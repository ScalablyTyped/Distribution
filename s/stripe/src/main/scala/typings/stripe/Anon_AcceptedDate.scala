package typings.stripe

import typings.stripe.stripeStrings.accepted
import typings.stripe.stripeStrings.offline
import typings.stripe.stripeStrings.online
import typings.stripe.stripeStrings.refused
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AcceptedDate extends js.Object {
  var date: js.UndefOr[Double] = js.undefined
  var ip: js.UndefOr[String] = js.undefined
  var offline: js.UndefOr[Anon_Contactemail] = js.undefined
  var online: js.UndefOr[Anon_DateIpUseragent] = js.undefined
  var status: accepted | refused
  var `type`: online | offline
  var user_agent: js.UndefOr[String] = js.undefined
}

object Anon_AcceptedDate {
  @scala.inline
  def apply(
    status: accepted | refused,
    `type`: online | offline,
    date: Int | Double = null,
    ip: String = null,
    offline: Anon_Contactemail = null,
    online: Anon_DateIpUseragent = null,
    user_agent: String = null
  ): Anon_AcceptedDate = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (ip != null) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    if (offline != null) __obj.updateDynamic("offline")(offline.asInstanceOf[js.Any])
    if (online != null) __obj.updateDynamic("online")(online.asInstanceOf[js.Any])
    if (user_agent != null) __obj.updateDynamic("user_agent")(user_agent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AcceptedDate]
  }
}

