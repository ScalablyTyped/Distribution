package typings.typeCheck

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait TypeOf extends StObject {
    
    var typeOf: String = js.native
    
    def validate(x: js.Any): js.Any = js.native
  }
  object TypeOf {
    
    @scala.inline
    def apply(typeOf: String, validate: js.Any => js.Any): TypeOf = {
      val __obj = js.Dynamic.literal(typeOf = typeOf.asInstanceOf[js.Any], validate = js.Any.fromFunction1(validate))
      __obj.asInstanceOf[TypeOf]
    }
    
    @scala.inline
    implicit class TypeOfMutableBuilder[Self <: TypeOf] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTypeOf(value: String): Self = StObject.set(x, "typeOf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidate(value: js.Any => js.Any): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
    }
  }
}
