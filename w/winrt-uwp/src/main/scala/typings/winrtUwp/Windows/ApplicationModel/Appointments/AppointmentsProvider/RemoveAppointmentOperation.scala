package typings.winrtUwp.Windows.ApplicationModel.Appointments.AppointmentsProvider

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the operation object associated with removing an appointment. Appointments provider apps use this info to perform the operation. */
@js.native
trait RemoveAppointmentOperation extends js.Object {
  
  /** Gets the unique identifier of the appointment to remove. */
  var appointmentId: String = js.native
  
  /** Dismisses the UI for the operation that removes an appointment. */
  def dismissUI(): Unit = js.native
  
  /** Gets the start date and time of the appointment instance to remove. */
  var instanceStartDate: Date = js.native
  
  /** Call this method to inform the activating app that the operation was canceled by the user. */
  def reportCanceled(): Unit = js.native
  
  /** Informs the activating app that the operation was completed successfully. */
  def reportCompleted(): Unit = js.native
  
  /**
    * Informs the activating app that the operation couldn't be completed because of a provider error.
    * @param value A string that contains info about the error.
    */
  def reportError(value: String): Unit = js.native
  
  /** Gets the package family name of the app that is requesting the operation. */
  var sourcePackageFamilyName: String = js.native
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
  implicit class RemoveAppointmentOperationOps[Self <: RemoveAppointmentOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAppointmentId(value: String): Self = this.set("appointmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDismissUI(value: () => Unit): Self = this.set("dismissUI", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInstanceStartDate(value: Date): Self = this.set("instanceStartDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportCanceled(value: () => Unit): Self = this.set("reportCanceled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReportCompleted(value: () => Unit): Self = this.set("reportCompleted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReportError(value: String => Unit): Self = this.set("reportError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSourcePackageFamilyName(value: String): Self = this.set("sourcePackageFamilyName", value.asInstanceOf[js.Any])
  }
}
