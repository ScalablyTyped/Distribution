package typings
package atUirouterCoreLib.libUrlInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UrlRulesApi extends js.Object {
  /** See: [[UrlRules.initial]] */ @JSName("initial")
  var initial_Original: js.Function1[
    /* handler */ java.lang.String | UrlRuleHandlerFn | atUirouterCoreLib.libStateMod.TargetState | atUirouterCoreLib.libStateInterfaceMod.TargetStateDef, 
    scala.Unit
  ] = js.native
  /** See: [[UrlRules.otherwise]] */ @JSName("otherwise")
  var otherwise_Original: js.Function1[
    /* handler */ java.lang.String | UrlRuleHandlerFn | atUirouterCoreLib.libStateMod.TargetState | atUirouterCoreLib.libStateInterfaceMod.TargetStateDef, 
    scala.Unit
  ] = js.native
  /** See: [[UrlRules.removeRule]] */ @JSName("removeRule")
  var removeRule_Original: js.Function1[/* rule */ js.Any, scala.Unit] = js.native
  /** See: [[UrlRules.rule]] */ @JSName("rule")
  var rule_Original: js.Function1[/* rule */ UrlRule, js.Function] = js.native
  /** See: [[UrlRules.rules]] */ @JSName("rules")
  var rules_Original: js.Function0[js.Array[UrlRule]] = js.native
  /** See: [[UrlRules.sort]] */ @JSName("sort")
  var sort_Original: js.Function1[
    /* compareFn */ js.UndefOr[js.Function2[/* a */ UrlRule, /* b */ UrlRule, scala.Double]], 
    scala.Unit
  ] = js.native
  /** See: [[UrlRules.when]] */ @JSName("when")
  var when_Original: js.Function3[
    /* matcher */ stdLib.RegExp | atUirouterCoreLib.libUrlUrlMatcherMod.UrlMatcher | java.lang.String, 
    /* handler */ java.lang.String | UrlRuleHandlerFn, 
    /* options */ js.UndefOr[atUirouterCoreLib.Anon_Priority], 
    UrlRule
  ] = js.native
  def initial(handler: atUirouterCoreLib.libStateInterfaceMod.TargetStateDef): scala.Unit = js.native
  def initial(handler: atUirouterCoreLib.libStateMod.TargetState): scala.Unit = js.native
  def initial(handler: UrlRuleHandlerFn): scala.Unit = js.native
  /** See: [[UrlRules.initial]] */ def initial(handler: java.lang.String): scala.Unit = js.native
  def otherwise(handler: atUirouterCoreLib.libStateInterfaceMod.TargetStateDef): scala.Unit = js.native
  def otherwise(handler: atUirouterCoreLib.libStateMod.TargetState): scala.Unit = js.native
  def otherwise(handler: UrlRuleHandlerFn): scala.Unit = js.native
  /** See: [[UrlRules.otherwise]] */ def otherwise(handler: java.lang.String): scala.Unit = js.native
  /** See: [[UrlRules.removeRule]] */ def removeRule(rule: js.Any): scala.Unit = js.native
  /** See: [[UrlRules.rule]] */ def rule(rule: UrlRule): js.Function = js.native
  /** See: [[UrlRules.rules]] */ def rules(): js.Array[UrlRule] = js.native
  /** See: [[UrlRules.sort]] */ def sort(): scala.Unit = js.native
  def sort(compareFn: js.Function2[/* a */ UrlRule, /* b */ UrlRule, scala.Double]): scala.Unit = js.native
  def when(matcher: atUirouterCoreLib.libUrlUrlMatcherMod.UrlMatcher, handler: UrlRuleHandlerFn): UrlRule = js.native
  def when(
    matcher: atUirouterCoreLib.libUrlUrlMatcherMod.UrlMatcher,
    handler: UrlRuleHandlerFn,
    options: atUirouterCoreLib.Anon_Priority
  ): UrlRule = js.native
  def when(matcher: atUirouterCoreLib.libUrlUrlMatcherMod.UrlMatcher, handler: java.lang.String): UrlRule = js.native
  def when(
    matcher: atUirouterCoreLib.libUrlUrlMatcherMod.UrlMatcher,
    handler: java.lang.String,
    options: atUirouterCoreLib.Anon_Priority
  ): UrlRule = js.native
  def when(matcher: java.lang.String, handler: UrlRuleHandlerFn): UrlRule = js.native
  def when(matcher: java.lang.String, handler: UrlRuleHandlerFn, options: atUirouterCoreLib.Anon_Priority): UrlRule = js.native
  def when(matcher: java.lang.String, handler: java.lang.String): UrlRule = js.native
  def when(matcher: java.lang.String, handler: java.lang.String, options: atUirouterCoreLib.Anon_Priority): UrlRule = js.native
  def when(matcher: stdLib.RegExp, handler: UrlRuleHandlerFn): UrlRule = js.native
  def when(matcher: stdLib.RegExp, handler: UrlRuleHandlerFn, options: atUirouterCoreLib.Anon_Priority): UrlRule = js.native
  /** See: [[UrlRules.when]] */ def when(matcher: stdLib.RegExp, handler: java.lang.String): UrlRule = js.native
  def when(matcher: stdLib.RegExp, handler: java.lang.String, options: atUirouterCoreLib.Anon_Priority): UrlRule = js.native
}

