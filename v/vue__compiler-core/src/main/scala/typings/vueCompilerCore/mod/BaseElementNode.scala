package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseElementNode
  extends StObject
     with Node2 {
  
  var children: js.Array[TemplateChildNode]
  
  var isSelfClosing: Boolean
  
  var ns: Namespace
  
  var props: js.Array[AttributeNode | DirectiveNode]
  
  var tag: String
  
  var tagType: ElementTypes
  
  @JSName("type")
  var type_BaseElementNode: `1`
}
object BaseElementNode {
  
  @scala.inline
  def apply(
    children: js.Array[TemplateChildNode],
    isSelfClosing: Boolean,
    loc: SourceLocation,
    ns: Namespace,
    props: js.Array[AttributeNode | DirectiveNode],
    tag: String,
    tagType: ElementTypes
  ): BaseElementNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagType = tagType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(1)
    __obj.asInstanceOf[BaseElementNode]
  }
  
  @scala.inline
  implicit class BaseElementNodeMutableBuilder[Self <: BaseElementNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: js.Array[TemplateChildNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: TemplateChildNode*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setIsSelfClosing(value: Boolean): Self = StObject.set(x, "isSelfClosing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNs(value: Namespace): Self = StObject.set(x, "ns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: js.Array[AttributeNode | DirectiveNode]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropsVarargs(value: (AttributeNode | DirectiveNode)*): Self = StObject.set(x, "props", js.Array(value :_*))
    
    @scala.inline
    def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagType(value: ElementTypes): Self = StObject.set(x, "tagType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `1`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
