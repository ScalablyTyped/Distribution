package typings.vsoNodeApi.workInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlanMetadata extends js.Object {
  
  /**
    * Identity of the creator of the plan
    */
  var createdByIdentity: IdentityRef = js.native
  
  /**
    * Description of plan
    */
  var description: String = js.native
  
  /**
    * Last modified date of the plan
    */
  var modifiedDate: Date = js.native
  
  /**
    * Bit flag indicating set of permissions a user has to the plan.
    */
  var userPermissions: PlanUserPermissions = js.native
}
object PlanMetadata {
  
  @scala.inline
  def apply(
    createdByIdentity: IdentityRef,
    description: String,
    modifiedDate: Date,
    userPermissions: PlanUserPermissions
  ): PlanMetadata = {
    val __obj = js.Dynamic.literal(createdByIdentity = createdByIdentity.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], modifiedDate = modifiedDate.asInstanceOf[js.Any], userPermissions = userPermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanMetadata]
  }
  
  @scala.inline
  implicit class PlanMetadataOps[Self <: PlanMetadata] (val x: Self) extends AnyVal {
    
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
    def setCreatedByIdentity(value: IdentityRef): Self = this.set("createdByIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedDate(value: Date): Self = this.set("modifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPermissions(value: PlanUserPermissions): Self = this.set("userPermissions", value.asInstanceOf[js.Any])
  }
}
