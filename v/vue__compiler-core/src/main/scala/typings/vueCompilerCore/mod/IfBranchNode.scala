package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`10`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IfBranchNode
  extends StObject
     with Node2
     with ParentNode2
     with TemplateChildNode {
  
  var children: js.Array[TemplateChildNode]
  
  var condition: js.UndefOr[ExpressionNode] = js.undefined
  
  @JSName("type")
  var type_IfBranchNode: `10`
  
  var userKey: js.UndefOr[AttributeNode | DirectiveNode] = js.undefined
}
object IfBranchNode {
  
  @scala.inline
  def apply(children: js.Array[TemplateChildNode], loc: SourceLocation): IfBranchNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(10)
    __obj.asInstanceOf[IfBranchNode]
  }
  
  @scala.inline
  implicit class IfBranchNodeMutableBuilder[Self <: IfBranchNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[TemplateChildNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: TemplateChildNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setCondition(value: ExpressionNode): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setType(value: `10`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserKey(value: AttributeNode | DirectiveNode): Self = StObject.set(x, "userKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserKeyUndefined: Self = StObject.set(x, "userKey", js.undefined)
  }
}
