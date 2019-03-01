package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitConflictUpdateResult extends js.Object {
  /**
    * Conflict ID that was provided by input
    */
  var conflictId: scala.Double
  /**
    * Reason for failing
    */
  var customMessage: java.lang.String
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
    conflictId: scala.Double,
    customMessage: java.lang.String,
    updateStatus: GitConflictUpdateStatus,
    updatedConflict: GitConflict
  ): GitConflictUpdateResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("conflictId")(conflictId)
    __obj.updateDynamic("customMessage")(customMessage)
    __obj.updateDynamic("updateStatus")(updateStatus)
    __obj.updateDynamic("updatedConflict")(updatedConflict)
    __obj.asInstanceOf[GitConflictUpdateResult]
  }
}

