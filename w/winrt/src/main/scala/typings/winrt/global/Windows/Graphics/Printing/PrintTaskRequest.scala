package typings.winrt.global.Windows.Graphics.Printing

import typings.std.Date
import typings.winrt.Windows.Graphics.Printing.PrintTaskSourceRequestedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Printing.PrintTaskRequest")
@js.native
class PrintTaskRequest ()
  extends typings.winrt.Windows.Graphics.Printing.PrintTaskRequest {
  /* CompleteClass */
  override var deadline: Date = js.native
  /* CompleteClass */
  override def createPrintTask(title: String, handler: PrintTaskSourceRequestedHandler): typings.winrt.Windows.Graphics.Printing.PrintTask = js.native
  /* CompleteClass */
  override def getDeferral(): typings.winrt.Windows.Graphics.Printing.PrintTaskRequestedDeferral = js.native
}

