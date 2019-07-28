package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitConflictUpdateResult extends js.Object {
  /**
    * Conflict ID that was provided by input
    */
  var conflictId: Double
  /**
    * Reason for failing
    */
  var customMessage: String
  /**
    * Status of the update on the server
    */
  var updateStatus: GitConflictUpdateStatus
  /**
    * New state of the conflict after updating
    */
  var updatedConflict: GitConflict
}

object GitConflictUpdateResult {
  @scala.inline
  def apply(
    conflictId: Double,
    customMessage: String,
    updateStatus: GitConflictUpdateStatus,
    updatedConflict: GitConflict
  ): GitConflictUpdateResult = {
    val __obj = js.Dynamic.literal(conflictId = conflictId, customMessage = customMessage, updateStatus = updateStatus, updatedConflict = updatedConflict)
  
    __obj.asInstanceOf[GitConflictUpdateResult]
  }
}

