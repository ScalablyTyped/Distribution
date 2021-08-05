package typings.winrtUwp.global.Windows.ApplicationModel.Appointments

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines operations classes for add appointment and remove appointment requests through activations that an appointments provider interacts with. */
object AppointmentsProvider {
  
  /** Represents the operation object associated with adding a new appointment. Appointments provider apps use this info to perform the operation. */
  @JSGlobal("Windows.ApplicationModel.Appointments.AppointmentsProvider.AddAppointmentOperation")
  @js.native
  abstract class AddAppointmentOperation ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentsProvider.AddAppointmentOperation {
    
    /** Gets the Appointment info from the activation request. */
    /* CompleteClass */
    var appointmentInformation: typings.winrtUwp.Windows.ApplicationModel.Appointments.Appointment = js.native
    
    /** Dismisses the UI for the operation that adds a new appointment. */
    /* CompleteClass */
    override def dismissUI(): Unit = js.native
    
    /** Call this method to inform the activating app that the operation was canceled by the user. */
    /* CompleteClass */
    override def reportCanceled(): Unit = js.native
    
    /**
      * Call this method to inform the activating app that the operation was completed successfully. Provide a unique appointment ID as the itemID parameter.
      * @param itemId A unique appointment ID that the activating app can later use to remove this appointment if necessary.
      */
    /* CompleteClass */
    override def reportCompleted(itemId: String): Unit = js.native
    
    /**
      * Informs the activating app that the operation couldn't be completed because of a provider error.
      * @param value A string that contains info about the error.
      */
    /* CompleteClass */
    override def reportError(value: String): Unit = js.native
    
    /** Gets the package family name of the app that is requesting the operation. */
    /* CompleteClass */
    var sourcePackageFamilyName: String = js.native
  }
  
  /** Represents the object associated with retrieving the operation of the appointments provider. */
  @JSGlobal("Windows.ApplicationModel.Appointments.AppointmentsProvider.AppointmentsProviderLaunchActionVerbs")
  @js.native
  abstract class AppointmentsProviderLaunchActionVerbs ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentsProvider.AppointmentsProviderLaunchActionVerbs
  object AppointmentsProviderLaunchActionVerbs {
    
    @JSGlobal("Windows.ApplicationModel.Appointments.AppointmentsProvider.AppointmentsProviderLaunchActionVerbs")
    @js.native
    val ^ : js.Any = js.native
    
    /** Gets the add-appointment action that the appointments provider performs. */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.Appointments.AppointmentsProvider.AppointmentsProviderLaunchActionVerbs.addAppointment")
    @js.native
    def addAppointment: String = js.native
    inline def addAppointment_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addAppointment")(x.asInstanceOf[js.Any])
    
    /** Gets the remove-appointment action that the appointments provider performs. */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.Appointments.AppointmentsProvider.AppointmentsProviderLaunchActionVerbs.removeAppointment")
    @js.native
    def removeAppointment: String = js.native
    inline def removeAppointment_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeAppointment")(x.asInstanceOf[js.Any])
    
    /** Gets the replace-appointment action that the appointments provider performs. */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.Appointments.AppointmentsProvider.AppointmentsProviderLaunchActionVerbs.replaceAppointment")
    @js.native
    def replaceAppointment: String = js.native
    inline def replaceAppointment_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("replaceAppointment")(x.asInstanceOf[js.Any])
    
    /** Gets the show-appointment-details action that the appointments provider performs. */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.Appointments.AppointmentsProvider.AppointmentsProviderLaunchActionVerbs.showAppointmentDetails")
    @js.native
    def showAppointmentDetails: String = js.native
    inline def showAppointmentDetails_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showAppointmentDetails")(x.asInstanceOf[js.Any])
    
    /** Gets the show-time-frame action of an appointment that the appointments provider performs. */
    /* static member */
    @JSGlobal("Windows.ApplicationModel.Appointments.AppointmentsProvider.AppointmentsProviderLaunchActionVerbs.showTimeFrame")
    @js.native
    def showTimeFrame: String = js.native
    inline def showTimeFrame_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showTimeFrame")(x.asInstanceOf[js.Any])
  }
  
  /** Represents the operation object associated with removing an appointment. Appointments provider apps use this info to perform the operation. */
  @JSGlobal("Windows.ApplicationModel.Appointments.AppointmentsProvider.RemoveAppointmentOperation")
  @js.native
  abstract class RemoveAppointmentOperation ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentsProvider.RemoveAppointmentOperation {
    
    /** Gets the unique identifier of the appointment to remove. */
    /* CompleteClass */
    var appointmentId: String = js.native
    
    /** Dismisses the UI for the operation that removes an appointment. */
    /* CompleteClass */
    override def dismissUI(): Unit = js.native
    
    /** Gets the start date and time of the appointment instance to remove. */
    /* CompleteClass */
    var instanceStartDate: Date = js.native
    
    /** Call this method to inform the activating app that the operation was canceled by the user. */
    /* CompleteClass */
    override def reportCanceled(): Unit = js.native
    
    /** Informs the activating app that the operation was completed successfully. */
    /* CompleteClass */
    override def reportCompleted(): Unit = js.native
    
    /**
      * Informs the activating app that the operation couldn't be completed because of a provider error.
      * @param value A string that contains info about the error.
      */
    /* CompleteClass */
    override def reportError(value: String): Unit = js.native
    
    /** Gets the package family name of the app that is requesting the operation. */
    /* CompleteClass */
    var sourcePackageFamilyName: String = js.native
  }
  
  /** Represents the operation object associated with replacing an appointment. Appointments provider apps use this info to perform the operation. */
  @JSGlobal("Windows.ApplicationModel.Appointments.AppointmentsProvider.ReplaceAppointmentOperation")
  @js.native
  abstract class ReplaceAppointmentOperation ()
    extends StObject
       with typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentsProvider.ReplaceAppointmentOperation {
    
    /** Gets the unique identifier of the appointment to replace. */
    /* CompleteClass */
    var appointmentId: String = js.native
    
    /** Gets the Appointment info from the activation request. */
    /* CompleteClass */
    var appointmentInformation: typings.winrtUwp.Windows.ApplicationModel.Appointments.Appointment = js.native
    
    /** Dismisses the UI for the operation that replaces an appointment. */
    /* CompleteClass */
    override def dismissUI(): Unit = js.native
    
    /** Gets the start date and time of the appointment instance to replace. */
    /* CompleteClass */
    var instanceStartDate: Date = js.native
    
    /** Informs the activating app that the operation was canceled by the user. */
    /* CompleteClass */
    override def reportCanceled(): Unit = js.native
    
    /**
      * Informs the activating app that the operation was completed successfully.
      * @param itemId A unique appointment ID that the activating app can later use to remove this appointment if necessary or to replace it again.
      */
    /* CompleteClass */
    override def reportCompleted(itemId: String): Unit = js.native
    
    /**
      * Informs the activating app that the operation couldn't be completed because of a provider error.
      * @param value A string that contains info about the error.
      */
    /* CompleteClass */
    override def reportError(value: String): Unit = js.native
    
    /** Gets the package family name of the app that is requesting the operation. */
    /* CompleteClass */
    var sourcePackageFamilyName: String = js.native
  }
}
