package typings.vueCompilerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateNode
  extends StObject
     with BaseElementNode {
  
  var codegenNode: Unit
  
  @JSName("tagType")
  var tagType_TemplateNode: 3
}
object TemplateNode {
  
  inline def apply(
    children: js.Array[TemplateChildNode],
    codegenNode: Unit,
    isSelfClosing: Boolean,
    loc: SourceLocation,
    ns: Namespace,
    props: js.Array[AttributeNode | DirectiveNode],
    tag: String
  ): TemplateNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], codegenNode = codegenNode.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagType = 3)
    __obj.updateDynamic("type")(1)
    __obj.asInstanceOf[TemplateNode]
  }
  
  extension [Self <: TemplateNode](x: Self) {
    
    inline def setCodegenNode(value: Unit): Self = StObject.set(x, "codegenNode", value.asInstanceOf[js.Any])
    
    inline def setTagType(value: 3): Self = StObject.set(x, "tagType", value.asInstanceOf[js.Any])
  }
}
