package typings.vueCompilerCore.mod

import typings.vueCompilerCore.vueCompilerCoreNumbers.`1`
import typings.vueCompilerCore.vueCompilerCoreNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateNode
  extends ElementNode
     with BaseElementNode {
  
  var codegenNode: js.UndefOr[scala.Nothing] = js.native
  
  @JSName("tagType")
  var tagType_TemplateNode: `3` = js.native
}
object TemplateNode {
  
  @scala.inline
  def apply(
    children: js.Array[TemplateChildNode],
    isSelfClosing: Boolean,
    loc: SourceLocation,
    ns: Namespace,
    props: js.Array[AttributeNode | DirectiveNode],
    tag: String,
    tagType: `3`,
    `type`: `1`
  ): TemplateNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isSelfClosing = isSelfClosing.asInstanceOf[js.Any], loc = loc.asInstanceOf[js.Any], ns = ns.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagType = tagType.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateNode]
  }
  
  @scala.inline
  implicit class TemplateNodeMutableBuilder[Self <: TemplateNode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTagType(value: `3`): Self = StObject.set(x, "tagType", value.asInstanceOf[js.Any])
  }
}
