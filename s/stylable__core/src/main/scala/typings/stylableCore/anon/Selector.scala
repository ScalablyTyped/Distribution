package typings.stylableCore.anon

import typings.stylableCore.selectorUtilsMod.SelectorAstNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Selector extends js.Object {
  
  var selector: String = js.native
  
  var selectorAst: SelectorAstNode = js.native
}
object Selector {
  
  @scala.inline
  def apply(selector: String, selectorAst: SelectorAstNode): Selector = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any], selectorAst = selectorAst.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  
  @scala.inline
  implicit class SelectorOps[Self <: Selector] (val x: Self) extends AnyVal {
    
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
    def setSelector(value: String): Self = this.set("selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorAst(value: SelectorAstNode): Self = this.set("selectorAst", value.asInstanceOf[js.Any])
  }
}
