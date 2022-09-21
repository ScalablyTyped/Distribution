package typings.stripe.mod

import org.scalablytyped.runtime.StringDictionary
import typings.stripe.anon.Instantiable
import typings.stripe.anon.StripeRawErrortypeRawErro
import typings.stripe.anon.StripeRawErrortypeapierro
import typings.stripe.anon.StripeRawErrortypeauthent
import typings.stripe.anon.StripeRawErrortypecarderr
import typings.stripe.anon.StripeRawErrortypeidempot
import typings.stripe.anon.StripeRawErrortypeinvalid
import typings.stripe.anon.StripeRawErrortypeinvalidCharge
import typings.stripe.anon.StripeRawErrortyperatelim
import typings.stripe.mod.Stripe.CryptoProvider
import typings.stripe.mod.Stripe.RawErrorType
import typings.stripe.mod.Stripe.StripeRawError
import typings.stripe.stripeStrings.api_error
import typings.stripe.stripeStrings.authentication_error
import typings.stripe.stripeStrings.card_error
import typings.stripe.stripeStrings.idempotency_error
import typings.stripe.stripeStrings.invalid_grant
import typings.stripe.stripeStrings.invalid_request_error
import typings.stripe.stripeStrings.rate_limit_error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stripe", JSImport.Default)
@js.native
open class default protected () extends Stripe {
  def this(
    apiKey: String,
    config: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Stripe.StripeConfig */ Any
  ) = this()
}
/* static members */
object default {
  
  @JSImport("stripe", JSImport.Default)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("stripe", "default.AccountLinksResource")
  @js.native
  open class AccountLinksResource ()
    extends StObject
       with typings.stripe.mod.Stripe.AccountLinksResource
  
  @JSImport("stripe", "default.AccountsResource")
  @js.native
  open class AccountsResource ()
    extends StObject
       with typings.stripe.mod.Stripe.AccountsResource
  
  @JSImport("stripe", "default.ApplePayDomainsResource")
  @js.native
  open class ApplePayDomainsResource ()
    extends StObject
       with typings.stripe.mod.Stripe.ApplePayDomainsResource
  
  @JSImport("stripe", "default.ApplicationFeesResource")
  @js.native
  open class ApplicationFeesResource ()
    extends StObject
       with typings.stripe.mod.Stripe.ApplicationFeesResource
  
  object Apps {
    
    @JSImport("stripe", "default.Apps.SecretsResource")
    @js.native
    open class SecretsResource ()
      extends StObject
         with typings.stripe.mod.Stripe.Apps.SecretsResource
  }
  
  @JSImport("stripe", "default.BalanceResource")
  @js.native
  open class BalanceResource ()
    extends StObject
       with typings.stripe.mod.Stripe.BalanceResource
  
  @JSImport("stripe", "default.BalanceTransactionsResource")
  @js.native
  open class BalanceTransactionsResource ()
    extends StObject
       with typings.stripe.mod.Stripe.BalanceTransactionsResource
  
  object BillingPortal {
    
    @JSImport("stripe", "default.BillingPortal.ConfigurationsResource")
    @js.native
    open class ConfigurationsResource ()
      extends StObject
         with typings.stripe.mod.Stripe.BillingPortal.ConfigurationsResource
    
    @JSImport("stripe", "default.BillingPortal.SessionsResource")
    @js.native
    open class SessionsResource ()
      extends StObject
         with typings.stripe.mod.Stripe.BillingPortal.SessionsResource
  }
  
  @JSImport("stripe", "default.ChargesResource")
  @js.native
  open class ChargesResource ()
    extends StObject
       with typings.stripe.mod.Stripe.ChargesResource
  
  object Checkout {
    
    @JSImport("stripe", "default.Checkout.SessionsResource")
    @js.native
    open class SessionsResource ()
      extends StObject
         with typings.stripe.mod.Stripe.Checkout.SessionsResource
  }
  
  @JSImport("stripe", "default.CountrySpecsResource")
  @js.native
  open class CountrySpecsResource ()
    extends StObject
       with typings.stripe.mod.Stripe.CountrySpecsResource
  
  @JSImport("stripe", "default.CouponsResource")
  @js.native
  open class CouponsResource ()
    extends StObject
       with typings.stripe.mod.Stripe.CouponsResource
  
  @JSImport("stripe", "default.CreditNotesResource")
  @js.native
  open class CreditNotesResource ()
    extends StObject
       with typings.stripe.mod.Stripe.CreditNotesResource
  
  @JSImport("stripe", "default.CustomersResource")
  @js.native
  open class CustomersResource ()
    extends StObject
       with typings.stripe.mod.Stripe.CustomersResource
  
  @JSImport("stripe", "default.DisputesResource")
  @js.native
  open class DisputesResource ()
    extends StObject
       with typings.stripe.mod.Stripe.DisputesResource
  
  @JSImport("stripe", "default.EphemeralKeysResource")
  @js.native
  open class EphemeralKeysResource ()
    extends StObject
       with typings.stripe.mod.Stripe.EphemeralKeysResource
  
  @JSImport("stripe", "default.EventsResource")
  @js.native
  open class EventsResource ()
    extends StObject
       with typings.stripe.mod.Stripe.EventsResource
  
  @JSImport("stripe", "default.ExchangeRatesResource")
  @js.native
  open class ExchangeRatesResource ()
    extends StObject
       with typings.stripe.mod.Stripe.ExchangeRatesResource
  
  @JSImport("stripe", "default.FileLinksResource")
  @js.native
  open class FileLinksResource ()
    extends StObject
       with typings.stripe.mod.Stripe.FileLinksResource
  
  @JSImport("stripe", "default.FilesResource")
  @js.native
  open class FilesResource ()
    extends StObject
       with typings.stripe.mod.Stripe.FilesResource
  
  object FinancialConnections {
    
    @JSImport("stripe", "default.FinancialConnections.AccountsResource")
    @js.native
    open class AccountsResource ()
      extends StObject
         with typings.stripe.mod.Stripe.FinancialConnections.AccountsResource
    
    @JSImport("stripe", "default.FinancialConnections.SessionsResource")
    @js.native
    open class SessionsResource ()
      extends StObject
         with typings.stripe.mod.Stripe.FinancialConnections.SessionsResource
  }
  
  object Identity {
    
    @JSImport("stripe", "default.Identity.VerificationReportsResource")
    @js.native
    open class VerificationReportsResource ()
      extends StObject
         with typings.stripe.mod.Stripe.Identity.VerificationReportsResource
    
    @JSImport("stripe", "default.Identity.VerificationSessionsResource")
    @js.native
    open class VerificationSessionsResource ()
      extends StObject
         with typings.stripe.mod.Stripe.Identity.VerificationSessionsResource
  }
  
  @JSImport("stripe", "default.InvoiceItemsResource")
  @js.native
  open class InvoiceItemsResource ()
    extends StObject
       with typings.stripe.mod.Stripe.InvoiceItemsResource
  
  @JSImport("stripe", "default.InvoicesResource")
  @js.native
  open class InvoicesResource ()
    extends StObject
       with typings.stripe.mod.Stripe.InvoicesResource
  
  object Issuing {
    
    @JSImport("stripe", "default.Issuing.AuthorizationsResource")
    @js.native
    open class AuthorizationsResource ()
      extends StObject
         with typings.stripe.mod.Stripe.Issuing.AuthorizationsResource
    
    @JSImport("stripe", "default.Issuing.CardholdersResource")
    @js.native
    open class CardholdersResource ()
      extends StObject
         with typings.stripe.mod.Stripe.Issuing.CardholdersResource
    
    @JSImport("stripe", "default.Issuing.CardsResource")
    @js.native
    open class CardsResource ()
      extends StObject
         with typings.stripe.mod.Stripe.Issuing.CardsResource
    
    @JSImport("stripe", "default.Issuing.DisputesResource")
    @js.native
    open class DisputesResource ()
      extends StObject
         with typings.stripe.mod.Stripe.Issuing.DisputesResource
    
    @JSImport("stripe", "default.Issuing.TransactionsResource")
    @js.native
    open class TransactionsResource ()
      extends StObject
         with typings.stripe.mod.Stripe.Issuing.TransactionsResource
  }
  
  @JSImport("stripe", "default.MandatesResource")
  @js.native
  open class MandatesResource ()
    extends StObject
       with typings.stripe.mod.Stripe.MandatesResource
  
  @JSImport("stripe", "default.OAuthResource")
  @js.native
  open class OAuthResource ()
    extends StObject
       with typings.stripe.mod.Stripe.OAuthResource
  
  @JSImport("stripe", "default.OrdersResource")
  @js.native
  open class OrdersResource ()
    extends StObject
       with typings.stripe.mod.Stripe.OrdersResource
  
  @JSImport("stripe", "default.PaymentIntentsResource")
  @js.native
  open class PaymentIntentsResource ()
    extends StObject
       with typings.stripe.mod.Stripe.PaymentIntentsResource
  
  @JSImport("stripe", "default.PaymentLinksResource")
  @js.native
  open class PaymentLinksResource ()
    extends StObject
       with typings.stripe.mod.Stripe.PaymentLinksResource
  
  @JSImport("stripe", "default.PaymentMethodsResource")
  @js.native
  open class PaymentMethodsResource ()
    extends StObject
       with typings.stripe.mod.Stripe.PaymentMethodsResource
  
  @JSImport("stripe", "default.PayoutsResource")
  @js.native
  open class PayoutsResource ()
    extends StObject
       with typings.stripe.mod.Stripe.PayoutsResource
  
  @JSImport("stripe", "default.PlansResource")
  @js.native
  open class PlansResource ()
    extends StObject
       with typings.stripe.mod.Stripe.PlansResource
  
  @JSImport("stripe", "default.PricesResource")
  @js.native
  open class PricesResource ()
    extends StObject
       with typings.stripe.mod.Stripe.PricesResource
  
  @JSImport("stripe", "default.ProductsResource")
  @js.native
  open class ProductsResource ()
    extends StObject
       with typings.stripe.mod.Stripe.ProductsResource
  
  @JSImport("stripe", "default.PromotionCodesResource")
  @js.native
  open class PromotionCodesResource ()
    extends StObject
       with typings.stripe.mod.Stripe.PromotionCodesResource
  
  @JSImport("stripe", "default.QuotesResource")
  @js.native
  open class QuotesResource ()
    extends StObject
       with typings.stripe.mod.Stripe.QuotesResource
  
  object Radar {
    
    @JSImport("stripe", "default.Radar.EarlyFraudWarningsResource")
    @js.native
    open class EarlyFraudWarningsResource ()
      extends StObject
         with typings.stripe.mod.Stripe.Radar.EarlyFraudWarningsResource
    
    @JSImport("stripe", "default.Radar.ValueListItemsResource")
    @js.native
    open class ValueListItemsResource ()
      extends StObject
         with typings.stripe.mod.Stripe.Radar.ValueListItemsResource
    
    @JSImport("stripe", "default.Radar.ValueListsResource")
    @js.native
    open class ValueListsResource ()
      extends StObject
         with typings.stripe.mod.Stripe.Radar.ValueListsResource
  }
  
  @JSImport("stripe", "default.RefundsResource")
  @js.native
  open class RefundsResource ()
    extends StObject
       with typings.stripe.mod.Stripe.RefundsResource
  
  object Reporting {
    
    @JSImport("stripe", "default.Reporting.ReportRunsResource")
    @js.native
    open class ReportRunsResource ()
      extends StObject
         with typings.stripe.mod.Stripe.Reporting.ReportRunsResource
    
    @JSImport("stripe", "default.Reporting.ReportTypesResource")
    @js.native
    open class ReportTypesResource ()
      extends StObject
         with typings.stripe.mod.Stripe.Reporting.ReportTypesResource
  }
  
  @JSImport("stripe", "default.ReviewsResource")
  @js.native
  open class ReviewsResource ()
    extends StObject
       with typings.stripe.mod.Stripe.ReviewsResource
  
  @JSImport("stripe", "default.SetupAttemptsResource")
  @js.native
  open class SetupAttemptsResource ()
    extends StObject
       with typings.stripe.mod.Stripe.SetupAttemptsResource
  
  @JSImport("stripe", "default.SetupIntentsResource")
  @js.native
  open class SetupIntentsResource ()
    extends StObject
       with typings.stripe.mod.Stripe.SetupIntentsResource
  
  @JSImport("stripe", "default.ShippingRatesResource")
  @js.native
  open class ShippingRatesResource ()
    extends StObject
       with typings.stripe.mod.Stripe.ShippingRatesResource
  
  object Sigma {
    
    @JSImport("stripe", "default.Sigma.ScheduledQueryRunsResource")
    @js.native
    open class ScheduledQueryRunsResource ()
      extends StObject
         with typings.stripe.mod.Stripe.Sigma.ScheduledQueryRunsResource
  }
  
  @JSImport("stripe", "default.Signature")
  @js.native
  open class Signature ()
    extends StObject
       with typings.stripe.mod.Stripe.Signature
  
  @JSImport("stripe", "default.SkusResource")
  @js.native
  open class SkusResource ()
    extends StObject
       with typings.stripe.mod.Stripe.SkusResource
  
  @JSImport("stripe", "default.SourcesResource")
  @js.native
  open class SourcesResource ()
    extends StObject
       with typings.stripe.mod.Stripe.SourcesResource
  
  @JSImport("stripe", "default.Stripe")
  @js.native
  def Stripe: Instantiable = js.native
  inline def Stripe_=(x: Instantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Stripe")(x.asInstanceOf[js.Any])
  
  @JSImport("stripe", "default.SubscriptionItemsResource")
  @js.native
  open class SubscriptionItemsResource ()
    extends StObject
       with typings.stripe.mod.Stripe.SubscriptionItemsResource
  
  @JSImport("stripe", "default.SubscriptionSchedulesResource")
  @js.native
  open class SubscriptionSchedulesResource ()
    extends StObject
       with typings.stripe.mod.Stripe.SubscriptionSchedulesResource
  
  @JSImport("stripe", "default.SubscriptionsResource")
  @js.native
  open class SubscriptionsResource ()
    extends StObject
       with typings.stripe.mod.Stripe.SubscriptionsResource
  
  @JSImport("stripe", "default.TaxCodesResource")
  @js.native
  open class TaxCodesResource ()
    extends StObject
       with typings.stripe.mod.Stripe.TaxCodesResource
  
  @JSImport("stripe", "default.TaxRatesResource")
  @js.native
  open class TaxRatesResource ()
    extends StObject
       with typings.stripe.mod.Stripe.TaxRatesResource
  
  object Terminal {
    
    @JSImport("stripe", "default.Terminal.ConfigurationsResource")
    @js.native
    open class ConfigurationsResource ()
      extends StObject
         with typings.stripe.mod.Stripe.Terminal.ConfigurationsResource
    
    @JSImport("stripe", "default.Terminal.ConnectionTokensResource")
    @js.native
    open class ConnectionTokensResource ()
      extends StObject
         with typings.stripe.mod.Stripe.Terminal.ConnectionTokensResource
    
    @JSImport("stripe", "default.Terminal.LocationsResource")
    @js.native
    open class LocationsResource ()
      extends StObject
         with typings.stripe.mod.Stripe.Terminal.LocationsResource
    
    @JSImport("stripe", "default.Terminal.ReadersResource")
    @js.native
    open class ReadersResource ()
      extends StObject
         with typings.stripe.mod.Stripe.Terminal.ReadersResource
  }
  
  object TestHelpers {
    
    @JSImport("stripe", "default.TestHelpers.CustomersResource")
    @js.native
    open class CustomersResource ()
      extends StObject
         with typings.stripe.mod.Stripe.TestHelpers.CustomersResource
    
    object Issuing {
      
      @JSImport("stripe", "default.TestHelpers.Issuing.CardsResource")
      @js.native
      open class CardsResource ()
        extends StObject
           with typings.stripe.mod.Stripe.TestHelpers.Issuing.CardsResource
    }
    
    @JSImport("stripe", "default.TestHelpers.RefundsResource")
    @js.native
    open class RefundsResource ()
      extends StObject
         with typings.stripe.mod.Stripe.TestHelpers.RefundsResource
    
    object Terminal {
      
      @JSImport("stripe", "default.TestHelpers.Terminal.ReadersResource")
      @js.native
      open class ReadersResource ()
        extends StObject
           with typings.stripe.mod.Stripe.TestHelpers.Terminal.ReadersResource
    }
    
    @JSImport("stripe", "default.TestHelpers.TestClocksResource")
    @js.native
    open class TestClocksResource ()
      extends StObject
         with typings.stripe.mod.Stripe.TestHelpers.TestClocksResource
    
    object Treasury {
      
      @JSImport("stripe", "default.TestHelpers.Treasury.InboundTransfersResource")
      @js.native
      open class InboundTransfersResource ()
        extends StObject
           with typings.stripe.mod.Stripe.TestHelpers.Treasury.InboundTransfersResource
      
      @JSImport("stripe", "default.TestHelpers.Treasury.OutboundPaymentsResource")
      @js.native
      open class OutboundPaymentsResource ()
        extends StObject
           with typings.stripe.mod.Stripe.TestHelpers.Treasury.OutboundPaymentsResource
      
      @JSImport("stripe", "default.TestHelpers.Treasury.OutboundTransfersResource")
      @js.native
      open class OutboundTransfersResource ()
        extends StObject
           with typings.stripe.mod.Stripe.TestHelpers.Treasury.OutboundTransfersResource
      
      @JSImport("stripe", "default.TestHelpers.Treasury.ReceivedCreditsResource")
      @js.native
      open class ReceivedCreditsResource ()
        extends StObject
           with typings.stripe.mod.Stripe.TestHelpers.Treasury.ReceivedCreditsResource
      
      @JSImport("stripe", "default.TestHelpers.Treasury.ReceivedDebitsResource")
      @js.native
      open class ReceivedDebitsResource ()
        extends StObject
           with typings.stripe.mod.Stripe.TestHelpers.Treasury.ReceivedDebitsResource
    }
  }
  
  @JSImport("stripe", "default.TokensResource")
  @js.native
  open class TokensResource ()
    extends StObject
       with typings.stripe.mod.Stripe.TokensResource
  
  @JSImport("stripe", "default.TopupsResource")
  @js.native
  open class TopupsResource ()
    extends StObject
       with typings.stripe.mod.Stripe.TopupsResource
  
  @JSImport("stripe", "default.TransfersResource")
  @js.native
  open class TransfersResource ()
    extends StObject
       with typings.stripe.mod.Stripe.TransfersResource
  
  object Treasury {
    
    @JSImport("stripe", "default.Treasury.CreditReversalsResource")
    @js.native
    open class CreditReversalsResource ()
      extends StObject
         with typings.stripe.mod.Stripe.Treasury.CreditReversalsResource
    
    @JSImport("stripe", "default.Treasury.DebitReversalsResource")
    @js.native
    open class DebitReversalsResource ()
      extends StObject
         with typings.stripe.mod.Stripe.Treasury.DebitReversalsResource
    
    @JSImport("stripe", "default.Treasury.FinancialAccountsResource")
    @js.native
    open class FinancialAccountsResource ()
      extends StObject
         with typings.stripe.mod.Stripe.Treasury.FinancialAccountsResource
    
    @JSImport("stripe", "default.Treasury.InboundTransfersResource")
    @js.native
    open class InboundTransfersResource ()
      extends StObject
         with typings.stripe.mod.Stripe.Treasury.InboundTransfersResource
    
    @JSImport("stripe", "default.Treasury.OutboundPaymentsResource")
    @js.native
    open class OutboundPaymentsResource ()
      extends StObject
         with typings.stripe.mod.Stripe.Treasury.OutboundPaymentsResource
    
    @JSImport("stripe", "default.Treasury.OutboundTransfersResource")
    @js.native
    open class OutboundTransfersResource ()
      extends StObject
         with typings.stripe.mod.Stripe.Treasury.OutboundTransfersResource
    
    @JSImport("stripe", "default.Treasury.ReceivedCreditsResource")
    @js.native
    open class ReceivedCreditsResource ()
      extends StObject
         with typings.stripe.mod.Stripe.Treasury.ReceivedCreditsResource
    
    @JSImport("stripe", "default.Treasury.ReceivedDebitsResource")
    @js.native
    open class ReceivedDebitsResource ()
      extends StObject
         with typings.stripe.mod.Stripe.Treasury.ReceivedDebitsResource
    
    @JSImport("stripe", "default.Treasury.TransactionEntriesResource")
    @js.native
    open class TransactionEntriesResource ()
      extends StObject
         with typings.stripe.mod.Stripe.Treasury.TransactionEntriesResource
    
    @JSImport("stripe", "default.Treasury.TransactionsResource")
    @js.native
    open class TransactionsResource ()
      extends StObject
         with typings.stripe.mod.Stripe.Treasury.TransactionsResource
  }
  
  @JSImport("stripe", "default.WebhookEndpointsResource")
  @js.native
  open class WebhookEndpointsResource ()
    extends StObject
       with typings.stripe.mod.Stripe.WebhookEndpointsResource
  
  @JSImport("stripe", "default.Webhooks")
  @js.native
  open class Webhooks ()
    extends StObject
       with typings.stripe.mod.Stripe.Webhooks
  
  inline def createNodeCryptoProvider(): CryptoProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("createNodeCryptoProvider")().asInstanceOf[CryptoProvider]
  
  inline def createSubtleCryptoProvider(): CryptoProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("createSubtleCryptoProvider")().asInstanceOf[CryptoProvider]
  inline def createSubtleCryptoProvider(
    /**
    * The SubtleCrypto type cannot be specified without pulling in DOM types.
    * This corresponds to WindowOrWorkerGlobalScope['crypto']['subtle'] for
    * applications which pull in DOM types.
    */
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  subtleCrypto: Any
  ): CryptoProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("createSubtleCryptoProvider")(subtleCrypto.asInstanceOf[js.Any]).asInstanceOf[CryptoProvider]
  
  object errors {
    
    @JSImport("stripe", "default.errors")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * API errors cover any other type of problem (e.g., a temporary problem with Stripe's servers),
      * and are extremely uncommon.
      *
      * It could also be raised in the case that a new error has been introduced in the API,
      * but this version of the library doesn't know how to handle it.
      */
    @JSImport("stripe", "default.errors.StripeAPIError")
    @js.native
    open class StripeAPIError ()
      extends StObject
         with typings.stripe.mod.Stripe.errors.StripeAPIError {
      
      /* CompleteClass */
      override val headers: StringDictionary[String] = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var message: String = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var name: String = js.native
      
      /* CompleteClass */
      override val raw: Any = js.native
      
      /**
        * See the "error types" section at https://stripe.com/docs/api/errors
        */
      /* CompleteClass */
      override val rawType: RawErrorType = js.native
      /* CompleteClass */
      @JSName("rawType")
      override val rawType_StripeAPIError: api_error = js.native
      
      /* CompleteClass */
      override val requestId: String = js.native
      
      /* CompleteClass */
      override val `type`: typings.stripe.stripeStrings.StripeError | typings.stripe.stripeStrings.StripeCardError | typings.stripe.stripeStrings.StripeInvalidRequestError | typings.stripe.stripeStrings.StripeAPIError | typings.stripe.stripeStrings.StripeAuthenticationError | typings.stripe.stripeStrings.StripePermissionError | typings.stripe.stripeStrings.StripeRateLimitError | typings.stripe.stripeStrings.StripeConnectionError | typings.stripe.stripeStrings.StripeSignatureVerificationError | typings.stripe.stripeStrings.StripeIdempotencyError | typings.stripe.stripeStrings.StripeInvalidGrantError = js.native
      /* CompleteClass */
      @JSName("type")
      override val type_StripeAPIError: typings.stripe.stripeStrings.StripeAPIError = js.native
    }
    
    /**
      * Failure to properly authenticate yourself in the request.
      */
    @JSImport("stripe", "default.errors.StripeAuthenticationError")
    @js.native
    open class StripeAuthenticationError ()
      extends StObject
         with typings.stripe.mod.Stripe.errors.StripeAuthenticationError {
      
      /* CompleteClass */
      override val headers: StringDictionary[String] = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var message: String = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var name: String = js.native
      
      /* CompleteClass */
      override val raw: Any = js.native
      
      /**
        * See the "error types" section at https://stripe.com/docs/api/errors
        */
      /* CompleteClass */
      override val rawType: RawErrorType = js.native
      /* CompleteClass */
      @JSName("rawType")
      override val rawType_StripeAuthenticationError: authentication_error = js.native
      
      /* CompleteClass */
      override val requestId: String = js.native
      
      /* CompleteClass */
      override val `type`: typings.stripe.stripeStrings.StripeError | typings.stripe.stripeStrings.StripeCardError | typings.stripe.stripeStrings.StripeInvalidRequestError | typings.stripe.stripeStrings.StripeAPIError | typings.stripe.stripeStrings.StripeAuthenticationError | typings.stripe.stripeStrings.StripePermissionError | typings.stripe.stripeStrings.StripeRateLimitError | typings.stripe.stripeStrings.StripeConnectionError | typings.stripe.stripeStrings.StripeSignatureVerificationError | typings.stripe.stripeStrings.StripeIdempotencyError | typings.stripe.stripeStrings.StripeInvalidGrantError = js.native
      /* CompleteClass */
      @JSName("type")
      override val type_StripeAuthenticationError: typings.stripe.stripeStrings.StripeAuthenticationError = js.native
    }
    
    /**
      * Card errors are the most common type of error you should expect to handle.
      * They result when the user enters a card that can't be charged for some reason.
      */
    @JSImport("stripe", "default.errors.StripeCardError")
    @js.native
    open class StripeCardError ()
      extends StObject
         with typings.stripe.mod.Stripe.errors.StripeCardError {
      
      /**
        * @docs https://stripe.com/docs/declines/codes
        */
      /* CompleteClass */
      @JSName("decline_code")
      override val decline_code_StripeCardError: String = js.native
      
      /* CompleteClass */
      override val headers: StringDictionary[String] = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var message: String = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var name: String = js.native
      
      /* CompleteClass */
      override val raw: Any = js.native
      
      /**
        * See the "error types" section at https://stripe.com/docs/api/errors
        */
      /* CompleteClass */
      override val rawType: RawErrorType = js.native
      /* CompleteClass */
      @JSName("rawType")
      override val rawType_StripeCardError: card_error = js.native
      
      /* CompleteClass */
      override val requestId: String = js.native
      
      /* CompleteClass */
      override val `type`: typings.stripe.stripeStrings.StripeError | typings.stripe.stripeStrings.StripeCardError | typings.stripe.stripeStrings.StripeInvalidRequestError | typings.stripe.stripeStrings.StripeAPIError | typings.stripe.stripeStrings.StripeAuthenticationError | typings.stripe.stripeStrings.StripePermissionError | typings.stripe.stripeStrings.StripeRateLimitError | typings.stripe.stripeStrings.StripeConnectionError | typings.stripe.stripeStrings.StripeSignatureVerificationError | typings.stripe.stripeStrings.StripeIdempotencyError | typings.stripe.stripeStrings.StripeInvalidGrantError = js.native
      /* CompleteClass */
      @JSName("type")
      override val type_StripeCardError: typings.stripe.stripeStrings.StripeCardError = js.native
    }
    
    /**
      * The library cannot connect to Stripe.
      * This can happen for a variety of reasons,
      * such as loss of network connectivity or a bad TLS certificate.
      */
    @JSImport("stripe", "default.errors.StripeConnectionError")
    @js.native
    open class StripeConnectionError ()
      extends StObject
         with typings.stripe.mod.Stripe.errors.StripeConnectionError {
      
      /* CompleteClass */
      override val headers: StringDictionary[String] = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var message: String = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var name: String = js.native
      
      /* CompleteClass */
      override val raw: Any = js.native
      
      /**
        * See the "error types" section at https://stripe.com/docs/api/errors
        */
      /* CompleteClass */
      override val rawType: RawErrorType = js.native
      
      /* CompleteClass */
      override val requestId: String = js.native
      
      /* CompleteClass */
      override val `type`: typings.stripe.stripeStrings.StripeError | typings.stripe.stripeStrings.StripeCardError | typings.stripe.stripeStrings.StripeInvalidRequestError | typings.stripe.stripeStrings.StripeAPIError | typings.stripe.stripeStrings.StripeAuthenticationError | typings.stripe.stripeStrings.StripePermissionError | typings.stripe.stripeStrings.StripeRateLimitError | typings.stripe.stripeStrings.StripeConnectionError | typings.stripe.stripeStrings.StripeSignatureVerificationError | typings.stripe.stripeStrings.StripeIdempotencyError | typings.stripe.stripeStrings.StripeInvalidGrantError = js.native
      /* CompleteClass */
      @JSName("type")
      override val type_StripeConnectionError: typings.stripe.stripeStrings.StripeConnectionError = js.native
    }
    
    @JSImport("stripe", "default.errors.StripeError")
    @js.native
    open class StripeError protected ()
      extends StObject
         with typings.stripe.mod.Stripe.errors.StripeError {
      def this(rawError: StripeRawError) = this()
      
      /* CompleteClass */
      override val headers: StringDictionary[String] = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var message: String = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var name: String = js.native
      
      /* CompleteClass */
      override val raw: Any = js.native
      
      /**
        * See the "error types" section at https://stripe.com/docs/api/errors
        */
      /* CompleteClass */
      override val rawType: RawErrorType = js.native
      
      /* CompleteClass */
      override val requestId: String = js.native
      
      /* CompleteClass */
      override val `type`: typings.stripe.stripeStrings.StripeError | typings.stripe.stripeStrings.StripeCardError | typings.stripe.stripeStrings.StripeInvalidRequestError | typings.stripe.stripeStrings.StripeAPIError | typings.stripe.stripeStrings.StripeAuthenticationError | typings.stripe.stripeStrings.StripePermissionError | typings.stripe.stripeStrings.StripeRateLimitError | typings.stripe.stripeStrings.StripeConnectionError | typings.stripe.stripeStrings.StripeSignatureVerificationError | typings.stripe.stripeStrings.StripeIdempotencyError | typings.stripe.stripeStrings.StripeInvalidGrantError = js.native
    }
    object StripeError {
      
      @JSImport("stripe", "default.errors.StripeError")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def generate(rawError: StripeRawErrortypeRawErro): typings.stripe.mod.Stripe.errors.StripeError = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(rawError.asInstanceOf[js.Any]).asInstanceOf[typings.stripe.mod.Stripe.errors.StripeError]
      /* static member */
      inline def generate(rawError: StripeRawErrortypeapierro): typings.stripe.mod.Stripe.errors.StripeAPIError = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(rawError.asInstanceOf[js.Any]).asInstanceOf[typings.stripe.mod.Stripe.errors.StripeAPIError]
      /* static member */
      inline def generate(rawError: StripeRawErrortypeauthent): typings.stripe.mod.Stripe.errors.StripeAuthenticationError = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(rawError.asInstanceOf[js.Any]).asInstanceOf[typings.stripe.mod.Stripe.errors.StripeAuthenticationError]
      /* static member */
      inline def generate(rawError: StripeRawErrortypecarderr): typings.stripe.mod.Stripe.errors.StripeCardError = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(rawError.asInstanceOf[js.Any]).asInstanceOf[typings.stripe.mod.Stripe.errors.StripeCardError]
      /* static member */
      inline def generate(rawError: StripeRawErrortypeidempot): typings.stripe.mod.Stripe.errors.StripeIdempotencyError = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(rawError.asInstanceOf[js.Any]).asInstanceOf[typings.stripe.mod.Stripe.errors.StripeIdempotencyError]
      /* static member */
      inline def generate(rawError: StripeRawErrortypeinvalid): typings.stripe.mod.Stripe.errors.StripeInvalidRequestError = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(rawError.asInstanceOf[js.Any]).asInstanceOf[typings.stripe.mod.Stripe.errors.StripeInvalidRequestError]
      /* static member */
      inline def generate(rawError: StripeRawErrortypeinvalidCharge): typings.stripe.mod.Stripe.errors.StripeInvalidGrantError = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(rawError.asInstanceOf[js.Any]).asInstanceOf[typings.stripe.mod.Stripe.errors.StripeInvalidGrantError]
      /* static member */
      inline def generate(rawError: StripeRawErrortyperatelim): typings.stripe.mod.Stripe.errors.StripeRateLimitError = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(rawError.asInstanceOf[js.Any]).asInstanceOf[typings.stripe.mod.Stripe.errors.StripeRateLimitError]
    }
    
    /**
      * Idempotency errors occur when an `Idempotency-Key` is re-used on a request that does not match the first request's API endpoint and parameters.
      * @docs https://stripe.com/docs/api/idempotent_requests?lang=node
      */
    @JSImport("stripe", "default.errors.StripeIdempotencyError")
    @js.native
    open class StripeIdempotencyError ()
      extends StObject
         with typings.stripe.mod.Stripe.errors.StripeIdempotencyError {
      
      /* CompleteClass */
      override val headers: StringDictionary[String] = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var message: String = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var name: String = js.native
      
      /* CompleteClass */
      override val raw: Any = js.native
      
      /**
        * See the "error types" section at https://stripe.com/docs/api/errors
        */
      /* CompleteClass */
      override val rawType: RawErrorType = js.native
      /* CompleteClass */
      @JSName("rawType")
      override val rawType_StripeIdempotencyError: idempotency_error = js.native
      
      /* CompleteClass */
      override val requestId: String = js.native
      
      /* CompleteClass */
      override val `type`: typings.stripe.stripeStrings.StripeError | typings.stripe.stripeStrings.StripeCardError | typings.stripe.stripeStrings.StripeInvalidRequestError | typings.stripe.stripeStrings.StripeAPIError | typings.stripe.stripeStrings.StripeAuthenticationError | typings.stripe.stripeStrings.StripePermissionError | typings.stripe.stripeStrings.StripeRateLimitError | typings.stripe.stripeStrings.StripeConnectionError | typings.stripe.stripeStrings.StripeSignatureVerificationError | typings.stripe.stripeStrings.StripeIdempotencyError | typings.stripe.stripeStrings.StripeInvalidGrantError = js.native
      /* CompleteClass */
      @JSName("type")
      override val type_StripeIdempotencyError: typings.stripe.stripeStrings.StripeIdempotencyError = js.native
    }
    
    /**
      * InvalidGrantError is raised when a specified code doesn't exist, is
      * expired, has been used, or doesn't belong to you; a refresh token doesn't
      * exist, or doesn't belong to you; or if an API key's mode (live or test)
      * doesn't match the mode of a code or refresh token.
      */
    @JSImport("stripe", "default.errors.StripeInvalidGrantError")
    @js.native
    open class StripeInvalidGrantError ()
      extends StObject
         with typings.stripe.mod.Stripe.errors.StripeInvalidGrantError {
      
      /* CompleteClass */
      override val headers: StringDictionary[String] = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var message: String = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var name: String = js.native
      
      /* CompleteClass */
      override val raw: Any = js.native
      
      /**
        * See the "error types" section at https://stripe.com/docs/api/errors
        */
      /* CompleteClass */
      override val rawType: RawErrorType = js.native
      /* CompleteClass */
      @JSName("rawType")
      override val rawType_StripeInvalidGrantError: invalid_grant = js.native
      
      /* CompleteClass */
      override val requestId: String = js.native
      
      /* CompleteClass */
      override val `type`: typings.stripe.stripeStrings.StripeError | typings.stripe.stripeStrings.StripeCardError | typings.stripe.stripeStrings.StripeInvalidRequestError | typings.stripe.stripeStrings.StripeAPIError | typings.stripe.stripeStrings.StripeAuthenticationError | typings.stripe.stripeStrings.StripePermissionError | typings.stripe.stripeStrings.StripeRateLimitError | typings.stripe.stripeStrings.StripeConnectionError | typings.stripe.stripeStrings.StripeSignatureVerificationError | typings.stripe.stripeStrings.StripeIdempotencyError | typings.stripe.stripeStrings.StripeInvalidGrantError = js.native
      /* CompleteClass */
      @JSName("type")
      override val type_StripeInvalidGrantError: typings.stripe.stripeStrings.StripeInvalidGrantError = js.native
    }
    
    /**
      * Invalid request errors arise when your request has invalid parameters.
      */
    @JSImport("stripe", "default.errors.StripeInvalidRequestError")
    @js.native
    open class StripeInvalidRequestError ()
      extends StObject
         with typings.stripe.mod.Stripe.errors.StripeInvalidRequestError {
      
      /* CompleteClass */
      override val headers: StringDictionary[String] = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var message: String = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var name: String = js.native
      
      /* CompleteClass */
      override val raw: Any = js.native
      
      /**
        * See the "error types" section at https://stripe.com/docs/api/errors
        */
      /* CompleteClass */
      override val rawType: RawErrorType = js.native
      /* CompleteClass */
      @JSName("rawType")
      override val rawType_StripeInvalidRequestError: invalid_request_error = js.native
      
      /* CompleteClass */
      override val requestId: String = js.native
      
      /* CompleteClass */
      override val `type`: typings.stripe.stripeStrings.StripeError | typings.stripe.stripeStrings.StripeCardError | typings.stripe.stripeStrings.StripeInvalidRequestError | typings.stripe.stripeStrings.StripeAPIError | typings.stripe.stripeStrings.StripeAuthenticationError | typings.stripe.stripeStrings.StripePermissionError | typings.stripe.stripeStrings.StripeRateLimitError | typings.stripe.stripeStrings.StripeConnectionError | typings.stripe.stripeStrings.StripeSignatureVerificationError | typings.stripe.stripeStrings.StripeIdempotencyError | typings.stripe.stripeStrings.StripeInvalidGrantError = js.native
      /* CompleteClass */
      @JSName("type")
      override val type_StripeInvalidRequestError: typings.stripe.stripeStrings.StripeInvalidRequestError = js.native
    }
    
    /**
      * Access was attempted on a resource that wasn't allowed.
      */
    @JSImport("stripe", "default.errors.StripePermissionError")
    @js.native
    open class StripePermissionError ()
      extends StObject
         with typings.stripe.mod.Stripe.errors.StripePermissionError {
      
      /* CompleteClass */
      override val headers: StringDictionary[String] = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var message: String = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var name: String = js.native
      
      /* CompleteClass */
      override val raw: Any = js.native
      
      /**
        * See the "error types" section at https://stripe.com/docs/api/errors
        */
      /* CompleteClass */
      override val rawType: RawErrorType = js.native
      
      /* CompleteClass */
      override val requestId: String = js.native
      
      /* CompleteClass */
      override val `type`: typings.stripe.stripeStrings.StripeError | typings.stripe.stripeStrings.StripeCardError | typings.stripe.stripeStrings.StripeInvalidRequestError | typings.stripe.stripeStrings.StripeAPIError | typings.stripe.stripeStrings.StripeAuthenticationError | typings.stripe.stripeStrings.StripePermissionError | typings.stripe.stripeStrings.StripeRateLimitError | typings.stripe.stripeStrings.StripeConnectionError | typings.stripe.stripeStrings.StripeSignatureVerificationError | typings.stripe.stripeStrings.StripeIdempotencyError | typings.stripe.stripeStrings.StripeInvalidGrantError = js.native
      /* CompleteClass */
      @JSName("type")
      override val type_StripePermissionError: typings.stripe.stripeStrings.StripePermissionError = js.native
    }
    
    /**
      * Too many requests hit the API too quickly.
      * @docs https://stripe.com/docs/rate-limits
      */
    @JSImport("stripe", "default.errors.StripeRateLimitError")
    @js.native
    open class StripeRateLimitError ()
      extends StObject
         with typings.stripe.mod.Stripe.errors.StripeRateLimitError {
      
      /* CompleteClass */
      override val headers: StringDictionary[String] = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var message: String = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var name: String = js.native
      
      /* CompleteClass */
      override val raw: Any = js.native
      
      /**
        * See the "error types" section at https://stripe.com/docs/api/errors
        */
      /* CompleteClass */
      override val rawType: RawErrorType = js.native
      /* CompleteClass */
      @JSName("rawType")
      override val rawType_StripeRateLimitError: rate_limit_error = js.native
      
      /* CompleteClass */
      override val requestId: String = js.native
      
      /* CompleteClass */
      override val `type`: typings.stripe.stripeStrings.StripeError | typings.stripe.stripeStrings.StripeCardError | typings.stripe.stripeStrings.StripeInvalidRequestError | typings.stripe.stripeStrings.StripeAPIError | typings.stripe.stripeStrings.StripeAuthenticationError | typings.stripe.stripeStrings.StripePermissionError | typings.stripe.stripeStrings.StripeRateLimitError | typings.stripe.stripeStrings.StripeConnectionError | typings.stripe.stripeStrings.StripeSignatureVerificationError | typings.stripe.stripeStrings.StripeIdempotencyError | typings.stripe.stripeStrings.StripeInvalidGrantError = js.native
      /* CompleteClass */
      @JSName("type")
      override val type_StripeRateLimitError: typings.stripe.stripeStrings.StripeRateLimitError = js.native
    }
    
    /**
      * The signature verification for a webhook failed.
      * @docs https://stripe.com/docs/webhooks/signatures
      */
    @JSImport("stripe", "default.errors.StripeSignatureVerificationError")
    @js.native
    open class StripeSignatureVerificationError ()
      extends StObject
         with typings.stripe.mod.Stripe.errors.StripeSignatureVerificationError {
      
      /* CompleteClass */
      override val headers: StringDictionary[String] = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var message: String = js.native
      
      /* standard es5 */
      /* CompleteClass */
      var name: String = js.native
      
      /* CompleteClass */
      override val raw: Any = js.native
      
      /**
        * See the "error types" section at https://stripe.com/docs/api/errors
        */
      /* CompleteClass */
      override val rawType: RawErrorType = js.native
      
      /* CompleteClass */
      override val requestId: String = js.native
      
      /* CompleteClass */
      override val `type`: typings.stripe.stripeStrings.StripeError | typings.stripe.stripeStrings.StripeCardError | typings.stripe.stripeStrings.StripeInvalidRequestError | typings.stripe.stripeStrings.StripeAPIError | typings.stripe.stripeStrings.StripeAuthenticationError | typings.stripe.stripeStrings.StripePermissionError | typings.stripe.stripeStrings.StripeRateLimitError | typings.stripe.stripeStrings.StripeConnectionError | typings.stripe.stripeStrings.StripeSignatureVerificationError | typings.stripe.stripeStrings.StripeIdempotencyError | typings.stripe.stripeStrings.StripeInvalidGrantError = js.native
      /* CompleteClass */
      @JSName("type")
      override val type_StripeSignatureVerificationError: typings.stripe.stripeStrings.StripeSignatureVerificationError = js.native
    }
    
    inline def generate(rawError: StripeRawErrortypeRawErro): typings.stripe.mod.Stripe.errors.StripeError = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(rawError.asInstanceOf[js.Any]).asInstanceOf[typings.stripe.mod.Stripe.errors.StripeError]
    inline def generate(rawError: StripeRawErrortypeapierro): typings.stripe.mod.Stripe.errors.StripeAPIError = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(rawError.asInstanceOf[js.Any]).asInstanceOf[typings.stripe.mod.Stripe.errors.StripeAPIError]
    inline def generate(rawError: StripeRawErrortypeauthent): typings.stripe.mod.Stripe.errors.StripeAuthenticationError = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(rawError.asInstanceOf[js.Any]).asInstanceOf[typings.stripe.mod.Stripe.errors.StripeAuthenticationError]
    inline def generate(rawError: StripeRawErrortypecarderr): typings.stripe.mod.Stripe.errors.StripeCardError = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(rawError.asInstanceOf[js.Any]).asInstanceOf[typings.stripe.mod.Stripe.errors.StripeCardError]
    inline def generate(rawError: StripeRawErrortypeidempot): typings.stripe.mod.Stripe.errors.StripeIdempotencyError = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(rawError.asInstanceOf[js.Any]).asInstanceOf[typings.stripe.mod.Stripe.errors.StripeIdempotencyError]
    inline def generate(rawError: StripeRawErrortypeinvalid): typings.stripe.mod.Stripe.errors.StripeInvalidRequestError = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(rawError.asInstanceOf[js.Any]).asInstanceOf[typings.stripe.mod.Stripe.errors.StripeInvalidRequestError]
    inline def generate(rawError: StripeRawErrortypeinvalidCharge): typings.stripe.mod.Stripe.errors.StripeInvalidGrantError = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(rawError.asInstanceOf[js.Any]).asInstanceOf[typings.stripe.mod.Stripe.errors.StripeInvalidGrantError]
    inline def generate(rawError: StripeRawErrortyperatelim): typings.stripe.mod.Stripe.errors.StripeRateLimitError = ^.asInstanceOf[js.Dynamic].applyDynamic("generate")(rawError.asInstanceOf[js.Any]).asInstanceOf[typings.stripe.mod.Stripe.errors.StripeRateLimitError]
  }
}
