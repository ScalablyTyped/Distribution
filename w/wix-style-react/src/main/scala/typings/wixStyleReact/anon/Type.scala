package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  var `type`: Any
  
  var validation: String
}
object Type {
  
  inline def apply(`type`: Any, validation: String): Type = {
    val __obj = js.Dynamic.literal(validation = validation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValidation(value: String): Self = StObject.set(x, "validation", value.asInstanceOf[js.Any])
  }
}
