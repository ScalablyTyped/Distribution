package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseElementNode extends Node2 {
  
  var children: js.Array[TemplateChildNode] = js.native
  
  var isSelfClosing: Boolean = js.native
  
  var ns: Namespace = js.native
  
  var props: js.Array[AttributeNode | DirectiveNode] = js.native
  
  var tag: String = js.native
  
  var tagType: ElementTypes = js.native
  
  @JSName("type")
  var type_BaseElementNode: `1` = js.native
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
    tagType: ElementTypes,
    `type`: `1`
  ): BaseElementNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagType = tagType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseElementNode]
  }
  
  @scala.inline
  implicit class BaseElementNodeOps[Self <: BaseElementNode] (val x: Self) extends AnyVal {
    
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
    def setIsSelfClosing(value: Boolean): Self = this.set("isSelfClosing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNs(value: Namespace): Self = this.set("ns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropsVarargs(value: (AttributeNode | DirectiveNode)*): Self = this.set("props", js.Array(value :_*))
    
    @scala.inline
    def setProps(value: js.Array[AttributeNode | DirectiveNode]): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagType(value: ElementTypes): Self = this.set("tagType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `1`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
