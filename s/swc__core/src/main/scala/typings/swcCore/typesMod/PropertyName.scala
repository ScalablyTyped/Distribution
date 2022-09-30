package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swcCore.typesMod.Identifier
  - typings.swcCore.typesMod.StringLiteral
  - typings.swcCore.typesMod.NumericLiteral
  - typings.swcCore.typesMod.ComputedPropName
  - typings.swcCore.typesMod.BigIntLiteral
*/
trait PropertyName extends StObject
object PropertyName {
  
  inline def BigIntLiteral(span: Span, value: js.BigInt): typings.swcCore.typesMod.BigIntLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BigIntLiteral")
    __obj.asInstanceOf[typings.swcCore.typesMod.BigIntLiteral]
  }
  
  inline def ComputedPropName(expression: Expression, span: Span): typings.swcCore.typesMod.ComputedPropName = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Computed")
    __obj.asInstanceOf[typings.swcCore.typesMod.ComputedPropName]
  }
  
  inline def Identifier(optional: Boolean, span: Span, value: String): typings.swcCore.typesMod.Identifier = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typings.swcCore.typesMod.Identifier]
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
}
