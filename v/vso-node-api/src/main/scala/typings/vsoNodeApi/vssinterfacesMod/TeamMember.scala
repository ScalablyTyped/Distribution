package typings.vsoNodeApi.vssinterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TeamMember extends StObject {
  
  var identity: IdentityRef
  
  var isTeamAdmin: Boolean
}
object TeamMember {
  
  inline def apply(identity: IdentityRef, isTeamAdmin: Boolean): TeamMember = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], isTeamAdmin = isTeamAdmin.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamMember]
  }
  
  extension [Self <: TeamMember](x: Self) {
    
    inline def setIdentity(value: IdentityRef): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setIsTeamAdmin(value: Boolean): Self = StObject.set(x, "isTeamAdmin", value.asInstanceOf[js.Any])
  }
}
