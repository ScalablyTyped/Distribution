package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`0`
import typings.vueCompilerCore.vueCompilerCoreNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlainElementNode
  extends ElementNode
     with BaseElementNode {
  
  var codegenNode: js.UndefOr[VNodeCall | SimpleExpressionNode | CacheExpression] = js.native
  
  var ssrCodegenNode: js.UndefOr[TemplateLiteral] = js.native
  
  @JSName("tagType")
  var tagType_PlainElementNode: `0` = js.native
}
object PlainElementNode {
  
  @scala.inline
  def apply(
    children: js.Array[TemplateChildNode],
    isSelfClosing: Boolean,
    loc: SourceLocation,
    ns: Namespace,
    props: js.Array[AttributeNode | DirectiveNode],
    tag: String,
    tagType: `0`,
    `type`: `1`
  ): PlainElementNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagType = tagType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlainElementNode]
  }
  
  @scala.inline
  implicit class PlainElementNodeOps[Self <: PlainElementNode] (val x: Self) extends AnyVal {
    
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
    def setTagType(value: `0`): Self = this.set("tagType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodegenNode(value: VNodeCall | SimpleExpressionNode | CacheExpression): Self = this.set("codegenNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodegenNode: Self = this.set("codegenNode", js.undefined)
    
    @scala.inline
    def setSsrCodegenNode(value: TemplateLiteral): Self = this.set("ssrCodegenNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsrCodegenNode: Self = this.set("ssrCodegenNode", js.undefined)
  }
}
