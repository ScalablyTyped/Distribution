package typings.vsoNodeApi.identitiesInterfacesMod

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
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], identityType = identityType.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FrameworkIdentityInfo]
  }
}

