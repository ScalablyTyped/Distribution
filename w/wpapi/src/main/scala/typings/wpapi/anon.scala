package typings.wpapi

import typings.wpapi.mod.HTTPArgumentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Self extends StObject {
    
    var self: String
  }
  object Self {
    
    inline def apply(self: String): Self = {
      val __obj = js.Dynamic.literal(self = self.asInstanceOf[js.Any])
      __obj.asInstanceOf[Self]
    }
    
    extension [Self_ <: Self](x: Self_) {
      
      inline def setSelf(value: String): Self_ = StObject.set(x, "self", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var `type`: HTTPArgumentType
  }
  object Type {
    
    inline def apply(`type`: HTTPArgumentType): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: HTTPArgumentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
