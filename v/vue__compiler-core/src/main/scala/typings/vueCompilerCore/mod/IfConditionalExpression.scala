package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`19`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IfConditionalExpression extends ConditionalExpression {
  
  @JSName("alternate")
  var alternate_IfConditionalExpression: BlockCodegenNode | IfConditionalExpression = js.native
  
  @JSName("consequent")
  var consequent_IfConditionalExpression: BlockCodegenNode = js.native
}
object IfConditionalExpression {
  
  @scala.inline
  def apply(
    alternate: BlockCodegenNode | IfConditionalExpression,
    consequent: BlockCodegenNode,
    loc: SourceLocation,
    newline: Boolean,
    test: JSChildNode,
    `type`: `19`
  ): IfConditionalExpression = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], newline = newline.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfConditionalExpression]
  }
  
  @scala.inline
  implicit class IfConditionalExpressionOps[Self <: IfConditionalExpression] (val x: Self) extends AnyVal {
    
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
    def setAlternate(value: BlockCodegenNode | IfConditionalExpression): Self = this.set("alternate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsequent(value: BlockCodegenNode): Self = this.set("consequent", value.asInstanceOf[js.Any])
  }
}
