package typings.stripeV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeOptions extends js.Object {
  var betas: js.UndefOr[js.Array[String]] = js.native
  var locale: js.UndefOr[String] = js.native
  var stripeAccount: js.UndefOr[String] = js.native
}

object StripeOptions {
  @scala.inline
  def apply(): StripeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StripeOptions]
  }
  @scala.inline
  implicit class StripeOptionsOps[Self <: StripeOptions] (val x: Self) extends AnyVal {
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
    def setBetasVarargs(value: String*): Self = this.set("betas", js.Array(value :_*))
    @scala.inline
    def setBetas(value: js.Array[String]): Self = this.set("betas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBetas: Self = this.set("betas", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setStripeAccount(value: String): Self = this.set("stripeAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStripeAccount: Self = this.set("stripeAccount", js.undefined)
  }
  
}

