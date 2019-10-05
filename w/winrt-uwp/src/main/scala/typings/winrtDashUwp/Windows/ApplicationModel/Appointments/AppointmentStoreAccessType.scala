package typings.winrtDashUwp.Windows.ApplicationModel.Appointments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppointmentStoreAccessType extends js.Object

/** Specifies the level of access granted to an AppointmentStore . */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentStoreAccessType")
@js.native
object AppointmentStoreAccessType extends js.Object {
  /** The appointment store has read-only access to all calendars on the device. */
  @js.native
  sealed trait allCalendarsReadOnly extends AppointmentStoreAccessType
  
  /** The appointment store has read and write access to all calendars created by the calling app. */
  @js.native
  sealed trait allCalendarsReadWrite extends AppointmentStoreAccessType
  
  /** The appointment store has read and write access to appointment calendars created by the calling app. */
  @js.native
  sealed trait appCalendarsReadWrite extends AppointmentStoreAccessType
  
  /* 1 */ val allCalendarsReadOnly: typings.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentStoreAccessType.allCalendarsReadOnly with Double = js.native
  /* 2 */ val allCalendarsReadWrite: typings.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentStoreAccessType.allCalendarsReadWrite with Double = js.native
  /* 0 */ val appCalendarsReadWrite: typings.winrtDashUwp.Windows.ApplicationModel.Appointments.AppointmentStoreAccessType.appCalendarsReadWrite with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppointmentStoreAccessType with Double] = js.native
}

