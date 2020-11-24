package typings.ts3NodejsLibrary.responseTypesMod

import typings.ts3NodejsLibrary.teamSpeakQueryMod.TeamSpeakQuery.ResponseEntry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BanEntry extends ResponseEntry {
  
  var banid: String = js.native
  
  var created: Double = js.native
  
  var duration: Double = js.native
  
  var enforcements: Double = js.native
  
  var invokercldbid: String = js.native
  
  var invokername: String = js.native
  
  var invokeruid: String = js.native
  
  var ip: String = js.native
  
  var lastnickname: String = js.native
  
  var mytsid: String = js.native
  
  var name: String = js.native
  
  var reason: String = js.native
  
  var uid: String = js.native
}
object BanEntry {
  
  @scala.inline
  def apply(
    banid: String,
    created: Double,
    duration: Double,
    enforcements: Double,
    invokercldbid: String,
    invokername: String,
    invokeruid: String,
    ip: String,
    lastnickname: String,
    mytsid: String,
    name: String,
    reason: String,
    uid: String
  ): BanEntry = {
    val __obj = js.Dynamic.literal(banid = banid.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], enforcements = enforcements.asInstanceOf[js.Any], invokercldbid = invokercldbid.asInstanceOf[js.Any], invokername = invokername.asInstanceOf[js.Any], invokeruid = invokeruid.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], lastnickname = lastnickname.asInstanceOf[js.Any], mytsid = mytsid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[BanEntry]
  }
  
  @scala.inline
  implicit class BanEntryOps[Self <: BanEntry] (val x: Self) extends AnyVal {
    
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
    def setBanid(value: String): Self = this.set("banid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforcements(value: Double): Self = this.set("enforcements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvokercldbid(value: String): Self = this.set("invokercldbid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvokername(value: String): Self = this.set("invokername", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvokeruid(value: String): Self = this.set("invokeruid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastnickname(value: String): Self = this.set("lastnickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMytsid(value: String): Self = this.set("mytsid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUid(value: String): Self = this.set("uid", value.asInstanceOf[js.Any])
  }
}
