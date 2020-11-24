package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`1`
import typings.vueCompilerCore.vueCompilerCoreNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlotOutletNode
  extends ElementNode
     with BaseElementNode {
  
  var codegenNode: js.UndefOr[RenderSlotCall | CacheExpression] = js.native
  
  var ssrCodegenNode: js.UndefOr[CallExpression] = js.native
  
  @JSName("tagType")
  var tagType_SlotOutletNode: `2` = js.native
}
object SlotOutletNode {
  
  @scala.inline
  def apply(
    children: js.Array[TemplateChildNode],
    isSelfClosing: Boolean,
    loc: SourceLocation,
    ns: Namespace,
    props: js.Array[AttributeNode | DirectiveNode],
    tag: String,
    tagType: `2`,
    `type`: `1`
  ): SlotOutletNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagType = tagType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotOutletNode]
  }
  
  @scala.inline
  implicit class SlotOutletNodeOps[Self <: SlotOutletNode] (val x: Self) extends AnyVal {
    
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
    def setTagType(value: `2`): Self = this.set("tagType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodegenNode(value: RenderSlotCall | CacheExpression): Self = this.set("codegenNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodegenNode: Self = this.set("codegenNode", js.undefined)
    
    @scala.inline
    def setSsrCodegenNode(value: CallExpression): Self = this.set("ssrCodegenNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsrCodegenNode: Self = this.set("ssrCodegenNode", js.undefined)
  }
}
