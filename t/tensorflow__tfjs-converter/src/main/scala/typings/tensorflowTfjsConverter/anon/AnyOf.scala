package typings.tensorflowTfjsConverter.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnyOf extends StObject {
  
  var anyOf: js.Array[ItemsType | TypeString]
}
object AnyOf {
  
  inline def apply(anyOf: js.Array[ItemsType | TypeString]): AnyOf = {
    val __obj = js.Dynamic.literal(anyOf = anyOf.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnyOf]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnyOf] (val x: Self) extends AnyVal {
    
    inline def setAnyOf(value: js.Array[ItemsType | TypeString]): Self = StObject.set(x, "anyOf", value.asInstanceOf[js.Any])
    
    inline def setAnyOfVarargs(value: (ItemsType | TypeString)*): Self = StObject.set(x, "anyOf", js.Array(value*))
  }
}
