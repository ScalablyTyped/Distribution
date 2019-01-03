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
    * Only return transfers with the specified transfer group.
    */
  var transfer_group: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

