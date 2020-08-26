package typings.winrtUwp.Windows.Storage.Provider

import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about a requested file update so that the app can complete the request. */
@js.native
trait FileUpdateRequest extends js.Object {
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
  @scala.inline
  implicit class FileUpdateRequestOps[Self <: FileUpdateRequest] (val x: Self) extends AnyVal {
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
    def setContentId(value: String): Self = this.set("contentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFile(value: StorageFile): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetDeferral(value: () => FileUpdateRequestDeferral): Self = this.set("getDeferral", js.Any.fromFunction0(value))
    @scala.inline
    def setStatus(value: FileUpdateStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateLocalFile(value: IStorageFile => Unit): Self = this.set("updateLocalFile", js.Any.fromFunction1(value))
    @scala.inline
    def setUserInputNeededMessage(value: String): Self = this.set("userInputNeededMessage", value.asInstanceOf[js.Any])
  }
  
}

