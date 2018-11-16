package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a phone event that triggers a background task. */
@JSGlobal("Windows.ApplicationModel.Background.PhoneTrigger")
@js.native
class PhoneTrigger protected () extends js.Object {
  /**
                   * Initializes a new instance of the PhoneTrigger class.
                   * @param type Specifies the type of phone event.
                   * @param oneShot Indicates if the trigger is a one-shot notification. If you weren't subscribed when a one-shot notification was sent, you get nothing. If you weren't connected when you fired a one-shot notification, nothing happens.
                   */
  def this(`type`: winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneTriggerType, oneShot: scala.Boolean) = this()
  /** Gets a Boolean value indicating if the trigger is a one-shot notification. */
  var oneShot: scala.Boolean = js.native
  /** Gets the type of phone event indicated by the trigger. */
  var triggerType: winrtDashUwpLib.WindowsNs.ApplicationModelNs.CallsNs.BackgroundNs.PhoneTriggerType = js.native
}

