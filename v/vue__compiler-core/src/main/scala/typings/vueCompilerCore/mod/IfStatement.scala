package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`23`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IfStatement
  extends SSRCodegenNode
     with Node2 {
  
  var alternate: js.UndefOr[IfStatement | BlockStatement | ReturnStatement] = js.native
  
  var consequent: BlockStatement = js.native
  
  var test: ExpressionNode = js.native
  
  @JSName("type")
  var type_IfStatement: `23` = js.native
}
object IfStatement {
  
  @scala.inline
  def apply(consequent: BlockStatement, loc: SourceLocation, test: ExpressionNode, `type`: `23`): IfStatement = {
    val __obj = js.Dynamic.literal(consequent = consequent.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], test = test.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IfStatement]
  }
  
  @scala.inline
  implicit class IfStatementOps[Self <: IfStatement] (val x: Self) extends AnyVal {
    
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
    def setConsequent(value: BlockStatement): Self = this.set("consequent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTest(value: ExpressionNode): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `23`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlternate(value: IfStatement | BlockStatement | ReturnStatement): Self = this.set("alternate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlternate: Self = this.set("alternate", js.undefined)
  }
}
