package typings.stripe.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import typings.node.httpMod.IncomingMessage
import typings.stripe.mod.Stripe
import typings.stripe.mod.Stripe.HttpAgent
import typings.stripe.mod.Stripe.HttpClient
import typings.stripe.mod.Stripe.HttpClientResponse
import typings.stripe.mod.Stripe.StripeConfig
import typings.stripe.mod.Stripe.StripeStreamResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Instantiable
  extends StObject
     with Instantiable2[/* apiKey */ String, /* config */ StripeConfig, Stripe] {
  
  val Account: TypeofAccountCapabilities = js.native
  
  val AccountCreateParams: TypeofAccountCreateParams = js.native
  
  val AccountLinkCreateParams: Any = js.native
  
  var AccountLinksResource: Instantiable0[typings.stripe.mod.Stripe.AccountLinksResource] = js.native
  
  val AccountUpdateParams: TypeofAccountUpdateParams = js.native
  
  var AccountsResource: Instantiable0[typings.stripe.mod.Stripe.AccountsResource] = js.native
  
  var ApplePayDomainsResource: Instantiable0[typings.stripe.mod.Stripe.ApplePayDomainsResource] = js.native
  
  var ApplicationFeesResource: Instantiable0[typings.stripe.mod.Stripe.ApplicationFeesResource] = js.native
  
  val Apps: TypeofApps = js.native
  
  val Balance: TypeofBalance = js.native
  
  var BalanceResource: Instantiable0[typings.stripe.mod.Stripe.BalanceResource] = js.native
  
  val BalanceTransaction: Any = js.native
  
  var BalanceTransactionsResource: Instantiable0[typings.stripe.mod.Stripe.BalanceTransactionsResource] = js.native
  
  val BankAccount: TypeofBankAccount = js.native
  
  val BillingPortal: TypeofBillingPortal = js.native
  
  val Capability: TypeofCapability = js.native
  
  val Card: Any = js.native
  
  val CashBalance: TypeofCashBalance = js.native
  
  val CashBalanceUpdateParams: TypeofCashBalanceUpdatePa = js.native
  
  val Charge: TypeofCharge = js.native
  
  val ChargeCaptureParams: Any = js.native
  
  val ChargeCreateParams: Any = js.native
  
  val ChargeUpdateParams: TypeofChargeUpdateParams = js.native
  
  var ChargesResource: Instantiable0[typings.stripe.mod.Stripe.ChargesResource] = js.native
  
  val Checkout: TypeofCheckout = js.native
  
  val CountrySpec: TypeofCountrySpec = js.native
  
  var CountrySpecsResource: Instantiable0[typings.stripe.mod.Stripe.CountrySpecsResource] = js.native
  
  val Coupon: Any = js.native
  
  val CouponCreateParams: Any = js.native
  
  val CouponUpdateParams: Any = js.native
  
  var CouponsResource: Instantiable0[typings.stripe.mod.Stripe.CouponsResource] = js.native
  
  val CreditNote: TypeofCreditNote = js.native
  
  val CreditNoteCreateParams: TypeofCreditNoteCreatePar = js.native
  
  val CreditNoteLineItem: TypeofCreditNoteLineItem = js.native
  
  val CreditNoteListPreviewLineItemsParams: TypeofCreditNoteListPrevi = js.native
  
  val CreditNotePreviewParams: TypeofCreditNotePreviewPa = js.native
  
  var CreditNotesResource: Instantiable0[typings.stripe.mod.Stripe.CreditNotesResource] = js.native
  
  val Customer: TypeofCustomer = js.native
  
  val CustomerBalanceTransaction: Any = js.native
  
  val CustomerCashBalanceTransaction: TypeofCustomerCashBalance = js.native
  
  val CustomerCreateFundingInstructionsParams: TypeofCustomerCreateFundi = js.native
  
  val CustomerCreateParams: TypeofCustomerCreateParam = js.native
  
  val CustomerListPaymentMethodsParams: Any = js.native
  
  val CustomerSourceUpdateParams: Any = js.native
  
  val CustomerUpdateParams: TypeofCustomerUpdateParam = js.native
  
  var CustomersResource: Instantiable0[typings.stripe.mod.Stripe.CustomersResource] = js.native
  
  val Dispute: Any = js.native
  
  val DisputeUpdateParams: Any = js.native
  
  var DisputesResource: Instantiable0[typings.stripe.mod.Stripe.DisputesResource] = js.native
  
  var EphemeralKeysResource: Instantiable0[typings.stripe.mod.Stripe.EphemeralKeysResource] = js.native
  
  val Event: TypeofEvent = js.native
  
  var EventsResource: Instantiable0[typings.stripe.mod.Stripe.EventsResource] = js.native
  
  var ExchangeRatesResource: Instantiable0[typings.stripe.mod.Stripe.ExchangeRatesResource] = js.native
  
  val ExternalAccountListParams: Any = js.native
  
  val ExternalAccountUpdateParams: TypeofExternalAccountUpda = js.native
  
  val File: Any = js.native
  
  var FileLinksResource: Instantiable0[typings.stripe.mod.Stripe.FileLinksResource] = js.native
  
  val FileListParams: Any = js.native
  
  var FilesResource: Instantiable0[typings.stripe.mod.Stripe.FilesResource] = js.native
  
  val FinancialConnections: TypeofFinancialConnection = js.native
  
  val FundingInstructions: TypeofFundingInstructions = js.native
  
  val Identity: TypeofIdentity = js.native
  
  val Invoice: TypeofInvoice = js.native
  
  val InvoiceCreateParams: TypeofInvoiceCreateParams = js.native
  
  val InvoiceItem: Any = js.native
  
  val InvoiceItemCreateParams: TypeofInvoiceItemCreatePa = js.native
  
  val InvoiceItemUpdateParams: TypeofInvoiceItemUpdatePa = js.native
  
  var InvoiceItemsResource: Instantiable0[typings.stripe.mod.Stripe.InvoiceItemsResource] = js.native
  
  val InvoiceLineItem: TypeofInvoiceLineItem = js.native
  
  val InvoiceListParams: Any = js.native
  
  val InvoiceListUpcomingLinesParams: TypeofInvoiceListUpcoming = js.native
  
  val InvoiceRetrieveUpcomingParams: TypeofInvoiceRetrieveUpco = js.native
  
  val InvoiceUpdateParams: TypeofInvoiceUpdateParams = js.native
  
  var InvoicesResource: Instantiable0[typings.stripe.mod.Stripe.InvoicesResource] = js.native
  
  val Issuing: TypeofIssuing = js.native
  
  val LineItem: TypeofLineItemTax = js.native
  
  val Mandate: TypeofMandateCustomerAcceptance = js.native
  
  var MandatesResource: Instantiable0[typings.stripe.mod.Stripe.MandatesResource] = js.native
  
  val OAuthAuthorizeUrlParams: Any = js.native
  
  var OAuthResource: Instantiable0[typings.stripe.mod.Stripe.OAuthResource] = js.native
  
  val PaymentIntent: TypeofPaymentIntent = js.native
  
  val PaymentIntentCancelParams: Any = js.native
  
  val PaymentIntentCaptureParams: Any = js.native
  
  val PaymentIntentConfirmParams: TypeofPaymentIntentConfir = js.native
  
  val PaymentIntentCreateParams: TypeofPaymentIntentCreate = js.native
  
  val PaymentIntentIncrementAuthorizationParams: Any = js.native
  
  val PaymentIntentUpdateParams: TypeofPaymentIntentUpdate = js.native
  
  var PaymentIntentsResource: Instantiable0[typings.stripe.mod.Stripe.PaymentIntentsResource] = js.native
  
  val PaymentLink: TypeofPaymentLink = js.native
  
  val PaymentLinkCreateParams: TypeofPaymentLinkCreatePa = js.native
  
  val PaymentLinkUpdateParams: TypeofPaymentLinkUpdatePa = js.native
  
  var PaymentLinksResource: Instantiable0[typings.stripe.mod.Stripe.PaymentLinksResource] = js.native
  
  val PaymentMethod: TypeofPaymentMethod = js.native
  
  val PaymentMethodCreateParams: TypeofPaymentMethodCreate = js.native
  
  val PaymentMethodListParams: Any = js.native
  
  val PaymentMethodUpdateParams: TypeofPaymentMethodUpdate = js.native
  
  var PaymentMethodsResource: Instantiable0[typings.stripe.mod.Stripe.PaymentMethodsResource] = js.native
  
  val Payout: Any = js.native
  
  val PayoutCreateParams: Any = js.native
  
  var PayoutsResource: Instantiable0[typings.stripe.mod.Stripe.PayoutsResource] = js.native
  
  val Person: TypeofPersonFutureRequirements = js.native
  
  val PersonCreateParams: TypeofPersonCreateParams = js.native
  
  val PersonListParams: Any = js.native
  
  val PersonUpdateParams: TypeofPersonUpdateParams = js.native
  
  val Plan: TypeofPlan = js.native
  
  val PlanCreateParams: TypeofPlanCreateParams = js.native
  
  var PlansResource: Instantiable0[typings.stripe.mod.Stripe.PlansResource] = js.native
  
  val Price: TypeofPrice = js.native
  
  val PriceCreateParams: TypeofPriceCreateParams = js.native
  
  val PriceListParams: TypeofPriceListParams = js.native
  
  val PriceUpdateParams: TypeofPriceUpdateParams = js.native
  
  var PricesResource: Instantiable0[typings.stripe.mod.Stripe.PricesResource] = js.native
  
  val Product: Any = js.native
  
  val ProductCreateParams: TypeofProductCreateParams = js.native
  
  val ProductListParams: Any = js.native
  
  val ProductUpdateParams: Any = js.native
  
  var ProductsResource: Instantiable0[typings.stripe.mod.Stripe.ProductsResource] = js.native
  
  val PromotionCode: TypeofPromotionCode = js.native
  
  val PromotionCodeCreateParams: TypeofPromotionCodeCreate = js.native
  
  val PromotionCodeUpdateParams: TypeofPromotionCodeUpdate = js.native
  
  var PromotionCodesResource: Instantiable0[typings.stripe.mod.Stripe.PromotionCodesResource] = js.native
  
  val Quote: TypeofQuote = js.native
  
  val QuoteCreateParams: TypeofQuoteCreateParams = js.native
  
  val QuoteListParams: Any = js.native
  
  val QuoteUpdateParams: TypeofQuoteUpdateParams = js.native
  
  var QuotesResource: Instantiable0[typings.stripe.mod.Stripe.QuotesResource] = js.native
  
  val Radar: TypeofRadar = js.native
  
  val Refund: TypeofRefund = js.native
  
  val RefundCreateParams: Any = js.native
  
  var RefundsResource: Instantiable0[typings.stripe.mod.Stripe.RefundsResource] = js.native
  
  val Reporting: TypeofReporting = js.native
  
  val Review: Any = js.native
  
  var ReviewsResource: Instantiable0[typings.stripe.mod.Stripe.ReviewsResource] = js.native
  
  val SetupAttempt: TypeofSetupAttempt = js.native
  
  var SetupAttemptsResource: Instantiable0[typings.stripe.mod.Stripe.SetupAttemptsResource] = js.native
  
  val SetupIntent: TypeofSetupIntent = js.native
  
  val SetupIntentCancelParams: Any = js.native
  
  val SetupIntentConfirmParams: TypeofSetupIntentConfirmP = js.native
  
  val SetupIntentCreateParams: TypeofSetupIntentCreatePa = js.native
  
  val SetupIntentUpdateParams: TypeofSetupIntentUpdatePa = js.native
  
  var SetupIntentsResource: Instantiable0[typings.stripe.mod.Stripe.SetupIntentsResource] = js.native
  
  val ShippingRate: TypeofShippingRate = js.native
  
  val ShippingRateCreateParams: TypeofShippingRateCreateP = js.native
  
  val ShippingRateUpdateParams: TypeofShippingRateUpdateP = js.native
  
  var ShippingRatesResource: Instantiable0[typings.stripe.mod.Stripe.ShippingRatesResource] = js.native
  
  val Sigma: TypeofSigma = js.native
  
  var Signature: Instantiable0[typings.stripe.mod.Stripe.Signature] = js.native
  
  val Source: TypeofSource = js.native
  
  val SourceCreateParams: TypeofSourceCreateParams = js.native
  
  val SourceMandateNotification: Any = js.native
  
  val SourceTransaction: Any = js.native
  
  val SourceUpdateParams: TypeofSourceUpdateParams = js.native
  
  var SourcesResource: Instantiable0[typings.stripe.mod.Stripe.SourcesResource] = js.native
  
  var StripeResource: TypeofStripeResource = js.native
  
  val Subscription: TypeofSubscription = js.native
  
  val SubscriptionCancelParams: TypeofSubscriptionCancelP = js.native
  
  val SubscriptionCreateParams: TypeofSubscriptionCreateP = js.native
  
  val SubscriptionDeleteParams: TypeofSubscriptionDeleteP = js.native
  
  val SubscriptionItem: Any = js.native
  
  val SubscriptionItemCreateParams: TypeofSubscriptionItemCre = js.native
  
  val SubscriptionItemDeleteParams: Any = js.native
  
  val SubscriptionItemUpdateParams: TypeofSubscriptionItemUpd = js.native
  
  var SubscriptionItemsResource: Instantiable0[typings.stripe.mod.Stripe.SubscriptionItemsResource] = js.native
  
  val SubscriptionListParams: Any = js.native
  
  val SubscriptionResumeParams: Any = js.native
  
  val SubscriptionSchedule: TypeofSubscriptionSchedulDefaultSettings = js.native
  
  val SubscriptionScheduleCreateParams: TypeofSubscriptionSchedul = js.native
  
  val SubscriptionScheduleUpdateParams: TypeofSubscriptionSchedul = js.native
  
  var SubscriptionSchedulesResource: Instantiable0[typings.stripe.mod.Stripe.SubscriptionSchedulesResource] = js.native
  
  val SubscriptionUpdateParams: TypeofSubscriptionUpdateP = js.native
  
  var SubscriptionsResource: Instantiable0[typings.stripe.mod.Stripe.SubscriptionsResource] = js.native
  
  val Tax: TypeofTax = js.native
  
  var TaxCodesResource: Instantiable0[typings.stripe.mod.Stripe.TaxCodesResource] = js.native
  
  val TaxId: TypeofTaxId = js.native
  
  val TaxIdCreateParams: Any = js.native
  
  val TaxRate: Any = js.native
  
  val TaxRateCreateParams: Any = js.native
  
  val TaxRateUpdateParams: Any = js.native
  
  var TaxRatesResource: Instantiable0[typings.stripe.mod.Stripe.TaxRatesResource] = js.native
  
  val Terminal: TypeofTerminal = js.native
  
  val TestHelpers: TypeofTestHelpers = js.native
  
  val TokenCreateParams: TypeofTokenCreateParams = js.native
  
  var TokensResource: Instantiable0[typings.stripe.mod.Stripe.TokensResource] = js.native
  
  val Topup: Any = js.native
  
  val TopupListParams: Any = js.native
  
  var TopupsResource: Instantiable0[typings.stripe.mod.Stripe.TopupsResource] = js.native
  
  val TransferCreateParams: Any = js.native
  
  var TransfersResource: Instantiable0[typings.stripe.mod.Stripe.TransfersResource] = js.native
  
  val Treasury: TypeofTreasuryCreditReversal = js.native
  
  val UsageRecordCreateParams: Any = js.native
  
  val UsageRecordSummary: Any = js.native
  
  val WebhookEndpointCreateParams: Any = js.native
  
  val WebhookEndpointUpdateParams: Any = js.native
  
  var WebhookEndpointsResource: Instantiable0[typings.stripe.mod.Stripe.WebhookEndpointsResource] = js.native
  
  var Webhooks: Instantiable0[typings.stripe.mod.Stripe.Webhooks] = js.native
  
  def createFetchHttpClient(): HttpClient[
    HttpClientResponse[
      /**
    * The response type cannot be specified without pulling in DOM types.
    * This corresponds to ReturnType<WindowOrWorkerGlobalScope['fetch']>
    * for applications which pull in DOM types.
    */
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  Any, 
      /**
    * The stream type cannot be specified without pulling in DOM types.
    * This corresponds to ReadableStream<Uint8Array> for applications which
    * pull in DOM types.
    */
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  Any
    ]
  ] = js.native
  def createFetchHttpClient(/** When specified, interface should match the Web Fetch API function. */
  fetchFn: js.Function): HttpClient[
    HttpClientResponse[
      /**
    * The response type cannot be specified without pulling in DOM types.
    * This corresponds to ReturnType<WindowOrWorkerGlobalScope['fetch']>
    * for applications which pull in DOM types.
    */
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  Any, 
      /**
    * The stream type cannot be specified without pulling in DOM types.
    * This corresponds to ReadableStream<Uint8Array> for applications which
    * pull in DOM types.
    */
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  Any
    ]
  ] = js.native
  
  def createNodeCryptoProvider(): typings.stripe.mod.Stripe.CryptoProvider = js.native
  
  def createNodeHttpClient(): HttpClient[HttpClientResponse[IncomingMessage, StripeStreamResponse]] = js.native
  def createNodeHttpClient(agent: HttpAgent): HttpClient[HttpClientResponse[IncomingMessage, StripeStreamResponse]] = js.native
  
  def createSubtleCryptoProvider(): typings.stripe.mod.Stripe.CryptoProvider = js.native
  def createSubtleCryptoProvider(
    /**
    * The SubtleCrypto type cannot be specified without pulling in DOM types.
    * This corresponds to WindowOrWorkerGlobalScope['crypto']['subtle'] for
    * applications which pull in DOM types.
    */
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  subtleCrypto: Any
  ): typings.stripe.mod.Stripe.CryptoProvider = js.native
  
  val errors: Typeoferrors = js.native
}
