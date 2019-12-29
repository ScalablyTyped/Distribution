package typings.winrtDashUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AppointmentConflictType extends js.Object

/** Specifies the way in which an appointment conflicts with another appointment. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentConflictType")
@js.native
object AppointmentConflictType extends js.Object {
  /** The appointment is adjacent to another appointment. */
  @js.native
  sealed trait adjacent extends AppointmentConflictType
  
  /** There is no appointment conflict. */
  @js.native
  sealed trait none extends AppointmentConflictType
  
  /** The appointment overlaps another appointment. */
  @js.native
  sealed trait overlap extends AppointmentConflictType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AppointmentConflictType with Double] = js.native
  /* 1 */ @js.native
  object adjacent extends TopLevel[adjacent with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object overlap extends TopLevel[overlap with Double]
  
}

