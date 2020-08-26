package typings.winrt.Windows.Storage.Pickers

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Collections.ValueSet
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFolderPicker extends js.Object {
  var commitButtonText: String = js.native
  var continuationData: ValueSet = js.native
  var fileTypeFilter: IVector[String] = js.native
  var settingsIdentifier: String = js.native
  var suggestedStartLocation: PickerLocationId = js.native
  var viewMode: PickerViewMode = js.native
  def pickFolderAndContinue(): Unit = js.native
  def pickSingleFolderAsync(): IAsyncOperation[StorageFolder] = js.native
}

object IFolderPicker {
  @scala.inline
  def apply(
    commitButtonText: String,
    continuationData: ValueSet,
    fileTypeFilter: IVector[String],
    pickFolderAndContinue: () => Unit,
    pickSingleFolderAsync: () => IAsyncOperation[StorageFolder],
    settingsIdentifier: String,
    suggestedStartLocation: PickerLocationId,
    viewMode: PickerViewMode
  ): IFolderPicker = {
    val __obj = js.Dynamic.literal(commitButtonText = commitButtonText.asInstanceOf[js.Any], continuationData = continuationData.asInstanceOf[js.Any], fileTypeFilter = fileTypeFilter.asInstanceOf[js.Any], pickFolderAndContinue = js.Any.fromFunction0(pickFolderAndContinue), pickSingleFolderAsync = js.Any.fromFunction0(pickSingleFolderAsync), settingsIdentifier = settingsIdentifier.asInstanceOf[js.Any], suggestedStartLocation = suggestedStartLocation.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFolderPicker]
  }
  @scala.inline
  implicit class IFolderPickerOps[Self <: IFolderPicker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommitButtonText(value: String): Self = this.set("commitButtonText", value.asInstanceOf[js.Any])
    @scala.inline
    def setContinuationData(value: ValueSet): Self = this.set("continuationData", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileTypeFilter(value: IVector[String]): Self = this.set("fileTypeFilter", value.asInstanceOf[js.Any])
    @scala.inline
    def setPickFolderAndContinue(value: () => Unit): Self = this.set("pickFolderAndContinue", js.Any.fromFunction0(value))
    @scala.inline
    def setPickSingleFolderAsync(value: () => IAsyncOperation[StorageFolder]): Self = this.set("pickSingleFolderAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setSettingsIdentifier(value: String): Self = this.set("settingsIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuggestedStartLocation(value: PickerLocationId): Self = this.set("suggestedStartLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewMode(value: PickerViewMode): Self = this.set("viewMode", value.asInstanceOf[js.Any])
  }
  
}

