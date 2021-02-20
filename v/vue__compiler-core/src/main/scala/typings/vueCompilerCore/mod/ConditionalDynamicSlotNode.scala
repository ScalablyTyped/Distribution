package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`19`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalDynamicSlotNode extends ConditionalExpression {
  
  @JSName("alternate")
  var alternate_ConditionalDynamicSlotNode: DynamicSlotNode | SimpleExpressionNode = js.native
  
  @JSName("consequent")
  var consequent_ConditionalDynamicSlotNode: DynamicSlotNode = js.native
}
object ConditionalDynamicSlotNode {
  
  @scala.inline
  def apply(
    alternate: DynamicSlotNode | SimpleExpressionNode,
    consequent: DynamicSlotNode,
    loc: SourceLocation,
    newline: Boolean,
    test: JSChildNode,
    `type`: `19`
  ): ConditionalDynamicSlotNode = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], newline = newline.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalDynamicSlotNode]
  }
  
  @scala.inline
  implicit class ConditionalDynamicSlotNodeMutableBuilder[Self <: ConditionalDynamicSlotNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlternate(value: DynamicSlotNode | SimpleExpressionNode): Self = StObject.set(x, "alternate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsequent(value: DynamicSlotNode): Self = StObject.set(x, "consequent", value.asInstanceOf[js.Any])
  }
}
