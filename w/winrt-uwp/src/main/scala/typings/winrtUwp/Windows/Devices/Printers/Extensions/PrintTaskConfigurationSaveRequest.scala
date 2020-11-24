package typings.winrtUwp.Windows.Devices.Printers.Extensions

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Called when the print dialog for your app raises a SaveRequested event. */
@js.native
trait PrintTaskConfigurationSaveRequest extends js.Object {
  
  /** Called by the device app to cancel the client's request to save the print task configuration. */
  def cancel(): Unit = js.native
  
  /** Gets the date-time object that provides the deadline information for the print task. */
  var deadline: Date = js.native
  
  /**
    * Called by the device app when it has to complete some asynchronous tasks before it can save the print task configuration information.
    * @return The object that represents the deferral for the print task configuration save request.
    */
  def getDeferral(): PrintTaskConfigurationSaveRequestedDeferral = js.native
  
  /**
    * Called by the device app to save the print task configuration.
    * @param printerExtensionContext The object that represents the print task extension context.
    */
  def save(printerExtensionContext: js.Any): Unit = js.native
}
object PrintTaskConfigurationSaveRequest {
  
  @scala.inline
  def apply(
    cancel: () => Unit,
    deadline: Date,
    getDeferral: () => PrintTaskConfigurationSaveRequestedDeferral,
    save: js.Any => Unit
  ): PrintTaskConfigurationSaveRequest = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), save = js.Any.fromFunction1(save))
    __obj.asInstanceOf[PrintTaskConfigurationSaveRequest]
  }
  
  @scala.inline
  implicit class PrintTaskConfigurationSaveRequestOps[Self <: PrintTaskConfigurationSaveRequest] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeadline(value: Date): Self = this.set("deadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetDeferral(value: () => PrintTaskConfigurationSaveRequestedDeferral): Self = this.set("getDeferral", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSave(value: js.Any => Unit): Self = this.set("save", js.Any.fromFunction1(value))
  }
}
