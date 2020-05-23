package typings.typescriptServices.TypeScript.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RulesMap extends js.Object {
  var map: js.Array[RulesBucket]
  var mapRowLength: Double
  /* private */ def FillRule(rule: js.Any, rulesBucketConstructionStateList: js.Any): js.Any
  def FillRules(rules: js.Array[Rule], rulesBucketConstructionStateList: js.Array[RulesBucketConstructionState]): Unit
  def GetRule(context: FormattingContext): Rule
  /* private */ def GetRuleBucketIndex(row: js.Any, column: js.Any): js.Any
  def Initialize(rules: js.Array[Rule]): js.Array[RulesBucket]
}

object RulesMap {
  @scala.inline
  def apply(
    FillRule: (js.Any, js.Any) => js.Any,
    FillRules: (js.Array[Rule], js.Array[RulesBucketConstructionState]) => Unit,
    GetRule: FormattingContext => Rule,
    GetRuleBucketIndex: (js.Any, js.Any) => js.Any,
    Initialize: js.Array[Rule] => js.Array[RulesBucket],
    map: js.Array[RulesBucket],
    mapRowLength: Double
  ): RulesMap = {
    val __obj = js.Dynamic.literal(FillRule = js.Any.fromFunction2(FillRule), FillRules = js.Any.fromFunction2(FillRules), GetRule = js.Any.fromFunction1(GetRule), GetRuleBucketIndex = js.Any.fromFunction2(GetRuleBucketIndex), Initialize = js.Any.fromFunction1(Initialize), map = map.asInstanceOf[js.Any], mapRowLength = mapRowLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesMap]
  }
}

