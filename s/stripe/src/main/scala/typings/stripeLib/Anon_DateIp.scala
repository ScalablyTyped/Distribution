package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateIp extends js.Object {
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

