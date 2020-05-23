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
trait FileSavePicker extends js.Object {
  /** Gets or sets the label text of the commit button in the file picker UI. */
  var commitButtonText: String
  /** Gets a set of values to be populated by the app before a PickSaveFileAndContinue operation that deactivates the app in order to provide context when the app is activated. (Windows Phone Store apps) */
  var continuationData: ValueSet
  /** Gets or sets the default file name extension that the fileSavePicker gives to files to be saved. */
  var defaultFileExtension: String
  /** Gets or sets an ID that specifies the enterprise that owns the file. */
  var enterpriseId: String
  /** Gets the collection of valid file types that the user can choose to assign to a file. */
  var fileTypeChoices: IMap[String, IVector[String]]
  /** Gets or sets the settings identifier associated with the current FileSavePicker instance. */
  var settingsIdentifier: String
  /** Gets or sets the file name that the file save picker suggests to the user. */
  var suggestedFileName: String
  /** Gets or sets the storageFile that the file picker suggests to the user for saving a file. */
  var suggestedSaveFile: StorageFile
  /** Gets or sets the location that the file save picker suggests to the user as the location to save a file. */
  var suggestedStartLocation: PickerLocationId
  /** Shows the file picker so that the user can save a file, deactivating and the app and reactivating it when the operation is complete. (Windows Phone Store apps) */
  def pickSaveFileAndContinue(): Unit
  /**
    * Shows the file picker so that the user can save a file and set the file name, extension, and location of the file to be saved. (Windows Store apps)
    * @return When the call to this method completes successfully, it returns a storageFile object that was created to represent the saved file. The file name, extension, and location of this storageFile match those specified by the user, but the file has no content.
    */
  def pickSaveFileAsync(): IPromiseWithIAsyncOperation[StorageFile]
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
}

