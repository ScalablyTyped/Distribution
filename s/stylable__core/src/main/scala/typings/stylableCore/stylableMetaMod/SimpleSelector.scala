package typings.stylableCore.stylableMetaMod

import typings.postcss.mod.Root_
import typings.postcss.mod.Rule_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SimpleSelector extends js.Object {
  
  var node: Rule_ | Root_ = js.native
  
  var symbol: ClassSymbol | ElementSymbol = js.native
}
object SimpleSelector {
  
  @scala.inline
  def apply(node: Rule_ | Root_, symbol: ClassSymbol | ElementSymbol): SimpleSelector = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleSelector]
  }
  
  @scala.inline
  implicit class SimpleSelectorOps[Self <: SimpleSelector] (val x: Self) extends AnyVal {
    
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
    def setNode(value: Rule_ | Root_): Self = this.set("node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: ClassSymbol | ElementSymbol): Self = this.set("symbol", value.asInstanceOf[js.Any])
  }
}
