package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlainElementNode
  extends StObject
     with BaseElementNode
     with ElementNode {
  
  var codegenNode: js.UndefOr[VNodeCall | SimpleExpressionNode | CacheExpression | MemoExpression] = js.undefined
  
  var ssrCodegenNode: js.UndefOr[TemplateLiteral] = js.undefined
  
  @JSName("tagType")
  var tagType_PlainElementNode: `0`
}
object PlainElementNode {
  
  inline def apply(
    children: js.Array[TemplateChildNode],
    isSelfClosing: Boolean,
    loc: SourceLocation,
    ns: Namespace,
    props: js.Array[AttributeNode | DirectiveNode],
    tag: String
  ): PlainElementNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagType = 0)
    __obj.updateDynamic("type")(1)
    __obj.asInstanceOf[PlainElementNode]
  }
  
  extension [Self <: PlainElementNode](x: Self) {
    
    inline def setCodegenNode(value: VNodeCall | SimpleExpressionNode | CacheExpression | MemoExpression): Self = StObject.set(x, "codegenNode", value.asInstanceOf[js.Any])
    
    inline def setCodegenNodeUndefined: Self = StObject.set(x, "codegenNode", js.undefined)
    
    inline def setSsrCodegenNode(value: TemplateLiteral): Self = StObject.set(x, "ssrCodegenNode", value.asInstanceOf[js.Any])
    
    inline def setSsrCodegenNodeUndefined: Self = StObject.set(x, "ssrCodegenNode", js.undefined)
    
    inline def setTagType(value: `0`): Self = StObject.set(x, "tagType", value.asInstanceOf[js.Any])
  }
}
