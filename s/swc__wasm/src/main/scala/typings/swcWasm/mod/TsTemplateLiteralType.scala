package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsTemplateLiteralType
  extends StObject
     with Node
     with HasSpan
     with TsLiteral {
  
  var quasis: js.Array[TemplateElement]
  
  @JSName("type")
  var type_TsTemplateLiteralType: typings.swcWasm.swcWasmStrings.TemplateLiteral
  
  var types: js.Array[TsType]
}
object TsTemplateLiteralType {
  
  inline def apply(quasis: js.Array[TemplateElement], span: Span, types: js.Array[TsType]): TsTemplateLiteralType = {
    val __obj = js.Dynamic.literal(quasis = quasis.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TemplateLiteral")
    __obj.asInstanceOf[TsTemplateLiteralType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TsTemplateLiteralType] (val x: Self) extends AnyVal {
    
    inline def setQuasis(value: js.Array[TemplateElement]): Self = StObject.set(x, "quasis", value.asInstanceOf[js.Any])
    
    inline def setQuasisVarargs(value: TemplateElement*): Self = StObject.set(x, "quasis", js.Array(value*))
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.TemplateLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: js.Array[TsType]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
    
    inline def setTypesVarargs(value: TsType*): Self = StObject.set(x, "types", js.Array(value*))
  }
}
