package typings.winrtUwp.Windows.Graphics.Printing

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the request from the system to create a print task. This object is available from the PrintTaskRequestedEventArgs object passed to the PrintTaskRequested event. */
@js.native
trait PrintTaskRequest extends js.Object {
  /** Gets a DateTime value that indicates how long an app has to respond to the PrintTaskRequested event. If the system has not received a response from the PrintTaskRequested event handler by the time the deadline is reached, then the print task is ignored. */
  var deadline: Date = js.native
  /**
    * Creates a new PrintTask which indicates that the app has content to be printed.
    * @param title Title for the print task.
    * @param handler Pointer to a PrintTaskSourceRequestedHandler delegate for the print task.
    * @return Pointer to the print task that was created.
    */
  def createPrintTask(title: String, handler: PrintTaskSourceRequestedHandler): PrintTask = js.native
  /**
    * Retrieves the deferral object associated with the PrintTaskRequest . The deferral object is used to handle asynchronous calls in the PrintTaskRequested event handler.
    * @return The PrintTaskRequestedDeferral for a print task.
    */
  def getDeferral(): PrintTaskRequestedDeferral = js.native
}

object PrintTaskRequest {
  @scala.inline
  def apply(
    createPrintTask: (String, PrintTaskSourceRequestedHandler) => PrintTask,
    deadline: Date,
    getDeferral: () => PrintTaskRequestedDeferral
  ): PrintTaskRequest = {
    val __obj = js.Dynamic.literal(createPrintTask = js.Any.fromFunction2(createPrintTask), deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[PrintTaskRequest]
  }
  @scala.inline
  implicit class PrintTaskRequestOps[Self <: PrintTaskRequest] (val x: Self) extends AnyVal {
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
    def setCreatePrintTask(value: (String, PrintTaskSourceRequestedHandler) => PrintTask): Self = this.set("createPrintTask", js.Any.fromFunction2(value))
    @scala.inline
    def setDeadline(value: Date): Self = this.set("deadline", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDeferral(value: () => PrintTaskRequestedDeferral): Self = this.set("getDeferral", js.Any.fromFunction0(value))
  }
  
}

