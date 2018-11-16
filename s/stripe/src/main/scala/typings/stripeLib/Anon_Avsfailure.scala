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

