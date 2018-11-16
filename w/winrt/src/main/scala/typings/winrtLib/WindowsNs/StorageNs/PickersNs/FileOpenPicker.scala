package typings
package winrtLib.WindowsNs.StorageNs.PickersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Pickers.FileOpenPicker")
@js.native
class FileOpenPicker () extends IFileOpenPicker {
  /* CompleteClass */
  override var commitButtonText: java.lang.String = js.native
  /* CompleteClass */
  override var continuationData: winrtLib.WindowsNs.FoundationNs.CollectionsNs.ValueSet = js.native
  /* CompleteClass */
  override var fileTypeFilter: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /* CompleteClass */
  override var settingsIdentifier: java.lang.String = js.native
  /* CompleteClass */
  override var suggestedStartLocation: PickerLocationId = js.native
  /* CompleteClass */
  override var viewMode: PickerViewMode = js.native
  /* CompleteClass */
  override def pickMultipleFilesAndContinue(): scala.Unit = js.native
  /* CompleteClass */
  override def pickMultipleFilesAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.StorageNs.StorageFile]
  ] = js.native
  /* CompleteClass */
  override def pickSingleFileAndContinue(): scala.Unit = js.native
  /* CompleteClass */
  override def pickSingleFileAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StorageFile] = js.native
}

