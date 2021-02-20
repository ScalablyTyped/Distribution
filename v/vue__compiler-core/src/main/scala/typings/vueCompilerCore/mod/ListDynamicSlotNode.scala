package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`14`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDynamicSlotNode extends CallExpression {
  
  @JSName("arguments")
  var arguments_ListDynamicSlotNode: js.Tuple2[ExpressionNode, ListDynamicSlotIterator] = js.native
  
  @JSName("callee")
  var callee_ListDynamicSlotNode: js.Symbol = js.native
}
object ListDynamicSlotNode {
  
  @scala.inline
  def apply(
    arguments: js.Tuple2[ExpressionNode, ListDynamicSlotIterator],
    callee: js.Symbol,
    loc: SourceLocation,
    `type`: `14`
  ): ListDynamicSlotNode = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDynamicSlotNode]
  }
  
  @scala.inline
  implicit class ListDynamicSlotNodeMutableBuilder[Self <: ListDynamicSlotNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArguments(value: js.Tuple2[ExpressionNode, ListDynamicSlotIterator]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallee(value: js.Symbol): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
  }
}
