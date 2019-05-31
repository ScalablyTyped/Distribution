package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateIpUseragent extends js.Object {
  var date: js.UndefOr[scala.Double] = js.undefined
  var ip: js.UndefOr[java.lang.String] = js.undefined
  var user_agent: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DateIpUseragent {
  @scala.inline
  def apply(
    date: scala.Int | scala.Double = null,
    ip: java.lang.String = null,
    user_agent: java.lang.String = null
  ): Anon_DateIpUseragent = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (ip != null) __obj.updateDynamic("ip")(ip)
    if (user_agent != null) __obj.updateDynamic("user_agent")(user_agent)
    __obj.asInstanceOf[Anon_DateIpUseragent]
  }
}

