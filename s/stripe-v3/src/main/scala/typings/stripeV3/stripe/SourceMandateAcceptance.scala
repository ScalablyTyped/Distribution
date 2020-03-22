package typings.stripeV3.stripe

import typings.stripeV3.stripeV3Strings.accepted
import typings.stripeV3.stripeV3Strings.offline
import typings.stripeV3.stripeV3Strings.online
import typings.stripeV3.stripeV3Strings.refused
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceMandateAcceptance extends js.Object {
  var date: Double
  var ip: js.UndefOr[String] = js.undefined
  var offline: js.UndefOr[OfflineAcceptanceMandate] = js.undefined
  var online: js.UndefOr[OnlineAcceptanceMandate] = js.undefined
  var status: accepted | refused
  var `type`: js.UndefOr[online | offline] = js.undefined
  var user_agent: js.UndefOr[String] = js.undefined
}

object SourceMandateAcceptance {
  @scala.inline
  def apply(
    date: Double,
    status: accepted | refused,
    ip: String = null,
    offline: OfflineAcceptanceMandate = null,
    online: OnlineAcceptanceMandate = null,
    `type`: online | offline = null,
    user_agent: String = null
  ): SourceMandateAcceptance = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (ip != null) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    if (offline != null) __obj.updateDynamic("offline")(offline.asInstanceOf[js.Any])
    if (online != null) __obj.updateDynamic("online")(online.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (user_agent != null) __obj.updateDynamic("user_agent")(user_agent.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceMandateAcceptance]
  }
}

