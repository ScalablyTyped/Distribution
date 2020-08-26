package typings.winrtUwp.global.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a location event that triggers a background task. This is used for Geofencing. */
@JSGlobal("Windows.ApplicationModel.Background.LocationTrigger")
@js.native
class LocationTrigger protected ()
  extends typings.winrtUwp.Windows.ApplicationModel.Background.LocationTrigger {
  /**
    * Initializes a new instance of a location event trigger.
    * @param triggerType The type of location event for this trigger.
    */
  def this(triggerType: typings.winrtUwp.Windows.ApplicationModel.Background.LocationTriggerType) = this()
}

