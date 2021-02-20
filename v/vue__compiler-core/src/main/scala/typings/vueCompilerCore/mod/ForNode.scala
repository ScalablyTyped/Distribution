package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`11`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ForNode
  extends TemplateChildNode
     with Node2
     with ParentNode2 {
  
  var children: js.Array[TemplateChildNode] = js.native
  
  var codegenNode: js.UndefOr[ForCodegenNode] = js.native
  
  var keyAlias: js.UndefOr[ExpressionNode] = js.native
  
  var objectIndexAlias: js.UndefOr[ExpressionNode] = js.native
  
  var parseResult: ForParseResult = js.native
  
  var source: ExpressionNode = js.native
  
  @JSName("type")
  var type_ForNode: `11` = js.native
  
  var valueAlias: js.UndefOr[ExpressionNode] = js.native
}
object ForNode {
  
  @scala.inline
  def apply(
    children: js.Array[TemplateChildNode],
    loc: SourceLocation,
    parseResult: ForParseResult,
    source: ExpressionNode,
    `type`: `11`
  ): ForNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], parseResult = parseResult.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForNode]
  }
  
  @scala.inline
  implicit class ForNodeMutableBuilder[Self <: ForNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[TemplateChildNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: TemplateChildNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setCodegenNode(value: ForCodegenNode): Self = StObject.set(x, "codegenNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodegenNodeUndefined: Self = StObject.set(x, "codegenNode", js.undefined)
    
    @scala.inline
    def setKeyAlias(value: ExpressionNode): Self = StObject.set(x, "keyAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyAliasUndefined: Self = StObject.set(x, "keyAlias", js.undefined)
    
    @scala.inline
    def setObjectIndexAlias(value: ExpressionNode): Self = StObject.set(x, "objectIndexAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIndexAliasUndefined: Self = StObject.set(x, "objectIndexAlias", js.undefined)
    
    @scala.inline
    def setParseResult(value: ForParseResult): Self = StObject.set(x, "parseResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: ExpressionNode): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `11`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueAlias(value: ExpressionNode): Self = StObject.set(x, "valueAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueAliasUndefined: Self = StObject.set(x, "valueAlias", js.undefined)
  }
}
