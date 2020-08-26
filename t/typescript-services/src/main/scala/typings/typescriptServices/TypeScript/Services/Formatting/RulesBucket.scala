package typings.typescriptServices.TypeScript.Services.Formatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RulesBucket extends js.Object {
  var rules: js.Any = js.native
  def AddRule(
    rule: Rule,
    specificTokens: Boolean,
    constructionState: js.Array[RulesBucketConstructionState],
    rulesBucketIndex: Double
  ): Unit = js.native
  def Rules(): js.Array[Rule] = js.native
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
  @scala.inline
  implicit class RulesBucketOps[Self <: RulesBucket] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddRule(value: (Rule, Boolean, js.Array[RulesBucketConstructionState], Double) => Unit): Self = this.set("AddRule", js.Any.fromFunction4(value))
    @scala.inline
    def setRules(value: () => js.Array[Rule]): Self = this.set("Rules", js.Any.fromFunction0(value))
  }
  
}

