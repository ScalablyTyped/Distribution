package typings.tufjsModels

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Role extends StObject {
    
    var role: String
    
    var terminating: Boolean
  }
  object Role {
    
    inline def apply(role: String, terminating: Boolean): Role = {
      val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any], terminating = terminating.asInstanceOf[js.Any])
      __obj.asInstanceOf[Role]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Role] (val x: Self) extends AnyVal {
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setTerminating(value: Boolean): Self = StObject.set(x, "terminating", value.asInstanceOf[js.Any])
    }
  }
}
