package typings.word.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WJSDoc extends js.Object {
  
  var p: js.Array[WJSPara] = js.native
}
object WJSDoc {
  
  @scala.inline
  def apply(p: js.Array[WJSPara]): WJSDoc = {
    val __obj = js.Dynamic.literal(p = p.asInstanceOf[js.Any])
    __obj.asInstanceOf[WJSDoc]
  }
  
  @scala.inline
  implicit class WJSDocOps[Self <: WJSDoc] (val x: Self) extends AnyVal {
    
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
  }
}
