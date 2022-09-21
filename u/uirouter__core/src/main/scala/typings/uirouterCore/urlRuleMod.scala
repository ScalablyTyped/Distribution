package typings.uirouterCore

import typings.uirouterCore.routerMod.UIRouter
import typings.uirouterCore.stateInterfaceMod.StateDeclaration
import typings.uirouterCore.stateInterfaceMod.TargetStateDef
import typings.uirouterCore.stateMod.TargetState
import typings.uirouterCore.stateObjectMod.StateObject
import typings.uirouterCore.urlInterfaceMod.MatcherUrlRule
import typings.uirouterCore.urlInterfaceMod.RegExpRule
import typings.uirouterCore.urlInterfaceMod.StateRule
import typings.uirouterCore.urlInterfaceMod.UrlParts
import typings.uirouterCore.urlInterfaceMod.UrlRule
import typings.uirouterCore.urlInterfaceMod.UrlRuleHandlerFn
import typings.uirouterCore.urlInterfaceMod.UrlRuleMatchFn
import typings.uirouterCore.urlInterfaceMod.UrlRuleType
import typings.uirouterCore.urlMatcherMod.UrlMatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlRuleMod {
  
  @JSImport("@uirouter/core/lib/url/urlRule", "BaseUrlRule")
  @js.native
  open class BaseUrlRule protected ()
    extends StObject
       with UrlRule {
    def this(`match`: UrlRuleMatchFn) = this()
    def this(`match`: UrlRuleMatchFn, handler: UrlRuleHandlerFn) = this()
    
    /**
      * The rule's ID.
      *
      * IDs are auto-assigned when the rule is registered, in increasing order.
      */
    /* CompleteClass */
    @JSName("$id")
    var $id: Double = js.native
    
    /** @internal */
    /* CompleteClass */
    var _group: Double = js.native
    
    /**
      * This function is called if the rule matched, and was selected as the "best match".
      * This function handles the rule match event.
      *
      * See [[UrlRuleHandlerFn]] for details
      */
    /* CompleteClass */
    override def handler(): String | TargetState | TargetStateDef | Unit = js.native
    /* CompleteClass */
    override def handler(matchValue: Any): String | TargetState | TargetStateDef | Unit = js.native
    /* CompleteClass */
    override def handler(matchValue: Any, url: Unit, router: UIRouter): String | TargetState | TargetStateDef | Unit = js.native
    /* CompleteClass */
    override def handler(matchValue: Any, url: UrlParts): String | TargetState | TargetStateDef | Unit = js.native
    /* CompleteClass */
    override def handler(matchValue: Any, url: UrlParts, router: UIRouter): String | TargetState | TargetStateDef | Unit = js.native
    /* CompleteClass */
    override def handler(matchValue: Unit, url: Unit, router: UIRouter): String | TargetState | TargetStateDef | Unit = js.native
    /* CompleteClass */
    override def handler(matchValue: Unit, url: UrlParts): String | TargetState | TargetStateDef | Unit = js.native
    /* CompleteClass */
    override def handler(matchValue: Unit, url: UrlParts, router: UIRouter): String | TargetState | TargetStateDef | Unit = js.native
    /**
      * This function is called if the rule matched, and was selected as the "best match".
      * This function handles the rule match event.
      *
      * See [[UrlRuleHandlerFn]] for details
      */
    /* CompleteClass */
    @JSName("handler")
    var handler_Original: UrlRuleHandlerFn = js.native
    
    /**
      * This function should match the url and return the match details
      *
      * See [[UrlRuleMatchFn]] for details
      */
    /* CompleteClass */
    override def `match`(): Any = js.native
    /* CompleteClass */
    override def `match`(url: Unit, router: UIRouter): Any = js.native
    /* CompleteClass */
    override def `match`(url: UrlParts): Any = js.native
    /* CompleteClass */
    override def `match`(url: UrlParts, router: UIRouter): Any = js.native
    
    /**
      * The priority of a given match.
      *
      * Sometimes more than one UrlRule might have matched.
      * This method is used to choose the best match.
      *
      * If multiple rules matched, each rule's `matchPriority` is called with the value from [[match]].
      * The rule with the highest `matchPriority` has its [[handler]] called.
      */
    /* CompleteClass */
    override def matchPriority(`match`: Any): Double = js.native
    
    /**
      * This function should match the url and return the match details
      *
      * See [[UrlRuleMatchFn]] for details
      */
    /* CompleteClass */
    @JSName("match")
    var match_Original: UrlRuleMatchFn = js.native
    
    /**
      * The rule's priority (defaults to 0).
      *
      * This can be used to explicitly modify the rule's priority.
      * Higher numbers are higher priority.
      */
    /* CompleteClass */
    var priority: Double = js.native
    
    /** The type of the rule */
    /* CompleteClass */
    var `type`: UrlRuleType = js.native
  }
  
  @JSImport("@uirouter/core/lib/url/urlRule", "UrlRuleFactory")
  @js.native
  open class UrlRuleFactory protected () extends StObject {
    def this(router: UIRouter) = this()
    
    def compile(str: String): UrlMatcher = js.native
    
    def create(what: String): UrlRule = js.native
    def create(what: String, handler: String): UrlRule = js.native
    def create(what: String, handler: UrlRuleHandlerFn): UrlRule = js.native
    def create(what: js.RegExp): UrlRule = js.native
    def create(what: js.RegExp, handler: String): UrlRule = js.native
    def create(what: js.RegExp, handler: UrlRuleHandlerFn): UrlRule = js.native
    def create(what: StateDeclaration): UrlRule = js.native
    def create(what: StateDeclaration, handler: String): UrlRule = js.native
    def create(what: StateDeclaration, handler: UrlRuleHandlerFn): UrlRule = js.native
    def create(what: StateObject): UrlRule = js.native
    def create(what: StateObject, handler: String): UrlRule = js.native
    def create(what: StateObject, handler: UrlRuleHandlerFn): UrlRule = js.native
    def create(what: UrlRuleMatchFn): UrlRule = js.native
    def create(what: UrlRuleMatchFn, handler: String): UrlRule = js.native
    def create(what: UrlRuleMatchFn, handler: UrlRuleHandlerFn): UrlRule = js.native
    def create(what: UrlMatcher): UrlRule = js.native
    def create(what: UrlMatcher, handler: String): UrlRule = js.native
    def create(what: UrlMatcher, handler: UrlRuleHandlerFn): UrlRule = js.native
    
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
    def fromRegExp(regexp: js.RegExp, handler: String): RegExpRule = js.native
    def fromRegExp(regexp: js.RegExp, handler: UrlRuleHandlerFn): RegExpRule = js.native
    
    def fromState(stateOrDecl: StateDeclaration, router: UIRouter): StateRule = js.native
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
    def fromState(stateOrDecl: StateObject, router: UIRouter): StateRule = js.native
    
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
    def fromUrlMatcher(urlMatcher: UrlMatcher, handler: String): MatcherUrlRule = js.native
    def fromUrlMatcher(urlMatcher: UrlMatcher, handler: UrlRuleHandlerFn): MatcherUrlRule = js.native
    def fromUrlMatcher(urlMatcher: UrlMatcher, handler: UrlMatcher): MatcherUrlRule = js.native
    
    var router: UIRouter = js.native
  }
  /* static members */
  object UrlRuleFactory {
    
    @JSImport("@uirouter/core/lib/url/urlRule", "UrlRuleFactory")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isUrlRule(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUrlRule")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
}
