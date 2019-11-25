package typings.vsoDashNodeDashApi.interfacesCommonVSSInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamMember extends js.Object {
  var identity: IdentityRef
  var isTeamAdmin: Boolean
}

object TeamMember {
  @scala.inline
  def apply(identity: IdentityRef, isTeamAdmin: Boolean): TeamMember = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], isTeamAdmin = isTeamAdmin.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamMember]
  }
}

