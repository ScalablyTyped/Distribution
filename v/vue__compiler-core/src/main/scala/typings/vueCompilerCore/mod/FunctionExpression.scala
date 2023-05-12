package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreInts.`18`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FunctionExpression
  extends StObject
     with Node
     with JSChildNode {
  
  var body: js.UndefOr[BlockStatement | IfStatement] = js.undefined
  
  /**
    * __COMPAT__ only, indicates a slot function that should be excluded from
    * the legacy $scopedSlots instance property.
    */
  var isNonScopedSlot: js.UndefOr[Boolean] = js.undefined
  
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
  
  inline def apply(isSlot: Boolean, loc: SourceLocation, newline: Boolean): FunctionExpression = {
    val __obj = js.Dynamic.literal(isSlot = isSlot.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], newline = newline.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(18)
    __obj.asInstanceOf[FunctionExpression]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FunctionExpression] (val x: Self) extends AnyVal {
    
    inline def setBody(value: BlockStatement | IfStatement): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setIsNonScopedSlot(value: Boolean): Self = StObject.set(x, "isNonScopedSlot", value.asInstanceOf[js.Any])
    
    inline def setIsNonScopedSlotUndefined: Self = StObject.set(x, "isNonScopedSlot", js.undefined)
    
    inline def setIsSlot(value: Boolean): Self = StObject.set(x, "isSlot", value.asInstanceOf[js.Any])
    
    inline def setNewline(value: Boolean): Self = StObject.set(x, "newline", value.asInstanceOf[js.Any])
    
    inline def setParams(value: ExpressionNode | String | (js.Array[ExpressionNode | String])): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setParamsVarargs(value: (ExpressionNode | String)*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setReturns(value: TemplateChildNode | js.Array[TemplateChildNode] | JSChildNode): Self = StObject.set(x, "returns", value.asInstanceOf[js.Any])
    
    inline def setReturnsUndefined: Self = StObject.set(x, "returns", js.undefined)
    
    inline def setReturnsVarargs(value: TemplateChildNode*): Self = StObject.set(x, "returns", js.Array(value*))
    
    inline def setType(value: `18`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
