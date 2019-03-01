package typings
package stripeLib.stripeMod.StripeNs.accountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILoginLink extends js.Object {
  var created: scala.Double
  var `object`: stripeLib.stripeLibStrings.login_link
  /**
    * A single-use login link for an Express account to access their Stripe dashboard.
    */
  var url: java.lang.String
}

object ILoginLink {
  @scala.inline
  def apply(created: scala.Double, `object`: stripeLib.stripeLibStrings.login_link, url: java.lang.String): ILoginLink = {
    val __obj = js.Dynamic.literal(`object` = `object`)
    __obj.updateDynamic("created")(created)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ILoginLink]
  }
}

