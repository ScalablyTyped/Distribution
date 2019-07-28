package typings.winrt.WindowsNs.GraphicsNs.PrintingNs

import typings.winrt.WindowsNs.ApplicationModelNs.DataTransferNs.DataPackagePropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Printing.PrintTask")
@js.native
class PrintTask () extends IPrintTask {
  /* CompleteClass */
  override var oncompleted: js.Any = js.native
  /* CompleteClass */
  override var onpreviewing: js.Any = js.native
  /* CompleteClass */
  override var onprogressing: js.Any = js.native
  /* CompleteClass */
  override var onsubmitting: js.Any = js.native
  /* CompleteClass */
  override var options: PrintTaskOptions = js.native
  /* CompleteClass */
  override var properties: DataPackagePropertySet = js.native
  /* CompleteClass */
  override var source: IPrintDocumentSource = js.native
}

