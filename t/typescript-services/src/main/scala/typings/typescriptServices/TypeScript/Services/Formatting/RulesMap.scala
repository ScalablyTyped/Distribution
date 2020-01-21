package typings.typescriptServices.TypeScript.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("TypeScript.Services.Formatting.RulesMap")
@js.native
class RulesMap () extends js.Object {
  var map: js.Array[RulesBucket] = js.native
  var mapRowLength: Double = js.native
  /* private */ def FillRule(rule: js.Any, rulesBucketConstructionStateList: js.Any): js.Any = js.native
  def FillRules(rules: js.Array[Rule], rulesBucketConstructionStateList: js.Array[RulesBucketConstructionState]): Unit = js.native
  def GetRule(context: FormattingContext): Rule = js.native
  /* private */ def GetRuleBucketIndex(row: js.Any, column: js.Any): js.Any = js.native
  def Initialize(rules: js.Array[Rule]): js.Array[RulesBucket] = js.native
}

/* static members */
@JSGlobal("TypeScript.Services.Formatting.RulesMap")
@js.native
object RulesMap extends js.Object {
  def create(rules: js.Array[Rule]): RulesMap = js.native
}

