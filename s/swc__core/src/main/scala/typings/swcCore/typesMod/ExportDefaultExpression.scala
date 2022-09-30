package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportDefaultExpression
  extends StObject
     with Node
     with HasSpan
     with ModuleDeclaration {
  
  var expression: Expression
  
  @JSName("type")
  var type_ExportDefaultExpression: typings.swcCore.swcCoreStrings.ExportDefaultExpression
}
object ExportDefaultExpression {
  
  inline def apply(expression: Expression, span: Span): ExportDefaultExpression = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ExportDefaultExpression")
    __obj.asInstanceOf[ExportDefaultExpression]
  }
  
  extension [Self <: ExportDefaultExpression](x: Self) {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.ExportDefaultExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
