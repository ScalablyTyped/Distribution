package typings
package vsoDashNodeDashApiLib.interfacesCommonVSSInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamMember extends js.Object {
  var identity: IdentityRef
  var isTeamAdmin: scala.Boolean
}

object TeamMember {
  @scala.inline
  def apply(identity: IdentityRef, isTeamAdmin: scala.Boolean): TeamMember = {
    val __obj = js.Dynamic.literal(identity = identity, isTeamAdmin = isTeamAdmin)
  
    __obj.asInstanceOf[TeamMember]
  }
}

