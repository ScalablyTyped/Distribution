package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Avsfailure extends js.Object {
  /**
    * Whether or not Stripe should automatically decline charges with an
    * incorrect zip/postal code. This setting only applies if a card includes a
    * zip code and the bank specifically marks it as failed.
    */
  var avs_failure: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether or not Stripe should automatically decline charges with an
    * incorrect CVC. This setting only applies if a card includes a CVC and the
    * bank specifically marks it as failed.
    */
  var cvc_failure: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Avsfailure {
  @scala.inline
  def apply(
    avs_failure: js.UndefOr[scala.Boolean] = js.undefined,
    cvc_failure: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Avsfailure = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(avs_failure)) __obj.updateDynamic("avs_failure")(avs_failure)
    if (!js.isUndefined(cvc_failure)) __obj.updateDynamic("cvc_failure")(cvc_failure)
    __obj.asInstanceOf[Anon_Avsfailure]
  }
}

