package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`26`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnStatement
  extends SSRCodegenNode
     with Node2 {
  
  var returns: TemplateChildNode | js.Array[TemplateChildNode] | JSChildNode = js.native
  
  @JSName("type")
  var type_ReturnStatement: `26` = js.native
}
object ReturnStatement {
  
  @scala.inline
  def apply(
    loc: SourceLocation,
    returns: TemplateChildNode | js.Array[TemplateChildNode] | JSChildNode,
    `type`: `26`
  ): ReturnStatement = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], returns = returns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnStatement]
  }
  
  @scala.inline
  implicit class ReturnStatementMutableBuilder[Self <: ReturnStatement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReturns(value: TemplateChildNode | js.Array[TemplateChildNode] | JSChildNode): Self = StObject.set(x, "returns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnsVarargs(value: TemplateChildNode*): Self = StObject.set(x, "returns", js.Array(value :_*))
    
    @scala.inline
    def setType(value: `26`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
