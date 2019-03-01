package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plan extends js.Object {
  /**
    * Identity that created this plan. Defaults to null for records before upgrading to ScaledAgileViewComponent4.
    */
  var createdByIdentity: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Date when the plan was created
    */
  var createdDate: stdLib.Date
  /**
    * Description of the plan
    */
  var description: java.lang.String
  /**
    * Id of the plan
    */
  var id: java.lang.String
  /**
    * Identity that last modified this plan. Defaults to null for records before upgrading to ScaledAgileViewComponent4.
    */
  var modifiedByIdentity: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef
  /**
    * Date when the plan was last modified. Default to CreatedDate when the plan is first created.
    */
  var modifiedDate: stdLib.Date
  /**
    * Name of the plan
    */
  var name: java.lang.String
  /**
    * The PlanPropertyCollection instance associated with the plan. These are dependent on the type of the plan. For example, DeliveryTimelineView, it would be of type DeliveryViewPropertyCollection.
    */
  var properties: js.Any
  /**
    * Revision of the plan. Used to safeguard users from overwriting each other's changes.
    */
  var revision: scala.Double
  /**
    * Type of the plan
    */
  var `type`: PlanType
  /**
    * The resource url to locate the plan via rest api
    */
  var url: java.lang.String
  /**
    * Bit flag indicating set of permissions a user has to the plan.
    */
  var userPermissions: PlanUserPermissions
}

object Plan {
  @scala.inline
  def apply(
    createdByIdentity: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    createdDate: stdLib.Date,
    description: java.lang.String,
    id: java.lang.String,
    modifiedByIdentity: vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod.IdentityRef,
    modifiedDate: stdLib.Date,
    name: java.lang.String,
    properties: js.Any,
    revision: scala.Double,
    `type`: PlanType,
    url: java.lang.String,
    userPermissions: PlanUserPermissions
  ): Plan = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("createdByIdentity")(createdByIdentity)
    __obj.updateDynamic("createdDate")(createdDate)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("modifiedByIdentity")(modifiedByIdentity)
    __obj.updateDynamic("modifiedDate")(modifiedDate)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("revision")(revision)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("userPermissions")(userPermissions)
    __obj.asInstanceOf[Plan]
  }
}

