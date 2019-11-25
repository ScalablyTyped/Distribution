package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlanMetadata extends js.Object {
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
  var modifiedDate: Date
  /**
    * Bit flag indicating set of permissions a user has to the plan.
    */
  var userPermissions: PlanUserPermissions
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
}

