package typings.winrtUwp.Windows.Devices.Printers.Extensions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data about the print request to the app that initiated the request. */
@js.native
trait Print3DWorkflowPrintRequestedEventArgs extends js.Object {
  
  /**
    * Sets the extended status of the print request.
    * @param value The extended status of the print request.
    */
  def setExtendedStatus(value: Print3DWorkflowDetail): Unit = js.native
  
  /**
    * Sets the latest model data, including any updates made by the Print3DWorkflow .
    * @param source The latest model data, including any updates made by the Print3DWorkflow .
    */
  def setSource(source: js.Any): Unit = js.native
  
  /**
    * Indicates if the data model has been updated by the Print3DWorkflow .
    * @param value Returns true if the data model has been updated; otherwise, false.
    */
  def setSourceChanged(value: Boolean): Unit = js.native
  
  /** Gets the status of the print request. */
  var status: Print3DWorkflowStatus = js.native
}
object Print3DWorkflowPrintRequestedEventArgs {
  
  @scala.inline
  def apply(
    setExtendedStatus: Print3DWorkflowDetail => Unit,
    setSource: js.Any => Unit,
    setSourceChanged: Boolean => Unit,
    status: Print3DWorkflowStatus
  ): Print3DWorkflowPrintRequestedEventArgs = {
    val __obj = js.Dynamic.literal(setExtendedStatus = js.Any.fromFunction1(setExtendedStatus), setSource = js.Any.fromFunction1(setSource), setSourceChanged = js.Any.fromFunction1(setSourceChanged), status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Print3DWorkflowPrintRequestedEventArgs]
  }
  
  @scala.inline
  implicit class Print3DWorkflowPrintRequestedEventArgsOps[Self <: Print3DWorkflowPrintRequestedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setSetExtendedStatus(value: Print3DWorkflowDetail => Unit): Self = this.set("setExtendedStatus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSource(value: js.Any => Unit): Self = this.set("setSource", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetSourceChanged(value: Boolean => Unit): Self = this.set("setSourceChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStatus(value: Print3DWorkflowStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
