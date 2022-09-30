package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swcCore.typesMod.NumericLiteral
  - typings.swcCore.typesMod.StringLiteral
  - typings.swcCore.typesMod.BooleanLiteral
  - typings.swcCore.typesMod.BigIntLiteral
  - typings.swcCore.typesMod.TsTemplateLiteralType
*/
trait TsLiteral extends StObject
object TsLiteral {
  
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
  
  inline def NumericLiteral(span: Span, value: Double): typings.swcCore.typesMod.NumericLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("NumericLiteral")
    __obj.asInstanceOf[typings.swcCore.typesMod.NumericLiteral]
  }
  
  inline def StringLiteral(span: Span, value: String): typings.swcCore.typesMod.StringLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("StringLiteral")
    __obj.asInstanceOf[typings.swcCore.typesMod.StringLiteral]
  }
  
  inline def TsTemplateLiteralType(quasis: js.Array[TemplateElement], span: Span, types: js.Array[TsType]): typings.swcCore.typesMod.TsTemplateLiteralType = {
    val __obj = js.Dynamic.literal(quasis = quasis.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TemplateLiteral")
    __obj.asInstanceOf[typings.swcCore.typesMod.TsTemplateLiteralType]
  }
}
