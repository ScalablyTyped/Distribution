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

