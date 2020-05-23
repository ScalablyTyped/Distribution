package typings.winrt.global.Windows.Graphics.Printing

import typings.std.Date
import typings.winrt.Windows.Graphics.Printing.IPrintDocumentSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Printing.PrintTaskSourceRequestedArgs")
@js.native
class PrintTaskSourceRequestedArgs ()
  extends typings.winrt.Windows.Graphics.Printing.PrintTaskSourceRequestedArgs {
  /* CompleteClass */
  override var deadline: Date = js.native
  /* CompleteClass */
  override def getDeferral(): typings.winrt.Windows.Graphics.Printing.PrintTaskSourceRequestedDeferral = js.native
  /* CompleteClass */
  override def setSource(source: IPrintDocumentSource): Unit = js.native
}

