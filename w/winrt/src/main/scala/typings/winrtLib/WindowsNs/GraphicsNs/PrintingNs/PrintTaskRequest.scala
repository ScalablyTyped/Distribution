package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Printing.PrintTaskRequest")
@js.native
class PrintTaskRequest () extends IPrintTaskRequest {
  /* CompleteClass */
  override var deadline: stdLib.Date = js.native
  /* CompleteClass */
  override def createPrintTask(title: java.lang.String, handler: PrintTaskSourceRequestedHandler): PrintTask = js.native
  /* CompleteClass */
  override def getDeferral(): PrintTaskRequestedDeferral = js.native
}

