package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXOpeningElement
  extends StObject
     with Node
     with HasSpan {
  
  var attributes: js.Array[JSXAttributeOrSpread]
  
  var name: JSXElementName
  
  var selfClosing: Boolean
  
  var typeArguments: js.UndefOr[TsTypeParameterInstantiation] = js.undefined
  
  @JSName("type")
  var type_JSXOpeningElement: typings.swcWasm.swcWasmStrings.JSXOpeningElement
}
object JSXOpeningElement {
  
  inline def apply(attributes: js.Array[JSXAttributeOrSpread], name: JSXElementName, selfClosing: Boolean, span: Span): JSXOpeningElement = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXOpeningElement")
    __obj.asInstanceOf[JSXOpeningElement]
  }
  
  extension [Self <: JSXOpeningElement](x: Self) {
    
    inline def setAttributes(value: js.Array[JSXAttributeOrSpread]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesVarargs(value: JSXAttributeOrSpread*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setName(value: JSXElementName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSelfClosing(value: Boolean): Self = StObject.set(x, "selfClosing", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.JSXOpeningElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeArguments(value: TsTypeParameterInstantiation): Self = StObject.set(x, "typeArguments", value.asInstanceOf[js.Any])
    
    inline def setTypeArgumentsUndefined: Self = StObject.set(x, "typeArguments", js.undefined)
  }
}
