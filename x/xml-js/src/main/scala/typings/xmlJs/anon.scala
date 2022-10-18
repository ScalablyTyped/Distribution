package typings.xmlJs

import typings.xmlJs.mod.DeclarationAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var _attributes: js.UndefOr[DeclarationAttributes] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def set_attributes(value: DeclarationAttributes): Self = StObject.set(x, "_attributes", value.asInstanceOf[js.Any])
      
      inline def set_attributesUndefined: Self = StObject.set(x, "_attributes", js.undefined)
    }
  }
  
  trait Attributes extends StObject {
    
    var attributes: js.UndefOr[DeclarationAttributes] = js.undefined
  }
  object Attributes {
    
    inline def apply(): Attributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attributes]
    }
    
    extension [Self <: Attributes](x: Self) {
      
      inline def setAttributes(value: DeclarationAttributes): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    }
  }
}
