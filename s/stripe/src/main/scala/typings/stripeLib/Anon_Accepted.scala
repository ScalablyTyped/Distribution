package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accepted extends js.Object {
  var date: js.UndefOr[scala.Double] = js.undefined
  var ip: js.UndefOr[java.lang.String] = js.undefined
  var offline: js.UndefOr[Anon_Contactemail] = js.undefined
  var online: js.UndefOr[Anon_DateIp] = js.undefined
  var status: stripeLib.stripeLibStrings.accepted | stripeLib.stripeLibStrings.refused
  var `type`: stripeLib.stripeLibStrings.online | stripeLib.stripeLibStrings.offline
  var user_agent: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Accepted {
  @scala.inline
  def apply(
    status: stripeLib.stripeLibStrings.accepted | stripeLib.stripeLibStrings.refused,
    `type`: stripeLib.stripeLibStrings.online | stripeLib.stripeLibStrings.offline,
    date: scala.Int | scala.Double = null,
    ip: java.lang.String = null,
    offline: Anon_Contactemail = null,
    online: Anon_DateIp = null,
    user_agent: java.lang.String = null
  ): Anon_Accepted = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (ip != null) __obj.updateDynamic("ip")(ip)
    if (offline != null) __obj.updateDynamic("offline")(offline)
    if (online != null) __obj.updateDynamic("online")(online)
    if (user_agent != null) __obj.updateDynamic("user_agent")(user_agent)
    __obj.asInstanceOf[Anon_Accepted]
  }
}

