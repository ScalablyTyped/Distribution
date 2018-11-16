package typings
package winrtDashUwpLib.WindowsNs.StorageNs.PickersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a file picker that lets the user choose the file name, extension, and storage location for a file. */
@JSGlobal("Windows.Storage.Pickers.FileSavePicker")
@js.native
class FileSavePicker () extends js.Object {
  /** Gets or sets the label text of the commit button in the file picker UI. */
  var commitButtonText: java.lang.String = js.native
  /** Gets a set of values to be populated by the app before a PickSaveFileAndContinue operation that deactivates the app in order to provide context when the app is activated. (Windows Phone Store apps) */
  var continuationData: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.ValueSet = js.native
  /** Gets or sets the default file name extension that the fileSavePicker gives to files to be saved. */
  var defaultFileExtension: java.lang.String = js.native
  /** Gets or sets an ID that specifies the enterprise that owns the file. */
  var enterpriseId: java.lang.String = js.native
  /** Gets the collection of valid file types that the user can choose to assign to a file. */
  var fileTypeChoices: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IMap[
    java.lang.String, 
    winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String]
  ] = js.native
  /** Gets or sets the settings identifier associated with the current FileSavePicker instance. */
  var settingsIdentifier: java.lang.String = js.native
  /** Gets or sets the file name that the file save picker suggests to the user. */
  var suggestedFileName: java.lang.String = js.native
  /** Gets or sets the storageFile that the file picker suggests to the user for saving a file. */
  var suggestedSaveFile: winrtDashUwpLib.WindowsNs.StorageNs.StorageFile = js.native
  /** Gets or sets the location that the file save picker suggests to the user as the location to save a file. */
  var suggestedStartLocation: PickerLocationId = js.native
  /** Shows the file picker so that the user can save a file, deactivating and the app and reactivating it when the operation is complete. (Windows Phone Store apps) */
  def pickSaveFileAndContinue(): scala.Unit = js.native
  /**
                   * Shows the file picker so that the user can save a file and set the file name, extension, and location of the file to be saved. (Windows Store apps)
                   * @return When the call to this method completes successfully, it returns a storageFile object that was created to represent the saved file. The file name, extension, and location of this storageFile match those specified by the user, but the file has no content.
                   */
  def pickSaveFileAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageFile] = js.native
}

