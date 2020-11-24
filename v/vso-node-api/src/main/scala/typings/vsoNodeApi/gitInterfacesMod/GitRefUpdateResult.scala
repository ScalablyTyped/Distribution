package typings.vsoNodeApi.gitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitRefUpdateResult extends js.Object {
  
  /**
    * Custom message for the result object For instance, Reason for failing.
    */
  var customMessage: String = js.native
  
  /**
    * Whether the ref is locked or not
    */
  var isLocked: Boolean = js.native
  
  /**
    * Ref name
    */
  var name: String = js.native
  
  /**
    * New object ID
    */
  var newObjectId: String = js.native
  
  /**
    * Old object ID
    */
  var oldObjectId: String = js.native
  
  /**
    * Name of the plugin that rejected the updated.
    */
  var rejectedBy: String = js.native
  
  /**
    * Repository ID
    */
  var repositoryId: String = js.native
  
  /**
    * True if the ref update succeeded, false otherwise
    */
  var success: Boolean = js.native
  
  /**
    * Status of the update from the TFS server.
    */
  var updateStatus: GitRefUpdateStatus = js.native
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
    val __obj = js.Dynamic.literal(customMessage = customMessage.asInstanceOf[js.Any], isLocked = isLocked.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], newObjectId = newObjectId.asInstanceOf[js.Any], oldObjectId = oldObjectId.asInstanceOf[js.Any], rejectedBy = rejectedBy.asInstanceOf[js.Any], repositoryId = repositoryId.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any], updateStatus = updateStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitRefUpdateResult]
  }
  
  @scala.inline
  implicit class GitRefUpdateResultOps[Self <: GitRefUpdateResult] (val x: Self) extends AnyVal {
    
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
    def setCustomMessage(value: String): Self = this.set("customMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLocked(value: Boolean): Self = this.set("isLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewObjectId(value: String): Self = this.set("newObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldObjectId(value: String): Self = this.set("oldObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectedBy(value: String): Self = this.set("rejectedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryId(value: String): Self = this.set("repositoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateStatus(value: GitRefUpdateStatus): Self = this.set("updateStatus", value.asInstanceOf[js.Any])
  }
}
