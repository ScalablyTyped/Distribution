package typings.winrtUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AppointmentConflictType extends StObject
/** Specifies the way in which an appointment conflicts with another appointment. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentConflictType")
@js.native
object AppointmentConflictType extends StObject {
  
  /** The appointment is adjacent to another appointment. */
  @js.native
  sealed trait adjacent
    extends StObject
       with AppointmentConflictType
  
  /** There is no appointment conflict. */
  @js.native
  sealed trait none
    extends StObject
       with AppointmentConflictType
  
  /** The appointment overlaps another appointment. */
  @js.native
  sealed trait overlap
    extends StObject
       with AppointmentConflictType
}
