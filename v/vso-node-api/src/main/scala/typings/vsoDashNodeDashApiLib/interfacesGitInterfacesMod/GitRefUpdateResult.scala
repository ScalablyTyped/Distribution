package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitRefUpdateResult extends js.Object {
  /**
    * Custom message for the result object For instance, Reason for failing.
    */
  var customMessage: java.lang.String
  /**
    * Whether the ref is locked or not
    */
  var isLocked: scala.Boolean
  /**
    * Ref name
    */
  var name: java.lang.String
  /**
    * New object ID
    */
  var newObjectId: java.lang.String
  /**
    * Old object ID
    */
  var oldObjectId: java.lang.String
  /**
    * Name of the plugin that rejected the updated.
    */
  var rejectedBy: java.lang.String
  /**
    * Repository ID
    */
  var repositoryId: java.lang.String
  /**
    * True if the ref update succeeded, false otherwise
    */
  var success: scala.Boolean
  /**
    * Status of the update from the TFS server.
    */
  var updateStatus: GitRefUpdateStatus
}

object GitRefUpdateResult {
  @scala.inline
  def apply(
    customMessage: java.lang.String,
    isLocked: scala.Boolean,
    name: java.lang.String,
    newObjectId: java.lang.String,
    oldObjectId: java.lang.String,
    rejectedBy: java.lang.String,
    repositoryId: java.lang.String,
    success: scala.Boolean,
    updateStatus: GitRefUpdateStatus
  ): GitRefUpdateResult = {
    val __obj = js.Dynamic.literal(customMessage = customMessage, isLocked = isLocked, name = name, newObjectId = newObjectId, oldObjectId = oldObjectId, rejectedBy = rejectedBy, repositoryId = repositoryId, success = success, updateStatus = updateStatus)
  
    __obj.asInstanceOf[GitRefUpdateResult]
  }
}

