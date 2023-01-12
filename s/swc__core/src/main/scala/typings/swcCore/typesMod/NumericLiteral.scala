package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumericLiteral
  extends StObject
     with Node
     with HasSpan
     with Literal
     with PropertyName
     with TsLiteral {
  
  var raw: js.UndefOr[String] = js.undefined
  
  @JSName("type")
  var type_NumericLiteral: typings.swcCore.swcCoreStrings.NumericLiteral
  
  var value: Double
}
object NumericLiteral {
  
  inline def apply(span: Span, value: Double): NumericLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[NumericLiteral]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumericLiteral] (val x: Self) extends AnyVal {
    
    inline def setRaw(value: String): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setType(value: typings.swcCore.swcCoreStrings.NumericLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
