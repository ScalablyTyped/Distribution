package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`10`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IfBranchNode
  extends TemplateChildNode
     with Node2
     with ParentNode2 {
  
  var children: js.Array[TemplateChildNode] = js.native
  
  var condition: js.UndefOr[ExpressionNode] = js.native
  
  @JSName("type")
  var type_IfBranchNode: `10` = js.native
  
  var userKey: js.UndefOr[AttributeNode | DirectiveNode] = js.native
}
object IfBranchNode {
  
  @scala.inline
  def apply(children: js.Array[TemplateChildNode], loc: SourceLocation, `type`: `10`): IfBranchNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
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
