package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.BackgroundNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a location event that triggers a background task. This is used for Geofencing. */
@JSGlobal("Windows.ApplicationModel.Background.LocationTrigger")
@js.native
class LocationTrigger protected () extends js.Object {
  /**
    * Initializes a new instance of a location event trigger.
    * @param triggerType The type of location event for this trigger.
    */
  def this(triggerType: LocationTriggerType) = this()
  /** The type of location event for this trigger. */
  var triggerType: LocationTriggerType = js.native
}

