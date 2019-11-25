package typings.vsoDashNodeDashApi.interfacesWorkInterfacesMod

import typings.std.Date
import typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod.IdentityRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plan extends js.Object {
  /**
    * Identity that created this plan. Defaults to null for records before upgrading to ScaledAgileViewComponent4.
    */
  var createdByIdentity: IdentityRef
  /**
    * Date when the plan was created
    */
  var createdDate: Date
  /**
    * Description of the plan
    */
  var description: String
  /**
    * Id of the plan
    */
  var id: String
  /**
    * Identity that last modified this plan. Defaults to null for records before upgrading to ScaledAgileViewComponent4.
    */
  var modifiedByIdentity: IdentityRef
  /**
    * Date when the plan was last modified. Default to CreatedDate when the plan is first created.
    */
  var modifiedDate: Date
  /**
    * Name of the plan
    */
  var name: String
  /**
    * The PlanPropertyCollection instance associated with the plan. These are dependent on the type of the plan. For example, DeliveryTimelineView, it would be of type DeliveryViewPropertyCollection.
    */
  var properties: js.Any
  /**
    * Revision of the plan. Used to safeguard users from overwriting each other's changes.
    */
  var revision: Double
  /**
    * Type of the plan
    */
  var `type`: PlanType
  /**
    * The resource url to locate the plan via rest api
    */
  var url: String
  /**
    * Bit flag indicating set of permissions a user has to the plan.
    */
  var userPermissions: PlanUserPermissions
}

object Plan {
  @scala.inline
  def apply(
    createdByIdentity: IdentityRef,
    createdDate: Date,
    description: String,
    id: String,
    modifiedByIdentity: IdentityRef,
    modifiedDate: Date,
    name: String,
    properties: js.Any,
    revision: Double,
    `type`: PlanType,
    url: String,
    userPermissions: PlanUserPermissions
  ): Plan = {
    val __obj = js.Dynamic.literal(createdByIdentity = createdByIdentity.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], modifiedByIdentity = modifiedByIdentity.asInstanceOf[js.Any], modifiedDate = modifiedDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], userPermissions = userPermissions.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plan]
  }
}

