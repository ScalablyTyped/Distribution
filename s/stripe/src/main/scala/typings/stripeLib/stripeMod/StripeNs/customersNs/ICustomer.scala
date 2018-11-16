package typings
package stripeLib.stripeMod.StripeNs.customersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Customer objects allow you to perform recurring charges and track multiple charges that are associated
         * with the same customer. The API allows you to create, delete, and update your customers. You can
         * retrieve individual customers as well as a list of all your customers.
         */

trait ICustomer
  extends stripeLib.stripeMod.StripeNs.IResourceObject {
  /**
               * Current balance, if any, being stored on the customer's account. If negative, the customer has credit to apply to
               * the next invoice. If positive, the customer has an amount owed that will be added to the next invoice. The balance
               * does not refer to any unpaid invoices; it solely takes into account amounts that have yet to be successfully applied
               * to any invoice. This balance is only taken into account for recurring charges.
               */
  var account_balance: js.UndefOr[scala.Double] = js.undefined
  var cards: js.UndefOr[stripeLib.stripeMod.StripeNs.resourcesNs.CustomerCards] = js.undefined
  var created: scala.Double
  /**
               * The currency the customer can be charged in for recurring billing purposes (subscriptions, invoices, invoice items).
               */
  var currency: java.lang.String | scala.Null
  /**
               * ID of the default source attached to this customer. [Expandable]
               */
  var default_source: java.lang.String | stripeLib.stripeMod.StripeNs.cardsNs.ICard | stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiver | stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount | scala.Null
  /**
               * Whether or not the latest charge for the customer's latest invoice has failed
               */
  var delinquent: scala.Boolean
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Describes the current discount active on the customer, if there is one.
               */
  var discount: js.UndefOr[stripeLib.stripeMod.StripeNs.couponsNs.IDiscount] = js.undefined
  var email: js.UndefOr[java.lang.String] = js.undefined
  var livemode: scala.Boolean
  var metadata: stripeLib.stripeMod.StripeNs.IMetadata
  /**
               * Value is 'customer'
               */
  @JSName("object")
  var object_ICustomer: stripeLib.stripeLibStrings.customer
  /**
               * Shipping information associated with the customer.
               */
  var shipping: stripeLib.stripeMod.StripeNs.IShippingInformation | scala.Null
  /**
               * The customer’s payment sources, if any
               */
  var sources: js.UndefOr[
    stripeLib.stripeMod.StripeNs.IList[
      stripeLib.stripeMod.StripeNs.cardsNs.ICard | stripeLib.stripeMod.StripeNs.bitcoinReceiversNs.IBitcoinReceiver | stripeLib.stripeMod.StripeNs.bankAccountsNs.IBankAccount
    ]
  ] = js.undefined
  /**
               * The customer's current subscriptions, if any
               */
  var subscriptions: ICustomerSubscriptions
}

