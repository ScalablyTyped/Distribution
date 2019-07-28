package typings.winrt.WindowsNs.GraphicsNs.PrintingNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskRequest extends js.Object {
  var deadline: Date
  def createPrintTask(title: String, handler: PrintTaskSourceRequestedHandler): PrintTask
  def getDeferral(): PrintTaskRequestedDeferral
}

object IPrintTaskRequest {
  @scala.inline
  def apply(
    createPrintTask: (String, PrintTaskSourceRequestedHandler) => PrintTask,
    deadline: Date,
    getDeferral: () => PrintTaskRequestedDeferral
  ): IPrintTaskRequest = {
    val __obj = js.Dynamic.literal(createPrintTask = js.Any.fromFunction2(createPrintTask), deadline = deadline, getDeferral = js.Any.fromFunction0(getDeferral))
  
    __obj.asInstanceOf[IPrintTaskRequest]
  }
}

