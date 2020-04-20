package typings.vsoNodeApi.securityRolesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecurityRole extends js.Object {
  /**
    * Permissions the role is allowed.
    */
  var allowPermissions: Double
  /**
    * Permissions the role is denied.
    */
  var denyPermissions: Double
  /**
    * Description of user access defined by the role
    */
  var description: String
  /**
    * User friendly name of the role.
    */
  var displayName: String
  /**
    * Globally unique identifier for the role.
    */
  var identifier: String
  /**
    * Unique name of the role in the scope.
    */
  var name: String
  /**
    * Returns the id of the ParentScope.
    */
  var scope: String
}

object SecurityRole {
  @scala.inline
  def apply(
    allowPermissions: Double,
    denyPermissions: Double,
    description: String,
    displayName: String,
    identifier: String,
    name: String,
    scope: String
  ): SecurityRole = {
    val __obj = js.Dynamic.literal(allowPermissions = allowPermissions.asInstanceOf[js.Any], denyPermissions = denyPermissions.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityRole]
  }
}

