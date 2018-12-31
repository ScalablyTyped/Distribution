package typings
package atUirouterCoreLib.libUrlUrlRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/url/urlRouter", "UrlRouter")
@js.native
class UrlRouter protected () extends js.Object {
  /** @hidden */
  def this(/** @hidden */ router: atUirouterCoreLib.libRouterMod.UIRouter) = this()
  /** @deprecated use [[UrlService.interceptDeferred]]*/
  var interceptDeferred: scala.Boolean = js.native
  /** @hidden */ var location: js.Any = js.native
  var router: js.Any = js.native
  /** used to create [[UrlRule]] objects for common cases */
  var urlRuleFactory: atUirouterCoreLib.libUrlUrlRuleMod.UrlRuleFactory = js.native
  /** @deprecated use [[UrlService.deferIntercept]]*/
  def deferIntercept(): scala.Unit = js.native
  def deferIntercept(defer: scala.Boolean): scala.Unit = js.native
  /**
    * Builds and returns a URL with interpolated parameters
    *
    * #### Example:
    * ```js
    * matcher = $umf.compile("/about/:person");
    * params = { person: "bob" };
    * $bob = $urlRouter.href(matcher, params);
    * // $bob == "/about/bob";
    * ```
    *
    * @param urlMatcher The [[UrlMatcher]] object which is used as the template of the URL to generate.
    * @param params An object of parameter values to fill the matcher's required parameters.
    * @param options Options object. The options are:
    *
    * - **`absolute`** - {boolean=false},  If true will generate an absolute url, e.g. "http://www.example.com/fullurl".
    *
    * @returns Returns the fully compiled URL, or `null` if `params` fail validation against `urlMatcher`
    */
  def href(urlMatcher: atUirouterCoreLib.libUrlUrlMatcherMod.UrlMatcher): java.lang.String = js.native
  def href(urlMatcher: atUirouterCoreLib.libUrlUrlMatcherMod.UrlMatcher, params: js.Any): java.lang.String = js.native
  def href(
    urlMatcher: atUirouterCoreLib.libUrlUrlMatcherMod.UrlMatcher,
    params: js.Any,
    options: atUirouterCoreLib.Anon_Absolute
  ): java.lang.String = js.native
  def initial(handler: atUirouterCoreLib.libStateInterfaceMod.TargetStateDef): scala.Unit = js.native
  def initial(handler: atUirouterCoreLib.libStateMod.TargetState): scala.Unit = js.native
  def initial(handler: atUirouterCoreLib.libUrlInterfaceMod.UrlRuleHandlerFn): scala.Unit = js.native
  /** @deprecated use [[UrlRules.initial]]*/
  def initial(handler: java.lang.String): scala.Unit = js.native
  /** @deprecated use [[UrlService.listen]]*/
  def listen(): js.Function = js.native
  def listen(enabled: scala.Boolean): js.Function = js.native
  /** @deprecated use [[UrlService.match]]*/
  def `match`(urlParts: atUirouterCoreLib.libUrlInterfaceMod.UrlParts): atUirouterCoreLib.libUrlInterfaceMod.MatchResult = js.native
  def otherwise(handler: atUirouterCoreLib.libStateInterfaceMod.TargetStateDef): scala.Unit = js.native
  def otherwise(handler: atUirouterCoreLib.libStateMod.TargetState): scala.Unit = js.native
  def otherwise(handler: atUirouterCoreLib.libUrlInterfaceMod.UrlRuleHandlerFn): scala.Unit = js.native
  /** @deprecated use [[UrlRules.otherwise]]*/
  def otherwise(handler: java.lang.String): scala.Unit = js.native
  /**
    * Internal API.
    *
    * Pushes a new location to the browser history.
    *
    * @internalapi
    * @param urlMatcher
    * @param params
    * @param options
    */
  def push(urlMatcher: atUirouterCoreLib.libUrlUrlMatcherMod.UrlMatcher): scala.Unit = js.native
  def push(
    urlMatcher: atUirouterCoreLib.libUrlUrlMatcherMod.UrlMatcher,
    params: atUirouterCoreLib.libParamsInterfaceMod.RawParams
  ): scala.Unit = js.native
  def push(
    urlMatcher: atUirouterCoreLib.libUrlUrlMatcherMod.UrlMatcher,
    params: atUirouterCoreLib.libParamsInterfaceMod.RawParams,
    options: atUirouterCoreLib.Anon_Replace
  ): scala.Unit = js.native
  /** @deprecated use [[UrlRules.removeRule]]*/
  def removeRule(rule: atUirouterCoreLib.libUrlInterfaceMod.UrlRule): scala.Unit = js.native
  /** @deprecated use [[UrlRules.rule]]*/
  def rule(rule: atUirouterCoreLib.libUrlInterfaceMod.UrlRule): js.Function = js.native
  /** @deprecated use [[UrlRules.rules]]*/
  def rules(): js.Array[atUirouterCoreLib.libUrlInterfaceMod.UrlRule] = js.native
  /** @deprecated use [[UrlRules.sort]]*/
  def sort(): scala.Unit = js.native
  def sort(
    compareFn: js.Function2[
      /* a */ atUirouterCoreLib.libUrlInterfaceMod.UrlRule, 
      /* b */ atUirouterCoreLib.libUrlInterfaceMod.UrlRule, 
      scala.Double
    ]
  ): scala.Unit = js.native
  /** @deprecated use [[UrlService.sync]]*/
  def sync(): scala.Unit = js.native
  def sync(evt: js.Any): scala.Unit = js.native
  /**
    * Internal API.
    * @internalapi
    */
  def update(): scala.Unit = js.native
  def update(read: scala.Boolean): scala.Unit = js.native
  def when(
    matcher: atUirouterCoreLib.libUrlUrlMatcherMod.UrlMatcher,
    handler: atUirouterCoreLib.libUrlInterfaceMod.UrlRuleHandlerFn
  ): atUirouterCoreLib.libUrlInterfaceMod.UrlRule = js.native
  def when(
    matcher: atUirouterCoreLib.libUrlUrlMatcherMod.UrlMatcher,
    handler: atUirouterCoreLib.libUrlInterfaceMod.UrlRuleHandlerFn,
    options: atUirouterCoreLib.Anon_Priority
  ): atUirouterCoreLib.libUrlInterfaceMod.UrlRule = js.native
  def when(matcher: atUirouterCoreLib.libUrlUrlMatcherMod.UrlMatcher, handler: java.lang.String): atUirouterCoreLib.libUrlInterfaceMod.UrlRule = js.native
  def when(
    matcher: atUirouterCoreLib.libUrlUrlMatcherMod.UrlMatcher,
    handler: java.lang.String,
    options: atUirouterCoreLib.Anon_Priority
  ): atUirouterCoreLib.libUrlInterfaceMod.UrlRule = js.native
  def when(matcher: java.lang.String, handler: atUirouterCoreLib.libUrlInterfaceMod.UrlRuleHandlerFn): atUirouterCoreLib.libUrlInterfaceMod.UrlRule = js.native
  def when(
    matcher: java.lang.String,
    handler: atUirouterCoreLib.libUrlInterfaceMod.UrlRuleHandlerFn,
    options: atUirouterCoreLib.Anon_Priority
  ): atUirouterCoreLib.libUrlInterfaceMod.UrlRule = js.native
  /** @deprecated use [[UrlRules.when]]*/
  def when(matcher: java.lang.String, handler: java.lang.String): atUirouterCoreLib.libUrlInterfaceMod.UrlRule = js.native
  def when(matcher: java.lang.String, handler: java.lang.String, options: atUirouterCoreLib.Anon_Priority): atUirouterCoreLib.libUrlInterfaceMod.UrlRule = js.native
  def when(matcher: stdLib.RegExp, handler: atUirouterCoreLib.libUrlInterfaceMod.UrlRuleHandlerFn): atUirouterCoreLib.libUrlInterfaceMod.UrlRule = js.native
  def when(
    matcher: stdLib.RegExp,
    handler: atUirouterCoreLib.libUrlInterfaceMod.UrlRuleHandlerFn,
    options: atUirouterCoreLib.Anon_Priority
  ): atUirouterCoreLib.libUrlInterfaceMod.UrlRule = js.native
  def when(matcher: stdLib.RegExp, handler: java.lang.String): atUirouterCoreLib.libUrlInterfaceMod.UrlRule = js.native
  def when(matcher: stdLib.RegExp, handler: java.lang.String, options: atUirouterCoreLib.Anon_Priority): atUirouterCoreLib.libUrlInterfaceMod.UrlRule = js.native
}

