package typings.winrtUwp.global.Windows.ApplicationModel.Background

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a maintenance trigger. */
@JSGlobal("Windows.ApplicationModel.Background.MaintenanceTrigger")
@js.native
class MaintenanceTrigger protected ()
  extends typings.winrtUwp.Windows.ApplicationModel.Background.MaintenanceTrigger {
  /**
    * Initializes a new instance of a maintenance trigger.
    * @param freshnessTime The number of minutes to wait before scheduling the background task. The system schedules the task within 15 minutes after freshnessTime elapses.
    * @param oneShot True if the maintenance trigger is used once; false if it is used each time the freshnessTime interval elapses.
    */
  def this(freshnessTime: Double, oneShot: Boolean) = this()
}

