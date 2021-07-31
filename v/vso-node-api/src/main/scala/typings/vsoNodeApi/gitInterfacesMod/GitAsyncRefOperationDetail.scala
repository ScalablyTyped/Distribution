package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitAsyncRefOperationDetail extends StObject {
  
  /**
    * Indicates if there was a conflict generated when trying to cherry pick or revert the changes.
    */
  var conflict: Boolean
  
  /**
    * The current commit from the list of commits that are being cherry picked or reverted.
    */
  var currentCommitId: String
  
  /**
    * Detailed information about why the cherry pick or revert failed to complete.
    */
  var failureMessage: String
  
  /**
    * A number between 0 and 1 indicating the percent complete of the operation.
    */
  var progress: Double
  
  /**
    * Provides a status code that indicates the reason the cherry pick or revert failed.
    */
  var status: GitAsyncRefOperationFailureStatus
  
  /**
    * Indicates if the operation went beyond the maximum time allowed for a cherry pick or revert operation.
    */
  var timedout: Boolean
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
  implicit class GitAsyncRefOperationDetailMutableBuilder[Self <: GitAsyncRefOperationDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConflict(value: Boolean): Self = StObject.set(x, "conflict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentCommitId(value: String): Self = StObject.set(x, "currentCommitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureMessage(value: String): Self = StObject.set(x, "failureMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: GitAsyncRefOperationFailureStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimedout(value: Boolean): Self = StObject.set(x, "timedout", value.asInstanceOf[js.Any])
  }
}
