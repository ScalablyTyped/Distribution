package typings
package stripeLib.stripeMod.StripeNs.accountsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IExternalAccountCreationOptions
  extends stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata {
  /**
               * Only applicable on accounts (not customers or recipients). If you set this to true (or if this is the first external account being added
               * in this currency) this card will become the default external account for its currency.
               */
  var default_for_currency: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * When adding a card to a customer, the parameter name is source. When
               * adding to an account, the parameter name is external_account. The
               * value can either be a token, like the ones returned by our Stripe.js, or a
               * dictionary containing a user’s credit card details (with the options shown
               * below). Stripe will automatically validate the card.
               */
  var external_account: java.lang.String
}

