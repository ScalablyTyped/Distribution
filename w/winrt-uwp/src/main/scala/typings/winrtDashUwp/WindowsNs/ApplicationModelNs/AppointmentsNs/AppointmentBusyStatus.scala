package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs

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
  sealed trait busy extends AppointmentBusyStatus
  
  /** The participant is free and so can attend the appointment. */
  @js.native
  sealed trait free extends AppointmentBusyStatus
  
  /** The participant is out of office. */
  @js.native
  sealed trait outOfOffice extends AppointmentBusyStatus
  
  /** The participant might be able to attend the appointment. */
  @js.native
  sealed trait tentative extends AppointmentBusyStatus
  
  /** The participant is working elsewhere. */
  @js.native
  sealed trait workingElsewhere extends AppointmentBusyStatus
  
  /* 0 */ val busy: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentBusyStatus.busy with Double = js.native
  /* 2 */ val free: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentBusyStatus.free with Double = js.native
  /* 3 */ val outOfOffice: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentBusyStatus.outOfOffice with Double = js.native
  /* 1 */ val tentative: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentBusyStatus.tentative with Double = js.native
  /* 4 */ val workingElsewhere: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.AppointmentBusyStatus.workingElsewhere with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppointmentBusyStatus with Double] = js.native
}

