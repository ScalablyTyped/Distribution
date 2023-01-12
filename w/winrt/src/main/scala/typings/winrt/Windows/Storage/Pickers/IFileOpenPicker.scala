package typings.winrt.Windows.Storage.Pickers

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.Collections.ValueSet
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileOpenPicker extends StObject {
  
  var commitButtonText: String
  
  var continuationData: ValueSet
  
  var fileTypeFilter: IVector[String]
  
  def pickMultipleFilesAndContinue(): Unit
  
  def pickMultipleFilesAsync(): IAsyncOperation[IVectorView[StorageFile]]
  
  def pickSingleFileAndContinue(): Unit
  
  def pickSingleFileAsync(): IAsyncOperation[StorageFile]
  
  var settingsIdentifier: String
  
  var suggestedStartLocation: PickerLocationId
  
  var viewMode: PickerViewMode
}
object IFileOpenPicker {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: IFileOpenPicker] (val x: Self) extends AnyVal {
    
    inline def setCommitButtonText(value: String): Self = StObject.set(x, "commitButtonText", value.asInstanceOf[js.Any])
    
    inline def setContinuationData(value: ValueSet): Self = StObject.set(x, "continuationData", value.asInstanceOf[js.Any])
    
    inline def setFileTypeFilter(value: IVector[String]): Self = StObject.set(x, "fileTypeFilter", value.asInstanceOf[js.Any])
    
    inline def setPickMultipleFilesAndContinue(value: () => Unit): Self = StObject.set(x, "pickMultipleFilesAndContinue", js.Any.fromFunction0(value))
    
    inline def setPickMultipleFilesAsync(value: () => IAsyncOperation[IVectorView[StorageFile]]): Self = StObject.set(x, "pickMultipleFilesAsync", js.Any.fromFunction0(value))
    
    inline def setPickSingleFileAndContinue(value: () => Unit): Self = StObject.set(x, "pickSingleFileAndContinue", js.Any.fromFunction0(value))
    
    inline def setPickSingleFileAsync(value: () => IAsyncOperation[StorageFile]): Self = StObject.set(x, "pickSingleFileAsync", js.Any.fromFunction0(value))
    
    inline def setSettingsIdentifier(value: String): Self = StObject.set(x, "settingsIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSuggestedStartLocation(value: PickerLocationId): Self = StObject.set(x, "suggestedStartLocation", value.asInstanceOf[js.Any])
    
    inline def setViewMode(value: PickerViewMode): Self = StObject.set(x, "viewMode", value.asInstanceOf[js.Any])
  }
}
