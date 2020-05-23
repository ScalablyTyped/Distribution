package typings.uirouterCore.paramsInterfaceMod

import typings.uirouterCore.paramTypeMod.ParamType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParamDeclaration extends js.Object {
  /**
    * The parameter's `array` mode
    *
    * Explicitly specifies the array mode of a URL parameter
    *
    * - If `false`, the parameter value will be treated (encoded/decoded) as a single value
    * - If `true`, the parameter value will be treated (encoded/decoded) as an array of values.
    * - If `auto` (for query parameters only), if multiple values for a single parameter are present
    * in the URL (e.g.: /foo?bar=1&bar=2&bar=3) then the values are mapped to an array (e.g.:
    * `{ foo: [ '1', '2', '3' ] }`). However, if only one value is present (e.g.: /foo?bar=1)
    * then the value is treated as single value (e.g.: { foo: '1' }).
    *
    * If you specified a [[type]] for the parameter, the value will be treated as an array
    * of the specified [[ParamType]].
    *
    * #### Example:
    * ```js
    * {
    *   name: 'foo',
    *   url: '/foo/{arrayParam:int}`,
    *   params: {
    *     arrayParam: { array: true }
    *   }
    * }
    *
    * // After the transition, URL should be '/foo/1-2-3'
    * $state.go("foo", { arrayParam: [ 1, 2, 3 ] });
    * ```
    *
    * @default `false` for path parameters, such as `url: '/foo/:pathParam'`
    * @default `auto` for query parameters, such as `url: '/foo?queryParam'`
    * @default `true` if the parameter name ends in `[]`, such as `url: '/foo/{implicitArrayParam:int[]}'`
    */
  var array: js.UndefOr[Boolean] = js.undefined
  /**
    * Dynamic flag
    *
    * When `dynamic` is `true`, changes to the parameter value will not cause the state to be entered/exited.
    * The resolves will not be re-fetched, nor will views be reloaded.
    *
    * Normally, if a parameter value changes, the state which declared that the parameter will be reloaded (entered/exited).
    * When a parameter is `dynamic`, a transition still occurs, but it does not cause the state to exit/enter.
    *
    * This can be useful to build UI where the component updates itself when the param values change.
    * A common scenario where this is useful is searching/paging/sorting.
    *
    * ---
    *
    * Note: this value overrides the `dynamic` value on a custom parameter type ([[ParamTypeDefinition.dynamic]]).
    *
    * ---
    *
    * Default: `false`
    */
  var dynamic: js.UndefOr[Boolean] = js.undefined
  /**
    * Enables/disables inheriting of this parameter's value
    *
    * When a transition is run with [[TransitionOptions.inherit]] set to
    * `true`, the current param values are inherited in the new transition.
    * However, parameters values which have `inherit: false` set  will *not be inherited*.
    *
    * #### Example state :
    * ```js
    * var fooState = {
    *   name: 'foo',
    *   url: '/:fooId?mode&refresh',
    *   params: {
    *     refresh: { inherit: false }
    *   }
    * }
    *
    * // Set fooId to 123
    * $state.go('fooState', { fooId: 1234, mode: 'list', refresh: true });
    * ```
    *
    * In the component:
    * `mode: 'list' is inherited, but refresh: true is not inherited.
    * // The param values are thus: `{ fooId: 4567, mode: 'list' }`
    * ```
    * <ui-sref="foo({ fooId: 4567 })">4567</ui-sref>
    * ```
    *
    * ---
    *
    * See also [[TransitionOptions.inherit]] and [[ParamTypeDefinition.inherit]]
    *
    * ---
    *
    * Default: `true`
    */
  var inherit: js.UndefOr[Boolean] = js.undefined
  /**
    * @hidden
    * @internalapi
    *
    * This is not part of the declaration; it is a calculated value depending on if a default value was specified or not.
    */
  var isOptional: js.UndefOr[Boolean] = js.undefined
  /**
    * Disables url-encoding of parameter values
    *
    * When `true`, parameter values are not url-encoded.
    * This is commonly used to allow "slug" urls, with a parameter value including non-semantic slashes.
    *
    * #### Example:
    * ```js
    * url: '/product/:slug',
    * params: {
    *   slug: { type: 'string', raw: true }
    * }
    * ```
    *
    * This allows a URL parameter of `{ slug: 'camping/tents/awesome_tent' }`
    * to serialize to `/product/camping/tents/awesome_tent`
    * instead of `/product/camping%2Ftents%2Fawesome_tent`.
    *
    * ---
    *
    * Note: this value overrides the `raw` value on a custom parameter type ([[ParamTypeDefinition.raw]]).
    *
    * ### Decoding warning
    *
    * The decoding behavior of raw parameters is not defined.
    * For example, given a url template such as `/:raw1/:raw2`
    * the url `/foo/bar/baz/qux/`, there is no way to determine which slashes belong to which params.
    *
    * It's generally safe to use a raw parameter at the end of a path, like '/product/:slug'.
    * However, beware of the characters you allow in your raw parameter values.
    * Avoid unencoded characters that could disrupt normal URL parsing, such as `?` and `#`.
    *
    * ---
    *
    * Default: `false`
    */
  var raw: js.UndefOr[Boolean] = js.undefined
  /**
    * @internalapi
    *
    * An array of [[Replace]] objects.
    *
    * When creating a Transition, defines how to handle certain special values, such as `undefined`, `null`,
    * or empty string `""`.  If the transition is started, and the parameter value is equal to one of the "to"
    * values, then the parameter value is replaced with the "from" value.
    *
    * #### Example:
    * ```js
    * replace: [
    *   { from: undefined, to: null },
    *   { from: "", to: null }
    * ]
    * ```
    */
  var replace: js.UndefOr[js.Array[Replace]] = js.undefined
  /**
    * Squash mode: omit default parameter values in URL
    *
    * Configures how a default parameter value is represented in the URL when the current parameter value
    * is the same as the default value.
    *
    * There are three squash settings:
    *
    * - `false`: The parameter's default value is not squashed. It is encoded and included in the URL
    * - `true`: The parameter's default value is omitted from the URL.
    *    If the parameter is preceeded and followed by slashes in the state's url declaration, then one of those slashes are omitted.
    *    This can allow for cleaner looking URLs.
    * - `"&lt;arbitrary string&gt;"`: The parameter's default value is replaced with an arbitrary
    *    placeholder of your choice.
    *
    * #### Example:
    * ```js
    * {
    *   name: 'mystate',
    *   url: '/mystate/:myparam',
    *   params: {
    *     myparam: 'defaultParamValue'
    *     squash: true
    *   }
    * }
    *
    * // URL will be `/mystate/`
    * $state.go('mystate', { myparam: 'defaultParamValue' });
    *
    * // URL will be `/mystate/someOtherValue`
    * $state.go('mystate', { myparam: 'someOtherValue' });
    * ```
    *
    * #### Example:
    * ```js
    * {
    *   name: 'mystate2',
    *   url: '/mystate2/:myparam2',
    *   params: {
    *     myparam2: 'defaultParamValue'
    *     squash: "~"
    *   }
    * }
    *
    * // URL will be `/mystate/~`
    * $state.go('mystate', { myparam2: 'defaultParamValue' });
    *
    * // URL will be `/mystate/someOtherValue`
    * $state.go('mystate', { myparam2: 'someOtherValue' });
    * ```
    *
    * Default: If squash is not set, it uses the configured default squash policy. (See [[defaultSquashPolicy]]())
    */
  var squash: js.UndefOr[Boolean | String] = js.undefined
  /**
    * The parameter's type
    *
    * Specifies the [[ParamType]] of the parameter.
    * Parameter types can be used to customize the encoding/decoding of parameter values.
    *
    * Set this property to the name of parameter's type.
    * The type may be either one of the built in types, or a custom type that has been registered with the [[UrlMatcherFactory]].
    *
    * See [[ParamTypes]] for the list of built in types.
    *
    * ---
    *
    * Default:
    * - Path parameters (`/:fooParam`): `path`
    * - Query parameters (`?queryParam`): `query`
    * - Non-url parameters (`param: { foo: null }`): `any`
    *
    */
  var `type`: js.UndefOr[String | ParamType] = js.undefined
  /**
    * The default value for this parameter.
    *
    * Specifies the default value for this parameter.
    * This implicitly sets this parameter as optional.
    *
    * When UI-Router routes to a state and no value is specified for this parameter in the URL or transition,
    * the default value will be used instead.
    * If value is a function, it will be injected and invoked, and the return value used.
    *
    * Note:  `value: undefined` is treated as though **no default value was specified**, while `value: null` is treated
    * as **"the default value is null"**.
    *
    * ```
    * // define default values for param1 and param2
    * params: {
    *   param1: {
    *     value: "defaultValue"
    *   },
    *   param2: {
    *     value: "param2Default;
    *   }
    * }
    * ```
    *
    * ### Shorthand Declaration
    *
    * If you only want to set the default value of the parameter, you may use a shorthand syntax.
    * In the params map, instead mapping the param name to a full parameter configuration object, simply set map it
    * to the default parameter value, e.g.:
    * ```
    * // Normal (non-shorthand) default value syntax
    * params: {
    *   param1: {
    *     value: "defaultValue"
    *   },
    *   param2: {
    *     value: "param2Default"
    *   }
    * }
    *
    * // Shorthand default value syntax
    * params: {
    *   param1: "defaultValue",
    *   param2: "param2Default"
    * }
    * ```
    *
    * This defines a default value for the parameter.
    * If a parameter value is `undefined`, this default value will be used instead
    *
    * ---
    *
    * Default: `undefined`
    */
  var value: js.UndefOr[js.Any] = js.undefined
}

object ParamDeclaration {
  @scala.inline
  def apply(
    array: js.UndefOr[Boolean] = js.undefined,
    dynamic: js.UndefOr[Boolean] = js.undefined,
    inherit: js.UndefOr[Boolean] = js.undefined,
    isOptional: js.UndefOr[Boolean] = js.undefined,
    raw: js.UndefOr[Boolean] = js.undefined,
    replace: js.Array[Replace] = null,
    squash: Boolean | String = null,
    `type`: String | ParamType = null,
    value: js.Any = null
  ): ParamDeclaration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(array)) __obj.updateDynamic("array")(array.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamic)) __obj.updateDynamic("dynamic")(dynamic.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inherit)) __obj.updateDynamic("inherit")(inherit.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isOptional)) __obj.updateDynamic("isOptional")(isOptional.get.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.get.asInstanceOf[js.Any])
    if (replace != null) __obj.updateDynamic("replace")(replace.asInstanceOf[js.Any])
    if (squash != null) __obj.updateDynamic("squash")(squash.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamDeclaration]
  }
}

