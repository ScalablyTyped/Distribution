package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserExtensionPolicy extends js.Object {
  /**
    * User display name that this policy refers to
    */
  var displayName: String
  /**
    * The extension policy applied to the user
    */
  var permissions: ExtensionPolicy
  /**
    * User id that this policy refers to
    */
  var userId: String
}

object UserExtensionPolicy {
  @scala.inline
  def apply(displayName: String, permissions: ExtensionPolicy, userId: String): UserExtensionPolicy = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UserExtensionPolicy]
  }
}

