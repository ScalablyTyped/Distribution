package typings.vueTemplateCompiler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ASTElementHandler extends StObject {
  
  var modifiers: js.UndefOr[ASTModifiers] = js.undefined
  
  var params: js.UndefOr[js.Array[Any]] = js.undefined
  
  var value: String
}
object ASTElementHandler {
  
  inline def apply(value: String): ASTElementHandler = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASTElementHandler]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASTElementHandler] (val x: Self) extends AnyVal {
    
    inline def setModifiers(value: ASTModifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
    
    inline def setModifiersUndefined: Self = StObject.set(x, "modifiers", js.undefined)
    
    inline def setParams(value: js.Array[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setParamsVarargs(value: Any*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
