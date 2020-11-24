package typings.word.typesMod

import typings.word.wordStrings.t
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WJSTable extends WJSParaElement {
  
  /** Rows */
  var r: js.Array[WJSTableRow] = js.native
  
  var t: typings.word.wordStrings.t = js.native
}
object WJSTable {
  
  @scala.inline
  def apply(r: js.Array[WJSTableRow], t: t): WJSTable = {
    val __obj = js.Dynamic.literal(r = r.asInstanceOf[js.Any], t = t.asInstanceOf[js.Any])
    __obj.asInstanceOf[WJSTable]
  }
  
  @scala.inline
  implicit class WJSTableOps[Self <: WJSTable] (val x: Self) extends AnyVal {
    
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
    def setRVarargs(value: WJSTableRow*): Self = this.set("r", js.Array(value :_*))
    
    @scala.inline
    def setR(value: js.Array[WJSTableRow]): Self = this.set("r", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setT(value: t): Self = this.set("t", value.asInstanceOf[js.Any])
  }
}
