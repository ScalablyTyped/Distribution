package typings.winrtUwp.Windows.ApplicationModel.Background

import typings.winrtUwp.Windows.Storage.Provider.CachedFileTarget
import typings.winrtUwp.Windows.Storage.Provider.FileUpdateRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides details about the cached file operation that invoked the trigger. */
trait CachedFileUpdaterTriggerDetails extends js.Object {
  /** Gets whether the system can display UI allowing the user to launch provider app in response to the cached file updater trigger. */
  var canRequestUserInput: Boolean
  /** Gets the FileUpdateRequest object associated with the cached file update. */
  var updateRequest: FileUpdateRequest
  /** Gets the CachedFileTarget object associated with cached file update that indicates whether the local or remote file should be updated. */
  var updateTarget: CachedFileTarget
}

object CachedFileUpdaterTriggerDetails {
  @scala.inline
  def apply(canRequestUserInput: Boolean, updateRequest: FileUpdateRequest, updateTarget: CachedFileTarget): CachedFileUpdaterTriggerDetails = {
    val __obj = js.Dynamic.literal(canRequestUserInput = canRequestUserInput.asInstanceOf[js.Any], updateRequest = updateRequest.asInstanceOf[js.Any], updateTarget = updateTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[CachedFileUpdaterTriggerDetails]
  }
}

