package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import typings.vsoNodeApi.interfacesCommonVssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskAgentPool
  extends StObject
     with TaskAgentPoolReference {
  
  /**
    * Gets the administrators group for this agent pool.
    */
  var administratorsGroup: IdentityRef
  
  /**
    * Gets or sets a value indicating whether or not a queue should be automatically provisioned for each project collection or not.
    */
  var autoProvision: Boolean
  
  /**
    * Gets the identity who created this pool. The creator of the pool is automatically added into the administrators group for the pool on creation.
    */
  var createdBy: IdentityRef
  
  /**
    * Gets the date/time of the pool creation.
    */
  var createdOn: js.Date
  
  /**
    * Gets the scope identifier for groups/roles which are owned by this pool.
    */
  var groupScopeId: String
  
  var properties: Any
  
  /**
    * Gets a value indicating whether or not roles have been provisioned for this pool.
    */
  var provisioned: Boolean
  
  /**
    * Gets the service accounts group for this agent pool.
    */
  var serviceAccountsGroup: IdentityRef
  
  /**
    * Gets the current size of the pool.
    */
  var size: Double
}
object TaskAgentPool {
  
  inline def apply(
    administratorsGroup: IdentityRef,
    autoProvision: Boolean,
    createdBy: IdentityRef,
    createdOn: js.Date,
    groupScopeId: String,
    id: Double,
    isHosted: Boolean,
    name: String,
    poolType: TaskAgentPoolType,
    properties: Any,
    provisioned: Boolean,
    scope: String,
    serviceAccountsGroup: IdentityRef,
    size: Double
  ): TaskAgentPool = {
    val __obj = js.Dynamic.literal(administratorsGroup = administratorsGroup.asInstanceOf[js.Any], autoProvision = autoProvision.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], groupScopeId = groupScopeId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isHosted = isHosted.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], poolType = poolType.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], provisioned = provisioned.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], serviceAccountsGroup = serviceAccountsGroup.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentPool]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskAgentPool] (val x: Self) extends AnyVal {
    
    inline def setAdministratorsGroup(value: IdentityRef): Self = StObject.set(x, "administratorsGroup", value.asInstanceOf[js.Any])
    
    inline def setAutoProvision(value: Boolean): Self = StObject.set(x, "autoProvision", value.asInstanceOf[js.Any])
    
    inline def setCreatedBy(value: IdentityRef): Self = StObject.set(x, "createdBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedOn(value: js.Date): Self = StObject.set(x, "createdOn", value.asInstanceOf[js.Any])
    
    inline def setGroupScopeId(value: String): Self = StObject.set(x, "groupScopeId", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setProvisioned(value: Boolean): Self = StObject.set(x, "provisioned", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountsGroup(value: IdentityRef): Self = StObject.set(x, "serviceAccountsGroup", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
