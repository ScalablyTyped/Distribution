package typings.winrtUwp.Windows.Storage.Pickers

import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a file picker that lets the user choose the file name, extension, and storage location for a file. */
@js.native
trait FileSavePicker extends StObject {
  
  /** Gets or sets the label text of the commit button in the file picker UI. */
  var commitButtonText: String = js.native
  
  /** Gets a set of values to be populated by the app before a PickSaveFileAndContinue operation that deactivates the app in order to provide context when the app is activated. (Windows Phone Store apps) */
  var continuationData: ValueSet = js.native
  
  /** Gets or sets the default file name extension that the fileSavePicker gives to files to be saved. */
  var defaultFileExtension: String = js.native
  
  /** Gets or sets an ID that specifies the enterprise that owns the file. */
  var enterpriseId: String = js.native
  
  /** Gets the collection of valid file types that the user can choose to assign to a file. */
  var fileTypeChoices: IMap[String, IVector[String]] = js.native
  
  /** Shows the file picker so that the user can save a file, deactivating and the app and reactivating it when the operation is complete. (Windows Phone Store apps) */
  def pickSaveFileAndContinue(): Unit = js.native
  
  /**
    * Shows the file picker so that the user can save a file and set the file name, extension, and location of the file to be saved. (Windows Store apps)
    * @return When the call to this method completes successfully, it returns a storageFile object that was created to represent the saved file. The file name, extension, and location of this storageFile match those specified by the user, but the file has no content.
    */
  def pickSaveFileAsync(): IPromiseWithIAsyncOperation[StorageFile] = js.native
  
  /** Gets or sets the settings identifier associated with the current FileSavePicker instance. */
  var settingsIdentifier: String = js.native
  
  /** Gets or sets the file name that the file save picker suggests to the user. */
  var suggestedFileName: String = js.native
  
  /** Gets or sets the storageFile that the file picker suggests to the user for saving a file. */
  var suggestedSaveFile: StorageFile = js.native
  
  /** Gets or sets the location that the file save picker suggests to the user as the location to save a file. */
  var suggestedStartLocation: PickerLocationId = js.native
}
object FileSavePicker {
  
  @scala.inline
  def apply(
    commitButtonText: String,
    continuationData: ValueSet,
    defaultFileExtension: String,
    enterpriseId: String,
    fileTypeChoices: IMap[String, IVector[String]],
    pickSaveFileAndContinue: () => Unit,
    pickSaveFileAsync: () => IPromiseWithIAsyncOperation[StorageFile],
    settingsIdentifier: String,
    suggestedFileName: String,
    suggestedSaveFile: StorageFile,
    suggestedStartLocation: PickerLocationId
  ): FileSavePicker = {
    val __obj = js.Dynamic.literal(commitButtonText = commitButtonText.asInstanceOf[js.Any], continuationData = continuationData.asInstanceOf[js.Any], defaultFileExtension = defaultFileExtension.asInstanceOf[js.Any], enterpriseId = enterpriseId.asInstanceOf[js.Any], fileTypeChoices = fileTypeChoices.asInstanceOf[js.Any], pickSaveFileAndContinue = js.Any.fromFunction0(pickSaveFileAndContinue), pickSaveFileAsync = js.Any.fromFunction0(pickSaveFileAsync), settingsIdentifier = settingsIdentifier.asInstanceOf[js.Any], suggestedFileName = suggestedFileName.asInstanceOf[js.Any], suggestedSaveFile = suggestedSaveFile.asInstanceOf[js.Any], suggestedStartLocation = suggestedStartLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSavePicker]
  }
  
  @scala.inline
  implicit class FileSavePickerMutableBuilder[Self <: FileSavePicker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommitButtonText(value: String): Self = StObject.set(x, "commitButtonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuationData(value: ValueSet): Self = StObject.set(x, "continuationData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultFileExtension(value: String): Self = StObject.set(x, "defaultFileExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterpriseId(value: String): Self = StObject.set(x, "enterpriseId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileTypeChoices(value: IMap[String, IVector[String]]): Self = StObject.set(x, "fileTypeChoices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPickSaveFileAndContinue(value: () => Unit): Self = StObject.set(x, "pickSaveFileAndContinue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPickSaveFileAsync(value: () => IPromiseWithIAsyncOperation[StorageFile]): Self = StObject.set(x, "pickSaveFileAsync", js.Any.fromFunction0(value))
    
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
