package typings.winrtDashUwp.Windows.Storage.Provider

import typings.winrtDashUwp.Windows.Storage.IStorageFile
import typings.winrtDashUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about a requested file update so that the app can complete the request. */
@JSGlobal("Windows.Storage.Provider.FileUpdateRequest")
@js.native
abstract class FileUpdateRequest () extends js.Object {
  /** Gets the unique identifier used to associate the local version of a file with the corresponding remote version. */
  var contentId: String = js.native
  /** Gets a StorageFile object that represents the locally cached copy of the file to update. */
  var file: StorageFile = js.native
  /** Gets or sets the status of the update. This property is set in response to a FileUpdateRequested event. */
  var status: FileUpdateStatus = js.native
  /** Gets or sets a message to the user indicating that user input is needed to complete the FileUpdateRequest . */
  var userInputNeededMessage: String = js.native
  /**
    * Gets an object used to complete an update asynchronously.
    * @return The object that the app uses to indicate, asynchronously, that it has finished responding to a FileUpdateRequested event and that the Request is complete.
    */
  def getDeferral(): FileUpdateRequestDeferral = js.native
  /**
    * Provide a new version of the local file to represent the remote file.
    * @param value The new version of the local file that will represent remote file.
    */
  def updateLocalFile(value: IStorageFile): Unit = js.native
}

