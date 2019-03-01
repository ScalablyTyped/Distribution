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
    createPrintTask: js.Function2[java.lang.String, PrintTaskSourceRequestedHandler, PrintTask],
    deadline: stdLib.Date,
    getDeferral: js.Function0[PrintTaskRequestedDeferral]
  ): IPrintTaskRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createPrintTask")(createPrintTask)
    __obj.updateDynamic("deadline")(deadline)
    __obj.updateDynamic("getDeferral")(getDeferral)
    __obj.asInstanceOf[IPrintTaskRequest]
  }
}

