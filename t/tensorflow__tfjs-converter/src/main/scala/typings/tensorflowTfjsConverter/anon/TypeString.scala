package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeString extends StObject {
  
  var items: Type
  
  var `type`: String
}
object TypeString {
  
  inline def apply(items: Type, `type`: String): TypeString = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeString] (val x: Self) extends AnyVal {
    
    inline def setItems(value: Type): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
