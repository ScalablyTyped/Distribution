package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDate extends js.Object {
  /**
    * The unix timestamp that Stripe’s terms of service were agreed to by the
    * account holder
    */
  var date: Double
  /**
    * The IP address from which Stripe’s terms of service were agreed to by the account holder
    */
  var ip: js.UndefOr[String] = js.undefined
  /**
    * The user agent of the browser from which Stripe’s terms of service
    * were agreed to by the account holder
    */
  var user_agent: js.UndefOr[String] = js.undefined
}

object AnonDate {
  @scala.inline
  def apply(date: Double, ip: String = null, user_agent: String = null): AnonDate = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    if (ip != null) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    if (user_agent != null) __obj.updateDynamic("user_agent")(user_agent.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDate]
  }
}

