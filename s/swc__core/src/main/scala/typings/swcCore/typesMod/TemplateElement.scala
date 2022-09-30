package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateElement
  extends StObject
     with ExpressionBase {
  
  var cooked: js.UndefOr[String] = js.undefined
  
  var raw: String
  
  var tail: Boolean
  
  @JSName("type")
  var type_TemplateElement: typings.swcCore.swcCoreStrings.TemplateElement
}
object TemplateElement {
  
  inline def apply(raw: String, span: Span, tail: Boolean): TemplateElement = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], tail = tail.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TemplateElement")
    __obj.asInstanceOf[TemplateElement]
  }
  
  extension [Self <: TemplateElement](x: Self) {
    
    inline def setCooked(value: String): Self = StObject.set(x, "cooked", value.asInstanceOf[js.Any])
    
    inline def setCookedUndefined: Self = StObject.set(x, "cooked", js.undefined)
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setTail(value: Boolean): Self = StObject.set(x, "tail", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.TemplateElement): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
