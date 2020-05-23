package typings.winrtUwp.Windows.Storage.Provider

import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about a requested file update so that the app can complete the request. */
trait FileUpdateRequest extends js.Object {
  /** Gets the unique identifier used to associate the local version of a file with the corresponding remote version. */
  var contentId: String
  /** Gets a StorageFile object that represents the locally cached copy of the file to update. */
  var file: StorageFile
  /** Gets or sets the status of the update. This property is set in response to a FileUpdateRequested event. */
  var status: FileUpdateStatus
  /** Gets or sets a message to the user indicating that user input is needed to complete the FileUpdateRequest . */
  var userInputNeededMessage: String
  /**
    * Gets an object used to complete an update asynchronously.
    * @return The object that the app uses to indicate, asynchronously, that it has finished responding to a FileUpdateRequested event and that the Request is complete.
    */
  def getDeferral(): FileUpdateRequestDeferral
  /**
    * Provide a new version of the local file to represent the remote file.
    * @param value The new version of the local file that will represent remote file.
    */
  def updateLocalFile(value: IStorageFile): Unit
}

object FileUpdateRequest {
  @scala.inline
  def apply(
    contentId: String,
    file: StorageFile,
    getDeferral: () => FileUpdateRequestDeferral,
    status: FileUpdateStatus,
    updateLocalFile: IStorageFile => Unit,
    userInputNeededMessage: String
  ): FileUpdateRequest = {
    val __obj = js.Dynamic.literal(contentId = contentId.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), status = status.asInstanceOf[js.Any], updateLocalFile = js.Any.fromFunction1(updateLocalFile), userInputNeededMessage = userInputNeededMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileUpdateRequest]
  }
}

