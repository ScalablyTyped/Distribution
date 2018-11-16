package typings
package stripeLib.stripeMod.StripeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sourcesNs {
  /**
           * The source can either be a token, like the ones returned by our
           * Stripe.js, or a object containing a user's credit card details (with
           * the options shown below). You must provide a source if the
           * customer does not already have a valid source attached, and you
           * are subscribing the customer for a plan that is not free. Passing
           * source will create a new source object, make it the customer
           * default source, and delete the old customer default if one exists.
           * If you want to add an additional source to use with subscriptions,
           * instead use the card creation API to add the card and then the
           * customer update API to set it as the default. Whenever you
           * attach a card to a customer, Stripe will automatically validate the
           * card.
           */
  type ISourceCreationOptions = java.lang.String | stripeLib.stripeMod.StripeNs.cardsNs.ISourceCreationOptions
  /**
           * The source can either be a token, like the ones returned by our
           * Stripe.js, or a object containing a user's credit card details (with
           * the options shown below). You must provide a source if the
           * customer does not already have a valid source attached, and you
           * are subscribing the customer for a plan that is not free. Passing
           * source will create a new source object, make it the customer
           * default source, and delete the old customer default if one exists.
           * If you want to add an additional source to use with subscriptions,
           * instead use the card creation API to add the card and then the
           * customer update API to set it as the default. Whenever you
           * attach a card to a customer, Stripe will automatically validate the
           * card.
           */
  type ISourceCreationOptionsExtended = java.lang.String | stripeLib.stripeMod.StripeNs.cardsNs.ISourceCreationOptionsExtended
}
