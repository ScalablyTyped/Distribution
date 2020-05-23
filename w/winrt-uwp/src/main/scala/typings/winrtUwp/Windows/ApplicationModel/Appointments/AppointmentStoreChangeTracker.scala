package typings.winrtUwp.Windows.ApplicationModel.Appointments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides APIs for managing change tracking for appointments. */
trait AppointmentStoreChangeTracker extends js.Object {
  var enable: js.Any
   /* unmapped type */ var getChangeReader: js.Any
   /* unmapped type */ var reset: js.Any
}

object AppointmentStoreChangeTracker {
  @scala.inline
  def apply(enable: js.Any, getChangeReader: js.Any, reset: js.Any): AppointmentStoreChangeTracker = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], getChangeReader = getChangeReader.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentStoreChangeTracker]
  }
}

