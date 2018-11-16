package typings
package winrtLib.WindowsNs.GraphicsNs.PrintingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Printing.PrintTaskSourceRequestedArgs")
@js.native
class PrintTaskSourceRequestedArgs () extends IPrintTaskSourceRequestedArgs {
  /* CompleteClass */
  override var deadline: stdLib.Date = js.native
  /* CompleteClass */
  override def getDeferral(): PrintTaskSourceRequestedDeferral = js.native
  /* CompleteClass */
  override def setSource(source: IPrintDocumentSource): scala.Unit = js.native
}

