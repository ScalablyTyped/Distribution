package typings
package winrtLib.WindowsNs.StorageNs.PickersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.Pickers.FolderPicker")
@js.native
class FolderPicker () extends IFolderPicker {
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
  override def pickFolderAndContinue(): scala.Unit = js.native
  /* CompleteClass */
  override def pickSingleFolderAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StorageFolder] = js.native
}

