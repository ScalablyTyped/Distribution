package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlanMetadata extends js.Object {
  /**
    * Identity of the creator of the plan
    */
  var createdByIdentity: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Description of plan
    */
  var description: java.lang.String
  /**
    * Last modified date of the plan
    */
  var modifiedDate: stdLib.Date
  /**
    * Bit flag indicating set of permissions a user has to the plan.
    */
  var userPermissions: PlanUserPermissions
}

object PlanMetadata {
  @scala.inline
  def apply(
    createdByIdentity: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    description: java.lang.String,
    modifiedDate: stdLib.Date,
    userPermissions: PlanUserPermissions
  ): PlanMetadata = {
    val __obj = js.Dynamic.literal(createdByIdentity = createdByIdentity, description = description, modifiedDate = modifiedDate, userPermissions = userPermissions)
  
    __obj.asInstanceOf[PlanMetadata]
  }
}

