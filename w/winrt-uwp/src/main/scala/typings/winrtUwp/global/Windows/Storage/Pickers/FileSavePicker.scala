package typings.winrtUwp.global.Windows.Storage.Pickers

import typings.winrtUwp.Windows.Foundation.Collections.IMap
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.Collections.ValueSet
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a file picker that lets the user choose the file name, extension, and storage location for a file. */
@JSGlobal("Windows.Storage.Pickers.FileSavePicker")
@js.native
/** Creates a new instance of a FileSavePicker . */
class FileSavePicker ()
  extends typings.winrtUwp.Windows.Storage.Pickers.FileSavePicker {
  /** Gets or sets the label text of the commit button in the file picker UI. */
  /* CompleteClass */
  override var commitButtonText: String = js.native
  /** Gets a set of values to be populated by the app before a PickSaveFileAndContinue operation that deactivates the app in order to provide context when the app is activated. (Windows Phone Store apps) */
  /* CompleteClass */
  override var continuationData: ValueSet = js.native
  /** Gets or sets the default file name extension that the fileSavePicker gives to files to be saved. */
  /* CompleteClass */
  override var defaultFileExtension: String = js.native
  /** Gets or sets an ID that specifies the enterprise that owns the file. */
  /* CompleteClass */
  override var enterpriseId: String = js.native
  /** Gets the collection of valid file types that the user can choose to assign to a file. */
  /* CompleteClass */
  override var fileTypeChoices: IMap[String, IVector[String]] = js.native
  /** Gets or sets the settings identifier associated with the current FileSavePicker instance. */
  /* CompleteClass */
  override var settingsIdentifier: String = js.native
  /** Gets or sets the file name that the file save picker suggests to the user. */
  /* CompleteClass */
  override var suggestedFileName: String = js.native
  /** Gets or sets the storageFile that the file picker suggests to the user for saving a file. */
  /* CompleteClass */
  override var suggestedSaveFile: StorageFile = js.native
  /** Gets or sets the location that the file save picker suggests to the user as the location to save a file. */
  /* CompleteClass */
  override var suggestedStartLocation: typings.winrtUwp.Windows.Storage.Pickers.PickerLocationId = js.native
  /** Shows the file picker so that the user can save a file, deactivating and the app and reactivating it when the operation is complete. (Windows Phone Store apps) */
  /* CompleteClass */
  override def pickSaveFileAndContinue(): Unit = js.native
  /**
    * Shows the file picker so that the user can save a file and set the file name, extension, and location of the file to be saved. (Windows Store apps)
    * @return When the call to this method completes successfully, it returns a storageFile object that was created to represent the saved file. The file name, extension, and location of this storageFile match those specified by the user, but the file has no content.
    */
  /* CompleteClass */
  override def pickSaveFileAsync(): IPromiseWithIAsyncOperation[StorageFile] = js.native
}

