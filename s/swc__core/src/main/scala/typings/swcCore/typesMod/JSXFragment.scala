package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXFragment
  extends StObject
     with Node
     with HasSpan
     with Expression
     with JSXAttrValue
     with JSXElementChild {
  
  var children: js.Array[JSXElementChild]
  
  var closing: JSXClosingFragment
  
  var opening: JSXOpeningFragment
  
  @JSName("type")
  var type_JSXFragment: typings.swcCore.swcCoreStrings.JSXFragment
}
object JSXFragment {
  
  inline def apply(
    children: js.Array[JSXElementChild],
    closing: JSXClosingFragment,
    opening: JSXOpeningFragment,
    span: Span
  ): JSXFragment = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], closing = closing.asInstanceOf[js.Any], opening = opening.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXFragment")
    __obj.asInstanceOf[JSXFragment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JSXFragment] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: js.Array[JSXElementChild]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: JSXElementChild*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setClosing(value: JSXClosingFragment): Self = StObject.set(x, "closing", value.asInstanceOf[js.Any])
    
    inline def setOpening(value: JSXOpeningFragment): Self = StObject.set(x, "opening", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.JSXFragment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
