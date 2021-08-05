package typings.valdr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Invalid extends StObject {
    
    var invalid: String
    
    var valid: String
  }
  object Invalid {
    
    inline def apply(invalid: String, valid: String): Invalid = {
      val __obj = js.Dynamic.literal(invalid = invalid.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Invalid]
    }
    
    extension [Self <: Invalid](x: Self) {
      
      inline def setInvalid(value: String): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
      
      inline def setValid(value: String): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
}
