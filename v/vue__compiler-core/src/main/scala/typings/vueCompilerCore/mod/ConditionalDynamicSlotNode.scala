package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionalDynamicSlotNode
  extends StObject
     with ConditionalExpression {
  
  @JSName("alternate")
  var alternate_ConditionalDynamicSlotNode: DynamicSlotNode | SimpleExpressionNode
  
  @JSName("consequent")
  var consequent_ConditionalDynamicSlotNode: DynamicSlotNode
}
object ConditionalDynamicSlotNode {
  
  inline def apply(
    alternate: DynamicSlotNode | SimpleExpressionNode,
    consequent: DynamicSlotNode,
    loc: SourceLocation,
    newline: Boolean,
    test: JSChildNode
  ): ConditionalDynamicSlotNode = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], newline = newline.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(19)
    __obj.asInstanceOf[ConditionalDynamicSlotNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConditionalDynamicSlotNode] (val x: Self) extends AnyVal {
    
    inline def setAlternate(value: DynamicSlotNode | SimpleExpressionNode): Self = StObject.set(x, "alternate", value.asInstanceOf[js.Any])
    
    inline def setConsequent(value: DynamicSlotNode): Self = StObject.set(x, "consequent", value.asInstanceOf[js.Any])
  }
}
