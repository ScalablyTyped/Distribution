package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A collection of SmsFilterRule instances. */
@JSGlobal("Windows.Devices.Sms.SmsFilterRules")
@js.native
class SmsFilterRules protected () extends js.Object {
  /**
                   * Creates an instance of SmsFilterRules .
                   * @param actionType An enumeration value that specifies which action type is to be associated with the rules for this instance. Action type determines the order in which rules are evaluated, as well as the action to be taken when a rule is matched.
                   */
  def this(actionType: SmsFilterActionType) = this()
  /** The SmsFilterActionType for this set of filter rules. */
  var actionType: SmsFilterActionType = js.native
  /** Gets the list of rules in this SmsFilterRules instance. */
  var rules: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[SmsFilterRule] = js.native
}

