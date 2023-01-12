package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArrayPattern
  extends StObject
     with PatternBase
     with Pattern
     with TsFnParameter {
  
  var elements: js.Array[js.UndefOr[Pattern]]
  
  var optional: Boolean
  
  @JSName("type")
  var type_ArrayPattern: typings.swcCore.swcCoreStrings.ArrayPattern
}
object ArrayPattern {
  
  inline def apply(elements: js.Array[js.UndefOr[Pattern]], optional: Boolean, span: Span): ArrayPattern = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ArrayPattern")
    __obj.asInstanceOf[ArrayPattern]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArrayPattern] (val x: Self) extends AnyVal {
    
    inline def setElements(value: js.Array[js.UndefOr[Pattern]]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsVarargs(value: js.UndefOr[Pattern]*): Self = StObject.set(x, "elements", js.Array(value*))
    
    inline def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.ArrayPattern): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
