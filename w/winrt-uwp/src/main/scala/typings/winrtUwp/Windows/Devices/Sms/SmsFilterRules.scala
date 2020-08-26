package typings.winrtUwp.Windows.Devices.Sms

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A collection of SmsFilterRule instances. */
@js.native
trait SmsFilterRules extends js.Object {
  /** The SmsFilterActionType for this set of filter rules. */
  var actionType: SmsFilterActionType = js.native
  /** Gets the list of rules in this SmsFilterRules instance. */
  var rules: IVector[SmsFilterRule] = js.native
}

object SmsFilterRules {
  @scala.inline
  def apply(actionType: SmsFilterActionType, rules: IVector[SmsFilterRule]): SmsFilterRules = {
    val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsFilterRules]
  }
  @scala.inline
  implicit class SmsFilterRulesOps[Self <: SmsFilterRules] (val x: Self) extends AnyVal {
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
    def setActionType(value: SmsFilterActionType): Self = this.set("actionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setRules(value: IVector[SmsFilterRule]): Self = this.set("rules", value.asInstanceOf[js.Any])
  }
  
}

