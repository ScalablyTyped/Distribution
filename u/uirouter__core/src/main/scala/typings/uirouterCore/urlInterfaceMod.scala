package typings.uirouterCore

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import typings.uirouterCore.anon.Priority
import typings.uirouterCore.coreservicesMod.LocationConfig
import typings.uirouterCore.paramsInterfaceMod.ParamTypeDefinition
import typings.uirouterCore.routerMod.UIRouter
import typings.uirouterCore.stateInterfaceMod.StateDeclaration
import typings.uirouterCore.stateInterfaceMod.TargetStateDef
import typings.uirouterCore.stateMod.StateObject
import typings.uirouterCore.stateMod.TargetState
import typings.uirouterCore.uirouterCoreStrings.REGEXP
import typings.uirouterCore.uirouterCoreStrings.STATE
import typings.uirouterCore.uirouterCoreStrings.URLMATCHER
import typings.uirouterCore.urlMatcherMod.UrlMatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlInterfaceMod {
  
  @js.native
  trait MatchResult extends StObject {
    
    /** The matched value from a [[UrlRule]] */
    var `match`: js.Any = js.native
    
    /** The rule that matched */
    var rule: UrlRule = js.native
    
    /** The match result weight */
    var weight: Double = js.native
  }
  object MatchResult {
    
    @scala.inline
    def apply(`match`: js.Any, rule: UrlRule, weight: Double): MatchResult = {
      val __obj = js.Dynamic.literal(rule = rule.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchResult]
    }
    
    @scala.inline
    implicit class MatchResultMutableBuilder[Self <: MatchResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMatch(value: js.Any): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRule(value: UrlRule): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWeight(value: Double): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MatcherUrlRule extends UrlRule {
    
    @JSName("type")
    var type_MatcherUrlRule: URLMATCHER | STATE = js.native
    
    var urlMatcher: UrlMatcher = js.native
  }
  
  @js.native
  trait RegExpRule extends UrlRule {
    
    var regexp: RegExp = js.native
    
    @JSName("type")
    var type_RegExpRule: REGEXP = js.native
  }
  
  @js.native
  trait StateRule extends MatcherUrlRule {
    
    var state: StateObject = js.native
    
    @JSName("type")
    var type_StateRule: STATE = js.native
  }
  
  @js.native
  trait UrlConfigApi
    extends LocationConfig
       with UrlMatcherConfig
  
  @js.native
  trait UrlMatcherCompileConfig extends StObject {
    
    var caseInsensitive: js.UndefOr[Boolean] = js.native
    
    var decodeParams: js.UndefOr[Boolean] = js.native
    
    var state: js.UndefOr[StateDeclaration] = js.native
    
    var strict: js.UndefOr[Boolean] = js.native
  }
  object UrlMatcherCompileConfig {
    
    @scala.inline
    def apply(): UrlMatcherCompileConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UrlMatcherCompileConfig]
    }
    
    @scala.inline
    implicit class UrlMatcherCompileConfigMutableBuilder[Self <: UrlMatcherCompileConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaseInsensitive(value: Boolean): Self = StObject.set(x, "caseInsensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseInsensitiveUndefined: Self = StObject.set(x, "caseInsensitive", js.undefined)
      
      @scala.inline
      def setDecodeParams(value: Boolean): Self = StObject.set(x, "decodeParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDecodeParamsUndefined: Self = StObject.set(x, "decodeParams", js.undefined)
      
      @scala.inline
      def setState(value: StateDeclaration): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrictUndefined: Self = StObject.set(x, "strict", js.undefined)
    }
  }
  
  @js.native
  trait UrlMatcherConfig extends StObject {
    
    /** See: [[UrlConfig.caseInsensitive]] */ def caseInsensitive(): Boolean = js.native
    def caseInsensitive(value: Boolean): Boolean = js.native
    /** See: [[UrlConfig.caseInsensitive]] */ @JSName("caseInsensitive")
    var caseInsensitive_Original: js.Function1[/* value */ js.UndefOr[Boolean], Boolean] = js.native
    
    /** See: [[UrlConfig.defaultSquashPolicy]] */ def defaultSquashPolicy(): String | Boolean = js.native
    def defaultSquashPolicy(value: String): String | Boolean = js.native
    def defaultSquashPolicy(value: Boolean): String | Boolean = js.native
    /** See: [[UrlConfig.defaultSquashPolicy]] */ @JSName("defaultSquashPolicy")
    var defaultSquashPolicy_Original: js.Function1[/* value */ js.UndefOr[Boolean | String], String | Boolean] = js.native
    
    /** See: [[UrlConfig.strictMode]] */ def strictMode(): Boolean = js.native
    def strictMode(value: Boolean): Boolean = js.native
    /** See: [[UrlConfig.strictMode]] */ @JSName("strictMode")
    var strictMode_Original: js.Function1[/* value */ js.UndefOr[Boolean], Boolean] = js.native
    
    /** See: [[UrlConfig.type]] */ def `type`(name: String): js.Any = js.native
    def `type`(
      name: String,
      definition: js.UndefOr[scala.Nothing],
      definitionFn: js.Function0[ParamTypeDefinition]
    ): js.Any = js.native
    def `type`(name: String, definition: ParamTypeDefinition): js.Any = js.native
    def `type`(name: String, definition: ParamTypeDefinition, definitionFn: js.Function0[ParamTypeDefinition]): js.Any = js.native
    /** See: [[UrlConfig.type]] */ @JSName("type")
    var type_Original: js.Function3[
        /* name */ String, 
        /* definition */ js.UndefOr[ParamTypeDefinition], 
        /* definitionFn */ js.UndefOr[js.Function0[ParamTypeDefinition]], 
        _
      ] = js.native
  }
  
  @js.native
  trait UrlParts extends StObject {
    
    var hash: js.UndefOr[String] = js.native
    
    var path: String = js.native
    
    var search: js.UndefOr[StringDictionary[js.Any]] = js.native
  }
  object UrlParts {
    
    @scala.inline
    def apply(path: String): UrlParts = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[UrlParts]
    }
    
    @scala.inline
    implicit class UrlPartsMutableBuilder[Self <: UrlParts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearch(value: StringDictionary[js.Any]): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
    }
  }
  
  @js.native
  trait UrlRule extends StObject {
    
    /**
      * The rule's ID.
      *
      * IDs are auto-assigned when the rule is registered, in increasing order.
      */
    @JSName("$id")
    var $id: Double = js.native
    
    /** @internal */
    var _group: Double = js.native
    
    /**
      * This function is called if the rule matched, and was selected as the "best match".
      * This function handles the rule match event.
      *
      * See [[UrlRuleHandlerFn]] for details
      */
    def handler(): String | TargetState | TargetStateDef | Unit = js.native
    def handler(matchValue: js.UndefOr[scala.Nothing], url: js.UndefOr[scala.Nothing], router: UIRouter): String | TargetState | TargetStateDef | Unit = js.native
    def handler(matchValue: js.UndefOr[scala.Nothing], url: UrlParts): String | TargetState | TargetStateDef | Unit = js.native
    def handler(matchValue: js.UndefOr[scala.Nothing], url: UrlParts, router: UIRouter): String | TargetState | TargetStateDef | Unit = js.native
    def handler(matchValue: js.Any): String | TargetState | TargetStateDef | Unit = js.native
    def handler(matchValue: js.Any, url: js.UndefOr[scala.Nothing], router: UIRouter): String | TargetState | TargetStateDef | Unit = js.native
    def handler(matchValue: js.Any, url: UrlParts): String | TargetState | TargetStateDef | Unit = js.native
    def handler(matchValue: js.Any, url: UrlParts, router: UIRouter): String | TargetState | TargetStateDef | Unit = js.native
    /**
      * This function is called if the rule matched, and was selected as the "best match".
      * This function handles the rule match event.
      *
      * See [[UrlRuleHandlerFn]] for details
      */
    @JSName("handler")
    var handler_Original: UrlRuleHandlerFn = js.native
    
    /**
      * This function should match the url and return the match details
      *
      * See [[UrlRuleMatchFn]] for details
      */
    def `match`(): js.Any = js.native
    def `match`(url: js.UndefOr[scala.Nothing], router: UIRouter): js.Any = js.native
    def `match`(url: UrlParts): js.Any = js.native
    def `match`(url: UrlParts, router: UIRouter): js.Any = js.native
    
    /**
      * The priority of a given match.
      *
      * Sometimes more than one UrlRule might have matched.
      * This method is used to choose the best match.
      *
      * If multiple rules matched, each rule's `matchPriority` is called with the value from [[match]].
      * The rule with the highest `matchPriority` has its [[handler]] called.
      */
    def matchPriority(`match`: js.Any): Double = js.native
    
    /**
      * This function should match the url and return the match details
      *
      * See [[UrlRuleMatchFn]] for details
      */
    @JSName("match")
    var match_Original: UrlRuleMatchFn = js.native
    
    /**
      * The rule's priority (defaults to 0).
      *
      * This can be used to explicitly modify the rule's priority.
      * Higher numbers are higher priority.
      */
    var priority: Double = js.native
    
    /** The type of the rule */
    var `type`: UrlRuleType = js.native
  }
  
  type UrlRuleHandlerFn = js.Function3[
    /* matchValue */ js.UndefOr[js.Any], 
    /* url */ js.UndefOr[UrlParts], 
    /* router */ js.UndefOr[UIRouter], 
    String | TargetState | TargetStateDef | Unit
  ]
  
  type UrlRuleMatchFn = js.Function2[/* url */ js.UndefOr[UrlParts], /* router */ js.UndefOr[UIRouter], js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.uirouterCore.uirouterCoreStrings.STATE
    - typings.uirouterCore.uirouterCoreStrings.URLMATCHER
    - typings.uirouterCore.uirouterCoreStrings.REGEXP
    - typings.uirouterCore.uirouterCoreStrings.RAW
    - typings.uirouterCore.uirouterCoreStrings.OTHER
  */
  trait UrlRuleType extends StObject
  object UrlRuleType {
    
    @scala.inline
    def OTHER: typings.uirouterCore.uirouterCoreStrings.OTHER = "OTHER".asInstanceOf[typings.uirouterCore.uirouterCoreStrings.OTHER]
    
    @scala.inline
    def RAW: typings.uirouterCore.uirouterCoreStrings.RAW = "RAW".asInstanceOf[typings.uirouterCore.uirouterCoreStrings.RAW]
    
    @scala.inline
    def REGEXP: typings.uirouterCore.uirouterCoreStrings.REGEXP = "REGEXP".asInstanceOf[typings.uirouterCore.uirouterCoreStrings.REGEXP]
    
    @scala.inline
    def STATE: typings.uirouterCore.uirouterCoreStrings.STATE = "STATE".asInstanceOf[typings.uirouterCore.uirouterCoreStrings.STATE]
    
    @scala.inline
    def URLMATCHER: typings.uirouterCore.uirouterCoreStrings.URLMATCHER = "URLMATCHER".asInstanceOf[typings.uirouterCore.uirouterCoreStrings.URLMATCHER]
  }
  
  @js.native
  trait UrlRulesApi extends StObject {
    
    /** See: [[UrlRules.initial]] */ def initial(handler: String): Unit = js.native
    def initial(handler: TargetStateDef): Unit = js.native
    def initial(handler: TargetState): Unit = js.native
    def initial(handler: UrlRuleHandlerFn): Unit = js.native
    /** See: [[UrlRules.initial]] */ @JSName("initial")
    var initial_Original: js.Function1[/* handler */ String | UrlRuleHandlerFn | TargetState | TargetStateDef, Unit] = js.native
    
    /** See: [[UrlRules.otherwise]] */ def otherwise(handler: String): Unit = js.native
    def otherwise(handler: TargetStateDef): Unit = js.native
    def otherwise(handler: TargetState): Unit = js.native
    def otherwise(handler: UrlRuleHandlerFn): Unit = js.native
    /** See: [[UrlRules.otherwise]] */ @JSName("otherwise")
    var otherwise_Original: js.Function1[/* handler */ String | UrlRuleHandlerFn | TargetState | TargetStateDef, Unit] = js.native
    
    /** See: [[UrlRules.removeRule]] */ def removeRule(rule: js.Any): Unit = js.native
    /** See: [[UrlRules.removeRule]] */ @JSName("removeRule")
    var removeRule_Original: js.Function1[/* rule */ js.Any, Unit] = js.native
    
    /** See: [[UrlRules.rule]] */ def rule(rule: UrlRule): js.Function = js.native
    /** See: [[UrlRules.rule]] */ @JSName("rule")
    var rule_Original: js.Function1[/* rule */ UrlRule, js.Function] = js.native
    
    /** See: [[UrlRules.rules]] */ def rules(): js.Array[UrlRule] = js.native
    /** See: [[UrlRules.rules]] */ @JSName("rules")
    var rules_Original: js.Function0[js.Array[UrlRule]] = js.native
    
    /** See: [[UrlRules.sort]] */ def sort(): Unit = js.native
    def sort(compareFn: js.Function2[/* a */ UrlRule, /* b */ UrlRule, Double]): Unit = js.native
    /** See: [[UrlRules.sort]] */ @JSName("sort")
    var sort_Original: js.Function1[
        /* compareFn */ js.UndefOr[js.Function2[/* a */ UrlRule, /* b */ UrlRule, Double]], 
        Unit
      ] = js.native
    
    def when(matcher: String, handler: String): UrlRule = js.native
    def when(matcher: String, handler: String, options: Priority): UrlRule = js.native
    def when(matcher: String, handler: UrlRuleHandlerFn): UrlRule = js.native
    def when(matcher: String, handler: UrlRuleHandlerFn, options: Priority): UrlRule = js.native
    /** See: [[UrlRules.when]] */ def when(matcher: RegExp, handler: String): UrlRule = js.native
    def when(matcher: RegExp, handler: String, options: Priority): UrlRule = js.native
    def when(matcher: RegExp, handler: UrlRuleHandlerFn): UrlRule = js.native
    def when(matcher: RegExp, handler: UrlRuleHandlerFn, options: Priority): UrlRule = js.native
    def when(matcher: UrlMatcher, handler: String): UrlRule = js.native
    def when(matcher: UrlMatcher, handler: String, options: Priority): UrlRule = js.native
    def when(matcher: UrlMatcher, handler: UrlRuleHandlerFn): UrlRule = js.native
    def when(matcher: UrlMatcher, handler: UrlRuleHandlerFn, options: Priority): UrlRule = js.native
    /** See: [[UrlRules.when]] */ @JSName("when")
    var when_Original: js.Function3[
        /* matcher */ RegExp | UrlMatcher | String, 
        /* handler */ String | UrlRuleHandlerFn, 
        /* options */ js.UndefOr[Priority], 
        UrlRule
      ] = js.native
  }
  
  @js.native
  trait UrlSyncApi extends StObject {
    
    /** See: [[UrlService.deferIntercept]] */ def deferIntercept(): Unit = js.native
    def deferIntercept(defer: Boolean): Unit = js.native
    /** See: [[UrlService.deferIntercept]] */ @JSName("deferIntercept")
    var deferIntercept_Original: (/* import warning: importer.ImportType#apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url/urlService.UrlService['deferIntercept'] */ js.Any) with (js.Function1[/* defer */ js.UndefOr[Boolean], Unit]) = js.native
    
    /** See: [[UrlService.listen]] */ def listen(): js.Function = js.native
    def listen(enabled: Boolean): js.Function = js.native
    /** See: [[UrlService.listen]] */ @JSName("listen")
    var listen_Original: (/* import warning: importer.ImportType#apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url/urlService.UrlService['listen'] */ js.Any) with (js.Function1[/* enabled */ js.UndefOr[Boolean], js.Function]) = js.native
    
    /** See: [[UrlService.sync]] */ def sync(): Unit = js.native
    def sync(evt: js.Any): Unit = js.native
    /** See: [[UrlService.sync]] */ @JSName("sync")
    var sync_Original: (/* import warning: importer.ImportType#apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url/urlService.UrlService['sync'] */ js.Any) with (js.Function1[/* evt */ js.UndefOr[js.Any], Unit]) = js.native
  }
}
