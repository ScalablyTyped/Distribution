package typings.winrt.WindowsNs.GraphicsNs.PrintingNs

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Printing.PrintTaskSourceRequestedArgs")
@js.native
class PrintTaskSourceRequestedArgs () extends IPrintTaskSourceRequestedArgs {
  /* CompleteClass */
  override var deadline: Date = js.native
  /* CompleteClass */
  override def getDeferral(): PrintTaskSourceRequestedDeferral = js.native
  /* CompleteClass */
  override def setSource(source: IPrintDocumentSource): Unit = js.native
}

