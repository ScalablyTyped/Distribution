package typings.winrt.Windows.Storage.Pickers

import typings.winrt.Windows.Foundation.Collections.IMap
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Collections.ValueSet
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFileSavePicker extends StObject {
  
  var commitButtonText: String
  
  var continuationData: ValueSet
  
  var defaultFileExtension: String
  
  var fileTypeChoices: IMap[String, IVector[String]]
  
  def pickSaveFileAndContinue(): Unit
  
  def pickSaveFileAsync(): IAsyncOperation[StorageFile]
  
  var settingsIdentifier: String
  
  var suggestedFileName: String
  
  var suggestedSaveFile: StorageFile
  
  var suggestedStartLocation: PickerLocationId
}
object IFileSavePicker {
  
  @scala.inline
  def apply(
    commitButtonText: String,
    continuationData: ValueSet,
    defaultFileExtension: String,
    fileTypeChoices: IMap[String, IVector[String]],
    pickSaveFileAndContinue: () => Unit,
    pickSaveFileAsync: () => IAsyncOperation[StorageFile],
    settingsIdentifier: String,
    suggestedFileName: String,
    suggestedSaveFile: StorageFile,
    suggestedStartLocation: PickerLocationId
  ): IFileSavePicker = {
    val __obj = js.Dynamic.literal(commitButtonText = commitButtonText.asInstanceOf[js.Any], continuationData = continuationData.asInstanceOf[js.Any], defaultFileExtension = defaultFileExtension.asInstanceOf[js.Any], fileTypeChoices = fileTypeChoices.asInstanceOf[js.Any], pickSaveFileAndContinue = js.Any.fromFunction0(pickSaveFileAndContinue), pickSaveFileAsync = js.Any.fromFunction0(pickSaveFileAsync), settingsIdentifier = settingsIdentifier.asInstanceOf[js.Any], suggestedFileName = suggestedFileName.asInstanceOf[js.Any], suggestedSaveFile = suggestedSaveFile.asInstanceOf[js.Any], suggestedStartLocation = suggestedStartLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFileSavePicker]
  }
  
  @scala.inline
  implicit class IFileSavePickerMutableBuilder[Self <: IFileSavePicker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommitButtonText(value: String): Self = StObject.set(x, "commitButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuationData(value: ValueSet): Self = StObject.set(x, "continuationData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultFileExtension(value: String): Self = StObject.set(x, "defaultFileExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTypeChoices(value: IMap[String, IVector[String]]): Self = StObject.set(x, "fileTypeChoices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickSaveFileAndContinue(value: () => Unit): Self = StObject.set(x, "pickSaveFileAndContinue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPickSaveFileAsync(value: () => IAsyncOperation[StorageFile]): Self = StObject.set(x, "pickSaveFileAsync", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSettingsIdentifier(value: String): Self = StObject.set(x, "settingsIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedFileName(value: String): Self = StObject.set(x, "suggestedFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedSaveFile(value: StorageFile): Self = StObject.set(x, "suggestedSaveFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuggestedStartLocation(value: PickerLocationId): Self = StObject.set(x, "suggestedStartLocation", value.asInstanceOf[js.Any])
  }
}
