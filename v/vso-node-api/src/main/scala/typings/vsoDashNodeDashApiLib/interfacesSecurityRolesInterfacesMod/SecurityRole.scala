package typings
package vsoDashNodeDashApiLib.interfacesSecurityRolesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityRole extends js.Object {
  /**
    * Permissions the role is allowed.
    */
  var allowPermissions: scala.Double
  /**
    * Permissions the role is denied.
    */
  var denyPermissions: scala.Double
  /**
    * Description of user access defined by the role
    */
  var description: java.lang.String
  /**
    * User friendly name of the role.
    */
  var displayName: java.lang.String
  /**
    * Globally unique identifier for the role.
    */
  var identifier: java.lang.String
  /**
    * Unique name of the role in the scope.
    */
  var name: java.lang.String
  /**
    * Returns the id of the ParentScope.
    */
  var scope: java.lang.String
}

object SecurityRole {
  @scala.inline
  def apply(
    allowPermissions: scala.Double,
    denyPermissions: scala.Double,
    description: java.lang.String,
    displayName: java.lang.String,
    identifier: java.lang.String,
    name: java.lang.String,
    scope: java.lang.String
  ): SecurityRole = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allowPermissions")(allowPermissions)
    __obj.updateDynamic("denyPermissions")(denyPermissions)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("identifier")(identifier)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[SecurityRole]
  }
}

