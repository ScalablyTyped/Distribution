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
  
  val exceptionInstance: exceptionInstance with java.lang.String = js.native
  val instance: instance with java.lang.String = js.native
  val master: master with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppointmentsNs.RecurrenceType with java.lang.String
  ] = js.native
}

