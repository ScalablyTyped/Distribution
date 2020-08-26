package typings.winrtUwp.Windows.Storage.Pickers

import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a file picker that lets the user choose the file name, extension, and storage location for a file. */
@js.native
trait FileSavePicker extends js.Object {
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
  /** Gets or sets the settings identifier associated with the current FileSavePicker instance. */
  var settingsIdentifier: String = js.native
  /** Gets or sets the file name that the file save picker suggests to the user. */
  var suggestedFileName: String = js.native
  /** Gets or sets the storageFile that the file picker suggests to the user for saving a file. */
  var suggestedSaveFile: StorageFile = js.native
  /** Gets or sets the location that the file save picker suggests to the user as the location to save a file. */
  var suggestedStartLocation: PickerLocationId = js.native
  /** Shows the file picker so that the user can save a file, deactivating and the app and reactivating it when the operation is complete. (Windows Phone Store apps) */
  def pickSaveFileAndContinue(): Unit = js.native
  /**
    * Shows the file picker so that the user can save a file and set the file name, extension, and location of the file to be saved. (Windows Store apps)
    * @return When the call to this method completes successfully, it returns a storageFile object that was created to represent the saved file. The file name, extension, and location of this storageFile match those specified by the user, but the file has no content.
    */
  def pickSaveFileAsync(): IPromiseWithIAsyncOperation[StorageFile] = js.native
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
  implicit class FileSavePickerOps[Self <: FileSavePicker] (val x: Self) extends AnyVal {
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
    def setDefaultFileExtension(value: String): Self = this.set("defaultFileExtension", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnterpriseId(value: String): Self = this.set("enterpriseId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileTypeChoices(value: IMap[String, IVector[String]]): Self = this.set("fileTypeChoices", value.asInstanceOf[js.Any])
    @scala.inline
    def setPickSaveFileAndContinue(value: () => Unit): Self = this.set("pickSaveFileAndContinue", js.Any.fromFunction0(value))
    @scala.inline
    def setPickSaveFileAsync(value: () => IPromiseWithIAsyncOperation[StorageFile]): Self = this.set("pickSaveFileAsync", js.Any.fromFunction0(value))
    @scala.inline
    def setSettingsIdentifier(value: String): Self = this.set("settingsIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuggestedFileName(value: String): Self = this.set("suggestedFileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuggestedSaveFile(value: StorageFile): Self = this.set("suggestedSaveFile", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuggestedStartLocation(value: PickerLocationId): Self = this.set("suggestedStartLocation", value.asInstanceOf[js.Any])
  }
  
}

