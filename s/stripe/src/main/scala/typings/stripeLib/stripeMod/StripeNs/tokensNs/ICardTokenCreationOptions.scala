package typings
package stripeLib.stripeMod.StripeNs.tokensNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ICardTokenCreationOptions extends ITokenCreationOptionsBase {
  /**
               * The card this token will represent. If you also pass in a customer,
               * the card must be the ID of a card belonging to the customer.
               * Otherwise, if you do not pass a customer, a object containing a
               * user's credit card details, with the options described below.
               */
  var card: stripeLib.stripeMod.StripeNs.sourcesNs.ISourceCreationOptions
}

