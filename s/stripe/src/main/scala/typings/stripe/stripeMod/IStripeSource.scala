package typings.stripe.stripeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Any Stripe source, including a bank account, credit/debit card, or less common "Source" types (see https://stripe.com/docs/api/sources/object). */
/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeMod.cards.ICard
  - typings.stripe.stripeMod.bitcoinReceivers.IBitcoinReceiver
  - typings.stripe.stripeMod.bankAccounts.IBankAccount
  - typings.stripe.stripeMod.sources.ISource
*/
trait IStripeSource extends js.Object

