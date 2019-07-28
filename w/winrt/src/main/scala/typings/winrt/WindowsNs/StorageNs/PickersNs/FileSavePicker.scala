package typings.winrt.WindowsNs.StorageNs.PickersNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IMap
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.ValueSet
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.StorageNs.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Pickers.FileSavePicker")
@js.native
class FileSavePicker () extends IFileSavePicker {
  /* CompleteClass */
  override var commitButtonText: String = js.native
  /* CompleteClass */
  override var continuationData: ValueSet = js.native
  /* CompleteClass */
  override var defaultFileExtension: String = js.native
  /* CompleteClass */
  override var fileTypeChoices: IMap[String, IVector[String]] = js.native
  /* CompleteClass */
  override var settingsIdentifier: String = js.native
  /* CompleteClass */
  override var suggestedFileName: String = js.native
  /* CompleteClass */
  override var suggestedSaveFile: StorageFile = js.native
  /* CompleteClass */
  override var suggestedStartLocation: PickerLocationId = js.native
  /* CompleteClass */
  override def pickSaveFileAndContinue(): Unit = js.native
  /* CompleteClass */
  override def pickSaveFileAsync(): IAsyncOperation[StorageFile] = js.native
}

