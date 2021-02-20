package typings.wpapi

import typings.wpapi.mod.HTTPArgumentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Self extends StObject {
    
    var self: String = js.native
  }
  object Self {
    
    @scala.inline
    def apply(self: String): Self = {
      val __obj = js.Dynamic.literal(self = self.asInstanceOf[js.Any])
      __obj.asInstanceOf[Self]
    }
    
    @scala.inline
    implicit class SelfMutableBuilder[Self_ <: Self] (val x: Self_) extends AnyVal {
      
      @scala.inline
      def setSelf(value: String): Self_ = StObject.set(x, "self", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Type extends StObject {
    
    var `type`: HTTPArgumentType = js.native
  }
  object Type {
    
    @scala.inline
    def apply(`type`: HTTPArgumentType): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: HTTPArgumentType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
