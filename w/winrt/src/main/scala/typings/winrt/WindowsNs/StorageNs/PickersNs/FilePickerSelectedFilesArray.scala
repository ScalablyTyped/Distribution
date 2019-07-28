package typings.winrt.WindowsNs.StorageNs.PickersNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IIterator
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.StorageNs.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Pickers.FilePickerSelectedFilesArray")
@js.native
class FilePickerSelectedFilesArray () extends IVectorView[StorageFile] {
  /* CompleteClass */
  override def first(): IIterator[StorageFile] = js.native
}

