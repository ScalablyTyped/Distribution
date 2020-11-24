package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`19`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConditionalExpression
  extends JSChildNode
     with Node2 {
  
  var alternate: JSChildNode = js.native
  
  var consequent: JSChildNode = js.native
  
  var newline: Boolean = js.native
  
  var test: JSChildNode = js.native
  
  @JSName("type")
  var type_ConditionalExpression: `19` = js.native
}
object ConditionalExpression {
  
  @scala.inline
  def apply(
    alternate: JSChildNode,
    consequent: JSChildNode,
    loc: SourceLocation,
    newline: Boolean,
    test: JSChildNode,
    `type`: `19`
  ): ConditionalExpression = {
    val __obj = js.Dynamic.literal(alternate = alternate.asInstanceOf[js.Any], consequent = consequent.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], newline = newline.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalExpression]
  }
  
  @scala.inline
  implicit class ConditionalExpressionOps[Self <: ConditionalExpression] (val x: Self) extends AnyVal {
    
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
    def setAlternate(value: JSChildNode): Self = this.set("alternate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsequent(value: JSChildNode): Self = this.set("consequent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewline(value: Boolean): Self = this.set("newline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: JSChildNode): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `19`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
