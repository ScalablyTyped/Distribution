package typings.stripe.mod.accounts

import typings.stripe.stripeStrings.login_link
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILoginLink extends js.Object {
  var created: Double = js.native
  var `object`: login_link = js.native
  /**
    * A single-use login link for an Express account to access their Stripe dashboard.
    */
  var url: String = js.native
}

object ILoginLink {
  @scala.inline
  def apply(created: Double, `object`: login_link, url: String): ILoginLink = {
    val __obj = js.Dynamic.literal(created = created.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILoginLink]
  }
  @scala.inline
  implicit class ILoginLinkOps[Self <: ILoginLink] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setObject(value: login_link): Self = this.set("object", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

