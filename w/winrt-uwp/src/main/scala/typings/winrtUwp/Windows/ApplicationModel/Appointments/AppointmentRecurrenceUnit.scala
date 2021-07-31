package typings.winrtUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AppointmentRecurrenceUnit extends StObject
/** Specifies the frequency for which an appointment occurs. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentRecurrenceUnit")
@js.native
object AppointmentRecurrenceUnit extends StObject {
  
  /** Appointment occurs daily. */
  @js.native
  sealed trait daily
    extends StObject
       with AppointmentRecurrenceUnit
  
  /** Appointment occurs monthly. */
  @js.native
  sealed trait monthly
    extends StObject
       with AppointmentRecurrenceUnit
  
  /** Appointment occurs monthly on a particular day of the month. */
  @js.native
  sealed trait monthlyOnDay
    extends StObject
       with AppointmentRecurrenceUnit
  
  /** Appointment occurs weekly. */
  @js.native
  sealed trait weekly
    extends StObject
       with AppointmentRecurrenceUnit
  
  /** Appointment occurs yearly. */
  @js.native
  sealed trait yearly
    extends StObject
       with AppointmentRecurrenceUnit
  
  /** Appointment occurs yearly on a particular day of the year. */
  @js.native
  sealed trait yearlyOnDay
    extends StObject
       with AppointmentRecurrenceUnit
}
