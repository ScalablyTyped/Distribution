package typings.word.typesMod

import typings.word.wordStrings.c
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WJSTableCell extends js.Object {
  
  /** Body */
  var p: js.Array[WJSPara] = js.native
  
  var t: c = js.native
}
object WJSTableCell {
  
  @scala.inline
  def apply(p: js.Array[WJSPara], t: c): WJSTableCell = {
    val __obj = js.Dynamic.literal(p = p.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[WJSTableCell]
  }
  
  @scala.inline
  implicit class WJSTableCellOps[Self <: WJSTableCell] (val x: Self) extends AnyVal {
    
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
    def setPVarargs(value: WJSPara*): Self = this.set("p", js.Array(value :_*))
    
    @scala.inline
    def setP(value: js.Array[WJSPara]): Self = this.set("p", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT(value: c): Self = this.set("t", value.asInstanceOf[js.Any])
  }
}
