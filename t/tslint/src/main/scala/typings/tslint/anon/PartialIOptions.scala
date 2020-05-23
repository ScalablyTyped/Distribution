package typings.tslint.anon

import typings.tslint.ruleMod.IDisabledInterval
import typings.tslint.ruleMod.RuleSeverity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<tslint.tslint/lib/language/rule/rule.IOptions> */
trait PartialIOptions extends js.Object {
  var disabledIntervals: js.UndefOr[js.Array[IDisabledInterval]] = js.undefined
  var ruleArguments: js.UndefOr[js.Array[_]] = js.undefined
  var ruleName: js.UndefOr[String] = js.undefined
  var ruleSeverity: js.UndefOr[RuleSeverity] = js.undefined
}

object PartialIOptions {
  @scala.inline
  def apply(
    disabledIntervals: js.Array[IDisabledInterval] = null,
    ruleArguments: js.Array[_] = null,
    ruleName: String = null,
    ruleSeverity: RuleSeverity = null
  ): PartialIOptions = {
    val __obj = js.Dynamic.literal()
    if (disabledIntervals != null) __obj.updateDynamic("disabledIntervals")(disabledIntervals.asInstanceOf[js.Any])
    if (ruleArguments != null) __obj.updateDynamic("ruleArguments")(ruleArguments.asInstanceOf[js.Any])
    if (ruleName != null) __obj.updateDynamic("ruleName")(ruleName.asInstanceOf[js.Any])
    if (ruleSeverity != null) __obj.updateDynamic("ruleSeverity")(ruleSeverity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIOptions]
  }
}

