package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`21`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockStatement
  extends SSRCodegenNode
     with Node2 {
  
  var body: js.Array[JSChildNode | IfStatement] = js.native
  
  @JSName("type")
  var type_BlockStatement: `21` = js.native
}
object BlockStatement {
  
  @scala.inline
  def apply(body: js.Array[JSChildNode | IfStatement], loc: SourceLocation, `type`: `21`): BlockStatement = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockStatement]
  }
  
  @scala.inline
  implicit class BlockStatementOps[Self <: BlockStatement] (val x: Self) extends AnyVal {
    
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
    def setBodyVarargs(value: (JSChildNode | IfStatement)*): Self = this.set("body", js.Array(value :_*))
    
    @scala.inline
    def setBody(value: js.Array[JSChildNode | IfStatement]): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `21`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
