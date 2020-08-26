package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitAsyncRefOperationDetail extends js.Object {
  /**
    * Indicates if there was a conflict generated when trying to cherry pick or revert the changes.
    */
  var conflict: Boolean = js.native
  /**
    * The current commit from the list of commits that are being cherry picked or reverted.
    */
  var currentCommitId: String = js.native
  /**
    * Detailed information about why the cherry pick or revert failed to complete.
    */
  var failureMessage: String = js.native
  /**
    * A number between 0 and 1 indicating the percent complete of the operation.
    */
  var progress: Double = js.native
  /**
    * Provides a status code that indicates the reason the cherry pick or revert failed.
    */
  var status: GitAsyncRefOperationFailureStatus = js.native
  /**
    * Indicates if the operation went beyond the maximum time allowed for a cherry pick or revert operation.
    */
  var timedout: Boolean = js.native
}

object GitAsyncRefOperationDetail {
  @scala.inline
  def apply(
    conflict: Boolean,
    currentCommitId: String,
    failureMessage: String,
    progress: Double,
    status: GitAsyncRefOperationFailureStatus,
    timedout: Boolean
  ): GitAsyncRefOperationDetail = {
    val __obj = js.Dynamic.literal(conflict = conflict.asInstanceOf[js.Any], currentCommitId = currentCommitId.asInstanceOf[js.Any], failureMessage = failureMessage.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timedout = timedout.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitAsyncRefOperationDetail]
  }
  @scala.inline
  implicit class GitAsyncRefOperationDetailOps[Self <: GitAsyncRefOperationDetail] (val x: Self) extends AnyVal {
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
    def setConflict(value: Boolean): Self = this.set("conflict", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentCommitId(value: String): Self = this.set("currentCommitId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFailureMessage(value: String): Self = this.set("failureMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: GitAsyncRefOperationFailureStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimedout(value: Boolean): Self = this.set("timedout", value.asInstanceOf[js.Any])
  }
  
}

