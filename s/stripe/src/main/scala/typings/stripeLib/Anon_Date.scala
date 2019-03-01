package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Date extends js.Object {
  /**
    * The unix timestamp that Stripe’s terms of service were agreed to by the
    * account holder
    */
  var date: scala.Double
  /**
    * The IP address from which Stripe’s terms of service were agreed to by the account holder
    */
  var ip: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The user agent of the browser from which Stripe’s terms of service
    * were agreed to by the account holder
    */
  var user_agent: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Date {
  @scala.inline
  def apply(date: scala.Double, ip: java.lang.String = null, user_agent: java.lang.String = null): Anon_Date = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("date")(date)
    if (ip != null) __obj.updateDynamic("ip")(ip)
    if (user_agent != null) __obj.updateDynamic("user_agent")(user_agent)
    __obj.asInstanceOf[Anon_Date]
  }
}

