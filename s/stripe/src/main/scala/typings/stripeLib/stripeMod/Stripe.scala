package typings
package stripeLib.stripeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stripe extends js.Object {
  var DEFAULT_API_VERSION: java.lang.String = js.native
  var DEFAULT_BASE_PATH: java.lang.String = js.native
  var DEFAULT_HOST: java.lang.String = js.native
  var DEFAULT_PORT: java.lang.String = js.native
  var DEFAULT_TIMEOUT: scala.Double = js.native
  var PACKAGE_VERSION: java.lang.String = js.native
  var StripeResource: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Stripe.StripeResource */ js.Any = js.native
  var USER_AGENT: stripeLib.Anon_Bindingsversion = js.native
  var USER_AGENT_SERIALIZED: java.lang.String = js.native
  var accounts: stripeLib.stripeMod.resourcesNs.Accounts = js.native
  var applicationFees: stripeLib.stripeMod.resourcesNs.ApplicationFees = js.native
  var balance: stripeLib.stripeMod.resourcesNs.Balance = js.native
  var bitcoinReceivers: stripeLib.stripeMod.resourcesNs.BitcoinReceivers = js.native
  var charges: stripeLib.stripeMod.resourcesNs.Charges = js.native
  var countrySpecs: stripeLib.stripeMod.resourcesNs.CountrySpecs = js.native
  var coupons: stripeLib.stripeMod.resourcesNs.Coupons = js.native
  var customers: stripeLib.stripeMod.resourcesNs.Customers = js.native
  var disputes: stripeLib.stripeMod.resourcesNs.Disputes = js.native
  var ephemeralKeys: stripeLib.stripeMod.resourcesNs.EphemeralKeys = js.native
  var events: stripeLib.stripeMod.resourcesNs.Events = js.native
  var fileUploads: stripeLib.stripeMod.resourcesNs.FileUploads = js.native
  var invoiceItems: stripeLib.stripeMod.resourcesNs.InvoiceItems = js.native
  var invoices: stripeLib.stripeMod.resourcesNs.Invoices = js.native
  var orders: stripeLib.stripeMod.resourcesNs.Orders = js.native
  var paymentIntents: stripeLib.stripeMod.resourcesNs.PaymentIntents = js.native
  var payouts: stripeLib.stripeMod.resourcesNs.Payouts = js.native
  var plans: stripeLib.stripeMod.resourcesNs.Plans = js.native
  var products: stripeLib.stripeMod.resourcesNs.Products = js.native
  /**
    * @deprecated
    */
  var recipientCards: stripeLib.stripeMod.resourcesNs.RecipientCards = js.native
  /**
    * @deprecated
    */
  var recipients: stripeLib.stripeMod.resourcesNs.Recipients = js.native
  var refunds: stripeLib.stripeMod.resourcesNs.Refunds = js.native
  var resources: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof Stripe.resources */ js.Any = js.native
  var skus: stripeLib.stripeMod.resourcesNs.SKUs = js.native
  var sources: stripeLib.stripeMod.resourcesNs.Sources = js.native
  var subscriptionItems: stripeLib.stripeMod.resourcesNs.SubscriptionItems = js.native
  var subscriptions: stripeLib.stripeMod.resourcesNs.Subscriptions = js.native
  var tokens: stripeLib.stripeMod.resourcesNs.Tokens = js.native
  var transfers: stripeLib.stripeMod.resourcesNs.Transfers = js.native
  var usageRecordSummaries: stripeLib.stripeMod.resourcesNs.UsageRecordSummaries = js.native
  var usageRecords: stripeLib.stripeMod.resourcesNs.UsageRecords = js.native
  var webhooks: stripeLib.stripeMod.resourcesNs.WebHooks = js.native
  def getClientUserAgent(response: js.Function1[/* userAgent */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def getConstant(c: java.lang.String): js.Any = js.native
  def getMaxNetworkRetries(): scala.Double = js.native
  def setApiKey(): scala.Unit = js.native
  def setApiKey(key: java.lang.String): scala.Unit = js.native
  def setApiVersion(): scala.Unit = js.native
  def setApiVersion(version: java.lang.String): scala.Unit = js.native
  def setHost(host: java.lang.String): scala.Unit = js.native
  def setHost(host: java.lang.String, port: java.lang.String): scala.Unit = js.native
  def setHost(host: java.lang.String, port: java.lang.String, protocol: java.lang.String): scala.Unit = js.native
  def setHost(host: java.lang.String, port: scala.Double): scala.Unit = js.native
  def setHost(host: java.lang.String, port: scala.Double, protocol: java.lang.String): scala.Unit = js.native
  def setHttpAgent(agent: java.lang.String): scala.Unit = js.native
  def setMaxNetworkRetries(maxNetworkRetries: scala.Double): scala.Unit = js.native
  def setPort(port: java.lang.String): scala.Unit = js.native
  def setPort(port: scala.Double): scala.Unit = js.native
  def setProtocol(protocol: java.lang.String): scala.Unit = js.native
  def setTimeout(): scala.Unit = js.native
  def setTimeout(timeout: scala.Double): scala.Unit = js.native
}

