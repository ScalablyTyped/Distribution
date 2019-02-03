package typings
package atUirouterCoreLib.libUrlUrlRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/url/urlRule", "UrlRuleFactory")
@js.native
class UrlRuleFactory protected () extends js.Object {
  def this(router: atUirouterCoreLib.libRouterMod.UIRouter) = this()
  var router: atUirouterCoreLib.libRouterMod.UIRouter = js.native
  def compile(str: java.lang.String): atUirouterCoreLib.libUrlUrlMatcherMod.UrlMatcher = js.native
  def create(what: atUirouterCoreLib.libStateStateObjectMod.StateObject): atUirouterCoreLib.libUrlInterfaceMod.UrlRule = js.native
  def create(
    what: atUirouterCoreLib.libStateStateObjectMod.StateObject,
    handler: atUirouterCoreLib.libUrlInterfaceMod.UrlRuleHandlerFn
  ): atUirouterCoreLib.libUrlInterfaceMod.UrlRule = js.native
  def create(what: atUirouterCoreLib.libStateStateObjectMod.StateObject, handler: java.lang.String): atUirouterCoreLib.libUrlInterfaceMod.UrlRule = js.native
  def create(what: atUirouterCoreLib.libUrlInterfaceMod.UrlRuleMatchFn): atUirouterCoreLib.libUrlInterfaceMod.UrlRule = js.native
  def create(
    what: atUirouterCoreLib.libUrlInterfaceMod.UrlRuleMatchFn,
    handler: atUirouterCoreLib.libUrlInterfaceMod.UrlRuleHandlerFn
  ): atUirouterCoreLib.libUrlInterfaceMod.UrlRule = js.native
  def create(what: atUirouterCoreLib.libUrlInterfaceMod.UrlRuleMatchFn, handler: java.lang.String): atUirouterCoreLib.libUrlInterfaceMod.UrlRule = js.native
  def create(what: atUirouterCoreLib.libUrlUrlMatcherMod.UrlMatcher): atUirouterCoreLib.libUrlInterfaceMod.UrlRule = js.native
  def create(
    what: atUirouterCoreLib.libUrlUrlMatcherMod.UrlMatcher,
    handler: atUirouterCoreLib.libUrlInterfaceMod.UrlRuleHandlerFn
  ): atUirouterCoreLib.libUrlInterfaceMod.UrlRule = js.native
  def create(what: atUirouterCoreLib.libUrlUrlMatcherMod.UrlMatcher, handler: java.lang.String): atUirouterCoreLib.libUrlInterfaceMod.UrlRule = js.native
  def create(what: java.lang.String): atUirouterCoreLib.libUrlInterfaceMod.UrlRule = js.native
  def create(what: java.lang.String, handler: atUirouterCoreLib.libUrlInterfaceMod.UrlRuleHandlerFn): atUirouterCoreLib.libUrlInterfaceMod.UrlRule = js.native
  def create(what: java.lang.String, handler: java.lang.String): atUirouterCoreLib.libUrlInterfaceMod.UrlRule = js.native
  def create(what: stdLib.RegExp): atUirouterCoreLib.libUrlInterfaceMod.UrlRule = js.native
  def create(what: stdLib.RegExp, handler: atUirouterCoreLib.libUrlInterfaceMod.UrlRuleHandlerFn): atUirouterCoreLib.libUrlInterfaceMod.UrlRule = js.native
  def create(what: stdLib.RegExp, handler: java.lang.String): atUirouterCoreLib.libUrlInterfaceMod.UrlRule = js.native
  def fromRegExp(regexp: stdLib.RegExp, handler: atUirouterCoreLib.libUrlInterfaceMod.UrlRuleHandlerFn): atUirouterCoreLib.libUrlInterfaceMod.RegExpRule = js.native
  /**
    * A UrlRule which matches based on a regular expression
    *
    * The `handler` may be either a [[UrlRuleHandlerFn]] or a string.
    *
    * ## Handler as a function
    *
    * If `handler` is a function, the function is invoked with:
    *
    * - regexp match array (from `regexp`)
    * - url: the current Url ([[UrlParts]])
    * - router: the router object ([[UIRouter]])
    *
    * #### Example:
    * ```js
    * var rule = factory.fromRegExp(/^\/foo\/(bar|baz)$/, match => "/home/" + match[1])
    * var match = rule.match('/foo/bar'); // results in [ '/foo/bar', 'bar' ]
    * var result = rule.handler(match); // '/home/bar'
    * ```
    *
    * ## Handler as string
    *
    * If `handler` is a string, the url is *replaced by the string* when the Rule is invoked.
    * The string is first interpolated using `string.replace()` style pattern.
    *
    * #### Example:
    * ```js
    * var rule = factory.fromRegExp(/^\/foo\/(bar|baz)$/, "/home/$1")
    * var match = rule.match('/foo/bar'); // results in [ '/foo/bar', 'bar' ]
    * var result = rule.handler(match); // '/home/bar'
    * ```
    */
  def fromRegExp(regexp: stdLib.RegExp, handler: java.lang.String): atUirouterCoreLib.libUrlInterfaceMod.RegExpRule = js.native
  /**
    * A UrlRule which matches a state by its url
    *
    * #### Example:
    * ```js
    * var rule = factory.fromState($state.get('foo'), router);
    * var match = rule.match('/foo/123/456'); // results in { fooId: '123', barId: '456' }
    * var result = rule.handler(match);
    * // Starts a transition to 'foo' with params: { fooId: '123', barId: '456' }
    * ```
    */
  def fromState(
    state: atUirouterCoreLib.libStateStateObjectMod.StateObject,
    router: atUirouterCoreLib.libRouterMod.UIRouter
  ): atUirouterCoreLib.libUrlInterfaceMod.StateRule = js.native
  def fromUrlMatcher(
    urlMatcher: atUirouterCoreLib.libUrlUrlMatcherMod.UrlMatcher,
    handler: atUirouterCoreLib.libUrlInterfaceMod.UrlRuleHandlerFn
  ): atUirouterCoreLib.libUrlInterfaceMod.MatcherUrlRule = js.native
  def fromUrlMatcher(
    urlMatcher: atUirouterCoreLib.libUrlUrlMatcherMod.UrlMatcher,
    handler: atUirouterCoreLib.libUrlUrlMatcherMod.UrlMatcher
  ): atUirouterCoreLib.libUrlInterfaceMod.MatcherUrlRule = js.native
  /**
    * A UrlRule which matches based on a UrlMatcher
    *
    * The `handler` may be either a `string`, a [[UrlRuleHandlerFn]] or another [[UrlMatcher]]
    *
    * ## Handler as a function
    *
    * If `handler` is a function, the function is invoked with:
    *
    * - matched parameter values ([[RawParams]] from [[UrlMatcher.exec]])
    * - url: the current Url ([[UrlParts]])
    * - router: the router object ([[UIRouter]])
    *
    * #### Example:
    * ```js
    * var urlMatcher = $umf.compile("/foo/:fooId/:barId");
    * var rule = factory.fromUrlMatcher(urlMatcher, match => "/home/" + match.fooId + "/" + match.barId);
    * var match = rule.match('/foo/123/456'); // results in { fooId: '123', barId: '456' }
    * var result = rule.handler(match); // '/home/123/456'
    * ```
    *
    * ## Handler as UrlMatcher
    *
    * If `handler` is a UrlMatcher, the handler matcher is used to create the new url.
    * The `handler` UrlMatcher is formatted using the matched param from the first matcher.
    * The url is replaced with the result.
    *
    * #### Example:
    * ```js
    * var urlMatcher = $umf.compile("/foo/:fooId/:barId");
    * var handler = $umf.compile("/home/:fooId/:barId");
    * var rule = factory.fromUrlMatcher(urlMatcher, handler);
    * var match = rule.match('/foo/123/456'); // results in { fooId: '123', barId: '456' }
    * var result = rule.handler(match); // '/home/123/456'
    * ```
    */
  def fromUrlMatcher(urlMatcher: atUirouterCoreLib.libUrlUrlMatcherMod.UrlMatcher, handler: java.lang.String): atUirouterCoreLib.libUrlInterfaceMod.MatcherUrlRule = js.native
}

/* static members */
@JSImport("@uirouter/core/lib/url/urlRule", "UrlRuleFactory")
@js.native
object UrlRuleFactory extends js.Object {
  def isUrlRule(obj: js.Any): scala.Boolean = js.native
}

