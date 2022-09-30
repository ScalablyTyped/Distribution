package typings.swcWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swcWasm.mod.Identifier
  - typings.swcWasm.mod.StringLiteral
  - typings.swcWasm.mod.NumericLiteral
  - typings.swcWasm.mod.ComputedPropName
  - typings.swcWasm.mod.BigIntLiteral
*/
trait PropertyName extends StObject
object PropertyName {
  
  inline def BigIntLiteral(span: Span, value: js.BigInt): typings.swcWasm.mod.BigIntLiteral = {
    val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("BigIntLiteral")
    __obj.asInstanceOf[typings.swcWasm.mod.BigIntLiteral]
  }
  
  inline def ComputedPropName(expression: Expression, span: Span): typings.swcWasm.mod.ComputedPropName = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Computed")
    __obj.asInstanceOf[typings.swcWasm.mod.ComputedPropName]
  }
  
  inline def Identifier(optional: Boolean, span: Span, value: String): typings.swcWasm.mod.Identifier = {
    val __obj = js.Dynamic.literal(optional = optional.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Identifier")
    __obj.asInstanceOf[typings.swcWasm.mod.Identifier]
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
}
