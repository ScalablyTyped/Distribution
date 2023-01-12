package typings.woosmapMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait IdPropertyName extends StObject {
    
    var idPropertyName: String
  }
  object IdPropertyName {
    
    inline def apply(idPropertyName: String): IdPropertyName = {
      val __obj = js.Dynamic.literal(idPropertyName = idPropertyName.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdPropertyName]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IdPropertyName] (val x: Self) extends AnyVal {
      
      inline def setIdPropertyName(value: String): Self = StObject.set(x, "idPropertyName", value.asInstanceOf[js.Any])
    }
  }
}
