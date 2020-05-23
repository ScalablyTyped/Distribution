package typings.winrt.global.Windows.Graphics.Printing

import typings.winrt.Windows.ApplicationModel.DataTransfer.DataPackagePropertySet
import typings.winrt.Windows.Graphics.Printing.IPrintDocumentSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Graphics.Printing.PrintTask")
@js.native
class PrintTask ()
  extends typings.winrt.Windows.Graphics.Printing.PrintTask {
  /* CompleteClass */
  override var oncompleted: js.Any = js.native
  /* CompleteClass */
  override var onpreviewing: js.Any = js.native
  /* CompleteClass */
  override var onprogressing: js.Any = js.native
  /* CompleteClass */
  override var onsubmitting: js.Any = js.native
  /* CompleteClass */
  override var options: typings.winrt.Windows.Graphics.Printing.PrintTaskOptions = js.native
  /* CompleteClass */
  override var properties: DataPackagePropertySet = js.native
  /* CompleteClass */
  override var source: IPrintDocumentSource = js.native
}

