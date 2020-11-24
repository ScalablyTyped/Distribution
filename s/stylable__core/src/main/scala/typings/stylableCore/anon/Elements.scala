package typings.stylableCore.anon

import typings.stylableCore.selectorUtilsMod.SelectorAstNode
import typings.stylableCore.stylableTransformerMod.ResolvedElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Elements extends js.Object {
  
  var elements: js.Array[js.Array[ResolvedElement]] = js.native
  
  var selector: String = js.native
  
  var targetSelectorAst: SelectorAstNode = js.native
}
object Elements {
  
  @scala.inline
  def apply(
    elements: js.Array[js.Array[ResolvedElement]],
    selector: String,
    targetSelectorAst: SelectorAstNode
  ): Elements = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], targetSelectorAst = targetSelectorAst.asInstanceOf[js.Any])
    __obj.asInstanceOf[Elements]
  }
  
  @scala.inline
  implicit class ElementsOps[Self <: Elements] (val x: Self) extends AnyVal {
    
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
    def setElementsVarargs(value: js.Array[ResolvedElement]*): Self = this.set("elements", js.Array(value :_*))
    
    @scala.inline
    def setElements(value: js.Array[js.Array[ResolvedElement]]): Self = this.set("elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetSelectorAst(value: SelectorAstNode): Self = this.set("targetSelectorAst", value.asInstanceOf[js.Any])
  }
}
