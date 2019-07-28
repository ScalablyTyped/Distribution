package typings.atUirouterCore.libUrlUrlRulesMod

import typings.atUirouterCore.Anon_Priority
import typings.atUirouterCore.libInterfaceMod.Disposable
import typings.atUirouterCore.libRouterMod.UIRouter
import typings.atUirouterCore.libStateInterfaceMod.TargetStateDef
import typings.atUirouterCore.libStateMod.TargetState
import typings.atUirouterCore.libUrlInterfaceMod.UrlRule
import typings.atUirouterCore.libUrlInterfaceMod.UrlRuleHandlerFn
import typings.atUirouterCore.libUrlUrlMatcherMod.UrlMatcher
import typings.atUirouterCore.libUrlUrlRuleMod.UrlRuleFactory
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/url/urlRules", "UrlRules")
@js.native
class UrlRules protected () extends Disposable {
  /** @hidden */
  def this(/** @hidden */ router: UIRouter) = this()
  /** @hidden */ var _id: js.Any = js.native
  /** @hidden */ var _otherwiseFn: js.Any = js.native
  /** @hidden */ var _rules: js.Any = js.native
  /** @hidden */ var _sortFn: js.Any = js.native
  /** @hidden */ var _sorted: js.Any = js.native
  /** @hidden */
  var ensureSorted: js.Any = js.native
  var router: js.Any = js.native
  /** @hidden */
  var stableSort: js.Any = js.native
  /** used to create [[UrlRule]] objects for common cases */
  var urlRuleFactory: UrlRuleFactory = js.native
  /**
    * Defines the initial state, path, or behavior to use when the app starts.
    *
    * This rule defines the initial/starting state for the application.
    *
    * This rule is triggered the first time the URL is checked (when the app initially loads).
    * The rule is triggered only when the url matches either `""` or `"/"`.
    *
    * Note: The rule is intended to be used when the root of the application is directly linked to.
    * When the URL is *not* `""` or `"/"` and doesn't match other rules, the [[otherwise]] rule is triggered.
    * This allows 404-like behavior when an unknown URL is deep-linked.
    *
    * #### Example:
    * Start app at `home` state.
    * ```js
    * .initial({ state: 'home' });
    * ```
    *
    * #### Example:
    * Start app at `/home` (by url)
    * ```js
    * .initial('/home');
    * ```
    *
    * #### Example:
    * When no other url rule matches, go to `home` state
    * ```js
    * .initial((matchValue, url, router) => {
    *   console.log('initial state');
    *   return { state: 'home' };
    * })
    * ```
    *
    * @param handler The initial state or url path, or a function which returns the state or url path (or performs custom logic).
    */
  def initial(handler: String): Unit = js.native
  def initial(handler: TargetStateDef): Unit = js.native
  def initial(handler: TargetState): Unit = js.native
  def initial(handler: UrlRuleHandlerFn): Unit = js.native
  /**
    * Defines the state, url, or behavior to use when no other rule matches the URL.
    *
    * This rule is matched when *no other rule* matches.
    * It is generally used to handle unknown URLs (similar to "404" behavior, but on the client side).
    *
    * - If `handler` a string, it is treated as a url redirect
    *
    * #### Example:
    * When no other url rule matches, redirect to `/index`
    * ```js
    * .otherwise('/index');
    * ```
    *
    * - If `handler` is an object with a `state` property, the state is activated.
    *
    * #### Example:
    * When no other url rule matches, redirect to `home` and provide a `dashboard` parameter value.
    * ```js
    * .otherwise({ state: 'home', params: { dashboard: 'default' } });
    * ```
    *
    * - If `handler` is a function, the function receives the current url ([[UrlParts]]) and the [[UIRouter]] object.
    *   The function can perform actions, and/or return a value.
    *
    * #### Example:
    * When no other url rule matches, manually trigger a transition to the `home` state
    * ```js
    * .otherwise((matchValue, urlParts, router) => {
    *   router.stateService.go('home');
    * });
    * ```
    *
    * #### Example:
    * When no other url rule matches, go to `home` state
    * ```js
    * .otherwise((matchValue, urlParts, router) => {
    *   return { state: 'home' };
    * });
    * ```
    *
    * @param handler The url path to redirect to, or a function which returns the url path (or performs custom logic).
    */
  def otherwise(handler: String): Unit = js.native
  def otherwise(handler: TargetStateDef): Unit = js.native
  def otherwise(handler: TargetState): Unit = js.native
  def otherwise(handler: UrlRuleHandlerFn): Unit = js.native
  /**
    * Remove a rule previously registered
    *
    * @param rule the matcher rule that was previously registered using [[rule]]
    */
  def removeRule(rule: js.Any): Unit = js.native
  /**
    * Manually adds a URL Rule.
    *
    * Usually, a url rule is added using [[StateDeclaration.url]] or [[when]].
    * This api can be used directly for more control (to register a [[BaseUrlRule]], for example).
    * Rules can be created using [[urlRuleFactory]], or created manually as simple objects.
    *
    * A rule should have a `match` function which returns truthy if the rule matched.
    * It should also have a `handler` function which is invoked if the rule is the best match.
    *
    * @return a function that deregisters the rule
    */
  def rule(rule: UrlRule): js.Function = js.native
  /**
    * Gets all registered rules
    *
    * @returns an array of all the registered rules
    */
  def rules(): js.Array[UrlRule] = js.native
  /**
    * Defines URL Rule priorities
    *
    * More than one rule ([[UrlRule]]) might match a given URL.
    * This `compareFn` is used to sort the rules by priority.
    * Higher priority rules should sort earlier.
    *
    * The [[defaultRuleSortFn]] is used by default.
    *
    * You only need to call this function once.
    * The `compareFn` will be used to sort the rules as each is registered.
    *
    * If called without any parameter, it will re-sort the rules.
    *
    * ---
    *
    * Url rules may come from multiple sources: states's urls ([[StateDeclaration.url]]), [[when]], and [[rule]].
    * Each rule has a (user-provided) [[UrlRule.priority]], a [[UrlRule.type]], and a [[UrlRule.$id]]
    * The `$id` is is the order in which the rule was registered.
    *
    * The sort function should use these data, or data found on a specific type
    * of [[UrlRule]] (such as [[StateRule.state]]), to order the rules as desired.
    *
    * #### Example:
    * This compare function prioritizes rules by the order in which the rules were registered.
    * A rule registered earlier has higher priority.
    *
    * ```js
    * function compareFn(a, b) {
    *   return a.$id - b.$id;
    * }
    * ```
    *
    * @param compareFn a function that compares to [[UrlRule]] objects.
    *    The `compareFn` should abide by the `Array.sort` compare function rules.
    *    Given two rules, `a` and `b`, return a negative number if `a` should be higher priority.
    *    Return a positive number if `b` should be higher priority.
    *    Return `0` if the rules are identical.
    *
    *    See the [mozilla reference](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array/sort#Description)
    *    for details.
    */
  def sort(): Unit = js.native
  def sort(compareFn: js.Function2[/* a */ UrlRule, /* b */ UrlRule, Double]): Unit = js.native
  def when(matcher: String, handler: String): UrlRule = js.native
  def when(matcher: String, handler: String, options: Anon_Priority): UrlRule = js.native
  def when(matcher: String, handler: UrlRuleHandlerFn): UrlRule = js.native
  def when(matcher: String, handler: UrlRuleHandlerFn, options: Anon_Priority): UrlRule = js.native
  def when(matcher: UrlMatcher, handler: String): UrlRule = js.native
  def when(matcher: UrlMatcher, handler: String, options: Anon_Priority): UrlRule = js.native
  def when(matcher: UrlMatcher, handler: UrlRuleHandlerFn): UrlRule = js.native
  def when(matcher: UrlMatcher, handler: UrlRuleHandlerFn, options: Anon_Priority): UrlRule = js.native
  /**
    * Registers a `matcher` and `handler` for custom URLs handling.
    *
    * The `matcher` can be:
    *
    * - a [[UrlMatcher]]: See: [[UrlMatcherFactory.compile]]
    * - a `string`: The string is compiled to a [[UrlMatcher]]
    * - a `RegExp`: The regexp is used to match the url.
    *
    * The `handler` can be:
    *
    * - a string: The url is redirected to the value of the string.
    * - a function: The url is redirected to the return value of the function.
    *
    * ---
    *
    * When the `handler` is a `string` and the `matcher` is a `UrlMatcher` (or string), the redirect
    * string is interpolated with parameter values.
    *
    * #### Example:
    * When the URL is `/foo/123` the rule will redirect to `/bar/123`.
    * ```js
    * .when("/foo/:param1", "/bar/:param1")
    * ```
    *
    * ---
    *
    * When the `handler` is a string and the `matcher` is a `RegExp`, the redirect string is
    * interpolated with capture groups from the RegExp.
    *
    * #### Example:
    * When the URL is `/foo/123` the rule will redirect to `/bar/123`.
    * ```js
    * .when(new RegExp("^/foo/(.*)$"), "/bar/$1");
    * ```
    *
    * ---
    *
    * When the handler is a function, it receives the matched value, the current URL, and the `UIRouter` object (See [[UrlRuleHandlerFn]]).
    * The "matched value" differs based on the `matcher`.
    * For [[UrlMatcher]]s, it will be the matched state params.
    * For `RegExp`, it will be the match array from `regexp.exec()`.
    *
    * If the handler returns a string, the URL is redirected to the string.
    *
    * #### Example:
    * When the URL is `/foo/123` the rule will redirect to `/bar/123`.
    * ```js
    * .when(new RegExp("^/foo/(.*)$"), match => "/bar/" + match[1]);
    * ```
    *
    * Note: the `handler` may also invoke arbitrary code, such as `$state.go()`
    *
    * @param matcher A pattern `string` to match, compiled as a [[UrlMatcher]], or a `RegExp`.
    * @param handler The path to redirect to, or a function that returns the path.
    * @param options `{ priority: number }`
    *
    * @return the registered [[UrlRule]]
    */
  def when(matcher: RegExp, handler: String): UrlRule = js.native
  def when(matcher: RegExp, handler: String, options: Anon_Priority): UrlRule = js.native
  def when(matcher: RegExp, handler: UrlRuleHandlerFn): UrlRule = js.native
  def when(matcher: RegExp, handler: UrlRuleHandlerFn, options: Anon_Priority): UrlRule = js.native
}

