package typings.winrt.Windows.Storage.Pickers

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Collections.ValueSet
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.StorageFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IFolderPicker extends StObject {
  
  var commitButtonText: String = js.native
  
  var continuationData: ValueSet = js.native
  
  var fileTypeFilter: IVector[String] = js.native
  
  def pickFolderAndContinue(): Unit = js.native
  
  def pickSingleFolderAsync(): IAsyncOperation[StorageFolder] = js.native
  
  var settingsIdentifier: String = js.native
  
  var suggestedStartLocation: PickerLocationId = js.native
  
  var viewMode: PickerViewMode = js.native
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
  implicit class IFolderPickerMutableBuilder[Self <: IFolderPicker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommitButtonText(value: String): Self = StObject.set(x, "commitButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuationData(value: ValueSet): Self = StObject.set(x, "continuationData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTypeFilter(value: IVector[String]): Self = StObject.set(x, "fileTypeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickFolderAndContinue(value: () => Unit): Self = StObject.set(x, "pickFolderAndContinue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPickSingleFolderAsync(value: () => IAsyncOperation[StorageFolder]): Self = StObject.set(x, "pickSingleFolderAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSettingsIdentifier(value: String): Self = StObject.set(x, "settingsIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedStartLocation(value: PickerLocationId): Self = StObject.set(x, "suggestedStartLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewMode(value: PickerViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
  }
}
