package typings.word.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WJSPara extends js.Object {
  
  /** Children */
  var elts: js.Array[WJSParaElement] = js.native
}
object WJSPara {
  
  @scala.inline
  def apply(elts: js.Array[WJSParaElement]): WJSPara = {
    val __obj = js.Dynamic.literal(elts = elts.asInstanceOf[js.Any])
    __obj.asInstanceOf[WJSPara]
  }
  
  @scala.inline
  implicit class WJSParaOps[Self <: WJSPara] (val x: Self) extends AnyVal {
    
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
    def setEltsVarargs(value: WJSParaElement*): Self = this.set("elts", js.Array(value :_*))
    
    @scala.inline
    def setElts(value: js.Array[WJSParaElement]): Self = this.set("elts", value.asInstanceOf[js.Any])
  }
}
