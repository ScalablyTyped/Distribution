package typings.vsoNodeApi.securityRolesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SecurityRole extends js.Object {
  /**
    * Permissions the role is allowed.
    */
  var allowPermissions: Double = js.native
  /**
    * Permissions the role is denied.
    */
  var denyPermissions: Double = js.native
  /**
    * Description of user access defined by the role
    */
  var description: String = js.native
  /**
    * User friendly name of the role.
    */
  var displayName: String = js.native
  /**
    * Globally unique identifier for the role.
    */
  var identifier: String = js.native
  /**
    * Unique name of the role in the scope.
    */
  var name: String = js.native
  /**
    * Returns the id of the ParentScope.
    */
  var scope: String = js.native
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
  @scala.inline
  implicit class SecurityRoleOps[Self <: SecurityRole] (val x: Self) extends AnyVal {
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
    def setAllowPermissions(value: Double): Self = this.set("allowPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def setDenyPermissions(value: Double): Self = this.set("denyPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
  }
  
}

