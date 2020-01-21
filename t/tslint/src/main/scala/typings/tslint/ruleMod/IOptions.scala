package typings.tslint.ruleMod

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
    val __obj = js.Dynamic.literal(disabledIntervals = disabledIntervals.asInstanceOf[js.Any], ruleArguments = ruleArguments.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any], ruleSeverity = ruleSeverity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IOptions]
  }
}

