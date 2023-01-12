package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegExpLiteral
  extends StObject
     with Node
     with HasSpan
     with Literal {
  
  var flags: String
  
  var pattern: String
  
  @JSName("type")
  var type_RegExpLiteral: typings.swcCore.swcCoreStrings.RegExpLiteral
}
object RegExpLiteral {
  
  inline def apply(flags: String, pattern: String, span: Span): RegExpLiteral = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RegExpLiteral")
    __obj.asInstanceOf[RegExpLiteral]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RegExpLiteral] (val x: Self) extends AnyVal {
    
    inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.RegExpLiteral): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
