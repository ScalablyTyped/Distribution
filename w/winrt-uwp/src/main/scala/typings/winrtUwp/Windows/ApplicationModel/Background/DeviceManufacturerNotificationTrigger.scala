package typings.winrtUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a trigger that launches a background task to enable device manufacturer operations. */
trait DeviceManufacturerNotificationTrigger extends js.Object {
  /** Gets whether the trigger is used only once. */
  var oneShot: Boolean
  /** Gets an app-defined string that qualifies the trigger. */
  var triggerQualifier: String
}

object DeviceManufacturerNotificationTrigger {
  @scala.inline
  def apply(oneShot: Boolean, triggerQualifier: String): DeviceManufacturerNotificationTrigger = {
    val __obj = js.Dynamic.literal(oneShot = oneShot.asInstanceOf[js.Any], triggerQualifier = triggerQualifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceManufacturerNotificationTrigger]
  }
}

