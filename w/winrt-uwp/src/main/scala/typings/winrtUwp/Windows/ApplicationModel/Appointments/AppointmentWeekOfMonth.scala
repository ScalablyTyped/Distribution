package typings.winrtUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AppointmentWeekOfMonth extends StObject
/** Specifies the week of the month for which the appointment occurs. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentWeekOfMonth")
@js.native
object AppointmentWeekOfMonth extends StObject {
  
  /** The appointment occurs on the first week of the month. */
  @js.native
  sealed trait first
    extends StObject
       with AppointmentWeekOfMonth
  
  /** The appointment occurs on the fourth week of the month. */
  @js.native
  sealed trait fourth
    extends StObject
       with AppointmentWeekOfMonth
  
  /** The appointment occurs on the last week of the month. */
  @js.native
  sealed trait last
    extends StObject
       with AppointmentWeekOfMonth
  
  /** The appointment occurs on the second week of the month. */
  @js.native
  sealed trait second
    extends StObject
       with AppointmentWeekOfMonth
  
  /** The appointment occurs on the third week of the month. */
  @js.native
  sealed trait third
    extends StObject
       with AppointmentWeekOfMonth
}
