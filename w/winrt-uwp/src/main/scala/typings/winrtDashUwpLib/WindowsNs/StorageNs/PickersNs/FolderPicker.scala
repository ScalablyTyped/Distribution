package typings
package winrtDashUwpLib.WindowsNs.StorageNs.PickersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a UI element that lets the user choose folders. */
@JSGlobal("Windows.Storage.Pickers.FolderPicker")
@js.native
/** Creates a new instance of a FolderPicker . */
class FolderPicker () extends js.Object {
  /** Gets or sets the label text of the folder picker's commit button. */
  var commitButtonText: java.lang.String = js.native
  /** Gets a set of values to be populated by the app before a PickFolderAndContinue operation that deactivates the app in order to provide context when the app is activated. (Windows Phone Store apps) */
  var continuationData: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.ValueSet = js.native
  /** Gets the collection of file types that the folder picker displays. */
  var fileTypeFilter: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
  /** Gets or sets the settings identifier associated with the with the current FolderPicker instance. */
  var settingsIdentifier: java.lang.String = js.native
  /** Gets or sets the initial location where the folder picker looks for folders to present to the user. */
  var suggestedStartLocation: PickerLocationId = js.native
  /** Gets or sets the view mode that the folder picker uses to display items. */
  var viewMode: PickerViewMode = js.native
  /** Shows the file picker so that the user can pick a folder, deactivating and the app and reactivating it when the operation is complete. (Windows Phone Store apps) */
  def pickFolderAndContinue(): scala.Unit = js.native
  /**
    * Shows the folderPicker object so that the user can pick a folder. (Windows Store apps)
    * @return When the call to this method completes successfully, it returns a storageFolder object that represents the folder that the user picked.
    */
  def pickSingleFolderAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StorageFolder] = js.native
}

