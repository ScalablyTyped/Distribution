package typings.winrtUwp.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a location event that triggers a background task. This is used for Geofencing. */
trait LocationTrigger extends js.Object {
  /** The type of location event for this trigger. */
  var triggerType: LocationTriggerType
}

object LocationTrigger {
  @scala.inline
  def apply(triggerType: LocationTriggerType): LocationTrigger = {
    val __obj = js.Dynamic.literal(triggerType = triggerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationTrigger]
  }
}

