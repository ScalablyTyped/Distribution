package typings.stropheJs.mucMod.stropheAugmentingMod.Strophe.MUC

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OccupantInfo extends js.Object {
  
  var affiliation: js.UndefOr[String] = js.native
  
  var jid: js.UndefOr[String] = js.native
  
  var nick: js.UndefOr[String] = js.native
  
  var role: js.UndefOr[String] = js.native
  
  var show: js.UndefOr[String] = js.native
  
  var status: js.UndefOr[String] = js.native
}
object OccupantInfo {
  
  @scala.inline
  def apply(): OccupantInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OccupantInfo]
  }
  
  @scala.inline
  implicit class OccupantInfoOps[Self <: OccupantInfo] (val x: Self) extends AnyVal {
    
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
    def setAffiliation(value: String): Self = this.set("affiliation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAffiliation: Self = this.set("affiliation", js.undefined)
    
    @scala.inline
    def setJid(value: String): Self = this.set("jid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJid: Self = this.set("jid", js.undefined)
    
    @scala.inline
    def setNick(value: String): Self = this.set("nick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNick: Self = this.set("nick", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
    
    @scala.inline
    def setShow(value: String): Self = this.set("show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
  }
}
