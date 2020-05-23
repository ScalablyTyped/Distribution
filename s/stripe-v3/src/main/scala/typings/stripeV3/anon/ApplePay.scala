package typings.stripeV3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplePay extends js.Object {
  var applePay: js.UndefOr[Boolean] = js.undefined
}

object ApplePay {
  @scala.inline
  def apply(applePay: js.UndefOr[Boolean] = js.undefined): ApplePay = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(applePay)) __obj.updateDynamic("applePay")(applePay.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePay]
  }
}

