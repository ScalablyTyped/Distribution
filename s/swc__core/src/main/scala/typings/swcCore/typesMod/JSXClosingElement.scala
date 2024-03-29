package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSXClosingElement
  extends StObject
     with Node
     with HasSpan {
  
  var name: JSXElementName
  
  @JSName("type")
  var type_JSXClosingElement: typings.swcCore.swcCoreStrings.JSXClosingElement
}
object JSXClosingElement {
  
  inline def apply(name: JSXElementName, span: Span): JSXClosingElement = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXClosingElement")
    __obj.asInstanceOf[JSXClosingElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JSXClosingElement] (val x: Self) extends AnyVal {
    
    inline def setName(value: JSXElementName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.JSXClosingElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
