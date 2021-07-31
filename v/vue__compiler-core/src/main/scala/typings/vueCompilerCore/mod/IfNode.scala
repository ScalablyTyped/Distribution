package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`9`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IfNode
  extends StObject
     with Node2
     with TemplateChildNode {
  
  var branches: js.Array[IfBranchNode]
  
  var codegenNode: js.UndefOr[IfConditionalExpression | CacheExpression] = js.undefined
  
  @JSName("type")
  var type_IfNode: `9`
}
object IfNode {
  
  @scala.inline
  def apply(branches: js.Array[IfBranchNode], loc: SourceLocation): IfNode = {
    val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(9)
    __obj.asInstanceOf[IfNode]
  }
  
  @scala.inline
  implicit class IfNodeMutableBuilder[Self <: IfNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBranches(value: js.Array[IfBranchNode]): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchesVarargs(value: IfBranchNode*): Self = StObject.set(x, "branches", js.Array(value :_*))
    
    @scala.inline
    def setCodegenNode(value: IfConditionalExpression | CacheExpression): Self = StObject.set(x, "codegenNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodegenNodeUndefined: Self = StObject.set(x, "codegenNode", js.undefined)
    
    @scala.inline
    def setType(value: `9`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
