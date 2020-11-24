package typings.word.typesMod

import typings.word.wordStrings.r
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WJSTableRow extends js.Object {
  
  /** Cells */
  var c: js.Array[WJSTableCell] = js.native
  
  var t: r = js.native
}
object WJSTableRow {
  
  @scala.inline
  def apply(c: js.Array[WJSTableCell], t: r): WJSTableRow = {
    val __obj = js.Dynamic.literal(c = c.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[WJSTableRow]
  }
  
  @scala.inline
  implicit class WJSTableRowOps[Self <: WJSTableRow] (val x: Self) extends AnyVal {
    
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
    def setCVarargs(value: WJSTableCell*): Self = this.set("c", js.Array(value :_*))
    
    @scala.inline
    def setC(value: js.Array[WJSTableCell]): Self = this.set("c", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT(value: r): Self = this.set("t", value.asInstanceOf[js.Any])
  }
}
