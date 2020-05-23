package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Avsfailure extends js.Object {
  /**
    * Whether Stripe automatically declines charges with an incorrect ZIP or
    * postal code. This setting only applies when a ZIP or postal code is
    * provided and they fail bank verification.
    */
  var avs_failure: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether Stripe automatically declines charges with an incorrect CVC.
    * This setting only applies when a CVC is provided and it fails bank
    * verification.
    */
  var cvc_failure: js.UndefOr[Boolean] = js.undefined
}

object Avsfailure {
  @scala.inline
  def apply(avs_failure: js.UndefOr[Boolean] = js.undefined, cvc_failure: js.UndefOr[Boolean] = js.undefined): Avsfailure = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(avs_failure)) __obj.updateDynamic("avs_failure")(avs_failure.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cvc_failure)) __obj.updateDynamic("cvc_failure")(cvc_failure.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Avsfailure]
  }
}

