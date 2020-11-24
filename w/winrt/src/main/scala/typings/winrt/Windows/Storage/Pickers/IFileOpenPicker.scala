package typings.winrt.Windows.Storage.Pickers

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.Collections.ValueSet
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFileOpenPicker extends js.Object {
  
  var commitButtonText: String = js.native
  
  var continuationData: ValueSet = js.native
  
  var fileTypeFilter: IVector[String] = js.native
  
  def pickMultipleFilesAndContinue(): Unit = js.native
  
  def pickMultipleFilesAsync(): IAsyncOperation[IVectorView[StorageFile]] = js.native
  
  def pickSingleFileAndContinue(): Unit = js.native
  
  def pickSingleFileAsync(): IAsyncOperation[StorageFile] = js.native
  
  var settingsIdentifier: String = js.native
  
  var suggestedStartLocation: PickerLocationId = js.native
  
  var viewMode: PickerViewMode = js.native
}
object IFileOpenPicker {
  
  @scala.inline
  def apply(
    commitButtonText: String,
    continuationData: ValueSet,
    fileTypeFilter: IVector[String],
    pickMultipleFilesAndContinue: () => Unit,
    pickMultipleFilesAsync: () => IAsyncOperation[IVectorView[StorageFile]],
    pickSingleFileAndContinue: () => Unit,
    pickSingleFileAsync: () => IAsyncOperation[StorageFile],
    settingsIdentifier: String,
    suggestedStartLocation: PickerLocationId,
    viewMode: PickerViewMode
  ): IFileOpenPicker = {
    val __obj = js.Dynamic.literal(commitButtonText = commitButtonText.asInstanceOf[js.Any], continuationData = continuationData.asInstanceOf[js.Any], fileTypeFilter = fileTypeFilter.asInstanceOf[js.Any], pickMultipleFilesAndContinue = js.Any.fromFunction0(pickMultipleFilesAndContinue), pickMultipleFilesAsync = js.Any.fromFunction0(pickMultipleFilesAsync), pickSingleFileAndContinue = js.Any.fromFunction0(pickSingleFileAndContinue), pickSingleFileAsync = js.Any.fromFunction0(pickSingleFileAsync), settingsIdentifier = settingsIdentifier.asInstanceOf[js.Any], suggestedStartLocation = suggestedStartLocation.asInstanceOf[js.Any], viewMode = viewMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileOpenPicker]
  }
  
  @scala.inline
  implicit class IFileOpenPickerOps[Self <: IFileOpenPicker] (val x: Self) extends AnyVal {
    
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
    def setPickMultipleFilesAndContinue(value: () => Unit): Self = this.set("pickMultipleFilesAndContinue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPickMultipleFilesAsync(value: () => IAsyncOperation[IVectorView[StorageFile]]): Self = this.set("pickMultipleFilesAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPickSingleFileAndContinue(value: () => Unit): Self = this.set("pickSingleFileAndContinue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPickSingleFileAsync(value: () => IAsyncOperation[StorageFile]): Self = this.set("pickSingleFileAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSettingsIdentifier(value: String): Self = this.set("settingsIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedStartLocation(value: PickerLocationId): Self = this.set("suggestedStartLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewMode(value: PickerViewMode): Self = this.set("viewMode", value.asInstanceOf[js.Any])
  }
}
