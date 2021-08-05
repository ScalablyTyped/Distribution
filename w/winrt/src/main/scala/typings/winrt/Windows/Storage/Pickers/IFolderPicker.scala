package typings.winrt.Windows.Storage.Pickers

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Collections.ValueSet
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.StorageFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFolderPicker extends StObject {
  
  var commitButtonText: String
  
  var continuationData: ValueSet
  
  var fileTypeFilter: IVector[String]
  
  def pickFolderAndContinue(): Unit
  
  def pickSingleFolderAsync(): IAsyncOperation[StorageFolder]
  
  var settingsIdentifier: String
  
  var suggestedStartLocation: PickerLocationId
  
  var viewMode: PickerViewMode
}
object IFolderPicker {
  
  inline def apply(
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
  
  extension [Self <: IFolderPicker](x: Self) {
    
    inline def setCommitButtonText(value: String): Self = StObject.set(x, "commitButtonText", value.asInstanceOf[js.Any])
    
    inline def setContinuationData(value: ValueSet): Self = StObject.set(x, "continuationData", value.asInstanceOf[js.Any])
    
    inline def setFileTypeFilter(value: IVector[String]): Self = StObject.set(x, "fileTypeFilter", value.asInstanceOf[js.Any])
    
    inline def setPickFolderAndContinue(value: () => Unit): Self = StObject.set(x, "pickFolderAndContinue", js.Any.fromFunction0(value))
    
    inline def setPickSingleFolderAsync(value: () => IAsyncOperation[StorageFolder]): Self = StObject.set(x, "pickSingleFolderAsync", js.Any.fromFunction0(value))
    
    inline def setSettingsIdentifier(value: String): Self = StObject.set(x, "settingsIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSuggestedStartLocation(value: PickerLocationId): Self = StObject.set(x, "suggestedStartLocation", value.asInstanceOf[js.Any])
    
    inline def setViewMode(value: PickerViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
  }
}
