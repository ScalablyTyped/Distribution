package typings.twig.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompiledGenericToken[TType, TValue] extends StObject {
  
  var `type`: TType
  
  var value: TValue
}
object CompiledGenericToken {
  
  inline def apply[TType, TValue](`type`: TType, value: TValue): CompiledGenericToken[TType, TValue] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompiledGenericToken[TType, TValue]]
  }
  
  extension [Self <: CompiledGenericToken[?, ?], TType, TValue](x: Self & (CompiledGenericToken[TType, TValue])) {
    
    inline def setType(value: TType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: TValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
