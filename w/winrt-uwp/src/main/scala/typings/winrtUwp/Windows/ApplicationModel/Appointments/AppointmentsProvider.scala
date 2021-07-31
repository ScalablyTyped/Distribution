package typings.winrtUwp.Windows.ApplicationModel.Appointments

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines operations classes for add appointment and remove appointment requests through activations that an appointments provider interacts with. */
object AppointmentsProvider {
  
  /** Represents the operation object associated with adding a new appointment. Appointments provider apps use this info to perform the operation. */
  trait AddAppointmentOperation extends StObject {
    
    /** Gets the Appointment info from the activation request. */
    var appointmentInformation: Appointment
    
    /** Dismisses the UI for the operation that adds a new appointment. */
    def dismissUI(): Unit
    
    /** Call this method to inform the activating app that the operation was canceled by the user. */
    def reportCanceled(): Unit
    
    /**
      * Call this method to inform the activating app that the operation was completed successfully. Provide a unique appointment ID as the itemID parameter.
      * @param itemId A unique appointment ID that the activating app can later use to remove this appointment if necessary.
      */
    def reportCompleted(itemId: String): Unit
    
    /**
      * Informs the activating app that the operation couldn't be completed because of a provider error.
      * @param value A string that contains info about the error.
      */
    def reportError(value: String): Unit
    
    /** Gets the package family name of the app that is requesting the operation. */
    var sourcePackageFamilyName: String
  }
  object AddAppointmentOperation {
    
    @scala.inline
    def apply(
      appointmentInformation: Appointment,
      dismissUI: () => Unit,
      reportCanceled: () => Unit,
      reportCompleted: String => Unit,
      reportError: String => Unit,
      sourcePackageFamilyName: String
    ): AddAppointmentOperation = {
      val __obj = js.Dynamic.literal(appointmentInformation = appointmentInformation.asInstanceOf[js.Any], dismissUI = js.Any.fromFunction0(dismissUI), reportCanceled = js.Any.fromFunction0(reportCanceled), reportCompleted = js.Any.fromFunction1(reportCompleted), reportError = js.Any.fromFunction1(reportError), sourcePackageFamilyName = sourcePackageFamilyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddAppointmentOperation]
    }
    
    @scala.inline
    implicit class AddAppointmentOperationMutableBuilder[Self <: AddAppointmentOperation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppointmentInformation(value: Appointment): Self = StObject.set(x, "appointmentInformation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissUI(value: () => Unit): Self = StObject.set(x, "dismissUI", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReportCanceled(value: () => Unit): Self = StObject.set(x, "reportCanceled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReportCompleted(value: String => Unit): Self = StObject.set(x, "reportCompleted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReportError(value: String => Unit): Self = StObject.set(x, "reportError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSourcePackageFamilyName(value: String): Self = StObject.set(x, "sourcePackageFamilyName", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents the object associated with retrieving the operation of the appointments provider. */
  trait AppointmentsProviderLaunchActionVerbs extends StObject
  
  /** Represents the operation object associated with removing an appointment. Appointments provider apps use this info to perform the operation. */
  trait RemoveAppointmentOperation extends StObject {
    
    /** Gets the unique identifier of the appointment to remove. */
    var appointmentId: String
    
    /** Dismisses the UI for the operation that removes an appointment. */
    def dismissUI(): Unit
    
    /** Gets the start date and time of the appointment instance to remove. */
    var instanceStartDate: Date
    
    /** Call this method to inform the activating app that the operation was canceled by the user. */
    def reportCanceled(): Unit
    
    /** Informs the activating app that the operation was completed successfully. */
    def reportCompleted(): Unit
    
    /**
      * Informs the activating app that the operation couldn't be completed because of a provider error.
      * @param value A string that contains info about the error.
      */
    def reportError(value: String): Unit
    
    /** Gets the package family name of the app that is requesting the operation. */
    var sourcePackageFamilyName: String
  }
  object RemoveAppointmentOperation {
    
    @scala.inline
    def apply(
      appointmentId: String,
      dismissUI: () => Unit,
      instanceStartDate: Date,
      reportCanceled: () => Unit,
      reportCompleted: () => Unit,
      reportError: String => Unit,
      sourcePackageFamilyName: String
    ): RemoveAppointmentOperation = {
      val __obj = js.Dynamic.literal(appointmentId = appointmentId.asInstanceOf[js.Any], dismissUI = js.Any.fromFunction0(dismissUI), instanceStartDate = instanceStartDate.asInstanceOf[js.Any], reportCanceled = js.Any.fromFunction0(reportCanceled), reportCompleted = js.Any.fromFunction0(reportCompleted), reportError = js.Any.fromFunction1(reportError), sourcePackageFamilyName = sourcePackageFamilyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveAppointmentOperation]
    }
    
    @scala.inline
    implicit class RemoveAppointmentOperationMutableBuilder[Self <: RemoveAppointmentOperation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppointmentId(value: String): Self = StObject.set(x, "appointmentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissUI(value: () => Unit): Self = StObject.set(x, "dismissUI", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInstanceStartDate(value: Date): Self = StObject.set(x, "instanceStartDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportCanceled(value: () => Unit): Self = StObject.set(x, "reportCanceled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReportCompleted(value: () => Unit): Self = StObject.set(x, "reportCompleted", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReportError(value: String => Unit): Self = StObject.set(x, "reportError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSourcePackageFamilyName(value: String): Self = StObject.set(x, "sourcePackageFamilyName", value.asInstanceOf[js.Any])
    }
  }
  
  /** Represents the operation object associated with replacing an appointment. Appointments provider apps use this info to perform the operation. */
  trait ReplaceAppointmentOperation extends StObject {
    
    /** Gets the unique identifier of the appointment to replace. */
    var appointmentId: String
    
    /** Gets the Appointment info from the activation request. */
    var appointmentInformation: Appointment
    
    /** Dismisses the UI for the operation that replaces an appointment. */
    def dismissUI(): Unit
    
    /** Gets the start date and time of the appointment instance to replace. */
    var instanceStartDate: Date
    
    /** Informs the activating app that the operation was canceled by the user. */
    def reportCanceled(): Unit
    
    /**
      * Informs the activating app that the operation was completed successfully.
      * @param itemId A unique appointment ID that the activating app can later use to remove this appointment if necessary or to replace it again.
      */
    def reportCompleted(itemId: String): Unit
    
    /**
      * Informs the activating app that the operation couldn't be completed because of a provider error.
      * @param value A string that contains info about the error.
      */
    def reportError(value: String): Unit
    
    /** Gets the package family name of the app that is requesting the operation. */
    var sourcePackageFamilyName: String
  }
  object ReplaceAppointmentOperation {
    
    @scala.inline
    def apply(
      appointmentId: String,
      appointmentInformation: Appointment,
      dismissUI: () => Unit,
      instanceStartDate: Date,
      reportCanceled: () => Unit,
      reportCompleted: String => Unit,
      reportError: String => Unit,
      sourcePackageFamilyName: String
    ): ReplaceAppointmentOperation = {
      val __obj = js.Dynamic.literal(appointmentId = appointmentId.asInstanceOf[js.Any], appointmentInformation = appointmentInformation.asInstanceOf[js.Any], dismissUI = js.Any.fromFunction0(dismissUI), instanceStartDate = instanceStartDate.asInstanceOf[js.Any], reportCanceled = js.Any.fromFunction0(reportCanceled), reportCompleted = js.Any.fromFunction1(reportCompleted), reportError = js.Any.fromFunction1(reportError), sourcePackageFamilyName = sourcePackageFamilyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReplaceAppointmentOperation]
    }
    
    @scala.inline
    implicit class ReplaceAppointmentOperationMutableBuilder[Self <: ReplaceAppointmentOperation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppointmentId(value: String): Self = StObject.set(x, "appointmentId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppointmentInformation(value: Appointment): Self = StObject.set(x, "appointmentInformation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDismissUI(value: () => Unit): Self = StObject.set(x, "dismissUI", js.Any.fromFunction0(value))
      
      @scala.inline
      def setInstanceStartDate(value: Date): Self = StObject.set(x, "instanceStartDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReportCanceled(value: () => Unit): Self = StObject.set(x, "reportCanceled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReportCompleted(value: String => Unit): Self = StObject.set(x, "reportCompleted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReportError(value: String => Unit): Self = StObject.set(x, "reportError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSourcePackageFamilyName(value: String): Self = StObject.set(x, "sourcePackageFamilyName", value.asInstanceOf[js.Any])
    }
  }
}
