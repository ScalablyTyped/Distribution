package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`26`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnStatement
  extends StObject
     with Node2
     with SSRCodegenNode {
  
  var returns: TemplateChildNode | js.Array[TemplateChildNode] | JSChildNode
  
  @JSName("type")
  var type_ReturnStatement: `26`
}
object ReturnStatement {
  
  @scala.inline
  def apply(loc: SourceLocation, returns: TemplateChildNode | js.Array[TemplateChildNode] | JSChildNode): ReturnStatement = {
    val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], returns = returns.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(26)
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
