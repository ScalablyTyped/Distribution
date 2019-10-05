package typings.winrt.Windows.Storage.Pickers.Provider

import typings.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Pickers.Provider.FileSavePickerUI")
@js.native
class FileSavePickerUI () extends IFileSavePickerUI {
  /* CompleteClass */
  override var allowedFileTypes: IVectorView[String] = js.native
  /* CompleteClass */
  override var fileName: String = js.native
  /* CompleteClass */
  override var onfilenamechanged: js.Any = js.native
  /* CompleteClass */
  override var ontargetfilerequested: js.Any = js.native
  /* CompleteClass */
  override var settingsIdentifier: String = js.native
  /* CompleteClass */
  override var title: String = js.native
  /* CompleteClass */
  override def trySetFileName(value: String): SetFileNameResult = js.native
}

