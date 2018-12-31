package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a trigger that is raised when an SMS message has arrived. */
@JSGlobal("Windows.ApplicationModel.Background.SmsMessageReceivedTrigger")
@js.native
class SmsMessageReceivedTrigger protected () extends js.Object {
  /**
    * Initializes a new instance of an SMS message received trigger.
    * @param filterRules Filter rules to be applied to incoming SMS messages. Only messages that pass through the filter rules raise the trigger.
    */
  def this(filterRules: winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs.SmsFilterRules) = this()
}

