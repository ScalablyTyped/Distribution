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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlInterfaceMod {
  
  trait MatchResult extends StObject {
    
    /** The matched value from a [[UrlRule]] */
    var `match`: js.Any
    
    /** The rule that matched */
    var rule: UrlRule
    
    /** The match result weight */
    var weight: Double
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
  
  trait MatcherUrlRule
    extends StObject
       with UrlRule {
    
    @JSName("type")
    var type_MatcherUrlRule: URLMATCHER | STATE
    
    var urlMatcher: UrlMatcher
  }
  object MatcherUrlRule {
    
    @scala.inline
    def apply(
      $id: Double,
      _group: Double,
      handler: (/* matchValue */ js.UndefOr[js.Any], /* url */ js.UndefOr[UrlParts], /* router */ js.UndefOr[UIRouter]) => String | TargetState | TargetStateDef | Unit,
      `match`: (/* url */ js.UndefOr[UrlParts], /* router */ js.UndefOr[UIRouter]) => js.Any,
      matchPriority: js.Any => Double,
      priority: Double,
      `type`: URLMATCHER | STATE,
      urlMatcher: UrlMatcher
    ): MatcherUrlRule = {
      val __obj = js.Dynamic.literal($id = $id.asInstanceOf[js.Any], _group = _group.asInstanceOf[js.Any], handler = js.Any.fromFunction3(handler), matchPriority = js.Any.fromFunction1(matchPriority), priority = priority.asInstanceOf[js.Any], urlMatcher = urlMatcher.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(js.Any.fromFunction2(`match`))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatcherUrlRule]
    }
    
    @scala.inline
    implicit class MatcherUrlRuleMutableBuilder[Self <: MatcherUrlRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: URLMATCHER | STATE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlMatcher(value: UrlMatcher): Self = StObject.set(x, "urlMatcher", value.asInstanceOf[js.Any])
    }
  }
  
  trait RegExpRule
    extends StObject
       with UrlRule {
    
    var regexp: RegExp
    
    @JSName("type")
    var type_RegExpRule: REGEXP
  }
  object RegExpRule {
    
    @scala.inline
    def apply(
      $id: Double,
      _group: Double,
      handler: (/* matchValue */ js.UndefOr[js.Any], /* url */ js.UndefOr[UrlParts], /* router */ js.UndefOr[UIRouter]) => String | TargetState | TargetStateDef | Unit,
      `match`: (/* url */ js.UndefOr[UrlParts], /* router */ js.UndefOr[UIRouter]) => js.Any,
      matchPriority: js.Any => Double,
      priority: Double,
      regexp: RegExp
    ): RegExpRule = {
      val __obj = js.Dynamic.literal($id = $id.asInstanceOf[js.Any], _group = _group.asInstanceOf[js.Any], handler = js.Any.fromFunction3(handler), matchPriority = js.Any.fromFunction1(matchPriority), priority = priority.asInstanceOf[js.Any], regexp = regexp.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(js.Any.fromFunction2(`match`))
      __obj.updateDynamic("type")("REGEXP")
      __obj.asInstanceOf[RegExpRule]
    }
    
    @scala.inline
    implicit class RegExpRuleMutableBuilder[Self <: RegExpRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegexp(value: RegExp): Self = StObject.set(x, "regexp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: REGEXP): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait StateRule
    extends StObject
       with MatcherUrlRule {
    
    var state: StateObject
    
    @JSName("type")
    var type_StateRule: STATE
  }
  object StateRule {
    
    @scala.inline
    def apply(
      $id: Double,
      _group: Double,
      handler: (/* matchValue */ js.UndefOr[js.Any], /* url */ js.UndefOr[UrlParts], /* router */ js.UndefOr[UIRouter]) => String | TargetState | TargetStateDef | Unit,
      `match`: (/* url */ js.UndefOr[UrlParts], /* router */ js.UndefOr[UIRouter]) => js.Any,
      matchPriority: js.Any => Double,
      priority: Double,
      state: StateObject,
      urlMatcher: UrlMatcher
    ): StateRule = {
      val __obj = js.Dynamic.literal($id = $id.asInstanceOf[js.Any], _group = _group.asInstanceOf[js.Any], handler = js.Any.fromFunction3(handler), matchPriority = js.Any.fromFunction1(matchPriority), priority = priority.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], urlMatcher = urlMatcher.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(js.Any.fromFunction2(`match`))
      __obj.updateDynamic("type")("STATE")
      __obj.asInstanceOf[StateRule]
    }
    
    @scala.inline
    implicit class StateRuleMutableBuilder[Self <: StateRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setState(value: StateObject): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: STATE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UrlConfigApi
    extends StObject
       with LocationConfig
       with UrlMatcherConfig
  
  trait UrlMatcherCompileConfig extends StObject {
    
    var caseInsensitive: js.UndefOr[Boolean] = js.undefined
    
    var decodeParams: js.UndefOr[Boolean] = js.undefined
    
    var state: js.UndefOr[StateDeclaration] = js.undefined
    
    var strict: js.UndefOr[Boolean] = js.undefined
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
  
  trait UrlMatcherConfig extends StObject {
    
    /** See: [[UrlConfig.caseInsensitive]] */ def caseInsensitive(): Boolean
    def caseInsensitive(value: Boolean): Boolean
    /** See: [[UrlConfig.caseInsensitive]] */ @JSName("caseInsensitive")
    var caseInsensitive_Original: js.Function1[/* value */ js.UndefOr[Boolean], Boolean]
    
    /** See: [[UrlConfig.defaultSquashPolicy]] */ def defaultSquashPolicy(): String | Boolean
    def defaultSquashPolicy(value: String): String | Boolean
    def defaultSquashPolicy(value: Boolean): String | Boolean
    /** See: [[UrlConfig.defaultSquashPolicy]] */ @JSName("defaultSquashPolicy")
    var defaultSquashPolicy_Original: js.Function1[/* value */ js.UndefOr[Boolean | String], String | Boolean]
    
    /** See: [[UrlConfig.strictMode]] */ def strictMode(): Boolean
    def strictMode(value: Boolean): Boolean
    /** See: [[UrlConfig.strictMode]] */ @JSName("strictMode")
    var strictMode_Original: js.Function1[/* value */ js.UndefOr[Boolean], Boolean]
    
    /** See: [[UrlConfig.type]] */ def `type`(name: String): js.Any
    def `type`(name: String, definition: Unit, definitionFn: js.Function0[ParamTypeDefinition]): js.Any
    def `type`(name: String, definition: ParamTypeDefinition): js.Any
    def `type`(name: String, definition: ParamTypeDefinition, definitionFn: js.Function0[ParamTypeDefinition]): js.Any
    /** See: [[UrlConfig.type]] */ @JSName("type")
    var type_Original: js.Function3[
        /* name */ String, 
        /* definition */ js.UndefOr[ParamTypeDefinition], 
        /* definitionFn */ js.UndefOr[js.Function0[ParamTypeDefinition]], 
        js.Any
      ]
  }
  object UrlMatcherConfig {
    
    @scala.inline
    def apply(
      caseInsensitive: /* value */ js.UndefOr[Boolean] => Boolean,
      defaultSquashPolicy: /* value */ js.UndefOr[Boolean | String] => String | Boolean,
      strictMode: /* value */ js.UndefOr[Boolean] => Boolean,
      `type`: (/* name */ String, /* definition */ js.UndefOr[ParamTypeDefinition], /* definitionFn */ js.UndefOr[js.Function0[ParamTypeDefinition]]) => js.Any
    ): UrlMatcherConfig = {
      val __obj = js.Dynamic.literal(caseInsensitive = js.Any.fromFunction1(caseInsensitive), defaultSquashPolicy = js.Any.fromFunction1(defaultSquashPolicy), strictMode = js.Any.fromFunction1(strictMode))
      __obj.updateDynamic("type")(js.Any.fromFunction3(`type`))
      __obj.asInstanceOf[UrlMatcherConfig]
    }
    
    @scala.inline
    implicit class UrlMatcherConfigMutableBuilder[Self <: UrlMatcherConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCaseInsensitive(value: /* value */ js.UndefOr[Boolean] => Boolean): Self = StObject.set(x, "caseInsensitive", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDefaultSquashPolicy(value: /* value */ js.UndefOr[Boolean | String] => String | Boolean): Self = StObject.set(x, "defaultSquashPolicy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStrictMode(value: /* value */ js.UndefOr[Boolean] => Boolean): Self = StObject.set(x, "strictMode", js.Any.fromFunction1(value))
      
      @scala.inline
      def setType(
        value: (/* name */ String, /* definition */ js.UndefOr[ParamTypeDefinition], /* definitionFn */ js.UndefOr[js.Function0[ParamTypeDefinition]]) => js.Any
      ): Self = StObject.set(x, "type", js.Any.fromFunction3(value))
    }
  }
  
  trait UrlParts extends StObject {
    
    var hash: js.UndefOr[String] = js.undefined
    
    var path: String
    
    var search: js.UndefOr[StringDictionary[js.Any]] = js.undefined
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
  
  trait UrlRule extends StObject {
    
    /**
      * The rule's ID.
      *
      * IDs are auto-assigned when the rule is registered, in increasing order.
      */
    @JSName("$id")
    var $id: Double
    
    /** @internal */
    var _group: Double
    
    /**
      * This function is called if the rule matched, and was selected as the "best match".
      * This function handles the rule match event.
      *
      * See [[UrlRuleHandlerFn]] for details
      */
    def handler(): String | TargetState | TargetStateDef | Unit
    def handler(matchValue: js.Any): String | TargetState | TargetStateDef | Unit
    def handler(matchValue: js.Any, url: Unit, router: UIRouter): String | TargetState | TargetStateDef | Unit
    def handler(matchValue: js.Any, url: UrlParts): String | TargetState | TargetStateDef | Unit
    def handler(matchValue: js.Any, url: UrlParts, router: UIRouter): String | TargetState | TargetStateDef | Unit
    def handler(matchValue: Unit, url: Unit, router: UIRouter): String | TargetState | TargetStateDef | Unit
    def handler(matchValue: Unit, url: UrlParts): String | TargetState | TargetStateDef | Unit
    def handler(matchValue: Unit, url: UrlParts, router: UIRouter): String | TargetState | TargetStateDef | Unit
    /**
      * This function is called if the rule matched, and was selected as the "best match".
      * This function handles the rule match event.
      *
      * See [[UrlRuleHandlerFn]] for details
      */
    @JSName("handler")
    var handler_Original: UrlRuleHandlerFn
    
    /**
      * This function should match the url and return the match details
      *
      * See [[UrlRuleMatchFn]] for details
      */
    def `match`(): js.Any
    def `match`(url: Unit, router: UIRouter): js.Any
    def `match`(url: UrlParts): js.Any
    def `match`(url: UrlParts, router: UIRouter): js.Any
    
    /**
      * The priority of a given match.
      *
      * Sometimes more than one UrlRule might have matched.
      * This method is used to choose the best match.
      *
      * If multiple rules matched, each rule's `matchPriority` is called with the value from [[match]].
      * The rule with the highest `matchPriority` has its [[handler]] called.
      */
    def matchPriority(`match`: js.Any): Double
    
    /**
      * This function should match the url and return the match details
      *
      * See [[UrlRuleMatchFn]] for details
      */
    @JSName("match")
    var match_Original: UrlRuleMatchFn
    
    /**
      * The rule's priority (defaults to 0).
      *
      * This can be used to explicitly modify the rule's priority.
      * Higher numbers are higher priority.
      */
    var priority: Double
    
    /** The type of the rule */
    var `type`: UrlRuleType
  }
  object UrlRule {
    
    @scala.inline
    def apply(
      $id: Double,
      _group: Double,
      handler: (/* matchValue */ js.UndefOr[js.Any], /* url */ js.UndefOr[UrlParts], /* router */ js.UndefOr[UIRouter]) => String | TargetState | TargetStateDef | Unit,
      `match`: (/* url */ js.UndefOr[UrlParts], /* router */ js.UndefOr[UIRouter]) => js.Any,
      matchPriority: js.Any => Double,
      priority: Double,
      `type`: UrlRuleType
    ): UrlRule = {
      val __obj = js.Dynamic.literal($id = $id.asInstanceOf[js.Any], _group = _group.asInstanceOf[js.Any], handler = js.Any.fromFunction3(handler), matchPriority = js.Any.fromFunction1(matchPriority), priority = priority.asInstanceOf[js.Any])
      __obj.updateDynamic("match")(js.Any.fromFunction2(`match`))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[UrlRule]
    }
    
    @scala.inline
    implicit class UrlRuleMutableBuilder[Self <: UrlRule] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$id(value: Double): Self = StObject.set(x, "$id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandler(
        value: (/* matchValue */ js.UndefOr[js.Any], /* url */ js.UndefOr[UrlParts], /* router */ js.UndefOr[UIRouter]) => String | TargetState | TargetStateDef | Unit
      ): Self = StObject.set(x, "handler", js.Any.fromFunction3(value))
      
      @scala.inline
      def setMatch(value: (/* url */ js.UndefOr[UrlParts], /* router */ js.UndefOr[UIRouter]) => js.Any): Self = StObject.set(x, "match", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMatchPriority(value: js.Any => Double): Self = StObject.set(x, "matchPriority", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: UrlRuleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_group(value: Double): Self = StObject.set(x, "_group", value.asInstanceOf[js.Any])
    }
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
  
  trait UrlRulesApi extends StObject {
    
    /** See: [[UrlRules.initial]] */ def initial(handler: String): Unit
    def initial(handler: TargetStateDef): Unit
    def initial(handler: TargetState): Unit
    def initial(handler: UrlRuleHandlerFn): Unit
    /** See: [[UrlRules.initial]] */ @JSName("initial")
    var initial_Original: js.Function1[/* handler */ String | UrlRuleHandlerFn | TargetState | TargetStateDef, Unit]
    
    /** See: [[UrlRules.otherwise]] */ def otherwise(handler: String): Unit
    def otherwise(handler: TargetStateDef): Unit
    def otherwise(handler: TargetState): Unit
    def otherwise(handler: UrlRuleHandlerFn): Unit
    /** See: [[UrlRules.otherwise]] */ @JSName("otherwise")
    var otherwise_Original: js.Function1[/* handler */ String | UrlRuleHandlerFn | TargetState | TargetStateDef, Unit]
    
    /** See: [[UrlRules.removeRule]] */ def removeRule(rule: js.Any): Unit
    /** See: [[UrlRules.removeRule]] */ @JSName("removeRule")
    var removeRule_Original: js.Function1[/* rule */ js.Any, Unit]
    
    /** See: [[UrlRules.rule]] */ def rule(rule: UrlRule): js.Function
    /** See: [[UrlRules.rule]] */ @JSName("rule")
    var rule_Original: js.Function1[/* rule */ UrlRule, js.Function]
    
    /** See: [[UrlRules.rules]] */ def rules(): js.Array[UrlRule]
    /** See: [[UrlRules.rules]] */ @JSName("rules")
    var rules_Original: js.Function0[js.Array[UrlRule]]
    
    /** See: [[UrlRules.sort]] */ def sort(): Unit
    def sort(compareFn: js.Function2[/* a */ UrlRule, /* b */ UrlRule, Double]): Unit
    /** See: [[UrlRules.sort]] */ @JSName("sort")
    var sort_Original: js.Function1[
        /* compareFn */ js.UndefOr[js.Function2[/* a */ UrlRule, /* b */ UrlRule, Double]], 
        Unit
      ]
    
    def when(matcher: String, handler: String): UrlRule
    def when(matcher: String, handler: String, options: Priority): UrlRule
    def when(matcher: String, handler: UrlRuleHandlerFn): UrlRule
    def when(matcher: String, handler: UrlRuleHandlerFn, options: Priority): UrlRule
    /** See: [[UrlRules.when]] */ def when(matcher: RegExp, handler: String): UrlRule
    def when(matcher: RegExp, handler: String, options: Priority): UrlRule
    def when(matcher: RegExp, handler: UrlRuleHandlerFn): UrlRule
    def when(matcher: RegExp, handler: UrlRuleHandlerFn, options: Priority): UrlRule
    def when(matcher: UrlMatcher, handler: String): UrlRule
    def when(matcher: UrlMatcher, handler: String, options: Priority): UrlRule
    def when(matcher: UrlMatcher, handler: UrlRuleHandlerFn): UrlRule
    def when(matcher: UrlMatcher, handler: UrlRuleHandlerFn, options: Priority): UrlRule
    /** See: [[UrlRules.when]] */ @JSName("when")
    var when_Original: js.Function3[
        /* matcher */ RegExp | UrlMatcher | String, 
        /* handler */ String | UrlRuleHandlerFn, 
        /* options */ js.UndefOr[Priority], 
        UrlRule
      ]
  }
  object UrlRulesApi {
    
    @scala.inline
    def apply(
      initial: /* handler */ String | UrlRuleHandlerFn | TargetState | TargetStateDef => Unit,
      otherwise: /* handler */ String | UrlRuleHandlerFn | TargetState | TargetStateDef => Unit,
      removeRule: /* rule */ js.Any => Unit,
      rule: /* rule */ UrlRule => js.Function,
      rules: () => js.Array[UrlRule],
      sort: /* compareFn */ js.UndefOr[js.Function2[/* a */ UrlRule, /* b */ UrlRule, Double]] => Unit,
      when: (/* matcher */ RegExp | UrlMatcher | String, /* handler */ String | UrlRuleHandlerFn, /* options */ js.UndefOr[Priority]) => UrlRule
    ): UrlRulesApi = {
      val __obj = js.Dynamic.literal(initial = js.Any.fromFunction1(initial), otherwise = js.Any.fromFunction1(otherwise), removeRule = js.Any.fromFunction1(removeRule), rule = js.Any.fromFunction1(rule), rules = js.Any.fromFunction0(rules), sort = js.Any.fromFunction1(sort), when = js.Any.fromFunction3(when))
      __obj.asInstanceOf[UrlRulesApi]
    }
    
    @scala.inline
    implicit class UrlRulesApiMutableBuilder[Self <: UrlRulesApi] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitial(value: /* handler */ String | UrlRuleHandlerFn | TargetState | TargetStateDef => Unit): Self = StObject.set(x, "initial", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOtherwise(value: /* handler */ String | UrlRuleHandlerFn | TargetState | TargetStateDef => Unit): Self = StObject.set(x, "otherwise", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRemoveRule(value: /* rule */ js.Any => Unit): Self = StObject.set(x, "removeRule", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRule(value: /* rule */ UrlRule => js.Function): Self = StObject.set(x, "rule", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRules(value: () => js.Array[UrlRule]): Self = StObject.set(x, "rules", js.Any.fromFunction0(value))
      
      @scala.inline
      def setSort(value: /* compareFn */ js.UndefOr[js.Function2[/* a */ UrlRule, /* b */ UrlRule, Double]] => Unit): Self = StObject.set(x, "sort", js.Any.fromFunction1(value))
      
      @scala.inline
      def setWhen(
        value: (/* matcher */ RegExp | UrlMatcher | String, /* handler */ String | UrlRuleHandlerFn, /* options */ js.UndefOr[Priority]) => UrlRule
      ): Self = StObject.set(x, "when", js.Any.fromFunction3(value))
    }
  }
  
  trait UrlSyncApi extends StObject {
    
    /** See: [[UrlService.deferIntercept]] */ def deferIntercept(): Unit
    def deferIntercept(defer: Boolean): Unit
    /** See: [[UrlService.deferIntercept]] */ @JSName("deferIntercept")
    var deferIntercept_Original: (/* import warning: importer.ImportType#apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url/urlService.UrlService['deferIntercept'] */ js.Any) & (js.Function1[/* defer */ js.UndefOr[Boolean], Unit])
    
    /** See: [[UrlService.listen]] */ def listen(): js.Function
    def listen(enabled: Boolean): js.Function
    /** See: [[UrlService.listen]] */ @JSName("listen")
    var listen_Original: (/* import warning: importer.ImportType#apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url/urlService.UrlService['listen'] */ js.Any) & (js.Function1[/* enabled */ js.UndefOr[Boolean], js.Function])
    
    /** See: [[UrlService.sync]] */ def sync(): Unit
    def sync(evt: js.Any): Unit
    /** See: [[UrlService.sync]] */ @JSName("sync")
    var sync_Original: (/* import warning: importer.ImportType#apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url/urlService.UrlService['sync'] */ js.Any) & (js.Function1[/* evt */ js.UndefOr[js.Any], Unit])
  }
  object UrlSyncApi {
    
    @scala.inline
    def apply(
      deferIntercept: (/* import warning: importer.ImportType#apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url/urlService.UrlService['deferIntercept'] */ js.Any) & (js.Function1[/* defer */ js.UndefOr[Boolean], Unit]),
      listen: (/* import warning: importer.ImportType#apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url/urlService.UrlService['listen'] */ js.Any) & (js.Function1[/* enabled */ js.UndefOr[Boolean], js.Function]),
      sync: (/* import warning: importer.ImportType#apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url/urlService.UrlService['sync'] */ js.Any) & (js.Function1[/* evt */ js.UndefOr[js.Any], Unit])
    ): UrlSyncApi = {
      val __obj = js.Dynamic.literal(deferIntercept = deferIntercept.asInstanceOf[js.Any], listen = listen.asInstanceOf[js.Any], sync = sync.asInstanceOf[js.Any])
      __obj.asInstanceOf[UrlSyncApi]
    }
    
    @scala.inline
    implicit class UrlSyncApiMutableBuilder[Self <: UrlSyncApi] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeferIntercept(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url/urlService.UrlService['deferIntercept'] */ js.Any) & (js.Function1[/* defer */ js.UndefOr[Boolean], Unit])
      ): Self = StObject.set(x, "deferIntercept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListen(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url/urlService.UrlService['listen'] */ js.Any) & (js.Function1[/* enabled */ js.UndefOr[Boolean], js.Function])
      ): Self = StObject.set(x, "listen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSync(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: @uirouter/core.@uirouter/core/lib/url/urlService.UrlService['sync'] */ js.Any) & (js.Function1[/* evt */ js.UndefOr[js.Any], Unit])
      ): Self = StObject.set(x, "sync", value.asInstanceOf[js.Any])
    }
  }
}
