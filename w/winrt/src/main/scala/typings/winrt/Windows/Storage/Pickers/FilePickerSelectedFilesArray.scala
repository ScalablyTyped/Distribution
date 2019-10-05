package typings.winrt.Windows.Storage.Pickers

import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Pickers.FilePickerSelectedFilesArray")
@js.native
class FilePickerSelectedFilesArray () extends IVectorView[StorageFile] {
  /* CompleteClass */
  override def first(): IIterator[StorageFile] = js.native
}

