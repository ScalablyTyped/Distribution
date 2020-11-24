package typings.stylableCore.selectorUtilsMod

import typings.stylableCore.stylableCoreStrings.`pseudo-class`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PseudoSelectorAstNode extends SelectorAstNode {
  
  @JSName("content")
  var content_PseudoSelectorAstNode: String = js.native
  
  @JSName("type")
  var type_PseudoSelectorAstNode: `pseudo-class` = js.native
}
object PseudoSelectorAstNode {
  
  @scala.inline
  def apply(content: String, name: String, nodes: js.Array[SelectorAstNode], `type`: `pseudo-class`): PseudoSelectorAstNode = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PseudoSelectorAstNode]
  }
  
  @scala.inline
  implicit class PseudoSelectorAstNodeOps[Self <: PseudoSelectorAstNode] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `pseudo-class`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
