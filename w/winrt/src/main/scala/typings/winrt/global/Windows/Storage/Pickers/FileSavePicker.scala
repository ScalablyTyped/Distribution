package typings.winrt.global.Windows.Storage.Pickers

import typings.winrt.Windows.Foundation.Collections.IMap
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Collections.ValueSet
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Pickers.FileSavePicker")
@js.native
class FileSavePicker ()
  extends typings.winrt.Windows.Storage.Pickers.FileSavePicker {
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
  override var suggestedStartLocation: typings.winrt.Windows.Storage.Pickers.PickerLocationId = js.native
  /* CompleteClass */
  override def pickSaveFileAndContinue(): Unit = js.native
  /* CompleteClass */
  override def pickSaveFileAsync(): IAsyncOperation[StorageFile] = js.native
}

