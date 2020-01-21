package typings.vsoNodeApi.taskAgentInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskAgentPool extends TaskAgentPoolReference {
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
  var createdOn: Date
  /**
    * Gets the scope identifier for groups/roles which are owned by this pool.
    */
  var groupScopeId: String
  var properties: js.Any
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
}

