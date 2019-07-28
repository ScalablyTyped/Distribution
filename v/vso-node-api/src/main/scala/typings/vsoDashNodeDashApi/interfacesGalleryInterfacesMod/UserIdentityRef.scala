package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserIdentityRef extends js.Object {
  /**
    * User display name
    */
  var displayName: String
  /**
    * User VSID
    */
  var id: String
}

object UserIdentityRef {
  @scala.inline
  def apply(displayName: String, id: String): UserIdentityRef = {
    val __obj = js.Dynamic.literal(displayName = displayName, id = id)
  
    __obj.asInstanceOf[UserIdentityRef]
  }
}

