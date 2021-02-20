package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentNode
  extends ElementNode
     with BaseElementNode {
  
  var codegenNode: js.UndefOr[VNodeCall | CacheExpression] = js.native
  
  var ssrCodegenNode: js.UndefOr[CallExpression] = js.native
  
  @JSName("tagType")
  var tagType_ComponentNode: `1` = js.native
}
object ComponentNode {
  
  @scala.inline
  def apply(
    children: js.Array[TemplateChildNode],
    isSelfClosing: Boolean,
    loc: SourceLocation,
    ns: Namespace,
    props: js.Array[AttributeNode | DirectiveNode],
    tag: String,
    tagType: `1`,
    `type`: `1`
  ): ComponentNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagType = tagType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentNode]
  }
  
  @scala.inline
  implicit class ComponentNodeMutableBuilder[Self <: ComponentNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodegenNode(value: VNodeCall | CacheExpression): Self = StObject.set(x, "codegenNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodegenNodeUndefined: Self = StObject.set(x, "codegenNode", js.undefined)
    
    @scala.inline
    def setSsrCodegenNode(value: CallExpression): Self = StObject.set(x, "ssrCodegenNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsrCodegenNodeUndefined: Self = StObject.set(x, "ssrCodegenNode", js.undefined)
    
    @scala.inline
    def setTagType(value: `1`): Self = StObject.set(x, "tagType", value.asInstanceOf[js.Any])
  }
}
