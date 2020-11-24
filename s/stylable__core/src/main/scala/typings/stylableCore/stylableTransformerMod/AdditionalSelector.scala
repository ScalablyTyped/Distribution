package typings.stylableCore.stylableTransformerMod

import typings.stylableCore.selectorUtilsMod.SelectorAstNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdditionalSelector extends js.Object {
  
  var customElementChunk: String = js.native
  
  var node: SelectorAstNode = js.native
  
  var selectorNode: SelectorAstNode = js.native
}
object AdditionalSelector {
  
  @scala.inline
  def apply(customElementChunk: String, node: SelectorAstNode, selectorNode: SelectorAstNode): AdditionalSelector = {
    val __obj = js.Dynamic.literal(customElementChunk = customElementChunk.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], selectorNode = selectorNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalSelector]
  }
  
  @scala.inline
  implicit class AdditionalSelectorOps[Self <: AdditionalSelector] (val x: Self) extends AnyVal {
    
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
    def setCustomElementChunk(value: String): Self = this.set("customElementChunk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: SelectorAstNode): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorNode(value: SelectorAstNode): Self = this.set("selectorNode", value.asInstanceOf[js.Any])
  }
}
