package typings.vsoDashNodeDashApi.interfacesIdentitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameworkIdentityInfo extends js.Object {
  var displayName: String
  var identifier: String
  var identityType: FrameworkIdentityType
  var role: String
}

object FrameworkIdentityInfo {
  @scala.inline
  def apply(displayName: String, identifier: String, identityType: FrameworkIdentityType, role: String): FrameworkIdentityInfo = {
    val __obj = js.Dynamic.literal(displayName = displayName, identifier = identifier, identityType = identityType, role = role)
  
    __obj.asInstanceOf[FrameworkIdentityInfo]
  }
}

