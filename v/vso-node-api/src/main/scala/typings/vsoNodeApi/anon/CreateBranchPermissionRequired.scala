package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBranchPermissionRequired extends js.Object {
  
  var createBranchPermissionRequired: scala.Double = js.native
  
  var createTagPermissionRequired: scala.Double = js.native
  
  var forcePushRequired: scala.Double = js.native
  
  var invalidRefName: scala.Double = js.native
  
  var locked: scala.Double = js.native
  
  var manageNotePermissionRequired: scala.Double = js.native
  
  var refNameConflict: scala.Double = js.native
  
  var rejectedByPlugin: scala.Double = js.native
  
  var rejectedByPolicy: scala.Double = js.native
  
  var staleOldObjectId: scala.Double = js.native
  
  var succeeded: scala.Double = js.native
  
  var succeededCorruptRef: scala.Double = js.native
  
  var succeededNonExistentRef: scala.Double = js.native
  
  var unprocessed: scala.Double = js.native
  
  var unresolvableToCommit: scala.Double = js.native
  
  var writePermissionRequired: scala.Double = js.native
}
object CreateBranchPermissionRequired {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class CreateBranchPermissionRequiredOps[Self <: CreateBranchPermissionRequired] (val x: Self) extends AnyVal {
    
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
    def setCreateBranchPermissionRequired(value: scala.Double): Self = this.set("createBranchPermissionRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreateTagPermissionRequired(value: scala.Double): Self = this.set("createTagPermissionRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForcePushRequired(value: scala.Double): Self = this.set("forcePushRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidRefName(value: scala.Double): Self = this.set("invalidRefName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocked(value: scala.Double): Self = this.set("locked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManageNotePermissionRequired(value: scala.Double): Self = this.set("manageNotePermissionRequired", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefNameConflict(value: scala.Double): Self = this.set("refNameConflict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectedByPlugin(value: scala.Double): Self = this.set("rejectedByPlugin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectedByPolicy(value: scala.Double): Self = this.set("rejectedByPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaleOldObjectId(value: scala.Double): Self = this.set("staleOldObjectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucceeded(value: scala.Double): Self = this.set("succeeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucceededCorruptRef(value: scala.Double): Self = this.set("succeededCorruptRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucceededNonExistentRef(value: scala.Double): Self = this.set("succeededNonExistentRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessed(value: scala.Double): Self = this.set("unprocessed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnresolvableToCommit(value: scala.Double): Self = this.set("unresolvableToCommit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritePermissionRequired(value: scala.Double): Self = this.set("writePermissionRequired", value.asInstanceOf[js.Any])
  }
}
