package typings.stripe.mod.accounts

import typings.stripe.stripeStrings.login_link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILoginLink extends js.Object {
  var created: Double
  var `object`: login_link
  /**
    * A single-use login link for an Express account to access their Stripe dashboard.
    */
  var url: String
}

object ILoginLink {
  @scala.inline
  def apply(created: Double, `object`: login_link, url: String): ILoginLink = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoginLink]
  }
}

