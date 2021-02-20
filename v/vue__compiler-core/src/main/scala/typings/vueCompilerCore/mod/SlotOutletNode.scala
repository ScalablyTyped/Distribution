package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`1`
import typings.vueCompilerCore.vueCompilerCoreNumbers.`2`
import org.scalablytyped.runtime.StObject
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
  implicit class SlotOutletNodeMutableBuilder[Self <: SlotOutletNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodegenNode(value: RenderSlotCall | CacheExpression): Self = StObject.set(x, "codegenNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodegenNodeUndefined: Self = StObject.set(x, "codegenNode", js.undefined)
    
    @scala.inline
    def setSsrCodegenNode(value: CallExpression): Self = StObject.set(x, "ssrCodegenNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsrCodegenNodeUndefined: Self = StObject.set(x, "ssrCodegenNode", js.undefined)
    
    @scala.inline
    def setTagType(value: `2`): Self = StObject.set(x, "tagType", value.asInstanceOf[js.Any])
  }
}
