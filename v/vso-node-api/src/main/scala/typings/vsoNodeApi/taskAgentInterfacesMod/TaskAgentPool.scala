package typings.vsoNodeApi.taskAgentInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskAgentPool extends TaskAgentPoolReference {
  
  /**
    * Gets the administrators group for this agent pool.
    */
  var administratorsGroup: IdentityRef = js.native
  
  /**
    * Gets or sets a value indicating whether or not a queue should be automatically provisioned for each project collection or not.
    */
  var autoProvision: Boolean = js.native
  
  /**
    * Gets the identity who created this pool. The creator of the pool is automatically added into the administrators group for the pool on creation.
    */
  var createdBy: IdentityRef = js.native
  
  /**
    * Gets the date/time of the pool creation.
    */
  var createdOn: Date = js.native
  
  /**
    * Gets the scope identifier for groups/roles which are owned by this pool.
    */
  var groupScopeId: String = js.native
  
  var properties: js.Any = js.native
  
  /**
    * Gets a value indicating whether or not roles have been provisioned for this pool.
    */
  var provisioned: Boolean = js.native
  
  /**
    * Gets the service accounts group for this agent pool.
    */
  var serviceAccountsGroup: IdentityRef = js.native
  
  /**
    * Gets the current size of the pool.
    */
  var size: Double = js.native
}
object TaskAgentPool {
  
  @scala.inline
  def apply(
    administratorsGroup: IdentityRef,
    autoProvision: Boolean,
    createdBy: IdentityRef,
    createdOn: Date,
    groupScopeId: String,
    id: Double,
    isHosted: Boolean,
    name: String,
    poolType: TaskAgentPoolType,
    properties: js.Any,
    provisioned: Boolean,
    scope: String,
    serviceAccountsGroup: IdentityRef,
    size: Double
  ): TaskAgentPool = {
    val __obj = js.Dynamic.literal(administratorsGroup = administratorsGroup.asInstanceOf[js.Any], autoProvision = autoProvision.asInstanceOf[js.Any], createdBy = createdBy.asInstanceOf[js.Any], createdOn = createdOn.asInstanceOf[js.Any], groupScopeId = groupScopeId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isHosted = isHosted.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], poolType = poolType.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], provisioned = provisioned.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any], serviceAccountsGroup = serviceAccountsGroup.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskAgentPool]
  }
  
  @scala.inline
  implicit class TaskAgentPoolOps[Self <: TaskAgentPool] (val x: Self) extends AnyVal {
    
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
    def setAdministratorsGroup(value: IdentityRef): Self = this.set("administratorsGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoProvision(value: Boolean): Self = this.set("autoProvision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedBy(value: IdentityRef): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedOn(value: Date): Self = this.set("createdOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupScopeId(value: String): Self = this.set("groupScopeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioned(value: Boolean): Self = this.set("provisioned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAccountsGroup(value: IdentityRef): Self = this.set("serviceAccountsGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
