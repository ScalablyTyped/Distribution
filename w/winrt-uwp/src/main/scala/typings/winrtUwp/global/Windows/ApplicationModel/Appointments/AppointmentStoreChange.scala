package typings.winrtUwp.global.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a change that has occurred in an appointment store. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentStoreChange")
@js.native
abstract class AppointmentStoreChange ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentStoreChange {
  
  /** Gets the Appointment associated with the change. */
  /* CompleteClass */
  var appointment: typings.winrtUwp.Windows.ApplicationModel.Appointments.Appointment = js.native
  
  /** Gets the AppointmentCalendar in which the change occurred. */
  /* CompleteClass */
  var appointmentCalendar: typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentCalendar = js.native
  
  /** Gets an AppointmentStoreChangeType value indicating the type of change represented by the object. */
  /* CompleteClass */
  var changeType: typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentStoreChangeType = js.native
}
