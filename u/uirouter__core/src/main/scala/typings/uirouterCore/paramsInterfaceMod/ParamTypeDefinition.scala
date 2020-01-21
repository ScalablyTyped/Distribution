package typings.uirouterCore.paramsInterfaceMod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamTypeDefinition extends js.Object {
  /**
    * Dynamic flag
    *
    * When `dynamic` is `true`, changes to the parameter value will not cause the state to be entered/exited.
    *
    * Normally, if a parameter value changes, the state which declared that the parameter will be reloaded (entered/exited).
    * When a parameter is `dynamic`, a transition still occurs, but it does not cause the state to exit/enter.
    *
    * Default: `false`
    */
  var dynamic: js.UndefOr[Boolean] = js.native
  /**
    * Enables/disables inheriting of parameter values (of this type)
    *
    * When a transition is run with [[TransitionOptions.inherit]] set to
    * `true`, the current param values are inherited in the new transition.
    * However, parameters whose type has `inherit: false` set  will *not be inherited*.
    *
    * The internal parameter type of `hash` has `inherit: false`.
    * This is used to disable inheriting of the hash value (`#`) on subsequent transitions.
    *
    * #### Example:
    * ```js
    * $state.go('home', { '#': 'inboxAnchor' });
    * ...
    * // "#" is not inherited.
    * // The value of the "#" parameter will be `null`
    * // The url's hash will be cleared.
    * $state.go('home.nest');
    * ```
    *
    * ---
    *
    * See also [[TransitionOptions.inherit]] and [[ParamDeclaration.inherit]]
    *
    */
  var inherit: js.UndefOr[Boolean] = js.native
  /**
    * A regular expression that matches the encoded parameter type
    *
    * This regular expression is used to match an encoded parameter value **in the URL**.
    *
    * For example, if your type encodes as a dash-separated numbers, match that here:
    * `new RegExp("[0-9]+(?:-[0-9]+)*")`.
    *
    * There are some limitations to these regexps:
    *
    * - No capturing groups are allowed (use non-capturing groups: `(?: )`)
    * - No pattern modifiers like case insensitive
    * - No start-of-string or end-of-string: `/^foo$/`
    */
  var pattern: js.UndefOr[RegExp] = js.native
  /**
    * Disables url-encoding of parameter values
    *
    * If a parameter type is declared `raw`, it will not be url-encoded.
    * Custom encoding can still be applied in the [[encode]] function.
    *
    * ### Decoding warning
    *
    * The decoding behavior of raw parameters is not defined.
    * See: [[ParamDeclaration.raw]] for details
    */
  var raw: js.UndefOr[Boolean] = js.native
  /**
    * Decodes a parameter value string (from URL string or transition param) to a custom/native value.
    *
    * For example, if your type decodes to an array of ints, then decode the string as an array of ints here:
    * ```js
    * decode: (str) => str.split("-").map(str => parseInt(str, 10))
    * ```
    *
    * Note: in general, [[encode]] and [[decode]] should be symmetrical.  That is, `encode(decode(str)) === str`
    *
    * @param val The URL parameter value to decode.
    * @param key The name of the parameter in which `val` is stored. Can be used for meta-programming of `ParamType` objects.
    * @returns a custom representation of the URL parameter value.
    */
  def decode(`val`: String): js.Any = js.native
  def decode(`val`: String, key: String): js.Any = js.native
  /**
    * Encodes a custom/native type value to a string that can be embedded in a URL.
    *
    * Note that the return value does *not* need to be URL-safe (i.e. passed through `encodeURIComponent()`).
    * It only needs to be a representation of `val` that has been encoded as a string.
    *
    * For example, if your custom type decodes to an array of ints, then encode the array of ints to a string here:
    *
    * ```js
    * encode: (intarray) => intarray.join("-")
    * ```
    *
    * Note: in general, [[encode]] and [[decode]] should be symmetrical.  That is, `encode(decode(str)) === str`
    *
    * @param val The value to encode.
    * @param key The name of the parameter in which `val` is stored. Can be used for meta-programming of `ParamType` objects.
    * @returns a string representation of `val` that can be encoded in a URL.
    */
  def encode(`val`: js.Any): String | js.Array[String] = js.native
  def encode(`val`: js.Any, key: String): String | js.Array[String] = js.native
  /**
    * Determines whether two decoded values are equivalent.
    *
    * For example, if your type decodes to an array of ints, then check if the arrays are equal:
    * ```js
    * equals: (a, b) => a.length === b.length && a.reduce((acc, x, idx) => acc && x === b[idx], true)
    * ```
    *
    * @param a A value to compare against.
    * @param b A value to compare against.
    * @returns `true` if the values are equivalent/equal, otherwise `false`.
    */
  def equals(a: js.Any, b: js.Any): Boolean = js.native
  /**
    * Tests if some object type is compatible with this parameter type
    *
    * Detects whether some value is of this particular type.
    * Accepts a decoded value and determines whether it matches this `ParamType` object.
    *
    * If your custom type encodes the parameter to a specific type, check for that type here.
    * For example, if your custom type decodes the URL parameter value as an array of ints, return true if the
    * input is an array of ints:
    *
    * ```
    * is: (val) => Array.isArray(val) && array.reduce((acc, x) => acc && parseInt(val, 10) === val, true)
    * ```
    *
    * If your type decodes the URL parameter value to a custom string, check that the string matches
    * the pattern (don't use an arrow fn if you need `this`): `function (val) { return !!this.pattern.exec(val) }`
    *
    * Note: This method is _not used to check if the URL matches_.
    * It's used to check if a _decoded value *is* this type_.
    * Use [[pattern]] to check the encoded value in the URL.
    *
    * @param val The value to check.
    * @param key If the type check is happening in the context of a specific [[UrlMatcher]]  object,
    *        this is the name of the parameter in which `val` is stored. Can be used for
    *        meta-programming of `ParamType` objects.
    * @returns `true` if the value matches the type, otherwise `false`.
    */
  def is(`val`: js.Any): Boolean = js.native
  def is(`val`: js.Any, key: String): Boolean = js.native
}

