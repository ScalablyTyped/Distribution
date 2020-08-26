package typings.vsoNodeApi.galleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserExtensionPolicy extends js.Object {
  /**
    * User display name that this policy refers to
    */
  var displayName: String = js.native
  /**
    * The extension policy applied to the user
    */
  var permissions: ExtensionPolicy = js.native
  /**
    * User id that this policy refers to
    */
  var userId: String = js.native
}

object UserExtensionPolicy {
  @scala.inline
  def apply(displayName: String, permissions: ExtensionPolicy, userId: String): UserExtensionPolicy = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserExtensionPolicy]
  }
  @scala.inline
  implicit class UserExtensionPolicyOps[Self <: UserExtensionPolicy] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermissions(value: ExtensionPolicy): Self = this.set("permissions", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
  }
  
}

