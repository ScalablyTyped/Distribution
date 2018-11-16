package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppointmentBusyStatus extends js.Object

/** Specifies the busy status for a participant of an appointment. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentBusyStatus")
@js.native
object AppointmentBusyStatus extends js.Object {
  /** The participant is busy and so can't attend the appointment. */
  @js.native
  sealed trait busy
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentBusyStatus
  
  /** The participant is free and so can attend the appointment. */
  @js.native
  sealed trait free
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentBusyStatus
  
  /** The participant is out of office. */
  @js.native
  sealed trait outOfOffice
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentBusyStatus
  
  /** The participant might be able to attend the appointment. */
  @js.native
  sealed trait tentative
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentBusyStatus
  
  /** The participant is working elsewhere. */
  @js.native
  sealed trait workingElsewhere
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentBusyStatus
  
  val busy: busy with java.lang.String = js.native
  val free: free with java.lang.String = js.native
  val outOfOffice: outOfOffice with java.lang.String = js.native
  val tentative: tentative with java.lang.String = js.native
  val workingElsewhere: workingElsewhere with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentBusyStatus with java.lang.String
  ] = js.native
}

