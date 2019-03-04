package typings
package vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameworkIdentityInfo extends js.Object {
  var displayName: java.lang.String
  var identifier: java.lang.String
  var identityType: FrameworkIdentityType
  var role: java.lang.String
}

object FrameworkIdentityInfo {
  @scala.inline
  def apply(
    displayName: java.lang.String,
    identifier: java.lang.String,
    identityType: FrameworkIdentityType,
    role: java.lang.String
  ): FrameworkIdentityInfo = {
    val __obj = js.Dynamic.literal(displayName = displayName, identifier = identifier, identityType = identityType, role = role)
  
    __obj.asInstanceOf[FrameworkIdentityInfo]
  }
}

