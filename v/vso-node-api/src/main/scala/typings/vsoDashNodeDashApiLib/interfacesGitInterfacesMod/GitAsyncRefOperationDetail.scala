package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitAsyncRefOperationDetail extends js.Object {
  /**
    * Indicates if there was a conflict generated when trying to cherry pick or revert the changes.
    */
  var conflict: scala.Boolean
  /**
    * The current commit from the list of commits that are being cherry picked or reverted.
    */
  var currentCommitId: java.lang.String
  /**
    * Detailed information about why the cherry pick or revert failed to complete.
    */
  var failureMessage: java.lang.String
  /**
    * A number between 0 and 1 indicating the percent complete of the operation.
    */
  var progress: scala.Double
  /**
    * Provides a status code that indicates the reason the cherry pick or revert failed.
    */
  var status: GitAsyncRefOperationFailureStatus
  /**
    * Indicates if the operation went beyond the maximum time allowed for a cherry pick or revert operation.
    */
  var timedout: scala.Boolean
}

object GitAsyncRefOperationDetail {
  @scala.inline
  def apply(
    conflict: scala.Boolean,
    currentCommitId: java.lang.String,
    failureMessage: java.lang.String,
    progress: scala.Double,
    status: GitAsyncRefOperationFailureStatus,
    timedout: scala.Boolean
  ): GitAsyncRefOperationDetail = {
    val __obj = js.Dynamic.literal(conflict = conflict, currentCommitId = currentCommitId, failureMessage = failureMessage, progress = progress, status = status, timedout = timedout)
  
    __obj.asInstanceOf[GitAsyncRefOperationDetail]
  }
}

