package typings.tslint.libLanguageRuleRuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends js.Object {
  /**
    * @deprecated
    * Tslint now handles disables itself.
    * This will be empty.
    */
  var disabledIntervals: js.Array[IDisabledInterval]
  var ruleArguments: js.Array[_]
  var ruleName: String
  var ruleSeverity: RuleSeverity
}

object IOptions {
  @scala.inline
  def apply(
    disabledIntervals: js.Array[IDisabledInterval],
    ruleArguments: js.Array[_],
    ruleName: String,
    ruleSeverity: RuleSeverity
  ): IOptions = {
    val __obj = js.Dynamic.literal(disabledIntervals = disabledIntervals, ruleArguments = ruleArguments, ruleName = ruleName, ruleSeverity = ruleSeverity)
  
    __obj.asInstanceOf[IOptions]
  }
}

