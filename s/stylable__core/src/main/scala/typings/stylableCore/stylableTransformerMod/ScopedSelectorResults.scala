package typings.stylableCore.stylableTransformerMod

import typings.stylableCore.selectorUtilsMod.SelectorAstNode
import typings.stylableCore.stylableMetaMod.StylableSymbol
import typings.stylableCore.stylableProcessorMod.StylableMeta
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScopedSelectorResults extends js.Object {
  
  var current: StylableMeta = js.native
  
  var elements: js.Array[js.Array[ResolvedElement]] = js.native
  
  var selector: String = js.native
  
  var selectorAst: SelectorAstNode = js.native
  
  var symbol: StylableSymbol | Null = js.native
}
object ScopedSelectorResults {
  
  @scala.inline
  def apply(
    current: StylableMeta,
    elements: js.Array[js.Array[ResolvedElement]],
    selector: String,
    selectorAst: SelectorAstNode
  ): ScopedSelectorResults = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], selectorAst = selectorAst.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopedSelectorResults]
  }
  
  @scala.inline
  implicit class ScopedSelectorResultsOps[Self <: ScopedSelectorResults] (val x: Self) extends AnyVal {
    
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
    def setCurrent(value: StylableMeta): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementsVarargs(value: js.Array[ResolvedElement]*): Self = this.set("elements", js.Array(value :_*))
    
    @scala.inline
    def setElements(value: js.Array[js.Array[ResolvedElement]]): Self = this.set("elements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorAst(value: SelectorAstNode): Self = this.set("selectorAst", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: StylableSymbol): Self = this.set("symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolNull: Self = this.set("symbol", null)
  }
}
