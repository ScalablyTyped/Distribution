package typings.swcCore.typesMod

import typings.swcCore.swcCoreStrings.Parameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Param
  extends StObject
     with Node
     with HasSpan
     with HasDecorator {
  
  var pat: Pattern
  
  @JSName("type")
  var type_Param: Parameter
}
object Param {
  
  inline def apply(pat: Pattern, span: Span): Param = {
    val __obj = js.Dynamic.literal(pat = pat.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Parameter")
    __obj.asInstanceOf[Param]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Param] (val x: Self) extends AnyVal {
    
    inline def setPat(value: Pattern): Self = StObject.set(x, "pat", value.asInstanceOf[js.Any])
    
    inline def setType(value: Parameter): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
