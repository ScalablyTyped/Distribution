package typings.stripeV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeServerCheckoutOptions extends js.Object {
  var sessionId: String = js.native
}

object StripeServerCheckoutOptions {
  @scala.inline
  def apply(sessionId: String): StripeServerCheckoutOptions = {
    val __obj = js.Dynamic.literal(sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeServerCheckoutOptions]
  }
  @scala.inline
  implicit class StripeServerCheckoutOptionsOps[Self <: StripeServerCheckoutOptions] (val x: Self) extends AnyVal {
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
    def setSessionId(value: String): Self = this.set("sessionId", value.asInstanceOf[js.Any])
  }
  
}

