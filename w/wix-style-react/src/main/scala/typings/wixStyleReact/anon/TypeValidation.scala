package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeValidation extends StObject {
  
  var `type`: js.Array[Any]
  
  var validation: String
}
object TypeValidation {
  
  inline def apply(`type`: js.Array[Any], validation: String): TypeValidation = {
    val __obj = js.Dynamic.literal(validation = validation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeValidation]
  }
  
  extension [Self <: TypeValidation](x: Self) {
    
    inline def setType(value: js.Array[Any]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeVarargs(value: Any*): Self = StObject.set(x, "type", js.Array(value*))
    
    inline def setValidation(value: String): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
  }
}
