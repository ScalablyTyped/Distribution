package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`19`
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
  implicit class ConditionalDynamicSlotNodeOps[Self <: ConditionalDynamicSlotNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAlternate(value: DynamicSlotNode | SimpleExpressionNode): Self = this.set("alternate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsequent(value: DynamicSlotNode): Self = this.set("consequent", value.asInstanceOf[js.Any])
  }
}
