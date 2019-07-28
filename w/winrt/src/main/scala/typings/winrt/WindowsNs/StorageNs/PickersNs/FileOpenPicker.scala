package typings.winrt.WindowsNs.StorageNs.PickersNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.ValueSet
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.StorageNs.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Pickers.FileOpenPicker")
@js.native
class FileOpenPicker () extends IFileOpenPicker {
  /* CompleteClass */
  override var commitButtonText: String = js.native
  /* CompleteClass */
  override var continuationData: ValueSet = js.native
  /* CompleteClass */
  override var fileTypeFilter: IVector[String] = js.native
  /* CompleteClass */
  override var settingsIdentifier: String = js.native
  /* CompleteClass */
  override var suggestedStartLocation: PickerLocationId = js.native
  /* CompleteClass */
  override var viewMode: PickerViewMode = js.native
  /* CompleteClass */
  override def pickMultipleFilesAndContinue(): Unit = js.native
  /* CompleteClass */
  override def pickMultipleFilesAsync(): IAsyncOperation[IVectorView[StorageFile]] = js.native
  /* CompleteClass */
  override def pickSingleFileAndContinue(): Unit = js.native
  /* CompleteClass */
  override def pickSingleFileAsync(): IAsyncOperation[StorageFile] = js.native
}

