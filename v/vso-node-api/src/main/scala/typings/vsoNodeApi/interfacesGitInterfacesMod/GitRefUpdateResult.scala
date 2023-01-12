package typings.vsoNodeApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GitRefUpdateResult extends StObject {
  
  /**
    * Custom message for the result object For instance, Reason for failing.
    */
  var customMessage: String
  
  /**
    * Whether the ref is locked or not
    */
  var isLocked: Boolean
  
  /**
    * Ref name
    */
  var name: String
  
  /**
    * New object ID
    */
  var newObjectId: String
  
  /**
    * Old object ID
    */
  var oldObjectId: String
  
  /**
    * Name of the plugin that rejected the updated.
    */
  var rejectedBy: String
  
  /**
    * Repository ID
    */
  var repositoryId: String
  
  /**
    * True if the ref update succeeded, false otherwise
    */
  var success: Boolean
  
  /**
    * Status of the update from the TFS server.
    */
  var updateStatus: GitRefUpdateStatus
}
object GitRefUpdateResult {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: GitRefUpdateResult] (val x: Self) extends AnyVal {
    
    inline def setCustomMessage(value: String): Self = StObject.set(x, "customMessage", value.asInstanceOf[js.Any])
    
    inline def setIsLocked(value: Boolean): Self = StObject.set(x, "isLocked", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNewObjectId(value: String): Self = StObject.set(x, "newObjectId", value.asInstanceOf[js.Any])
    
    inline def setOldObjectId(value: String): Self = StObject.set(x, "oldObjectId", value.asInstanceOf[js.Any])
    
    inline def setRejectedBy(value: String): Self = StObject.set(x, "rejectedBy", value.asInstanceOf[js.Any])
    
    inline def setRepositoryId(value: String): Self = StObject.set(x, "repositoryId", value.asInstanceOf[js.Any])
    
    inline def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
    
    inline def setUpdateStatus(value: GitRefUpdateStatus): Self = StObject.set(x, "updateStatus", value.asInstanceOf[js.Any])
  }
}
