package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBranchPermissionRequired extends StObject {
  
  var createBranchPermissionRequired: scala.Double
  
  var createTagPermissionRequired: scala.Double
  
  var forcePushRequired: scala.Double
  
  var invalidRefName: scala.Double
  
  var locked: scala.Double
  
  var manageNotePermissionRequired: scala.Double
  
  var refNameConflict: scala.Double
  
  var rejectedByPlugin: scala.Double
  
  var rejectedByPolicy: scala.Double
  
  var staleOldObjectId: scala.Double
  
  var succeeded: scala.Double
  
  var succeededCorruptRef: scala.Double
  
  var succeededNonExistentRef: scala.Double
  
  var unprocessed: scala.Double
  
  var unresolvableToCommit: scala.Double
  
  var writePermissionRequired: scala.Double
}
object CreateBranchPermissionRequired {
  
  inline def apply(
    createBranchPermissionRequired: scala.Double,
    createTagPermissionRequired: scala.Double,
    forcePushRequired: scala.Double,
    invalidRefName: scala.Double,
    locked: scala.Double,
    manageNotePermissionRequired: scala.Double,
    refNameConflict: scala.Double,
    rejectedByPlugin: scala.Double,
    rejectedByPolicy: scala.Double,
    staleOldObjectId: scala.Double,
    succeeded: scala.Double,
    succeededCorruptRef: scala.Double,
    succeededNonExistentRef: scala.Double,
    unprocessed: scala.Double,
    unresolvableToCommit: scala.Double,
    writePermissionRequired: scala.Double
  ): CreateBranchPermissionRequired = {
    val __obj = js.Dynamic.literal(createBranchPermissionRequired = createBranchPermissionRequired.asInstanceOf[js.Any], createTagPermissionRequired = createTagPermissionRequired.asInstanceOf[js.Any], forcePushRequired = forcePushRequired.asInstanceOf[js.Any], invalidRefName = invalidRefName.asInstanceOf[js.Any], locked = locked.asInstanceOf[js.Any], manageNotePermissionRequired = manageNotePermissionRequired.asInstanceOf[js.Any], refNameConflict = refNameConflict.asInstanceOf[js.Any], rejectedByPlugin = rejectedByPlugin.asInstanceOf[js.Any], rejectedByPolicy = rejectedByPolicy.asInstanceOf[js.Any], staleOldObjectId = staleOldObjectId.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any], succeededCorruptRef = succeededCorruptRef.asInstanceOf[js.Any], succeededNonExistentRef = succeededNonExistentRef.asInstanceOf[js.Any], unprocessed = unprocessed.asInstanceOf[js.Any], unresolvableToCommit = unresolvableToCommit.asInstanceOf[js.Any], writePermissionRequired = writePermissionRequired.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBranchPermissionRequired]
  }
  
  extension [Self <: CreateBranchPermissionRequired](x: Self) {
    
    inline def setCreateBranchPermissionRequired(value: scala.Double): Self = StObject.set(x, "createBranchPermissionRequired", value.asInstanceOf[js.Any])
    
    inline def setCreateTagPermissionRequired(value: scala.Double): Self = StObject.set(x, "createTagPermissionRequired", value.asInstanceOf[js.Any])
    
    inline def setForcePushRequired(value: scala.Double): Self = StObject.set(x, "forcePushRequired", value.asInstanceOf[js.Any])
    
    inline def setInvalidRefName(value: scala.Double): Self = StObject.set(x, "invalidRefName", value.asInstanceOf[js.Any])
    
    inline def setLocked(value: scala.Double): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setManageNotePermissionRequired(value: scala.Double): Self = StObject.set(x, "manageNotePermissionRequired", value.asInstanceOf[js.Any])
    
    inline def setRefNameConflict(value: scala.Double): Self = StObject.set(x, "refNameConflict", value.asInstanceOf[js.Any])
    
    inline def setRejectedByPlugin(value: scala.Double): Self = StObject.set(x, "rejectedByPlugin", value.asInstanceOf[js.Any])
    
    inline def setRejectedByPolicy(value: scala.Double): Self = StObject.set(x, "rejectedByPolicy", value.asInstanceOf[js.Any])
    
    inline def setStaleOldObjectId(value: scala.Double): Self = StObject.set(x, "staleOldObjectId", value.asInstanceOf[js.Any])
    
    inline def setSucceeded(value: scala.Double): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
    
    inline def setSucceededCorruptRef(value: scala.Double): Self = StObject.set(x, "succeededCorruptRef", value.asInstanceOf[js.Any])
    
    inline def setSucceededNonExistentRef(value: scala.Double): Self = StObject.set(x, "succeededNonExistentRef", value.asInstanceOf[js.Any])
    
    inline def setUnprocessed(value: scala.Double): Self = StObject.set(x, "unprocessed", value.asInstanceOf[js.Any])
    
    inline def setUnresolvableToCommit(value: scala.Double): Self = StObject.set(x, "unresolvableToCommit", value.asInstanceOf[js.Any])
    
    inline def setWritePermissionRequired(value: scala.Double): Self = StObject.set(x, "writePermissionRequired", value.asInstanceOf[js.Any])
  }
}
