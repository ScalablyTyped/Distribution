package typings.winrtUwp.global.Windows.ApplicationModel.Appointments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines operations classes for add appointment and remove appointment requests through activations that an appointments provider interacts with. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentsProvider")
@js.native
object AppointmentsProvider extends js.Object {
  
  /** Represents the operation object associated with adding a new appointment. Appointments provider apps use this info to perform the operation. */
  @js.native
  abstract class AddAppointmentOperation ()
    extends typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentsProvider.AddAppointmentOperation
  
  /** Represents the object associated with retrieving the operation of the appointments provider. */
  @js.native
  abstract class AppointmentsProviderLaunchActionVerbs ()
    extends typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentsProvider.AppointmentsProviderLaunchActionVerbs
  /* static members */
  @js.native
  object AppointmentsProviderLaunchActionVerbs extends js.Object {
    
    /** Gets the add-appointment action that the appointments provider performs. */
    var addAppointment: String = js.native
    
    /** Gets the remove-appointment action that the appointments provider performs. */
    var removeAppointment: String = js.native
    
    /** Gets the replace-appointment action that the appointments provider performs. */
    var replaceAppointment: String = js.native
    
    /** Gets the show-appointment-details action that the appointments provider performs. */
    var showAppointmentDetails: String = js.native
    
    /** Gets the show-time-frame action of an appointment that the appointments provider performs. */
    var showTimeFrame: String = js.native
  }
  
  /** Represents the operation object associated with removing an appointment. Appointments provider apps use this info to perform the operation. */
  @js.native
  abstract class RemoveAppointmentOperation ()
    extends typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentsProvider.RemoveAppointmentOperation
  
  /** Represents the operation object associated with replacing an appointment. Appointments provider apps use this info to perform the operation. */
  @js.native
  abstract class ReplaceAppointmentOperation ()
    extends typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentsProvider.ReplaceAppointmentOperation
}
