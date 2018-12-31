package typings
package winrtDashUwpLib.WindowsNs.StorageNs.PickersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a UI element that lets the user choose and open files. */
@JSGlobal("Windows.Storage.Pickers.FileOpenPicker")
@js.native
 /* unmapped type */ /** Creates a new instance of a FileOpenPicker . */
class FileOpenPicker () extends js.Object {
  /** Gets or sets the label text of the file open picker's commit button. */
  var commitButtonText: java.lang.String = js.native
  /** Gets a set of values to be populated by the app before PickSingleFileAndContinue or PickMultipleFilesAndContinue operation that deactivates the app in order to provide context when the app is activated. (Windows Phone Store apps) */
  var continuationData: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.ValueSet = js.native
  /** Gets the collection of file types that the file open picker displays. */
  var fileTypeFilter: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /** Gets or sets the settings identifier associated with the state of the file open picker. */
  var settingsIdentifier: java.lang.String = js.native
  /** Gets or sets the initial location where the file open picker looks for files to present to the user. */
  var suggestedStartLocation: PickerLocationId = js.native
  /** Gets or sets the view mode that the file open picker uses to display items. */
  var viewMode: PickerViewMode = js.native
  /** Shows the file picker so that the user can pick multiple files, deactivating and the app and reactivating it when the operation is complete. (Windows Phone Store apps) */
  def pickMultipleFilesAndContinue(): scala.Unit = js.native
  /**
    * Shows the file picker so that the user can pick multiple files. (Windows Store apps)
    * @return When the call to this method completes successfully, it returns a filePickerSelectedFilesArray object that contains all the files that were picked by the user. Picked files in this array are represented by storageFile objects.
    */
  def pickMultipleFilesAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /** Shows the file picker so that the user can pick one file, potentially deactivating the app and reactivating it when the operation is complete. (Windows Phone Store apps) */
  def pickSingleFileAndContinue(): scala.Unit = js.native
  /**
    * Shows the file picker so that the user can pick one file.
    * @return When the call to this method completes successfully, it returns a StorageFile object that represents the file that the user picked.
    */
  def pickSingleFileAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageFile] = js.native
  /**
    * Shows the file picker so that the user can pick one file.
    * @param pickerOperationId This argument is ignored and has no effect.
    * @return When the call to this method completes successfully, it returns a StorageFile object that represents the file that the user picked.
    */
  def pickSingleFileAsync(pickerOperationId: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageFile] = js.native
}

/** Represents a UI element that lets the user choose and open files. */
@JSGlobal("Windows.Storage.Pickers.FileOpenPicker")
@js.native
object FileOpenPicker extends js.Object {
  var resumePickSingleFileAsync: js.Any = js.native
}

