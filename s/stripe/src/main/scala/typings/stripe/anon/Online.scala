package typings.stripe.anon

import typings.stripe.stripeStrings.accepted
import typings.stripe.stripeStrings.offline
import typings.stripe.stripeStrings.online
import typings.stripe.stripeStrings.refused
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Online extends js.Object {
  
  var date: js.UndefOr[Double] = js.native
  
  var ip: js.UndefOr[String] = js.native
  
  var offline: js.UndefOr[Contactemail] = js.native
  
  var online: js.UndefOr[Useragent] = js.native
  
  var status: accepted | refused = js.native
  
  var `type`: online | offline = js.native
  
  var user_agent: js.UndefOr[String] = js.native
}
object Online {
  
  @scala.inline
  def apply(status: accepted | refused, `type`: online | offline): Online = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Online]
  }
  
  @scala.inline
  implicit class OnlineOps[Self <: Online] (val x: Self) extends AnyVal {
    
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
    def setStatus(value: accepted | refused): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: online | offline): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: Double): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIp: Self = this.set("ip", js.undefined)
    
    @scala.inline
    def setOffline(value: Contactemail): Self = this.set("offline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffline: Self = this.set("offline", js.undefined)
    
    @scala.inline
    def setOnline(value: Useragent): Self = this.set("online", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnline: Self = this.set("online", js.undefined)
    
    @scala.inline
    def setUser_agent(value: String): Self = this.set("user_agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser_agent: Self = this.set("user_agent", js.undefined)
  }
}
