package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IfNode
  extends StObject
     with Node2 {
  
  var branches: js.Array[IfBranchNode]
  
  var codegenNode: js.UndefOr[IfConditionalExpression | CacheExpression] = js.undefined
  
  @JSName("type")
  var type_IfNode: 9
}
object IfNode {
  
  inline def apply(branches: js.Array[IfBranchNode], loc: SourceLocation): IfNode = {
    val __obj = js.Dynamic.literal(branches = branches.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(9)
    __obj.asInstanceOf[IfNode]
  }
  
  extension [Self <: IfNode](x: Self) {
    
    inline def setBranches(value: js.Array[IfBranchNode]): Self = StObject.set(x, "branches", value.asInstanceOf[js.Any])
    
    inline def setBranchesVarargs(value: IfBranchNode*): Self = StObject.set(x, "branches", js.Array(value*))
    
    inline def setCodegenNode(value: IfConditionalExpression | CacheExpression): Self = StObject.set(x, "codegenNode", value.asInstanceOf[js.Any])
    
    inline def setCodegenNodeUndefined: Self = StObject.set(x, "codegenNode", js.undefined)
    
    inline def setType(value: 9): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
