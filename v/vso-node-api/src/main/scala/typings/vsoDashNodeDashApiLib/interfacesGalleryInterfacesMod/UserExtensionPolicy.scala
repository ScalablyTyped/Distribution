package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserExtensionPolicy extends js.Object {
  /**
    * User display name that this policy refers to
    */
  var displayName: java.lang.String
  /**
    * The extension policy applied to the user
    */
  var permissions: ExtensionPolicy
  /**
    * User id that this policy refers to
    */
  var userId: java.lang.String
}

object UserExtensionPolicy {
  @scala.inline
  def apply(displayName: java.lang.String, permissions: ExtensionPolicy, userId: java.lang.String): UserExtensionPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("permissions")(permissions)
    __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[UserExtensionPolicy]
  }
}

