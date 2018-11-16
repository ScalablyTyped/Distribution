package typings
package stripeLib.stripeMod.StripeNs.payoutsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IPayoutListOptions
  extends stripeLib.stripeMod.StripeNs.IListOptionsCreated {
  var arrival_date: js.UndefOr[java.lang.String | stripeLib.stripeMod.StripeNs.IDateFilter] = js.undefined
  var destination: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[
    stripeLib.stripeLibStrings.canceled | stripeLib.stripeLibStrings.failed | stripeLib.stripeLibStrings.paid | stripeLib.stripeLibStrings.pending
  ] = js.undefined
}

