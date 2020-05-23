package typings.winrt.global.Windows.Graphics.Printing

import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Printing.PrintManager")
@js.native
class PrintManager ()
  extends typings.winrt.Windows.Graphics.Printing.PrintManager {
  /* CompleteClass */
  override var onprinttaskrequested: js.Any = js.native
}

/* static members */
@JSGlobal("Windows.Graphics.Printing.PrintManager")
@js.native
object PrintManager extends js.Object {
  def getForCurrentView(): typings.winrt.Windows.Graphics.Printing.PrintManager = js.native
  def showPrintUIAsync(): IAsyncOperation[Boolean] = js.native
}

