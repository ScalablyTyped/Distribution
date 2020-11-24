package typings.webgme.Gme.Concepts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComposeChain extends js.Object {
  
  var objId: String = js.native
  
  var subCompId: js.UndefOr[String] = js.native
}
object ComposeChain {
  
  @scala.inline
  def apply(objId: String): ComposeChain = {
    val __obj = js.Dynamic.literal(objId = objId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComposeChain]
  }
  
  @scala.inline
  implicit class ComposeChainOps[Self <: ComposeChain] (val x: Self) extends AnyVal {
    
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
    def setObjId(value: String): Self = this.set("objId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubCompId(value: String): Self = this.set("subCompId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubCompId: Self = this.set("subCompId", js.undefined)
  }
}
