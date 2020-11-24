package typings.xstate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoForward extends js.Object {
  
  var autoForward: js.UndefOr[Boolean] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var sync: js.UndefOr[Boolean] = js.native
}
object AutoForward {
  
  @scala.inline
  def apply(): AutoForward = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoForward]
  }
  
  @scala.inline
  implicit class AutoForwardOps[Self <: AutoForward] (val x: Self) extends AnyVal {
    
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
    def setAutoForward(value: Boolean): Self = this.set("autoForward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoForward: Self = this.set("autoForward", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setSync(value: Boolean): Self = this.set("sync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSync: Self = this.set("sync", js.undefined)
  }
}
