package typings
package stripeLib.stripeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Any Stripe source, including a bank account, credit/debit card, or less common "Source" types (see https://stripe.com/docs/api/sources/object). */
/* Rewritten from type alias, can be one of: 
  - stripeLib.stripeMod.cardsNs.ICard
  - stripeLib.stripeMod.bitcoinReceiversNs.IBitcoinReceiver
  - stripeLib.stripeMod.bankAccountsNs.IBankAccount
  - stripeLib.stripeMod.sourcesNs.ISource
*/
trait IStripeSource extends js.Object

