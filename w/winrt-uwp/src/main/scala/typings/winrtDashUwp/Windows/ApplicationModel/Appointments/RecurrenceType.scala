package typings.winrtDashUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.ApplicationModel.Appointments.RecurrenceType.exceptionInstance
import typings.winrtDashUwp.Windows.ApplicationModel.Appointments.RecurrenceType.instance
import typings.winrtDashUwp.Windows.ApplicationModel.Appointments.RecurrenceType.master
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RecurrenceType with Double] = js.native
  /* 2 */ @js.native
  object exceptionInstance extends TopLevel[exceptionInstance with Double]
  
  /* 1 */ @js.native
  object instance extends TopLevel[instance with Double]
  
  /* 0 */ @js.native
  object master extends TopLevel[master with Double]
  
}

