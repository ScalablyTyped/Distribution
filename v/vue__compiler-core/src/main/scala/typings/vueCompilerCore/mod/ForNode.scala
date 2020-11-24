package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`11`
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
  implicit class ForNodeOps[Self <: ForNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChildrenVarargs(value: TemplateChildNode*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[TemplateChildNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParseResult(value: ForParseResult): Self = this.set("parseResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: ExpressionNode): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `11`): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodegenNode(value: ForCodegenNode): Self = this.set("codegenNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodegenNode: Self = this.set("codegenNode", js.undefined)
    
    @scala.inline
    def setKeyAlias(value: ExpressionNode): Self = this.set("keyAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyAlias: Self = this.set("keyAlias", js.undefined)
    
    @scala.inline
    def setObjectIndexAlias(value: ExpressionNode): Self = this.set("objectIndexAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectIndexAlias: Self = this.set("objectIndexAlias", js.undefined)
    
    @scala.inline
    def setValueAlias(value: ExpressionNode): Self = this.set("valueAlias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueAlias: Self = this.set("valueAlias", js.undefined)
  }
}
