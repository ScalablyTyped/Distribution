package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreInts.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotOutletNode
  extends StObject
     with BaseElementNode
     with ElementNode {
  
  var codegenNode: js.UndefOr[RenderSlotCall | CacheExpression] = js.undefined
  
  var ssrCodegenNode: js.UndefOr[CallExpression] = js.undefined
  
  @JSName("tagType")
  var tagType_SlotOutletNode: `2`
}
object SlotOutletNode {
  
  inline def apply(
    children: js.Array[TemplateChildNode],
    isSelfClosing: Boolean,
    loc: SourceLocation,
    ns: Namespace,
    props: js.Array[AttributeNode | DirectiveNode],
    tag: String
  ): SlotOutletNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagType = 2)
    __obj.updateDynamic("type")(1)
    __obj.asInstanceOf[SlotOutletNode]
  }
  
  extension [Self <: SlotOutletNode](x: Self) {
    
    inline def setCodegenNode(value: RenderSlotCall | CacheExpression): Self = StObject.set(x, "codegenNode", value.asInstanceOf[js.Any])
    
    inline def setCodegenNodeUndefined: Self = StObject.set(x, "codegenNode", js.undefined)
    
    inline def setSsrCodegenNode(value: CallExpression): Self = StObject.set(x, "ssrCodegenNode", value.asInstanceOf[js.Any])
    
    inline def setSsrCodegenNodeUndefined: Self = StObject.set(x, "ssrCodegenNode", js.undefined)
    
    inline def setTagType(value: `2`): Self = StObject.set(x, "tagType", value.asInstanceOf[js.Any])
  }
}
