package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateIpUseragent extends js.Object {
  var date: js.UndefOr[Double] = js.undefined
  var ip: js.UndefOr[String] = js.undefined
  var user_agent: js.UndefOr[String] = js.undefined
}

object Anon_DateIpUseragent {
  @scala.inline
  def apply(date: Int | Double = null, ip: String = null, user_agent: String = null): Anon_DateIpUseragent = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (ip != null) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    if (user_agent != null) __obj.updateDynamic("user_agent")(user_agent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DateIpUseragent]
  }
}

