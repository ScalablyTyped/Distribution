package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXElement
  extends StObject
     with Node
     with HasSpan
     with Expression
     with JSXAttrValue
     with JSXElementChild {
  
  var children: js.Array[JSXElementChild]
  
  var closing: js.UndefOr[JSXClosingElement] = js.undefined
  
  var opening: JSXOpeningElement
  
  @JSName("type")
  var type_JSXElement: typings.swcWasm.swcWasmStrings.JSXElement
}
object JSXElement {
  
  inline def apply(children: js.Array[JSXElementChild], opening: JSXOpeningElement, span: Span): JSXElement = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], opening = opening.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXElement")
    __obj.asInstanceOf[JSXElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JSXElement] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: js.Array[JSXElementChild]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: JSXElementChild*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setClosing(value: JSXClosingElement): Self = StObject.set(x, "closing", value.asInstanceOf[js.Any])
    
    inline def setClosingUndefined: Self = StObject.set(x, "closing", js.undefined)
    
    inline def setOpening(value: JSXOpeningElement): Self = StObject.set(x, "opening", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcWasm.swcWasmStrings.JSXElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
