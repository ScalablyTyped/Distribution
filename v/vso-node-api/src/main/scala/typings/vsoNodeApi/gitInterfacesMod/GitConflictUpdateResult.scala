package typings.vsoNodeApi.gitInterfacesMod

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
    val __obj = js.Dynamic.literal(conflictId = conflictId.asInstanceOf[js.Any], customMessage = customMessage.asInstanceOf[js.Any], updateStatus = updateStatus.asInstanceOf[js.Any], updatedConflict = updatedConflict.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GitConflictUpdateResult]
  }
}

