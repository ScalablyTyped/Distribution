package typings.winrtUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a system event that triggers a background task to run. */
trait SystemTrigger extends js.Object {
  /** Gets whether a system event trigger will be used only once. */
  var oneShot: Boolean
  /** Gets the system event type of a system event trigger. */
  var triggerType: SystemTriggerType
}

object SystemTrigger {
  @scala.inline
  def apply(oneShot: Boolean, triggerType: SystemTriggerType): SystemTrigger = {
    val __obj = js.Dynamic.literal(oneShot = oneShot.asInstanceOf[js.Any], triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemTrigger]
  }
}

