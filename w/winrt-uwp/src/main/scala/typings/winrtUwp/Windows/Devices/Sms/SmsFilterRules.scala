package typings.winrtUwp.Windows.Devices.Sms

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A collection of SmsFilterRule instances. */
trait SmsFilterRules extends js.Object {
  /** The SmsFilterActionType for this set of filter rules. */
  var actionType: SmsFilterActionType
  /** Gets the list of rules in this SmsFilterRules instance. */
  var rules: IVector[SmsFilterRule]
}

object SmsFilterRules {
  @scala.inline
  def apply(actionType: SmsFilterActionType, rules: IVector[SmsFilterRule]): SmsFilterRules = {
    val __obj = js.Dynamic.literal(actionType = actionType.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsFilterRules]
  }
}

