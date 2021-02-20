package typings.stylableCore.anon

import typings.stylableCore.selectorUtilsMod.SelectorAstNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@stylable/core.@stylable/core/cjs/selector-utils.SelectorAstNode> */
@js.native
trait PartialSelectorAstNode extends StObject {
  
  var before: js.UndefOr[String] = js.native
  
  var content: js.UndefOr[String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var nodes: js.UndefOr[js.Array[SelectorAstNode]] = js.native
  
  var operator: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object PartialSelectorAstNode {
  
  @scala.inline
  def apply(): PartialSelectorAstNode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSelectorAstNode]
  }
  
  @scala.inline
  implicit class PartialSelectorAstNodeMutableBuilder[Self <: PartialSelectorAstNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setNodes(value: js.Array[SelectorAstNode]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodesUndefined: Self = StObject.set(x, "nodes", js.undefined)
    
    @scala.inline
    def setNodesVarargs(value: SelectorAstNode*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    
    @scala.inline
    def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperatorUndefined: Self = StObject.set(x, "operator", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
