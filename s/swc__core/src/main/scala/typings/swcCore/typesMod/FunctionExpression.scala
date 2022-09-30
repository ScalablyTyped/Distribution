package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.swcCore.typesMod.HasSpan because Already inherited
- typings.swcCore.typesMod.ExpressionBase because var conflicts: span. Inlined  */ trait FunctionExpression
  extends StObject
     with Fn
     with DefaultDecl
     with Expression
     with Node {
  
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  @JSName("type")
  var type_FunctionExpression: typings.swcCore.swcCoreStrings.FunctionExpression
}
object FunctionExpression {
  
  inline def apply(async: Boolean, generator: Boolean, params: js.Array[Param], span: Span): FunctionExpression = {
    val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], generator = generator.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("FunctionExpression")
    __obj.asInstanceOf[FunctionExpression]
  }
  
  extension [Self <: FunctionExpression](x: Self) {
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setType(value: typings.swcCore.swcCoreStrings.FunctionExpression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
