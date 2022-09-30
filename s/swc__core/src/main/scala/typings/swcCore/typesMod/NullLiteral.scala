package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullLiteral
  extends StObject
     with Node
     with HasSpan
     with Literal {
  
  @JSName("type")
  var type_NullLiteral: typings.swcCore.swcCoreStrings.NullLiteral
}
object NullLiteral {
  
  inline def apply(span: Span): NullLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NullLiteral")
    __obj.asInstanceOf[NullLiteral]
  }
  
  extension [Self <: NullLiteral](x: Self) {
    
    inline def setType(value: typings.swcCore.swcCoreStrings.NullLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
