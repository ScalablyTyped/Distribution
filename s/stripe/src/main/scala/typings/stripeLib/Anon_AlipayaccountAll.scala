package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AlipayaccountAll extends js.Object {
  /**
    * Return charges that match this source type string. Available options are
    * "all", "alipay_account", "bitcoin_receiver", or "card".
    */
  var `object`: stripeLib.stripeLibStrings.all | stripeLib.stripeLibStrings.alipay_account | stripeLib.stripeLibStrings.bitcoin_receiver | stripeLib.stripeLibStrings.card
}

object Anon_AlipayaccountAll {
  @scala.inline
  def apply(
    `object`: stripeLib.stripeLibStrings.all | stripeLib.stripeLibStrings.alipay_account | stripeLib.stripeLibStrings.bitcoin_receiver | stripeLib.stripeLibStrings.card
  ): Anon_AlipayaccountAll = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AlipayaccountAll]
  }
}

