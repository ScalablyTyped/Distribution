package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`18`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionExpression
  extends StObject
     with Node2
     with JSChildNode {
  
  var body: js.UndefOr[BlockStatement | IfStatement] = js.undefined
  
  /**
    * This flag is for codegen to determine whether it needs to generate the
    * withScopeId() wrapper
    */
  var isSlot: Boolean
  
  var newline: Boolean
  
  var params: js.UndefOr[ExpressionNode | String | (js.Array[ExpressionNode | String])] = js.undefined
  
  var returns: js.UndefOr[TemplateChildNode | js.Array[TemplateChildNode] | JSChildNode] = js.undefined
  
  @JSName("type")
  var type_FunctionExpression: `18`
}
object FunctionExpression {
  
  @scala.inline
  def apply(isSlot: Boolean, loc: SourceLocation, newline: Boolean): FunctionExpression = {
    val __obj = js.Dynamic.literal(isSlot = isSlot.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], newline = newline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(18)
    __obj.asInstanceOf[FunctionExpression]
  }
  
  @scala.inline
  implicit class FunctionExpressionMutableBuilder[Self <: FunctionExpression] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: BlockStatement | IfStatement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setIsSlot(value: Boolean): Self = StObject.set(x, "isSlot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewline(value: Boolean): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: ExpressionNode | String | (js.Array[ExpressionNode | String])): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setParamsVarargs(value: (ExpressionNode | String)*): Self = StObject.set(x, "params", js.Array(value :_*))
    
    @scala.inline
    def setReturns(value: TemplateChildNode | js.Array[TemplateChildNode] | JSChildNode): Self = StObject.set(x, "returns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnsUndefined: Self = StObject.set(x, "returns", js.undefined)
    
    @scala.inline
    def setReturnsVarargs(value: TemplateChildNode*): Self = StObject.set(x, "returns", js.Array(value :_*))
    
    @scala.inline
    def setType(value: `18`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
