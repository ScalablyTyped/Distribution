package typings.stripeV3.stripe.elements

import typings.stripeV3.stripeV3Strings.`light-outline`
import typings.stripeV3.stripeV3Strings.buy
import typings.stripeV3.stripeV3Strings.dark
import typings.stripeV3.stripeV3Strings.default
import typings.stripeV3.stripeV3Strings.donate
import typings.stripeV3.stripeV3Strings.light
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentRequestButtonStyleOptions extends js.Object {
  var height: String = js.native
  var theme: dark | light | `light-outline` = js.native
  var `type`: js.UndefOr[default | donate | buy] = js.native
}

object PaymentRequestButtonStyleOptions {
  @scala.inline
  def apply(height: String, theme: dark | light | `light-outline`): PaymentRequestButtonStyleOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentRequestButtonStyleOptions]
  }
  @scala.inline
  implicit class PaymentRequestButtonStyleOptionsOps[Self <: PaymentRequestButtonStyleOptions] (val x: Self) extends AnyVal {
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
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setTheme(value: dark | light | `light-outline`): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: default | donate | buy): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

