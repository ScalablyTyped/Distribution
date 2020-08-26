package typings.stripeV3.stripe

import typings.stripeV3.stripeV3Strings.accepted
import typings.stripeV3.stripeV3Strings.offline
import typings.stripeV3.stripeV3Strings.online
import typings.stripeV3.stripeV3Strings.refused
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceMandateAcceptance extends js.Object {
  var date: Double = js.native
  var ip: js.UndefOr[String] = js.native
  var offline: js.UndefOr[OfflineAcceptanceMandate] = js.native
  var online: js.UndefOr[OnlineAcceptanceMandate] = js.native
  var status: accepted | refused = js.native
  var `type`: js.UndefOr[online | offline] = js.native
  var user_agent: js.UndefOr[String] = js.native
}

object SourceMandateAcceptance {
  @scala.inline
  def apply(date: Double, status: accepted | refused): SourceMandateAcceptance = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMandateAcceptance]
  }
  @scala.inline
  implicit class SourceMandateAcceptanceOps[Self <: SourceMandateAcceptance] (val x: Self) extends AnyVal {
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
    def setStatus(value: accepted | refused): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIp: Self = this.set("ip", js.undefined)
    @scala.inline
    def setOffline(value: OfflineAcceptanceMandate): Self = this.set("offline", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffline: Self = this.set("offline", js.undefined)
    @scala.inline
    def setOnline(value: OnlineAcceptanceMandate): Self = this.set("online", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnline: Self = this.set("online", js.undefined)
    @scala.inline
    def setType(value: online | offline): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUser_agent(value: String): Self = this.set("user_agent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUser_agent: Self = this.set("user_agent", js.undefined)
  }
  
}

