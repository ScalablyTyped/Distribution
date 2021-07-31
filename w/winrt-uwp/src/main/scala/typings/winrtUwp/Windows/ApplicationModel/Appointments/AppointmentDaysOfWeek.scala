package typings.winrtUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AppointmentDaysOfWeek extends StObject
/** Specifies the days of the week on which an appointment occurs. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentDaysOfWeek")
@js.native
object AppointmentDaysOfWeek extends StObject {
  
  /** The appointment occurs on Friday. */
  @js.native
  sealed trait friday
    extends StObject
       with AppointmentDaysOfWeek
  
  /** The appointment occurs on Monday. */
  @js.native
  sealed trait monday
    extends StObject
       with AppointmentDaysOfWeek
  
  /** The appointment doesn't occur on any days of the week. */
  @js.native
  sealed trait none
    extends StObject
       with AppointmentDaysOfWeek
  
  /** The appointment occurs on Saturday. */
  @js.native
  sealed trait saturday
    extends StObject
       with AppointmentDaysOfWeek
  
  /** The appointment occurs on Sunday. */
  @js.native
  sealed trait sunday
    extends StObject
       with AppointmentDaysOfWeek
  
  /** The appointment occurs on Thursday. */
  @js.native
  sealed trait thursday
    extends StObject
       with AppointmentDaysOfWeek
  
  /** The appointment occurs on Tuesday. */
  @js.native
  sealed trait tuesday
    extends StObject
       with AppointmentDaysOfWeek
  
  /** The appointment occurs on Wednesday. */
  @js.native
  sealed trait wednesday
    extends StObject
       with AppointmentDaysOfWeek
}
