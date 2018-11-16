package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs

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
  sealed trait allCalendarsReadOnly
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentStoreAccessType
  
  /** The appointment store has read and write access to all calendars created by the calling app. */
  @js.native
  sealed trait allCalendarsReadWrite
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentStoreAccessType
  
  /** The appointment store has read and write access to appointment calendars created by the calling app. */
  @js.native
  sealed trait appCalendarsReadWrite
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentStoreAccessType
  
  val allCalendarsReadOnly: allCalendarsReadOnly with java.lang.String = js.native
  val allCalendarsReadWrite: allCalendarsReadWrite with java.lang.String = js.native
  val appCalendarsReadWrite: appCalendarsReadWrite with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentStoreAccessType with java.lang.String
  ] = js.native
}

