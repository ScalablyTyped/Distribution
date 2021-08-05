package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentNode
  extends StObject
     with BaseElementNode
     with ElementNode {
  
  var codegenNode: js.UndefOr[VNodeCall | CacheExpression] = js.undefined
  
  var ssrCodegenNode: js.UndefOr[CallExpression] = js.undefined
  
  @JSName("tagType")
  var tagType_ComponentNode: `1`
}
object ComponentNode {
  
  inline def apply(
    children: js.Array[TemplateChildNode],
    isSelfClosing: Boolean,
    loc: SourceLocation,
    ns: Namespace,
    props: js.Array[AttributeNode | DirectiveNode],
    tag: String
  ): ComponentNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagType = 1)
    __obj.updateDynamic("type")(1)
    __obj.asInstanceOf[ComponentNode]
  }
  
  extension [Self <: ComponentNode](x: Self) {
    
    inline def setCodegenNode(value: VNodeCall | CacheExpression): Self = StObject.set(x, "codegenNode", value.asInstanceOf[js.Any])
    
    inline def setCodegenNodeUndefined: Self = StObject.set(x, "codegenNode", js.undefined)
    
    inline def setSsrCodegenNode(value: CallExpression): Self = StObject.set(x, "ssrCodegenNode", value.asInstanceOf[js.Any])
    
    inline def setSsrCodegenNodeUndefined: Self = StObject.set(x, "ssrCodegenNode", js.undefined)
    
    inline def setTagType(value: `1`): Self = StObject.set(x, "tagType", value.asInstanceOf[js.Any])
  }
}
