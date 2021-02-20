package typings.vsoNodeApi.vssinterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamMember extends StObject {
  
  var identity: IdentityRef = js.native
  
  var isTeamAdmin: Boolean = js.native
}
object TeamMember {
  
  @scala.inline
  def apply(identity: IdentityRef, isTeamAdmin: Boolean): TeamMember = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], isTeamAdmin = isTeamAdmin.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamMember]
  }
  
  @scala.inline
  implicit class TeamMemberMutableBuilder[Self <: TeamMember] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentity(value: IdentityRef): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTeamAdmin(value: Boolean): Self = StObject.set(x, "isTeamAdmin", value.asInstanceOf[js.Any])
  }
}
