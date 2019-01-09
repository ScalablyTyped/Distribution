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
  var StripeResource: org.scalablytyped.runtime.Instantiable2[
    /* stripe */ Stripe, 
    /* urlData */ js.Any, 
    stripeLib.stripeMod.StripeNs.StripeResource
  ] = js.native
  var USER_AGENT: stripeLib.Anon_Bindingsversion = js.native
  var USER_AGENT_SERIALIZED: java.lang.String = js.native
  var accounts: stripeLib.stripeMod.StripeNs.resourcesNs.Accounts = js.native
  var applicationFees: stripeLib.stripeMod.StripeNs.resourcesNs.ApplicationFees = js.native
  var balance: stripeLib.stripeMod.StripeNs.resourcesNs.Balance = js.native
  var bitcoinReceivers: stripeLib.stripeMod.StripeNs.resourcesNs.BitcoinReceivers = js.native
  var charges: stripeLib.stripeMod.StripeNs.resourcesNs.Charges = js.native
  var countrySpecs: stripeLib.stripeMod.StripeNs.resourcesNs.CountrySpecs = js.native
  var coupons: stripeLib.stripeMod.StripeNs.resourcesNs.Coupons = js.native
  var customers: stripeLib.stripeMod.StripeNs.resourcesNs.Customers = js.native
  var disputes: stripeLib.stripeMod.StripeNs.resourcesNs.Disputes = js.native
  var ephemeralKeys: stripeLib.stripeMod.StripeNs.resourcesNs.EphemeralKeys = js.native
  var events: stripeLib.stripeMod.StripeNs.resourcesNs.Events = js.native
  var fileUploads: stripeLib.stripeMod.StripeNs.resourcesNs.FileUploads = js.native
  var invoiceItems: stripeLib.stripeMod.StripeNs.resourcesNs.InvoiceItems = js.native
  var invoices: stripeLib.stripeMod.StripeNs.resourcesNs.Invoices = js.native
  var orders: stripeLib.stripeMod.StripeNs.resourcesNs.Orders = js.native
  var payouts: stripeLib.stripeMod.StripeNs.resourcesNs.Payouts = js.native
  var plans: stripeLib.stripeMod.StripeNs.resourcesNs.Plans = js.native
  var products: stripeLib.stripeMod.StripeNs.resourcesNs.Products = js.native
  /**
    * @deprecated
    */
  var recipientCards: stripeLib.stripeMod.StripeNs.resourcesNs.RecipientCards = js.native
  /**
    * @deprecated
    */
  var recipients: stripeLib.stripeMod.StripeNs.resourcesNs.Recipients = js.native
  var refunds: stripeLib.stripeMod.StripeNs.resourcesNs.Refunds = js.native
  var resources: stripeLib.Anon_Accounts = js.native
  var skus: stripeLib.stripeMod.StripeNs.resourcesNs.SKUs = js.native
  var subscriptionItems: stripeLib.stripeMod.StripeNs.resourcesNs.SubscriptionItems = js.native
  var subscriptions: stripeLib.stripeMod.StripeNs.resourcesNs.Subscriptions = js.native
  var tokens: stripeLib.stripeMod.StripeNs.resourcesNs.Tokens = js.native
  var transfers: stripeLib.stripeMod.StripeNs.resourcesNs.Transfers = js.native
  var usageRecordSummarys: stripeLib.stripeMod.StripeNs.resourcesNs.UsageRecordSummarys = js.native
  var usageRecords: stripeLib.stripeMod.StripeNs.resourcesNs.UsageRecords = js.native
  var webhooks: stripeLib.stripeMod.StripeNs.resourcesNs.WebHooks = js.native
  def getClientUserAgent(response: js.Function1[/* userAgent */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def getConstant(c: java.lang.String): js.Any = js.native
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
  def setPort(port: java.lang.String): scala.Unit = js.native
  def setPort(port: scala.Double): scala.Unit = js.native
  def setProtocol(protocol: java.lang.String): scala.Unit = js.native
  def setTimeout(): scala.Unit = js.native
  def setTimeout(timeout: scala.Double): scala.Unit = js.native
}

