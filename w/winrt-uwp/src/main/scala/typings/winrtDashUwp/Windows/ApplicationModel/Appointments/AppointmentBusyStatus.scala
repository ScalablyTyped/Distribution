package typings.winrtDashUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppointmentBusyStatus with Double] = js.native
  /* 0 */ @js.native
  object busy extends TopLevel[busy with Double]
  
  /* 2 */ @js.native
  object free extends TopLevel[free with Double]
  
  /* 3 */ @js.native
  object outOfOffice extends TopLevel[outOfOffice with Double]
  
  /* 1 */ @js.native
  object tentative extends TopLevel[tentative with Double]
  
  /* 4 */ @js.native
  object workingElsewhere extends TopLevel[workingElsewhere with Double]
  
}

