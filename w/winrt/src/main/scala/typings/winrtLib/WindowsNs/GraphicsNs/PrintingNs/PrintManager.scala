package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Printing.PrintManager")
@js.native
class PrintManager () extends IPrintManager {
  /* CompleteClass */
  override var onprinttaskrequested: js.Any = js.native
}

@JSGlobal("Windows.Graphics.Printing.PrintManager")
@js.native
object PrintManager extends js.Object {
  def getForCurrentView(): winrtLib.WindowsNs.GraphicsNs.PrintingNs.PrintManager = js.native
  def showPrintUIAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean] = js.native
}

