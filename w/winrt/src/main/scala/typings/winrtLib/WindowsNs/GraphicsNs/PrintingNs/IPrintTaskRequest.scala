package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskRequest extends js.Object {
  var deadline: stdLib.Date
  def createPrintTask(title: java.lang.String, handler: PrintTaskSourceRequestedHandler): PrintTask
  def getDeferral(): PrintTaskRequestedDeferral
}

object IPrintTaskRequest {
  @scala.inline
  def apply(
    createPrintTask: (java.lang.String, PrintTaskSourceRequestedHandler) => PrintTask,
    deadline: stdLib.Date,
    getDeferral: () => PrintTaskRequestedDeferral
  ): IPrintTaskRequest = {
    val __obj = js.Dynamic.literal(createPrintTask = js.Any.fromFunction2(createPrintTask), deadline = deadline, getDeferral = js.Any.fromFunction0(getDeferral))
  
    __obj.asInstanceOf[IPrintTaskRequest]
  }
}

