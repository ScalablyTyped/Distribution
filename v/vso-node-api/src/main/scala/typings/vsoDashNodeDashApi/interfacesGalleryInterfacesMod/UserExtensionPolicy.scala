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
    val __obj = js.Dynamic.literal(displayName = displayName, permissions = permissions, userId = userId)
  
    __obj.asInstanceOf[UserExtensionPolicy]
  }
}

