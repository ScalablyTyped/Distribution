package typings
package stripeLib.stripeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object StripeNs {
  /**
    * Header options can either be a Connect Account Secret Key,
    * or a hash with one or more of these keys: idempotency_key, stripe_account, api_key
    */
  type HeaderOptions = IHeaderOptions | java.lang.String
  // Helper
  type IBankAccount = stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount
  type ICard = stripeLib.stripeMod.StripeNs.cardsNs.ICard
  /**
    * A filter on the list based on this object field. The value can
    * be a string with an integer Unix timestamp, or it can be a
    * dictionary with the following options:
    */
  type IDateFilter = java.lang.String | stripeLib.Anon_Lte
  type IResponseFn[R] = js.Function2[/* err */ IStripeError, /* value */ R, scala.Unit]
}
