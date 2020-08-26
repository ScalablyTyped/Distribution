package typings.stripeV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnlineAcceptanceMandate extends js.Object {
  var date: Double = js.native
  var ip: String = js.native
  var user_agent: String = js.native
}

object OnlineAcceptanceMandate {
  @scala.inline
  def apply(date: Double, ip: String, user_agent: String): OnlineAcceptanceMandate = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], user_agent = user_agent.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnlineAcceptanceMandate]
  }
  @scala.inline
  implicit class OnlineAcceptanceMandateOps[Self <: OnlineAcceptanceMandate] (val x: Self) extends AnyVal {
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
    def setDate(value: Double): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser_agent(value: String): Self = this.set("user_agent", value.asInstanceOf[js.Any])
  }
  
}

