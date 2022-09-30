package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreInts.`25`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SequenceExpression
  extends StObject
     with Node2
     with JSChildNode
     with SSRCodegenNode {
  
  var expressions: js.Array[JSChildNode]
  
  @JSName("type")
  var type_SequenceExpression: `25`
}
object SequenceExpression {
  
  inline def apply(expressions: js.Array[JSChildNode], loc: SourceLocation): SequenceExpression = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(25)
    __obj.asInstanceOf[SequenceExpression]
  }
  
  extension [Self <: SequenceExpression](x: Self) {
    
    inline def setExpressions(value: js.Array[JSChildNode]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    inline def setExpressionsVarargs(value: JSChildNode*): Self = StObject.set(x, "expressions", js.Array(value*))
    
    inline def setType(value: `25`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
