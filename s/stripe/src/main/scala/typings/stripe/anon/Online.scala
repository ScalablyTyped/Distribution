package typings.stripe.anon

import typings.stripe.stripeStrings.accepted
import typings.stripe.stripeStrings.offline
import typings.stripe.stripeStrings.online
import typings.stripe.stripeStrings.refused
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Online extends js.Object {
  var date: js.UndefOr[Double] = js.undefined
  var ip: js.UndefOr[String] = js.undefined
  var offline: js.UndefOr[Contactemail] = js.undefined
  var online: js.UndefOr[Useragent] = js.undefined
  var status: accepted | refused
  var `type`: online | offline
  var user_agent: js.UndefOr[String] = js.undefined
}

object Online {
  @scala.inline
  def apply(
    status: accepted | refused,
    `type`: online | offline,
    date: js.UndefOr[Double] = js.undefined,
    ip: String = null,
    offline: Contactemail = null,
    online: Useragent = null,
    user_agent: String = null
  ): Online = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(date)) __obj.updateDynamic("date")(date.get.asInstanceOf[js.Any])
    if (ip != null) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    if (offline != null) __obj.updateDynamic("offline")(offline.asInstanceOf[js.Any])
    if (online != null) __obj.updateDynamic("online")(online.asInstanceOf[js.Any])
    if (user_agent != null) __obj.updateDynamic("user_agent")(user_agent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Online]
  }
}

