package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitRefUpdateResult extends js.Object {
  /**
    * Custom message for the result object For instance, Reason for failing.
    */
  var customMessage: String
  /**
    * Whether the ref is locked or not
    */
  var isLocked: Boolean
  /**
    * Ref name
    */
  var name: String
  /**
    * New object ID
    */
  var newObjectId: String
  /**
    * Old object ID
    */
  var oldObjectId: String
  /**
    * Name of the plugin that rejected the updated.
    */
  var rejectedBy: String
  /**
    * Repository ID
    */
  var repositoryId: String
  /**
    * True if the ref update succeeded, false otherwise
    */
  var success: Boolean
  /**
    * Status of the update from the TFS server.
    */
  var updateStatus: GitRefUpdateStatus
}

object GitRefUpdateResult {
  @scala.inline
  def apply(
    customMessage: String,
    isLocked: Boolean,
    name: String,
    newObjectId: String,
    oldObjectId: String,
    rejectedBy: String,
    repositoryId: String,
    success: Boolean,
    updateStatus: GitRefUpdateStatus
  ): GitRefUpdateResult = {
    val __obj = js.Dynamic.literal(customMessage = customMessage, isLocked = isLocked, name = name, newObjectId = newObjectId, oldObjectId = oldObjectId, rejectedBy = rejectedBy, repositoryId = repositoryId, success = success, updateStatus = updateStatus)
  
    __obj.asInstanceOf[GitRefUpdateResult]
  }
}

