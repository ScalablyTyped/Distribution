package typings.winrt.global.Windows.Storage.Pickers

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Collections.ValueSet
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Pickers.FolderPicker")
@js.native
class FolderPicker ()
  extends typings.winrt.Windows.Storage.Pickers.FolderPicker {
  /* CompleteClass */
  override var commitButtonText: String = js.native
  /* CompleteClass */
  override var continuationData: ValueSet = js.native
  /* CompleteClass */
  override var fileTypeFilter: IVector[String] = js.native
  /* CompleteClass */
  override var settingsIdentifier: String = js.native
  /* CompleteClass */
  override var suggestedStartLocation: typings.winrt.Windows.Storage.Pickers.PickerLocationId = js.native
  /* CompleteClass */
  override var viewMode: typings.winrt.Windows.Storage.Pickers.PickerViewMode = js.native
  /* CompleteClass */
  override def pickFolderAndContinue(): Unit = js.native
  /* CompleteClass */
  override def pickSingleFolderAsync(): IAsyncOperation[StorageFolder] = js.native
}

