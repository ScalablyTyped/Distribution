package typings
package stripeLib.stripeMod.StripeNs.transfersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITransferListOptions
  extends stripeLib.stripeMod.StripeNs.IListOptionsCreated {
  var date: js.UndefOr[stripeLib.stripeMod.StripeNs.IDateFilter] = js.undefined
  /**
    * Only return transfers for the destination specified by this
    * account ID.
    */
  var destination: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Only return transfers for the recipient specified by this
    * recipient ID.
    */
  var recipient: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Only return transfers that have the given status:
    * pending, paid, failed, in_transit, or canceled.
    */
  var status: Statuses
}

