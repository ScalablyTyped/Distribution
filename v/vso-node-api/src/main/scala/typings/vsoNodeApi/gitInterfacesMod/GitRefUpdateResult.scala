package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GitRefUpdateResult extends StObject {
  
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
  implicit class GitRefUpdateResultMutableBuilder[Self <: GitRefUpdateResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomMessage(value: String): Self = StObject.set(x, "customMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsLocked(value: Boolean): Self = StObject.set(x, "isLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewObjectId(value: String): Self = StObject.set(x, "newObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldObjectId(value: String): Self = StObject.set(x, "oldObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectedBy(value: String): Self = StObject.set(x, "rejectedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryId(value: String): Self = StObject.set(x, "repositoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateStatus(value: GitRefUpdateStatus): Self = StObject.set(x, "updateStatus", value.asInstanceOf[js.Any])
  }
}
