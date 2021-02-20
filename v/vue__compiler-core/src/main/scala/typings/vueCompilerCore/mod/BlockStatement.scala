package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`21`
import org.scalablytyped.runtime.StObject
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
  implicit class BlockStatementMutableBuilder[Self <: BlockStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: js.Array[JSChildNode | IfStatement]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyVarargs(value: (JSChildNode | IfStatement)*): Self = StObject.set(x, "body", js.Array(value :_*))
    
    @scala.inline
    def setType(value: `21`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
