package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swcWasm.mod.NumericLiteral
  - typings.swcWasm.mod.StringLiteral
  - typings.swcWasm.mod.BooleanLiteral
  - typings.swcWasm.mod.BigIntLiteral
  - typings.swcWasm.mod.TsTemplateLiteralType
*/
trait TsLiteral extends StObject
object TsLiteral {
  
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
  
  inline def NumericLiteral(span: Span, value: Double): typings.swcWasm.mod.NumericLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[typings.swcWasm.mod.NumericLiteral]
  }
  
  inline def StringLiteral(span: Span, value: String): typings.swcWasm.mod.StringLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typings.swcWasm.mod.StringLiteral]
  }
  
  inline def TsTemplateLiteralType(quasis: js.Array[TemplateElement], span: Span, types: js.Array[TsType]): typings.swcWasm.mod.TsTemplateLiteralType = {
    val __obj = js.Dynamic.literal(quasis = quasis.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TemplateLiteral")
    __obj.asInstanceOf[typings.swcWasm.mod.TsTemplateLiteralType]
  }
}
