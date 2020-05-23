package typings.typescriptServices.TypeScript.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RulesBucket extends js.Object {
  var rules: js.Any
  def AddRule(
    rule: Rule,
    specificTokens: Boolean,
    constructionState: js.Array[RulesBucketConstructionState],
    rulesBucketIndex: Double
  ): Unit
  def Rules(): js.Array[Rule]
}

object RulesBucket {
  @scala.inline
  def apply(
    AddRule: (Rule, Boolean, js.Array[RulesBucketConstructionState], Double) => Unit,
    Rules: () => js.Array[Rule],
    rules: js.Any
  ): RulesBucket = {
    val __obj = js.Dynamic.literal(AddRule = js.Any.fromFunction4(AddRule), Rules = js.Any.fromFunction0(Rules), rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulesBucket]
  }
}

