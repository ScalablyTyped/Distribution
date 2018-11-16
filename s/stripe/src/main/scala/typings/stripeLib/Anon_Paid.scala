package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Paid extends js.Object {
  /**
                   * A filter on the list based on the object canceled field. The value can be a string with an integer Unix timestamp,
                   * or it can be a dictionary with the following options:
                   */
  var canceled: js.UndefOr[stripeLib.stripeMod.StripeNs.IDateFilter] = js.undefined
  /**
                   * A filter on the list based on the object fulfilled field. The value can be a string with an integer Unix timestamp,
                   * or it can be a dictionary with the following options:
                   */
  var fulfilled: js.UndefOr[stripeLib.stripeMod.StripeNs.IDateFilter] = js.undefined
  /**
                   * A filter on the list based on the object paid field. The value can be a string with an integer Unix timestamp,
                   * or it can be a dictionary with the following options:
                   */
  var paid: js.UndefOr[stripeLib.stripeMod.StripeNs.IDateFilter] = js.undefined
  /**
                   * A filter on the list based on the object returned field. The value can be a string with an integer Unix timestamp,
                   * or it can be a dictionary with the following options:
                   */
  var returned: js.UndefOr[stripeLib.stripeMod.StripeNs.IDateFilter] = js.undefined
}

