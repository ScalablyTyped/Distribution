package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`25`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SequenceExpression
  extends JSChildNode
     with Node2
     with SSRCodegenNode {
  
  var expressions: js.Array[JSChildNode] = js.native
  
  @JSName("type")
  var type_SequenceExpression: `25` = js.native
}
object SequenceExpression {
  
  @scala.inline
  def apply(expressions: js.Array[JSChildNode], loc: SourceLocation, `type`: `25`): SequenceExpression = {
    val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SequenceExpression]
  }
  
  @scala.inline
  implicit class SequenceExpressionMutableBuilder[Self <: SequenceExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExpressions(value: js.Array[JSChildNode]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpressionsVarargs(value: JSChildNode*): Self = StObject.set(x, "expressions", js.Array(value :_*))
    
    @scala.inline
    def setType(value: `25`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
