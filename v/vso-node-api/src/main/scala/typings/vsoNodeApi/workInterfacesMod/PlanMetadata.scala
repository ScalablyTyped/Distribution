package typings.vsoNodeApi.workInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlanMetadata extends StObject {
  
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
  implicit class PlanMetadataMutableBuilder[Self <: PlanMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedByIdentity(value: IdentityRef): Self = StObject.set(x, "createdByIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedDate(value: Date): Self = StObject.set(x, "modifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserPermissions(value: PlanUserPermissions): Self = StObject.set(x, "userPermissions", value.asInstanceOf[js.Any])
  }
}
