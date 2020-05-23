package typings.winrtUwp.global.Windows.ApplicationModel.Appointments

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines operations classes for add appointment and remove appointment requests through activations that an appointments provider interacts with. */
@JSGlobal("Windows.ApplicationModel.Appointments.AppointmentsProvider")
@js.native
object AppointmentsProvider extends js.Object {
  /** Represents the operation object associated with adding a new appointment. Appointments provider apps use this info to perform the operation. */
  @js.native
  abstract class AddAppointmentOperation ()
    extends typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentsProvider.AddAppointmentOperation {
    /** Gets the Appointment info from the activation request. */
    /* CompleteClass */
    override var appointmentInformation: typings.winrtUwp.Windows.ApplicationModel.Appointments.Appointment = js.native
    /** Gets the package family name of the app that is requesting the operation. */
    /* CompleteClass */
    override var sourcePackageFamilyName: String = js.native
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
  }
  
  /** Represents the object associated with retrieving the operation of the appointments provider. */
  @js.native
  abstract class AppointmentsProviderLaunchActionVerbs ()
    extends typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentsProvider.AppointmentsProviderLaunchActionVerbs
  
  /** Represents the operation object associated with removing an appointment. Appointments provider apps use this info to perform the operation. */
  @js.native
  abstract class RemoveAppointmentOperation ()
    extends typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentsProvider.RemoveAppointmentOperation {
    /** Gets the unique identifier of the appointment to remove. */
    /* CompleteClass */
    override var appointmentId: String = js.native
    /** Gets the start date and time of the appointment instance to remove. */
    /* CompleteClass */
    override var instanceStartDate: Date = js.native
    /** Gets the package family name of the app that is requesting the operation. */
    /* CompleteClass */
    override var sourcePackageFamilyName: String = js.native
    /** Dismisses the UI for the operation that removes an appointment. */
    /* CompleteClass */
    override def dismissUI(): Unit = js.native
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
  }
  
  /** Represents the operation object associated with replacing an appointment. Appointments provider apps use this info to perform the operation. */
  @js.native
  abstract class ReplaceAppointmentOperation ()
    extends typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentsProvider.ReplaceAppointmentOperation {
    /** Gets the unique identifier of the appointment to replace. */
    /* CompleteClass */
    override var appointmentId: String = js.native
    /** Gets the Appointment info from the activation request. */
    /* CompleteClass */
    override var appointmentInformation: typings.winrtUwp.Windows.ApplicationModel.Appointments.Appointment = js.native
    /** Gets the start date and time of the appointment instance to replace. */
    /* CompleteClass */
    override var instanceStartDate: Date = js.native
    /** Gets the package family name of the app that is requesting the operation. */
    /* CompleteClass */
    override var sourcePackageFamilyName: String = js.native
    /** Dismisses the UI for the operation that replaces an appointment. */
    /* CompleteClass */
    override def dismissUI(): Unit = js.native
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
  }
  
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
  
}

