package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs

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
  sealed trait exceptionInstance
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.RecurrenceType
  
  /** The appointment is an instance of a recurring appointment. */
  @js.native
  sealed trait instance
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.RecurrenceType
  
  /** The appointment is the master appointment for a recurring appointment. */
  @js.native
  sealed trait master
    extends winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.RecurrenceType
  
  /* 2 */ val exceptionInstance: exceptionInstance with scala.Double = js.native
  /* 1 */ val instance: instance with scala.Double = js.native
  /* 0 */ val master: master with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.RecurrenceType with scala.Double
  ] = js.native
}

