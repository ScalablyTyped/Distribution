package typings.vegaTypings.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Role extends StObject {
  
  var role: String
}
object Role {
  
  @scala.inline
  def apply(role: String): Role = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[Role]
  }
  
  @scala.inline
  implicit class RoleMutableBuilder[Self <: Role] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
