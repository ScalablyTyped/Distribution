package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swcWasm.mod.StringLiteral
  - typings.swcWasm.mod.BooleanLiteral
  - typings.swcWasm.mod.NullLiteral
  - typings.swcWasm.mod.NumericLiteral
  - typings.swcWasm.mod.BigIntLiteral
  - typings.swcWasm.mod.RegExpLiteral
  - typings.swcWasm.mod.JSXText
*/
trait Literal
  extends StObject
     with Expression
     with JSXAttrValue
object Literal {
  
  inline def BigIntLiteral(span: Span, value: js.BigInt): typings.swcWasm.mod.BigIntLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BigIntLiteral")
    __obj.asInstanceOf[typings.swcWasm.mod.BigIntLiteral]
  }
  
  inline def BooleanLiteral(span: Span, value: Boolean): typings.swcWasm.mod.BooleanLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typings.swcWasm.mod.BooleanLiteral]
  }
  
  inline def JSXText(raw: String, span: Span, value: String): typings.swcWasm.mod.JSXText = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXText")
    __obj.asInstanceOf[typings.swcWasm.mod.JSXText]
  }
  
  inline def NullLiteral(span: Span): typings.swcWasm.mod.NullLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NullLiteral")
    __obj.asInstanceOf[typings.swcWasm.mod.NullLiteral]
  }
  
  inline def NumericLiteral(span: Span, value: Double): typings.swcWasm.mod.NumericLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[typings.swcWasm.mod.NumericLiteral]
  }
  
  inline def RegExpLiteral(flags: String, pattern: String, span: Span): typings.swcWasm.mod.RegExpLiteral = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RegExpLiteral")
    __obj.asInstanceOf[typings.swcWasm.mod.RegExpLiteral]
  }
  
  inline def StringLiteral(span: Span, value: String): typings.swcWasm.mod.StringLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typings.swcWasm.mod.StringLiteral]
  }
}
