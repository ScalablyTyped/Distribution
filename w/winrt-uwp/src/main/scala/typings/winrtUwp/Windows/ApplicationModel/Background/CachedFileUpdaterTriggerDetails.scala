package typings.winrtUwp.Windows.ApplicationModel.Background

import typings.winrtUwp.Windows.Storage.Provider.CachedFileTarget
import typings.winrtUwp.Windows.Storage.Provider.FileUpdateRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides details about the cached file operation that invoked the trigger. */
@js.native
trait CachedFileUpdaterTriggerDetails extends js.Object {
  /** Gets whether the system can display UI allowing the user to launch provider app in response to the cached file updater trigger. */
  var canRequestUserInput: Boolean = js.native
  /** Gets the FileUpdateRequest object associated with the cached file update. */
  var updateRequest: FileUpdateRequest = js.native
  /** Gets the CachedFileTarget object associated with cached file update that indicates whether the local or remote file should be updated. */
  var updateTarget: CachedFileTarget = js.native
}

object CachedFileUpdaterTriggerDetails {
  @scala.inline
  def apply(canRequestUserInput: Boolean, updateRequest: FileUpdateRequest, updateTarget: CachedFileTarget): CachedFileUpdaterTriggerDetails = {
    val __obj = js.Dynamic.literal(canRequestUserInput = canRequestUserInput.asInstanceOf[js.Any], updateRequest = updateRequest.asInstanceOf[js.Any], updateTarget = updateTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachedFileUpdaterTriggerDetails]
  }
  @scala.inline
  implicit class CachedFileUpdaterTriggerDetailsOps[Self <: CachedFileUpdaterTriggerDetails] (val x: Self) extends AnyVal {
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
    def setCanRequestUserInput(value: Boolean): Self = this.set("canRequestUserInput", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateRequest(value: FileUpdateRequest): Self = this.set("updateRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdateTarget(value: CachedFileTarget): Self = this.set("updateTarget", value.asInstanceOf[js.Any])
  }
  
}

