package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserIdentityRef extends js.Object {
  /**
    * User display name
    */
  var displayName: java.lang.String
  /**
    * User VSID
    */
  var id: java.lang.String
}

object UserIdentityRef {
  @scala.inline
  def apply(displayName: java.lang.String, id: java.lang.String): UserIdentityRef = {
    val __obj = js.Dynamic.literal(displayName = displayName, id = id)
  
    __obj.asInstanceOf[UserIdentityRef]
  }
}

