package typings.winrtUwp.Windows.Storage.Pickers.Provider

import typings.winrtUwp.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Lets an app that provides a save location specify the storageFile that represents the file to save and get a deferral so the app can respond asynchronously to a targetFileRequested event. */
@js.native
trait TargetFileRequest extends js.Object {
  /** Gets or sets the IStorageFile object that is provided to represent the file to save by the app that is providing the save location. */
  var targetFile: IStorageFile = js.native
  /**
    * Gets a targetFileRequestDeferral that the app providing the save location can use to respond asynchronously to a targetfilerequested event.
    * @return The targetFileRequestDeferral that the providing app can use asynchronously to indicate that it is finished responding to a targetfilerequested event.
    */
  def getDeferral(): TargetFileRequestDeferral = js.native
}

object TargetFileRequest {
  @scala.inline
  def apply(getDeferral: () => TargetFileRequestDeferral, targetFile: IStorageFile): TargetFileRequest = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral), targetFile = targetFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetFileRequest]
  }
  @scala.inline
  implicit class TargetFileRequestOps[Self <: TargetFileRequest] (val x: Self) extends AnyVal {
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
    def setGetDeferral(value: () => TargetFileRequestDeferral): Self = this.set("getDeferral", js.Any.fromFunction0(value))
    @scala.inline
    def setTargetFile(value: IStorageFile): Self = this.set("targetFile", value.asInstanceOf[js.Any])
  }
  
}

