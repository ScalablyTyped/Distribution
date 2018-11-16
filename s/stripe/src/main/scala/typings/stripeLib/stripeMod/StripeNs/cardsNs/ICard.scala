package typings
package stripeLib.stripeMod.StripeNs.cardsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * You can store multiple cards on a customer in order to charge the customer later. You
         * can also store multiple debit cards on a recipient in order to transfer to those cards later.
         */

trait ICard extends ICardHash {
  /**
               * The account this card belongs to. This attribute will not be in the
               * card object if the card belongs to a customer or recipient instead.
               * [Expandable]
               */
  var account: js.UndefOr[java.lang.String | stripeLib.stripeMod.StripeNs.accountsNs.IAccount] = js.undefined
  /**
               * Only applicable on accounts (not customers or recipients). The
               * card can be used as a transfer destination for funds in this
               * currency.
               */
  var currency: js.UndefOr[java.lang.String] = js.undefined
  /**
               * The customer that this card belongs to. This attribute will not be
               * in the card object if the card belongs to an account or recipient
               * instead.
               */
  var customer: js.UndefOr[
    java.lang.String | stripeLib.stripeMod.StripeNs.customersNs.ICustomer | scala.Null
  ] = js.undefined
  /**
               * Only applicable on accounts (not customers or recipients). This
               * indicates whether or not this card is the default external account
               * for its currency.
               */
  var default_for_currency: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * The recipient that this card belongs to. This attribute will not be
               * in the card object if the card belongs to a customer or account
               * instead. [Expandable]
               */
  var recipient: js.UndefOr[java.lang.String | stripeLib.stripeMod.StripeNs.recipientsNs.IRecipient] = js.undefined
}

