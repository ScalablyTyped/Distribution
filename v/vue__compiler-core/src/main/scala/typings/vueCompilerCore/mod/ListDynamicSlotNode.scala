package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDynamicSlotNode
  extends StObject
     with CallExpression {
  
  @JSName("arguments")
  var arguments_ListDynamicSlotNode: js.Tuple2[ExpressionNode, ListDynamicSlotIterator]
  
  @JSName("callee")
  var callee_ListDynamicSlotNode: js.Symbol
}
object ListDynamicSlotNode {
  
  inline def apply(
    arguments: js.Tuple2[ExpressionNode, ListDynamicSlotIterator],
    callee: js.Symbol,
    loc: SourceLocation
  ): ListDynamicSlotNode = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], callee = callee.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(14)
    __obj.asInstanceOf[ListDynamicSlotNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDynamicSlotNode] (val x: Self) extends AnyVal {
    
    inline def setArguments(value: js.Tuple2[ExpressionNode, ListDynamicSlotIterator]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setCallee(value: js.Symbol): Self = StObject.set(x, "callee", value.asInstanceOf[js.Any])
  }
}
