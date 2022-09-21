package typings.vsoNodeApi.workInterfacesMod

import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlanMetadata extends StObject {
  
  /**
    * Identity of the creator of the plan
    */
  var createdByIdentity: IdentityRef
  
  /**
    * Description of plan
    */
  var description: String
  
  /**
    * Last modified date of the plan
    */
  var modifiedDate: js.Date
  
  /**
    * Bit flag indicating set of permissions a user has to the plan.
    */
  var userPermissions: PlanUserPermissions
}
object PlanMetadata {
  
  inline def apply(
    createdByIdentity: IdentityRef,
    description: String,
    modifiedDate: js.Date,
    userPermissions: PlanUserPermissions
  ): PlanMetadata = {
    val __obj = js.Dynamic.literal(createdByIdentity = createdByIdentity.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], modifiedDate = modifiedDate.asInstanceOf[js.Any], userPermissions = userPermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlanMetadata]
  }
  
  extension [Self <: PlanMetadata](x: Self) {
    
    inline def setCreatedByIdentity(value: IdentityRef): Self = StObject.set(x, "createdByIdentity", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setModifiedDate(value: js.Date): Self = StObject.set(x, "modifiedDate", value.asInstanceOf[js.Any])
    
    inline def setUserPermissions(value: PlanUserPermissions): Self = StObject.set(x, "userPermissions", value.asInstanceOf[js.Any])
  }
}
