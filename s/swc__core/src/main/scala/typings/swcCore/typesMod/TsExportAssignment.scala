package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TsExportAssignment
  extends StObject
     with Node
     with HasSpan
     with ModuleDeclaration {
  
  var expression: Expression
  
  @JSName("type")
  var type_TsExportAssignment: typings.swcCore.swcCoreStrings.TsExportAssignment
}
object TsExportAssignment {
  
  inline def apply(expression: Expression, span: Span): TsExportAssignment = {
    val __obj = js.Dynamic.literal(expression = expression.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TsExportAssignment")
    __obj.asInstanceOf[TsExportAssignment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TsExportAssignment] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.TsExportAssignment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
