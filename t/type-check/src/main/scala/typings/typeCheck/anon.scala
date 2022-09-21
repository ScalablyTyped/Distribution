package typings.typeCheck

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait TypeOf extends StObject {
    
    var typeOf: String
    
    def validate(x: Any): Any
  }
  object TypeOf {
    
    inline def apply(typeOf: String, validate: Any => Any): TypeOf = {
      val __obj = js.Dynamic.literal(typeOf = typeOf.asInstanceOf[js.Any], validate = js.Any.fromFunction1(validate))
      __obj.asInstanceOf[TypeOf]
    }
    
    extension [Self <: TypeOf](x: Self) {
      
      inline def setTypeOf(value: String): Self = StObject.set(x, "typeOf", value.asInstanceOf[js.Any])
      
      inline def setValidate(value: Any => Any): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    }
  }
}
