package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RecurrenceType extends js.Object

/** Specifies the recurrence type of an appointment. */
@JSGlobal("Windows.ApplicationModel.Appointments.RecurrenceType")
@js.native
object RecurrenceType extends js.Object {
  /** The appointment is an exceptional instance of a recurring appointment. */
  @js.native
  sealed trait exceptionInstance extends RecurrenceType
  
  /** The appointment is an instance of a recurring appointment. */
  @js.native
  sealed trait instance extends RecurrenceType
  
  /** The appointment is the master appointment for a recurring appointment. */
  @js.native
  sealed trait master extends RecurrenceType
  
  /* 2 */ val exceptionInstance: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.RecurrenceType.exceptionInstance with Double = js.native
  /* 1 */ val instance: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.RecurrenceType.instance with Double = js.native
  /* 0 */ val master: typings.winrtDashUwp.WindowsNs.ApplicationModelNs.AppointmentsNs.RecurrenceType.master with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RecurrenceType with Double] = js.native
}

