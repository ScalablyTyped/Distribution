package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swcCore.typesMod.StringLiteral
  - typings.swcCore.typesMod.BooleanLiteral
  - typings.swcCore.typesMod.NullLiteral
  - typings.swcCore.typesMod.NumericLiteral
  - typings.swcCore.typesMod.BigIntLiteral
  - typings.swcCore.typesMod.RegExpLiteral
  - typings.swcCore.typesMod.JSXText
*/
trait Literal
  extends StObject
     with Expression
     with JSXAttrValue
object Literal {
  
  inline def BigIntLiteral(span: Span, value: js.BigInt): typings.swcCore.typesMod.BigIntLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BigIntLiteral")
    __obj.asInstanceOf[typings.swcCore.typesMod.BigIntLiteral]
  }
  
  inline def BooleanLiteral(span: Span, value: Boolean): typings.swcCore.typesMod.BooleanLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BooleanLiteral")
    __obj.asInstanceOf[typings.swcCore.typesMod.BooleanLiteral]
  }
  
  inline def JSXText(raw: String, span: Span, value: String): typings.swcCore.typesMod.JSXText = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("JSXText")
    __obj.asInstanceOf[typings.swcCore.typesMod.JSXText]
  }
  
  inline def NullLiteral(span: Span): typings.swcCore.typesMod.NullLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NullLiteral")
    __obj.asInstanceOf[typings.swcCore.typesMod.NullLiteral]
  }
  
  inline def NumericLiteral(span: Span, value: Double): typings.swcCore.typesMod.NumericLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[typings.swcCore.typesMod.NumericLiteral]
  }
  
  inline def RegExpLiteral(flags: String, pattern: String, span: Span): typings.swcCore.typesMod.RegExpLiteral = {
    val __obj = js.Dynamic.literal(flags = flags.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("RegExpLiteral")
    __obj.asInstanceOf[typings.swcCore.typesMod.RegExpLiteral]
  }
  
  inline def StringLiteral(span: Span, value: String): typings.swcCore.typesMod.StringLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typings.swcCore.typesMod.StringLiteral]
  }
}
