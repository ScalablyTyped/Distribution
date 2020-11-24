package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitConflictUpdateResult extends js.Object {
  
  /**
    * Conflict ID that was provided by input
    */
  var conflictId: Double = js.native
  
  /**
    * Reason for failing
    */
  var customMessage: String = js.native
  
  /**
    * Status of the update on the server
    */
  var updateStatus: GitConflictUpdateStatus = js.native
  
  /**
    * New state of the conflict after updating
    */
  var updatedConflict: GitConflict = js.native
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
  
  @scala.inline
  implicit class GitConflictUpdateResultOps[Self <: GitConflictUpdateResult] (val x: Self) extends AnyVal {
    
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
    def setConflictId(value: Double): Self = this.set("conflictId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomMessage(value: String): Self = this.set("customMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateStatus(value: GitConflictUpdateStatus): Self = this.set("updateStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedConflict(value: GitConflict): Self = this.set("updatedConflict", value.asInstanceOf[js.Any])
  }
}
