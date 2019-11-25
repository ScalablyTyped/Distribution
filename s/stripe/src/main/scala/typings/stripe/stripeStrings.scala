package typings.stripe

import typings.stripe.stripeMod.creditNotes.CreditNoteReason
import typings.stripe.stripeMod.customerBalanceTransactions.CustomerBalanceTransactionType
import typings.stripe.stripeMod.customerTaxIds.TaxIdType
import typings.stripe.stripeMod.errors.RawType
import typings.stripe.stripeMod.events.EventType
import typings.stripe.stripeMod.files.IPurpose
import typings.stripe.stripeMod.orders.OrderStatus
import typings.stripe.stripeMod.paymentIntents.PaymentIntendDataFutureUsageOptions
import typings.stripe.stripeMod.paymentIntents.PaymentIntentDataCaptureMethodOptions
import typings.stripe.stripeMod.paymentIntents.PaymentIntentFutureUsageType
import typings.stripe.stripeMod.paymentIntents.PaymentIntentPaymentMethodType
import typings.stripe.stripeMod.paymentIntents.PaymentIntentStripeProvidedCancellationReason
import typings.stripe.stripeMod.paymentIntents.PaymentIntentUserProvidedCancellationReason
import typings.stripe.stripeMod.paymentMethods.CardBrand
import typings.stripe.stripeMod.payouts.PayoutMethods
import typings.stripe.stripeMod.payouts.PayoutTypes
import typings.stripe.stripeMod.plans.IntervalUnit
import typings.stripe.stripeMod.products.ProductType
import typings.stripe.stripeMod.setupIntents.SetupIntentCancelationReason
import typings.stripe.stripeMod.setupIntents.SetupIntentPaymentMethodType
import typings.stripe.stripeMod.setupIntents.SetupIntentUsageType
import typings.stripe.stripeMod.subscriptions.SubscriptionBilling
import typings.stripe.stripeMod.subscriptions.SubscriptionStatus
import typings.stripe.stripeMod.transfers.SourceTypes
import typings.stripe.stripeMod.transfers.Statuses
import typings.stripe.stripeMod.usageRecords.IUsageRecordAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object stripeStrings {
  @js.native
  sealed trait `*` extends EventType
  
  @js.native
  sealed trait `American Express` extends js.Object
  
  @js.native
  sealed trait `Diners Club` extends js.Object
  
  @js.native
  sealed trait Discover extends js.Object
  
  @js.native
  sealed trait JCB extends js.Object
  
  @js.native
  sealed trait MasterCard extends js.Object
  
  @js.native
  sealed trait StripeAPIError extends js.Object
  
  @js.native
  sealed trait StripeAuthenticationError extends js.Object
  
  @js.native
  sealed trait StripeCardError extends js.Object
  
  @js.native
  sealed trait StripeConnectionError extends js.Object
  
  @js.native
  sealed trait StripeIdempotencyError extends js.Object
  
  @js.native
  sealed trait StripeInvalidRequestError extends js.Object
  
  @js.native
  sealed trait StripePermissionError extends js.Object
  
  @js.native
  sealed trait StripeRateLimitError extends js.Object
  
  @js.native
  sealed trait StripeSignatureVerificationError extends js.Object
  
  @js.native
  sealed trait Unknown extends js.Object
  
  @js.native
  sealed trait Visa extends js.Object
  
  @js.native
  sealed trait abandoned
    extends PaymentIntentUserProvidedCancellationReason
       with SetupIntentCancelationReason
  
  @js.native
  sealed trait accepted extends js.Object
  
  @js.native
  sealed trait account extends js.Object
  
  @js.native
  sealed trait accountDOTapplicationDOTauthorized extends EventType
  
  @js.native
  sealed trait accountDOTapplicationDOTdeauthorized extends EventType
  
  @js.native
  sealed trait accountDOTexternal_accountDOTcreated extends EventType
  
  @js.native
  sealed trait accountDOTexternal_accountDOTdeleted extends EventType
  
  @js.native
  sealed trait accountDOTexternal_accountDOTupdated extends EventType
  
  @js.native
  sealed trait accountDOTupdated extends EventType
  
  @js.native
  sealed trait ach_credit_transfer extends js.Object
  
  @js.native
  sealed trait ach_debit extends js.Object
  
  @js.native
  sealed trait active extends SubscriptionStatus
  
  @js.native
  sealed trait adjustment extends CustomerBalanceTransactionType
  
  @js.native
  sealed trait alipay extends js.Object
  
  @js.native
  sealed trait alipay_account extends SourceTypes
  
  @js.native
  sealed trait all extends js.Object
  
  @js.native
  sealed trait amex extends CardBrand
  
  @js.native
  sealed trait amex_express_checkout extends js.Object
  
  @js.native
  sealed trait android_pay extends js.Object
  
  @js.native
  sealed trait any extends js.Object
  
  @js.native
  sealed trait api_error extends RawType
  
  @js.native
  sealed trait apple_pay extends js.Object
  
  @js.native
  sealed trait application extends js.Object
  
  @js.native
  sealed trait `application/octet-stream` extends js.Object
  
  @js.native
  sealed trait application_fee extends js.Object
  
  @js.native
  sealed trait application_feeDOTcreated extends EventType
  
  @js.native
  sealed trait application_feeDOTrefundDOTupdated extends EventType
  
  @js.native
  sealed trait application_feeDOTrefunded extends EventType
  
  @js.native
  sealed trait application_fee_refund extends js.Object
  
  @js.native
  sealed trait applied_to_invoice extends CustomerBalanceTransactionType
  
  @js.native
  sealed trait approved extends js.Object
  
  @js.native
  sealed trait approved_by_network extends js.Object
  
  @js.native
  sealed trait au_abn extends TaxIdType
  
  @js.native
  sealed trait authorization_code extends js.Object
  
  @js.native
  sealed trait authorized extends js.Object
  
  @js.native
  sealed trait auto extends js.Object
  
  @js.native
  sealed trait automatic
    extends PaymentIntentDataCaptureMethodOptions
       with PaymentIntentStripeProvidedCancellationReason
  
  @js.native
  sealed trait available extends js.Object
  
  @js.native
  sealed trait balanceDOTavailable extends EventType
  
  @js.native
  sealed trait bancontact extends js.Object
  
  @js.native
  sealed trait bank_account
    extends PayoutTypes
       with SourceTypes
  
  @js.native
  sealed trait bank_cannot_process extends js.Object
  
  @js.native
  sealed trait bearer extends js.Object
  
  @js.native
  sealed trait bitcoin_receiver extends SourceTypes
  
  @js.native
  sealed trait blocked extends js.Object
  
  @js.native
  sealed trait book extends js.Object
  
  @js.native
  sealed trait bucket extends js.Object
  
  @js.native
  sealed trait business_logo extends IPurpose
  
  @js.native
  sealed trait canceled
    extends OrderStatus
       with Statuses
       with SubscriptionStatus
  
  @js.native
  sealed trait capabilityDOTupdated extends EventType
  
  @js.native
  sealed trait card
    extends PaymentIntentPaymentMethodType
       with PayoutTypes
       with SetupIntentPaymentMethodType
       with SourceTypes
  
  @js.native
  sealed trait card_error extends RawType
  
  @js.native
  sealed trait card_present
    extends PaymentIntentPaymentMethodType
       with SetupIntentPaymentMethodType
  
  @js.native
  sealed trait challenge_only extends js.Object
  
  @js.native
  sealed trait charge extends js.Object
  
  @js.native
  sealed trait chargeDOTcaptured extends EventType
  
  @js.native
  sealed trait chargeDOTdisputeDOTclosed extends EventType
  
  @js.native
  sealed trait chargeDOTdisputeDOTcreated extends EventType
  
  @js.native
  sealed trait chargeDOTdisputeDOTfunds_reinstated extends EventType
  
  @js.native
  sealed trait chargeDOTdisputeDOTfunds_withdrawn extends EventType
  
  @js.native
  sealed trait chargeDOTdisputeDOTupdated extends EventType
  
  @js.native
  sealed trait chargeDOTexpired extends EventType
  
  @js.native
  sealed trait chargeDOTfailed extends EventType
  
  @js.native
  sealed trait chargeDOTpending extends EventType
  
  @js.native
  sealed trait chargeDOTrefundDOTupdated extends EventType
  
  @js.native
  sealed trait chargeDOTrefunded extends EventType
  
  @js.native
  sealed trait chargeDOTsucceeded extends EventType
  
  @js.native
  sealed trait chargeDOTupdated extends EventType
  
  @js.native
  sealed trait charge_automatically extends SubscriptionBilling
  
  @js.native
  sealed trait charge_refunded extends js.Object
  
  @js.native
  sealed trait chargeable extends js.Object
  
  @js.native
  sealed trait checkoutDOTsessionDOTcompleted extends EventType
  
  @js.native
  sealed trait code_verification extends js.Object
  
  @js.native
  sealed trait company extends js.Object
  
  @js.native
  sealed trait consumed extends js.Object
  
  @js.native
  sealed trait country_spec extends js.Object
  
  @js.native
  sealed trait coupon extends js.Object
  
  @js.native
  sealed trait couponDOTcreated extends EventType
  
  @js.native
  sealed trait couponDOTdeleted extends EventType
  
  @js.native
  sealed trait couponDOTupdated extends EventType
  
  @js.native
  sealed trait created extends OrderStatus
  
  @js.native
  sealed trait credit extends js.Object
  
  @js.native
  sealed trait credit_not_processed extends js.Object
  
  @js.native
  sealed trait credit_note extends CustomerBalanceTransactionType
  
  @js.native
  sealed trait credit_noteDOTcreated extends EventType
  
  @js.native
  sealed trait credit_noteDOTupdated extends EventType
  
  @js.native
  sealed trait credit_noteDOTvoided extends EventType
  
  @js.native
  sealed trait custom extends js.Object
  
  @js.native
  sealed trait customer extends js.Object
  
  @js.native
  sealed trait customerDOTcreated extends EventType
  
  @js.native
  sealed trait customerDOTdeleted extends EventType
  
  @js.native
  sealed trait customerDOTdiscountDOTcreated extends EventType
  
  @js.native
  sealed trait customerDOTdiscountDOTdeleted extends EventType
  
  @js.native
  sealed trait customerDOTdiscountDOTupdated extends EventType
  
  @js.native
  sealed trait customerDOTsourceDOTcreated extends EventType
  
  @js.native
  sealed trait customerDOTsourceDOTdeleted extends EventType
  
  @js.native
  sealed trait customerDOTsourceDOTexpiring extends EventType
  
  @js.native
  sealed trait customerDOTsourceDOTupdated extends EventType
  
  @js.native
  sealed trait customerDOTsubscriptionDOTcreated extends EventType
  
  @js.native
  sealed trait customerDOTsubscriptionDOTdeleted extends EventType
  
  @js.native
  sealed trait customerDOTsubscriptionDOTtrial_will_end extends EventType
  
  @js.native
  sealed trait customerDOTsubscriptionDOTupdated extends EventType
  
  @js.native
  sealed trait customerDOTtax_idDOTcreated extends EventType
  
  @js.native
  sealed trait customerDOTtax_idDOTdeleted extends EventType
  
  @js.native
  sealed trait customerDOTtax_idDOTupdated extends EventType
  
  @js.native
  sealed trait customerDOTupdated extends EventType
  
  @js.native
  sealed trait customer_balance_transaction extends js.Object
  
  @js.native
  sealed trait da extends js.Object
  
  @js.native
  sealed trait daily extends js.Object
  
  @js.native
  sealed trait day extends IntervalUnit
  
  @js.native
  sealed trait de extends js.Object
  
  @js.native
  sealed trait debit extends js.Object
  
  @js.native
  sealed trait debit_not_authorized extends js.Object
  
  @js.native
  sealed trait declined extends js.Object
  
  @js.native
  sealed trait declined_by_network extends js.Object
  
  @js.native
  sealed trait diners extends CardBrand
  
  @js.native
  sealed trait disabled extends js.Object
  
  @js.native
  sealed trait discount extends js.Object
  
  @js.native
  sealed trait discover_ extends CardBrand
  
  @js.native
  sealed trait dispute extends js.Object
  
  @js.native
  sealed trait dispute_evidence extends IPurpose
  
  @js.native
  sealed trait disputed extends js.Object
  
  @js.native
  sealed trait donate extends js.Object
  
  @js.native
  sealed trait down extends js.Object
  
  @js.native
  sealed trait draft extends js.Object
  
  @js.native
  sealed trait duplicate
    extends CreditNoteReason
       with PaymentIntentUserProvidedCancellationReason
       with SetupIntentCancelationReason
  
  @js.native
  sealed trait email extends js.Object
  
  @js.native
  sealed trait en extends js.Object
  
  @js.native
  sealed trait enabled extends js.Object
  
  @js.native
  sealed trait ephemeral_key extends js.Object
  
  @js.native
  sealed trait eps extends js.Object
  
  @js.native
  sealed trait errored extends js.Object
  
  @js.native
  sealed trait es extends js.Object
  
  @js.native
  sealed trait eu_vat extends TaxIdType
  
  @js.native
  sealed trait event extends js.Object
  
  @js.native
  sealed trait exact extends js.Object
  
  @js.native
  sealed trait exempt extends js.Object
  
  @js.native
  sealed trait expired_or_canceled_card extends js.Object
  
  @js.native
  sealed trait express extends js.Object
  
  @js.native
  sealed trait fail extends js.Object
  
  @js.native
  sealed trait failed extends Statuses
  
  @js.native
  sealed trait failed_invoice extends PaymentIntentStripeProvidedCancellationReason
  
  @js.native
  sealed trait female extends js.Object
  
  @js.native
  sealed trait fi extends js.Object
  
  @js.native
  sealed trait file extends js.Object
  
  @js.native
  sealed trait fileDOTcreated extends EventType
  
  @js.native
  sealed trait file_link extends js.Object
  
  @js.native
  sealed trait finite extends js.Object
  
  @js.native
  sealed trait forever extends js.Object
  
  @js.native
  sealed trait fr extends js.Object
  
  @js.native
  sealed trait fraud extends js.Object
  
  @js.native
  sealed trait fraudulent
    extends CreditNoteReason
       with PaymentIntentUserProvidedCancellationReason
  
  @js.native
  sealed trait friday extends js.Object
  
  @js.native
  sealed trait fulfilled extends OrderStatus
  
  @js.native
  sealed trait general extends js.Object
  
  @js.native
  sealed trait giropay extends js.Object
  
  @js.native
  sealed trait good extends ProductType
  
  @js.native
  sealed trait google_pay extends js.Object
  
  @js.native
  sealed trait graduated extends js.Object
  
  @js.native
  sealed trait ideal extends js.Object
  
  @js.native
  sealed trait idempotency_error extends RawType
  
  @js.native
  sealed trait identity_document extends IPurpose
  
  @js.native
  sealed trait in_gst extends TaxIdType
  
  @js.native
  sealed trait in_stock extends js.Object
  
  @js.native
  sealed trait in_transit extends Statuses
  
  @js.native
  sealed trait inactive extends js.Object
  
  @js.native
  sealed trait incomplete extends SubscriptionStatus
  
  @js.native
  sealed trait incomplete_expired extends SubscriptionStatus
  
  @js.native
  sealed trait incorporation_article extends IPurpose
  
  @js.native
  sealed trait incorporation_document extends IPurpose
  
  @js.native
  sealed trait incorrect_account_details extends js.Object
  
  @js.native
  sealed trait increment extends IUsageRecordAction
  
  @js.native
  sealed trait individual extends js.Object
  
  @js.native
  sealed trait inf extends js.Object
  
  @js.native
  sealed trait infinite extends js.Object
  
  @js.native
  sealed trait initial extends CustomerBalanceTransactionType
  
  @js.native
  sealed trait instant extends PayoutMethods
  
  @js.native
  sealed trait insufficient_funds extends js.Object
  
  @js.native
  sealed trait invalid extends js.Object
  
  @js.native
  sealed trait invalid_request_error extends RawType
  
  @js.native
  sealed trait invoice extends js.Object
  
  @js.native
  sealed trait invoiceDOTcreated extends EventType
  
  @js.native
  sealed trait invoiceDOTdeleted extends EventType
  
  @js.native
  sealed trait invoiceDOTfinalized extends EventType
  
  @js.native
  sealed trait invoiceDOTmarked_uncollectible extends EventType
  
  @js.native
  sealed trait invoiceDOTpayment_action_required extends EventType
  
  @js.native
  sealed trait invoiceDOTpayment_failed extends EventType
  
  @js.native
  sealed trait invoiceDOTpayment_succeeded extends EventType
  
  @js.native
  sealed trait invoiceDOTsent extends EventType
  
  @js.native
  sealed trait invoiceDOTupcoming extends EventType
  
  @js.native
  sealed trait invoiceDOTupdated extends EventType
  
  @js.native
  sealed trait invoiceDOTvoided extends EventType
  
  @js.native
  sealed trait invoice_too_large extends CustomerBalanceTransactionType
  
  @js.native
  sealed trait invoice_too_small extends CustomerBalanceTransactionType
  
  @js.native
  sealed trait invoiceitem extends js.Object
  
  @js.native
  sealed trait invoiceitemDOTcreated extends EventType
  
  @js.native
  sealed trait invoiceitemDOTdeleted extends EventType
  
  @js.native
  sealed trait invoiceitemDOTupdated extends EventType
  
  @js.native
  sealed trait issued extends js.Object
  
  @js.native
  sealed trait issuer_declined extends js.Object
  
  @js.native
  sealed trait issuing_authorizationDOTcreated extends EventType
  
  @js.native
  sealed trait issuing_authorizationDOTrequest extends EventType
  
  @js.native
  sealed trait issuing_authorizationDOTupdated extends EventType
  
  @js.native
  sealed trait issuing_cardDOTcreated extends EventType
  
  @js.native
  sealed trait issuing_cardDOTupdated extends EventType
  
  @js.native
  sealed trait issuing_cardholderDOTcreated extends EventType
  
  @js.native
  sealed trait issuing_cardholderDOTupdated extends EventType
  
  @js.native
  sealed trait issuing_disputeDOTcreated extends EventType
  
  @js.native
  sealed trait issuing_disputeDOTupdated extends EventType
  
  @js.native
  sealed trait issuing_settlementDOTcreated extends EventType
  
  @js.native
  sealed trait issuing_settlementDOTupdated extends EventType
  
  @js.native
  sealed trait issuing_transactionDOTcreated extends EventType
  
  @js.native
  sealed trait issuing_transactionDOTupdated extends EventType
  
  @js.native
  sealed trait it extends js.Object
  
  @js.native
  sealed trait ja extends js.Object
  
  @js.native
  sealed trait jcb_ extends CardBrand
  
  @js.native
  sealed trait jpg extends js.Object
  
  @js.native
  sealed trait klarna extends js.Object
  
  @js.native
  sealed trait last_during_period extends js.Object
  
  @js.native
  sealed trait last_ever extends js.Object
  
  @js.native
  sealed trait licensed extends js.Object
  
  @js.native
  sealed trait limited extends js.Object
  
  @js.native
  sealed trait line_item extends js.Object
  
  @js.native
  sealed trait list extends js.Object
  
  @js.native
  sealed trait login_link extends js.Object
  
  @js.native
  sealed trait lost extends js.Object
  
  @js.native
  sealed trait lost_or_stolen_card extends js.Object
  
  @js.native
  sealed trait male extends js.Object
  
  @js.native
  sealed trait mandateDOTupdated extends EventType
  
  @js.native
  sealed trait manual extends PaymentIntentDataCaptureMethodOptions
  
  @js.native
  sealed trait manual_review extends js.Object
  
  @js.native
  sealed trait mastercard_ extends CardBrand
  
  @js.native
  sealed trait masterpass extends js.Object
  
  @js.native
  sealed trait max extends js.Object
  
  @js.native
  sealed trait metered extends js.Object
  
  @js.native
  sealed trait missing extends js.Object
  
  @js.native
  sealed trait monday extends js.Object
  
  @js.native
  sealed trait month extends IntervalUnit
  
  @js.native
  sealed trait monthly extends js.Object
  
  @js.native
  sealed trait multibanco extends js.Object
  
  @js.native
  sealed trait nb extends js.Object
  
  @js.native
  sealed trait needs_response extends js.Object
  
  @js.native
  sealed trait network_cost extends js.Object
  
  @js.native
  sealed trait `new` extends js.Object
  
  @js.native
  sealed trait nl extends js.Object
  
  @js.native
  sealed trait no_vat extends TaxIdType
  
  @js.native
  sealed trait none extends js.Object
  
  @js.native
  sealed trait not_required extends js.Object
  
  @js.native
  sealed trait not_sent_to_network extends js.Object
  
  @js.native
  sealed trait now extends js.Object
  
  @js.native
  sealed trait nz_gst extends TaxIdType
  
  @js.native
  sealed trait off_session
    extends PaymentIntendDataFutureUsageOptions
       with PaymentIntentFutureUsageType
       with SetupIntentUsageType
  
  @js.native
  sealed trait offline extends js.Object
  
  @js.native
  sealed trait on_session
    extends PaymentIntendDataFutureUsageOptions
       with PaymentIntentFutureUsageType
       with SetupIntentUsageType
  
  @js.native
  sealed trait once extends js.Object
  
  @js.native
  sealed trait one_time extends js.Object
  
  @js.native
  sealed trait online extends js.Object
  
  @js.native
  sealed trait open extends js.Object
  
  @js.native
  sealed trait order extends js.Object
  
  @js.native
  sealed trait orderDOTcreated extends EventType
  
  @js.native
  sealed trait orderDOTpayment_failed extends EventType
  
  @js.native
  sealed trait orderDOTpayment_succeeded extends EventType
  
  @js.native
  sealed trait orderDOTupdated extends EventType
  
  @js.native
  sealed trait order_change extends CreditNoteReason
  
  @js.native
  sealed trait order_item extends js.Object
  
  @js.native
  sealed trait order_returnDOTcreated extends EventType
  
  @js.native
  sealed trait other extends js.Object
  
  @js.native
  sealed trait out_of_stock extends js.Object
  
  @js.native
  sealed trait p24 extends js.Object
  
  @js.native
  sealed trait paid
    extends OrderStatus
       with Statuses
  
  @js.native
  sealed trait pass extends js.Object
  
  @js.native
  sealed trait past_due extends SubscriptionStatus
  
  @js.native
  sealed trait pay extends js.Object
  
  @js.native
  sealed trait payment extends js.Object
  
  @js.native
  sealed trait payment_intent extends js.Object
  
  @js.native
  sealed trait payment_intentDOTamount_capturable_updated extends EventType
  
  @js.native
  sealed trait payment_intentDOTcanceled extends EventType
  
  @js.native
  sealed trait payment_intentDOTcreated extends EventType
  
  @js.native
  sealed trait payment_intentDOTpayment_failed extends EventType
  
  @js.native
  sealed trait payment_intentDOTsucceeded extends EventType
  
  @js.native
  sealed trait payment_method extends js.Object
  
  @js.native
  sealed trait payment_methodDOTattached extends EventType
  
  @js.native
  sealed trait payment_methodDOTcard_automatically_updated extends EventType
  
  @js.native
  sealed trait payment_methodDOTdetached extends EventType
  
  @js.native
  sealed trait payment_methodDOTupdated extends EventType
  
  @js.native
  sealed trait payout extends js.Object
  
  @js.native
  sealed trait payoutDOTcanceled extends EventType
  
  @js.native
  sealed trait payoutDOTcreated extends EventType
  
  @js.native
  sealed trait payoutDOTfailed extends EventType
  
  @js.native
  sealed trait payoutDOTpaid extends EventType
  
  @js.native
  sealed trait payoutDOTupdated extends EventType
  
  @js.native
  sealed trait payout_failure extends js.Object
  
  @js.native
  sealed trait pdf extends js.Object
  
  @js.native
  sealed trait pending extends Statuses
  
  @js.native
  sealed trait per_unit extends js.Object
  
  @js.native
  sealed trait person extends js.Object
  
  @js.native
  sealed trait personDOTcreated extends EventType
  
  @js.native
  sealed trait personDOTdeleted extends EventType
  
  @js.native
  sealed trait personDOTupdated extends EventType
  
  @js.native
  sealed trait pl extends js.Object
  
  @js.native
  sealed trait plan extends js.Object
  
  @js.native
  sealed trait planDOTcreated extends EventType
  
  @js.native
  sealed trait planDOTdeleted extends EventType
  
  @js.native
  sealed trait planDOTupdated extends EventType
  
  @js.native
  sealed trait png extends js.Object
  
  @js.native
  sealed trait post_payment extends js.Object
  
  @js.native
  sealed trait pre_payment extends js.Object
  
  @js.native
  sealed trait prepaid extends js.Object
  
  @js.native
  sealed trait processing extends js.Object
  
  @js.native
  sealed trait processing_error extends js.Object
  
  @js.native
  sealed trait product extends js.Object
  
  @js.native
  sealed trait productDOTcreated extends EventType
  
  @js.native
  sealed trait productDOTdeleted extends EventType
  
  @js.native
  sealed trait productDOTupdated extends EventType
  
  @js.native
  sealed trait product_not_received extends js.Object
  
  @js.native
  sealed trait product_unacceptable extends js.Object
  
  @js.native
  sealed trait product_unsatisfactory extends CreditNoteReason
  
  @js.native
  sealed trait pt extends js.Object
  
  @js.native
  sealed trait publishable extends js.Object
  
  @js.native
  sealed trait radarDOTearly_fraud_warningDOTcreated extends EventType
  
  @js.native
  sealed trait radarDOTearly_fraud_warningDOTupdated extends EventType
  
  @js.native
  sealed trait range extends js.Object
  
  @js.native
  sealed trait receiver extends js.Object
  
  @js.native
  sealed trait recipientDOTcreated extends EventType
  
  @js.native
  sealed trait recipientDOTdeleted extends EventType
  
  @js.native
  sealed trait recipientDOTupdated extends EventType
  
  @js.native
  sealed trait redirect extends js.Object
  
  @js.native
  sealed trait redirect_to_url extends js.Object
  
  @js.native
  sealed trait refresh_token extends js.Object
  
  @js.native
  sealed trait refund extends js.Object
  
  @js.native
  sealed trait refunded extends js.Object
  
  @js.native
  sealed trait refunded_as_fraud extends js.Object
  
  @js.native
  sealed trait refused extends js.Object
  
  @js.native
  sealed trait repeating extends js.Object
  
  @js.native
  sealed trait reportingDOTreport_runDOTfailed extends EventType
  
  @js.native
  sealed trait reportingDOTreport_runDOTsucceeded extends EventType
  
  @js.native
  sealed trait reportingDOTreport_typeDOTupdated extends EventType
  
  @js.native
  sealed trait request extends js.Object
  
  @js.native
  sealed trait requested extends js.Object
  
  @js.native
  sealed trait requested_by_customer
    extends PaymentIntentUserProvidedCancellationReason
       with SetupIntentCancelationReason
  
  @js.native
  sealed trait required extends js.Object
  
  @js.native
  sealed trait requires_action extends js.Object
  
  @js.native
  sealed trait requires_capture extends js.Object
  
  @js.native
  sealed trait requires_confirmation extends js.Object
  
  @js.native
  sealed trait requires_payment_method extends js.Object
  
  @js.native
  sealed trait response extends js.Object
  
  @js.native
  sealed trait response_disabled extends js.Object
  
  @js.native
  sealed trait returned extends OrderStatus
  
  @js.native
  sealed trait reusable extends js.Object
  
  @js.native
  sealed trait reverse extends js.Object
  
  @js.native
  sealed trait reversed extends js.Object
  
  @js.native
  sealed trait reversed_after_approval extends js.Object
  
  @js.native
  sealed trait review extends js.Object
  
  @js.native
  sealed trait reviewDOTclosed extends EventType
  
  @js.native
  sealed trait reviewDOTopened extends EventType
  
  @js.native
  sealed trait rule extends js.Object
  
  @js.native
  sealed trait safe extends js.Object
  
  @js.native
  sealed trait samsung_pay extends js.Object
  
  @js.native
  sealed trait saturday extends js.Object
  
  @js.native
  sealed trait scheduled extends js.Object
  
  @js.native
  sealed trait secret extends js.Object
  
  @js.native
  sealed trait send_invoice extends SubscriptionBilling
  
  @js.native
  sealed trait sepa_debit extends SetupIntentPaymentMethodType
  
  @js.native
  sealed trait service extends ProductType
  
  @js.native
  sealed trait set extends IUsageRecordAction
  
  @js.native
  sealed trait setup extends js.Object
  
  @js.native
  sealed trait setup_intent extends js.Object
  
  @js.native
  sealed trait setup_intentDOTcanceled extends EventType
  
  @js.native
  sealed trait setup_intentDOTcreated extends EventType
  
  @js.native
  sealed trait setup_intentDOTsetup_failed extends EventType
  
  @js.native
  sealed trait setup_intentDOTsucceeded extends EventType
  
  @js.native
  sealed trait shipping extends js.Object
  
  @js.native
  sealed trait sigmaDOTscheduled_query_runDOTcreated extends EventType
  
  @js.native
  sealed trait single_use extends js.Object
  
  @js.native
  sealed trait sku extends js.Object
  
  @js.native
  sealed trait skuDOTcreated extends EventType
  
  @js.native
  sealed trait skuDOTdeleted extends EventType
  
  @js.native
  sealed trait skuDOTupdated extends EventType
  
  @js.native
  sealed trait sofort extends js.Object
  
  @js.native
  sealed trait source extends js.Object
  
  @js.native
  sealed trait sourceDOTcanceled extends EventType
  
  @js.native
  sealed trait sourceDOTchargeable extends EventType
  
  @js.native
  sealed trait sourceDOTfailed extends EventType
  
  @js.native
  sealed trait sourceDOTmandate_notification extends EventType
  
  @js.native
  sealed trait sourceDOTrefund_attributes_required extends EventType
  
  @js.native
  sealed trait sourceDOTtransactionDOTcreated extends EventType
  
  @js.native
  sealed trait sourceDOTtransactionDOTupdated extends EventType
  
  @js.native
  sealed trait standard extends PayoutMethods
  
  @js.native
  sealed trait string extends js.Object
  
  @js.native
  sealed trait stripe_account extends js.Object
  
  @js.native
  sealed trait stripe_fee extends js.Object
  
  @js.native
  sealed trait subscription extends js.Object
  
  @js.native
  sealed trait subscription_canceled extends js.Object
  
  @js.native
  sealed trait subscription_create extends js.Object
  
  @js.native
  sealed trait subscription_cycle extends js.Object
  
  @js.native
  sealed trait subscription_item extends js.Object
  
  @js.native
  sealed trait subscription_scheduleDOTaborted extends EventType
  
  @js.native
  sealed trait subscription_scheduleDOTcanceled extends EventType
  
  @js.native
  sealed trait subscription_scheduleDOTcompleted extends EventType
  
  @js.native
  sealed trait subscription_scheduleDOTcreated extends EventType
  
  @js.native
  sealed trait subscription_scheduleDOTexpiring extends EventType
  
  @js.native
  sealed trait subscription_scheduleDOTreleased extends EventType
  
  @js.native
  sealed trait subscription_scheduleDOTupdated extends EventType
  
  @js.native
  sealed trait subscription_threshold extends js.Object
  
  @js.native
  sealed trait subscription_update extends js.Object
  
  @js.native
  sealed trait succeeded extends js.Object
  
  @js.native
  sealed trait sum extends js.Object
  
  @js.native
  sealed trait sunday extends js.Object
  
  @js.native
  sealed trait sv extends js.Object
  
  @js.native
  sealed trait tax extends js.Object
  
  @js.native
  sealed trait tax_id extends js.Object
  
  @js.native
  sealed trait tax_rate extends js.Object
  
  @js.native
  sealed trait tax_rateDOTcreated extends EventType
  
  @js.native
  sealed trait tax_rateDOTupdated extends EventType
  
  @js.native
  sealed trait terms_of_service extends js.Object
  
  @js.native
  sealed trait three_d_secure extends js.Object
  
  @js.native
  sealed trait thursday extends js.Object
  
  @js.native
  sealed trait tiered extends js.Object
  
  @js.native
  sealed trait token extends js.Object
  
  @js.native
  sealed trait topup extends js.Object
  
  @js.native
  sealed trait topupDOTcreated extends EventType
  
  @js.native
  sealed trait topupDOTfailed extends EventType
  
  @js.native
  sealed trait topupDOTreversed extends EventType
  
  @js.native
  sealed trait topupDOTsucceeded extends EventType
  
  @js.native
  sealed trait transfer extends js.Object
  
  @js.native
  sealed trait transferDOTcreated extends EventType
  
  @js.native
  sealed trait transferDOTfailed extends EventType
  
  @js.native
  sealed trait transferDOTpaid extends EventType
  
  @js.native
  sealed trait transferDOTreversed extends EventType
  
  @js.native
  sealed trait transferDOTupdated extends EventType
  
  @js.native
  sealed trait transfer_reversal extends js.Object
  
  @js.native
  sealed trait trialing extends SubscriptionStatus
  
  @js.native
  sealed trait tuesday extends js.Object
  
  @js.native
  sealed trait unavailable extends js.Object
  
  @js.native
  sealed trait unchanged extends js.Object
  
  @js.native
  sealed trait unchecked extends js.Object
  
  @js.native
  sealed trait uncollectible extends js.Object
  
  @js.native
  sealed trait under_review extends js.Object
  
  @js.native
  sealed trait unionpay extends CardBrand
  
  @js.native
  sealed trait unknown_
    extends CardBrand
       with TaxIdType
  
  @js.native
  sealed trait unpaid extends SubscriptionStatus
  
  @js.native
  sealed trait unrecognized extends js.Object
  
  @js.native
  sealed trait unspent_receiver_credit extends CustomerBalanceTransactionType
  
  @js.native
  sealed trait unverified extends js.Object
  
  @js.native
  sealed trait up extends js.Object
  
  @js.native
  sealed trait upcoming extends js.Object
  
  @js.native
  sealed trait usage_record extends js.Object
  
  @js.native
  sealed trait use_stripe_sdk extends js.Object
  
  @js.native
  sealed trait user_abort extends js.Object
  
  @js.native
  sealed trait validated extends js.Object
  
  @js.native
  sealed trait variable extends js.Object
  
  @js.native
  sealed trait verification_failed extends js.Object
  
  @js.native
  sealed trait verified extends js.Object
  
  @js.native
  sealed trait visa_ extends CardBrand
  
  @js.native
  sealed trait visa_checkout extends js.Object
  
  @js.native
  sealed trait void extends js.Object
  
  @js.native
  sealed trait void_invoice extends PaymentIntentStripeProvidedCancellationReason
  
  @js.native
  sealed trait volume extends js.Object
  
  @js.native
  sealed trait warning_closed extends js.Object
  
  @js.native
  sealed trait warning_needs_response extends js.Object
  
  @js.native
  sealed trait warning_under_review extends js.Object
  
  @js.native
  sealed trait webhook_endpoint extends js.Object
  
  @js.native
  sealed trait wechat extends js.Object
  
  @js.native
  sealed trait wednesday extends js.Object
  
  @js.native
  sealed trait week extends IntervalUnit
  
  @js.native
  sealed trait weekly extends js.Object
  
  @js.native
  sealed trait won extends js.Object
  
  @js.native
  sealed trait year extends IntervalUnit
  
  @js.native
  sealed trait zh extends js.Object
  
  @scala.inline
  def `*`: `*` = "*".asInstanceOf[`*`]
  @scala.inline
  def `American Express`: `American Express` = "American Express".asInstanceOf[`American Express`]
  @scala.inline
  def `Diners Club`: `Diners Club` = "Diners Club".asInstanceOf[`Diners Club`]
  @scala.inline
  def Discover: Discover = "Discover".asInstanceOf[Discover]
  @scala.inline
  def JCB: JCB = "JCB".asInstanceOf[JCB]
  @scala.inline
  def MasterCard: MasterCard = "MasterCard".asInstanceOf[MasterCard]
  @scala.inline
  def StripeAPIError: StripeAPIError = "StripeAPIError".asInstanceOf[StripeAPIError]
  @scala.inline
  def StripeAuthenticationError: StripeAuthenticationError = "StripeAuthenticationError".asInstanceOf[StripeAuthenticationError]
  @scala.inline
  def StripeCardError: StripeCardError = "StripeCardError".asInstanceOf[StripeCardError]
  @scala.inline
  def StripeConnectionError: StripeConnectionError = "StripeConnectionError".asInstanceOf[StripeConnectionError]
  @scala.inline
  def StripeIdempotencyError: StripeIdempotencyError = "StripeIdempotencyError".asInstanceOf[StripeIdempotencyError]
  @scala.inline
  def StripeInvalidRequestError: StripeInvalidRequestError = "StripeInvalidRequestError".asInstanceOf[StripeInvalidRequestError]
  @scala.inline
  def StripePermissionError: StripePermissionError = "StripePermissionError".asInstanceOf[StripePermissionError]
  @scala.inline
  def StripeRateLimitError: StripeRateLimitError = "StripeRateLimitError".asInstanceOf[StripeRateLimitError]
  @scala.inline
  def StripeSignatureVerificationError: StripeSignatureVerificationError = "StripeSignatureVerificationError".asInstanceOf[StripeSignatureVerificationError]
  @scala.inline
  def Unknown: Unknown = "Unknown".asInstanceOf[Unknown]
  @scala.inline
  def Visa: Visa = "Visa".asInstanceOf[Visa]
  @scala.inline
  def abandoned: abandoned = "abandoned".asInstanceOf[abandoned]
  @scala.inline
  def accepted: accepted = "accepted".asInstanceOf[accepted]
  @scala.inline
  def account: account = "account".asInstanceOf[account]
  @scala.inline
  def accountDOTapplicationDOTauthorized: accountDOTapplicationDOTauthorized = "account.application.authorized".asInstanceOf[accountDOTapplicationDOTauthorized]
  @scala.inline
  def accountDOTapplicationDOTdeauthorized: accountDOTapplicationDOTdeauthorized = "account.application.deauthorized".asInstanceOf[accountDOTapplicationDOTdeauthorized]
  @scala.inline
  def accountDOTexternal_accountDOTcreated: accountDOTexternal_accountDOTcreated = "account.external_account.created".asInstanceOf[accountDOTexternal_accountDOTcreated]
  @scala.inline
  def accountDOTexternal_accountDOTdeleted: accountDOTexternal_accountDOTdeleted = "account.external_account.deleted".asInstanceOf[accountDOTexternal_accountDOTdeleted]
  @scala.inline
  def accountDOTexternal_accountDOTupdated: accountDOTexternal_accountDOTupdated = "account.external_account.updated".asInstanceOf[accountDOTexternal_accountDOTupdated]
  @scala.inline
  def accountDOTupdated: accountDOTupdated = "account.updated".asInstanceOf[accountDOTupdated]
  @scala.inline
  def ach_credit_transfer: ach_credit_transfer = "ach_credit_transfer".asInstanceOf[ach_credit_transfer]
  @scala.inline
  def ach_debit: ach_debit = "ach_debit".asInstanceOf[ach_debit]
  @scala.inline
  def active: active = "active".asInstanceOf[active]
  @scala.inline
  def adjustment: adjustment = "adjustment".asInstanceOf[adjustment]
  @scala.inline
  def alipay: alipay = "alipay".asInstanceOf[alipay]
  @scala.inline
  def alipay_account: alipay_account = "alipay_account".asInstanceOf[alipay_account]
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  @scala.inline
  def amex: amex = "amex".asInstanceOf[amex]
  @scala.inline
  def amex_express_checkout: amex_express_checkout = "amex_express_checkout".asInstanceOf[amex_express_checkout]
  @scala.inline
  def android_pay: android_pay = "android_pay".asInstanceOf[android_pay]
  @scala.inline
  def any: any = "any".asInstanceOf[any]
  @scala.inline
  def api_error: api_error = "api_error".asInstanceOf[api_error]
  @scala.inline
  def apple_pay: apple_pay = "apple_pay".asInstanceOf[apple_pay]
  @scala.inline
  def application: application = "application".asInstanceOf[application]
  @scala.inline
  def `application/octet-stream`: `application/octet-stream` = "application/octet-stream".asInstanceOf[`application/octet-stream`]
  @scala.inline
  def application_fee: application_fee = "application_fee".asInstanceOf[application_fee]
  @scala.inline
  def application_feeDOTcreated: application_feeDOTcreated = "application_fee.created".asInstanceOf[application_feeDOTcreated]
  @scala.inline
  def application_feeDOTrefundDOTupdated: application_feeDOTrefundDOTupdated = "application_fee.refund.updated".asInstanceOf[application_feeDOTrefundDOTupdated]
  @scala.inline
  def application_feeDOTrefunded: application_feeDOTrefunded = "application_fee.refunded".asInstanceOf[application_feeDOTrefunded]
  @scala.inline
  def application_fee_refund: application_fee_refund = "application_fee_refund".asInstanceOf[application_fee_refund]
  @scala.inline
  def applied_to_invoice: applied_to_invoice = "applied_to_invoice".asInstanceOf[applied_to_invoice]
  @scala.inline
  def approved: approved = "approved".asInstanceOf[approved]
  @scala.inline
  def approved_by_network: approved_by_network = "approved_by_network".asInstanceOf[approved_by_network]
  @scala.inline
  def au_abn: au_abn = "au_abn".asInstanceOf[au_abn]
  @scala.inline
  def authorization_code: authorization_code = "authorization_code".asInstanceOf[authorization_code]
  @scala.inline
  def authorized: authorized = "authorized".asInstanceOf[authorized]
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def automatic: automatic = "automatic".asInstanceOf[automatic]
  @scala.inline
  def available: available = "available".asInstanceOf[available]
  @scala.inline
  def balanceDOTavailable: balanceDOTavailable = "balance.available".asInstanceOf[balanceDOTavailable]
  @scala.inline
  def bancontact: bancontact = "bancontact".asInstanceOf[bancontact]
  @scala.inline
  def bank_account: bank_account = "bank_account".asInstanceOf[bank_account]
  @scala.inline
  def bank_cannot_process: bank_cannot_process = "bank_cannot_process".asInstanceOf[bank_cannot_process]
  @scala.inline
  def bearer: bearer = "bearer".asInstanceOf[bearer]
  @scala.inline
  def bitcoin_receiver: bitcoin_receiver = "bitcoin_receiver".asInstanceOf[bitcoin_receiver]
  @scala.inline
  def blocked: blocked = "blocked".asInstanceOf[blocked]
  @scala.inline
  def book: book = "book".asInstanceOf[book]
  @scala.inline
  def bucket: bucket = "bucket".asInstanceOf[bucket]
  @scala.inline
  def business_logo: business_logo = "business_logo".asInstanceOf[business_logo]
  @scala.inline
  def canceled: canceled = "canceled".asInstanceOf[canceled]
  @scala.inline
  def capabilityDOTupdated: capabilityDOTupdated = "capability.updated".asInstanceOf[capabilityDOTupdated]
  @scala.inline
  def card: card = "card".asInstanceOf[card]
  @scala.inline
  def card_error: card_error = "card_error".asInstanceOf[card_error]
  @scala.inline
  def card_present: card_present = "card_present".asInstanceOf[card_present]
  @scala.inline
  def challenge_only: challenge_only = "challenge_only".asInstanceOf[challenge_only]
  @scala.inline
  def charge: charge = "charge".asInstanceOf[charge]
  @scala.inline
  def chargeDOTcaptured: chargeDOTcaptured = "charge.captured".asInstanceOf[chargeDOTcaptured]
  @scala.inline
  def chargeDOTdisputeDOTclosed: chargeDOTdisputeDOTclosed = "charge.dispute.closed".asInstanceOf[chargeDOTdisputeDOTclosed]
  @scala.inline
  def chargeDOTdisputeDOTcreated: chargeDOTdisputeDOTcreated = "charge.dispute.created".asInstanceOf[chargeDOTdisputeDOTcreated]
  @scala.inline
  def chargeDOTdisputeDOTfunds_reinstated: chargeDOTdisputeDOTfunds_reinstated = "charge.dispute.funds_reinstated".asInstanceOf[chargeDOTdisputeDOTfunds_reinstated]
  @scala.inline
  def chargeDOTdisputeDOTfunds_withdrawn: chargeDOTdisputeDOTfunds_withdrawn = "charge.dispute.funds_withdrawn".asInstanceOf[chargeDOTdisputeDOTfunds_withdrawn]
  @scala.inline
  def chargeDOTdisputeDOTupdated: chargeDOTdisputeDOTupdated = "charge.dispute.updated".asInstanceOf[chargeDOTdisputeDOTupdated]
  @scala.inline
  def chargeDOTexpired: chargeDOTexpired = "charge.expired".asInstanceOf[chargeDOTexpired]
  @scala.inline
  def chargeDOTfailed: chargeDOTfailed = "charge.failed".asInstanceOf[chargeDOTfailed]
  @scala.inline
  def chargeDOTpending: chargeDOTpending = "charge.pending".asInstanceOf[chargeDOTpending]
  @scala.inline
  def chargeDOTrefundDOTupdated: chargeDOTrefundDOTupdated = "charge.refund.updated".asInstanceOf[chargeDOTrefundDOTupdated]
  @scala.inline
  def chargeDOTrefunded: chargeDOTrefunded = "charge.refunded".asInstanceOf[chargeDOTrefunded]
  @scala.inline
  def chargeDOTsucceeded: chargeDOTsucceeded = "charge.succeeded".asInstanceOf[chargeDOTsucceeded]
  @scala.inline
  def chargeDOTupdated: chargeDOTupdated = "charge.updated".asInstanceOf[chargeDOTupdated]
  @scala.inline
  def charge_automatically: charge_automatically = "charge_automatically".asInstanceOf[charge_automatically]
  @scala.inline
  def charge_refunded: charge_refunded = "charge_refunded".asInstanceOf[charge_refunded]
  @scala.inline
  def chargeable: chargeable = "chargeable".asInstanceOf[chargeable]
  @scala.inline
  def checkoutDOTsessionDOTcompleted: checkoutDOTsessionDOTcompleted = "checkout.session.completed".asInstanceOf[checkoutDOTsessionDOTcompleted]
  @scala.inline
  def code_verification: code_verification = "code_verification".asInstanceOf[code_verification]
  @scala.inline
  def company: company = "company".asInstanceOf[company]
  @scala.inline
  def consumed: consumed = "consumed".asInstanceOf[consumed]
  @scala.inline
  def country_spec: country_spec = "country_spec".asInstanceOf[country_spec]
  @scala.inline
  def coupon: coupon = "coupon".asInstanceOf[coupon]
  @scala.inline
  def couponDOTcreated: couponDOTcreated = "coupon.created".asInstanceOf[couponDOTcreated]
  @scala.inline
  def couponDOTdeleted: couponDOTdeleted = "coupon.deleted".asInstanceOf[couponDOTdeleted]
  @scala.inline
  def couponDOTupdated: couponDOTupdated = "coupon.updated".asInstanceOf[couponDOTupdated]
  @scala.inline
  def created: created = "created".asInstanceOf[created]
  @scala.inline
  def credit: credit = "credit".asInstanceOf[credit]
  @scala.inline
  def credit_not_processed: credit_not_processed = "credit_not_processed".asInstanceOf[credit_not_processed]
  @scala.inline
  def credit_note: credit_note = "credit_note".asInstanceOf[credit_note]
  @scala.inline
  def credit_noteDOTcreated: credit_noteDOTcreated = "credit_note.created".asInstanceOf[credit_noteDOTcreated]
  @scala.inline
  def credit_noteDOTupdated: credit_noteDOTupdated = "credit_note.updated".asInstanceOf[credit_noteDOTupdated]
  @scala.inline
  def credit_noteDOTvoided: credit_noteDOTvoided = "credit_note.voided".asInstanceOf[credit_noteDOTvoided]
  @scala.inline
  def custom: custom = "custom".asInstanceOf[custom]
  @scala.inline
  def customer: customer = "customer".asInstanceOf[customer]
  @scala.inline
  def customerDOTcreated: customerDOTcreated = "customer.created".asInstanceOf[customerDOTcreated]
  @scala.inline
  def customerDOTdeleted: customerDOTdeleted = "customer.deleted".asInstanceOf[customerDOTdeleted]
  @scala.inline
  def customerDOTdiscountDOTcreated: customerDOTdiscountDOTcreated = "customer.discount.created".asInstanceOf[customerDOTdiscountDOTcreated]
  @scala.inline
  def customerDOTdiscountDOTdeleted: customerDOTdiscountDOTdeleted = "customer.discount.deleted".asInstanceOf[customerDOTdiscountDOTdeleted]
  @scala.inline
  def customerDOTdiscountDOTupdated: customerDOTdiscountDOTupdated = "customer.discount.updated".asInstanceOf[customerDOTdiscountDOTupdated]
  @scala.inline
  def customerDOTsourceDOTcreated: customerDOTsourceDOTcreated = "customer.source.created".asInstanceOf[customerDOTsourceDOTcreated]
  @scala.inline
  def customerDOTsourceDOTdeleted: customerDOTsourceDOTdeleted = "customer.source.deleted".asInstanceOf[customerDOTsourceDOTdeleted]
  @scala.inline
  def customerDOTsourceDOTexpiring: customerDOTsourceDOTexpiring = "customer.source.expiring".asInstanceOf[customerDOTsourceDOTexpiring]
  @scala.inline
  def customerDOTsourceDOTupdated: customerDOTsourceDOTupdated = "customer.source.updated".asInstanceOf[customerDOTsourceDOTupdated]
  @scala.inline
  def customerDOTsubscriptionDOTcreated: customerDOTsubscriptionDOTcreated = "customer.subscription.created".asInstanceOf[customerDOTsubscriptionDOTcreated]
  @scala.inline
  def customerDOTsubscriptionDOTdeleted: customerDOTsubscriptionDOTdeleted = "customer.subscription.deleted".asInstanceOf[customerDOTsubscriptionDOTdeleted]
  @scala.inline
  def customerDOTsubscriptionDOTtrial_will_end: customerDOTsubscriptionDOTtrial_will_end = "customer.subscription.trial_will_end".asInstanceOf[customerDOTsubscriptionDOTtrial_will_end]
  @scala.inline
  def customerDOTsubscriptionDOTupdated: customerDOTsubscriptionDOTupdated = "customer.subscription.updated".asInstanceOf[customerDOTsubscriptionDOTupdated]
  @scala.inline
  def customerDOTtax_idDOTcreated: customerDOTtax_idDOTcreated = "customer.tax_id.created".asInstanceOf[customerDOTtax_idDOTcreated]
  @scala.inline
  def customerDOTtax_idDOTdeleted: customerDOTtax_idDOTdeleted = "customer.tax_id.deleted".asInstanceOf[customerDOTtax_idDOTdeleted]
  @scala.inline
  def customerDOTtax_idDOTupdated: customerDOTtax_idDOTupdated = "customer.tax_id.updated".asInstanceOf[customerDOTtax_idDOTupdated]
  @scala.inline
  def customerDOTupdated: customerDOTupdated = "customer.updated".asInstanceOf[customerDOTupdated]
  @scala.inline
  def customer_balance_transaction: customer_balance_transaction = "customer_balance_transaction".asInstanceOf[customer_balance_transaction]
  @scala.inline
  def da: da = "da".asInstanceOf[da]
  @scala.inline
  def daily: daily = "daily".asInstanceOf[daily]
  @scala.inline
  def day: day = "day".asInstanceOf[day]
  @scala.inline
  def de: de = "de".asInstanceOf[de]
  @scala.inline
  def debit: debit = "debit".asInstanceOf[debit]
  @scala.inline
  def debit_not_authorized: debit_not_authorized = "debit_not_authorized".asInstanceOf[debit_not_authorized]
  @scala.inline
  def declined: declined = "declined".asInstanceOf[declined]
  @scala.inline
  def declined_by_network: declined_by_network = "declined_by_network".asInstanceOf[declined_by_network]
  @scala.inline
  def diners: diners = "diners".asInstanceOf[diners]
  @scala.inline
  def disabled: disabled = "disabled".asInstanceOf[disabled]
  @scala.inline
  def discount: discount = "discount".asInstanceOf[discount]
  @scala.inline
  def discover_ : discover_ = "discover".asInstanceOf[discover_]
  @scala.inline
  def dispute: dispute = "dispute".asInstanceOf[dispute]
  @scala.inline
  def dispute_evidence: dispute_evidence = "dispute_evidence".asInstanceOf[dispute_evidence]
  @scala.inline
  def disputed: disputed = "disputed".asInstanceOf[disputed]
  @scala.inline
  def donate: donate = "donate".asInstanceOf[donate]
  @scala.inline
  def down: down = "down".asInstanceOf[down]
  @scala.inline
  def draft: draft = "draft".asInstanceOf[draft]
  @scala.inline
  def duplicate: duplicate = "duplicate".asInstanceOf[duplicate]
  @scala.inline
  def email: email = "email".asInstanceOf[email]
  @scala.inline
  def en: en = "en".asInstanceOf[en]
  @scala.inline
  def enabled: enabled = "enabled".asInstanceOf[enabled]
  @scala.inline
  def ephemeral_key: ephemeral_key = "ephemeral_key".asInstanceOf[ephemeral_key]
  @scala.inline
  def eps: eps = "eps".asInstanceOf[eps]
  @scala.inline
  def errored: errored = "errored".asInstanceOf[errored]
  @scala.inline
  def es: es = "es".asInstanceOf[es]
  @scala.inline
  def eu_vat: eu_vat = "eu_vat".asInstanceOf[eu_vat]
  @scala.inline
  def event: event = "event".asInstanceOf[event]
  @scala.inline
  def exact: exact = "exact".asInstanceOf[exact]
  @scala.inline
  def exempt: exempt = "exempt".asInstanceOf[exempt]
  @scala.inline
  def expired_or_canceled_card: expired_or_canceled_card = "expired_or_canceled_card".asInstanceOf[expired_or_canceled_card]
  @scala.inline
  def express: express = "express".asInstanceOf[express]
  @scala.inline
  def fail: fail = "fail".asInstanceOf[fail]
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  @scala.inline
  def failed_invoice: failed_invoice = "failed_invoice".asInstanceOf[failed_invoice]
  @scala.inline
  def female: female = "female".asInstanceOf[female]
  @scala.inline
  def fi: fi = "fi".asInstanceOf[fi]
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  @scala.inline
  def fileDOTcreated: fileDOTcreated = "file.created".asInstanceOf[fileDOTcreated]
  @scala.inline
  def file_link: file_link = "file_link".asInstanceOf[file_link]
  @scala.inline
  def finite: finite = "finite".asInstanceOf[finite]
  @scala.inline
  def forever: forever = "forever".asInstanceOf[forever]
  @scala.inline
  def fr: fr = "fr".asInstanceOf[fr]
  @scala.inline
  def fraud: fraud = "fraud".asInstanceOf[fraud]
  @scala.inline
  def fraudulent: fraudulent = "fraudulent".asInstanceOf[fraudulent]
  @scala.inline
  def friday: friday = "friday".asInstanceOf[friday]
  @scala.inline
  def fulfilled: fulfilled = "fulfilled".asInstanceOf[fulfilled]
  @scala.inline
  def general: general = "general".asInstanceOf[general]
  @scala.inline
  def giropay: giropay = "giropay".asInstanceOf[giropay]
  @scala.inline
  def good: good = "good".asInstanceOf[good]
  @scala.inline
  def google_pay: google_pay = "google_pay".asInstanceOf[google_pay]
  @scala.inline
  def graduated: graduated = "graduated".asInstanceOf[graduated]
  @scala.inline
  def ideal: ideal = "ideal".asInstanceOf[ideal]
  @scala.inline
  def idempotency_error: idempotency_error = "idempotency_error".asInstanceOf[idempotency_error]
  @scala.inline
  def identity_document: identity_document = "identity_document".asInstanceOf[identity_document]
  @scala.inline
  def in_gst: in_gst = "in_gst".asInstanceOf[in_gst]
  @scala.inline
  def in_stock: in_stock = "in_stock".asInstanceOf[in_stock]
  @scala.inline
  def in_transit: in_transit = "in_transit".asInstanceOf[in_transit]
  @scala.inline
  def inactive: inactive = "inactive".asInstanceOf[inactive]
  @scala.inline
  def incomplete: incomplete = "incomplete".asInstanceOf[incomplete]
  @scala.inline
  def incomplete_expired: incomplete_expired = "incomplete_expired".asInstanceOf[incomplete_expired]
  @scala.inline
  def incorporation_article: incorporation_article = "incorporation_article".asInstanceOf[incorporation_article]
  @scala.inline
  def incorporation_document: incorporation_document = "incorporation_document".asInstanceOf[incorporation_document]
  @scala.inline
  def incorrect_account_details: incorrect_account_details = "incorrect_account_details".asInstanceOf[incorrect_account_details]
  @scala.inline
  def increment: increment = "increment".asInstanceOf[increment]
  @scala.inline
  def individual: individual = "individual".asInstanceOf[individual]
  @scala.inline
  def inf: inf = "inf".asInstanceOf[inf]
  @scala.inline
  def infinite: infinite = "infinite".asInstanceOf[infinite]
  @scala.inline
  def initial: initial = "initial".asInstanceOf[initial]
  @scala.inline
  def instant: instant = "instant".asInstanceOf[instant]
  @scala.inline
  def insufficient_funds: insufficient_funds = "insufficient_funds".asInstanceOf[insufficient_funds]
  @scala.inline
  def invalid: invalid = "invalid".asInstanceOf[invalid]
  @scala.inline
  def invalid_request_error: invalid_request_error = "invalid_request_error".asInstanceOf[invalid_request_error]
  @scala.inline
  def invoice: invoice = "invoice".asInstanceOf[invoice]
  @scala.inline
  def invoiceDOTcreated: invoiceDOTcreated = "invoice.created".asInstanceOf[invoiceDOTcreated]
  @scala.inline
  def invoiceDOTdeleted: invoiceDOTdeleted = "invoice.deleted".asInstanceOf[invoiceDOTdeleted]
  @scala.inline
  def invoiceDOTfinalized: invoiceDOTfinalized = "invoice.finalized".asInstanceOf[invoiceDOTfinalized]
  @scala.inline
  def invoiceDOTmarked_uncollectible: invoiceDOTmarked_uncollectible = "invoice.marked_uncollectible".asInstanceOf[invoiceDOTmarked_uncollectible]
  @scala.inline
  def invoiceDOTpayment_action_required: invoiceDOTpayment_action_required = "invoice.payment_action_required".asInstanceOf[invoiceDOTpayment_action_required]
  @scala.inline
  def invoiceDOTpayment_failed: invoiceDOTpayment_failed = "invoice.payment_failed".asInstanceOf[invoiceDOTpayment_failed]
  @scala.inline
  def invoiceDOTpayment_succeeded: invoiceDOTpayment_succeeded = "invoice.payment_succeeded".asInstanceOf[invoiceDOTpayment_succeeded]
  @scala.inline
  def invoiceDOTsent: invoiceDOTsent = "invoice.sent".asInstanceOf[invoiceDOTsent]
  @scala.inline
  def invoiceDOTupcoming: invoiceDOTupcoming = "invoice.upcoming".asInstanceOf[invoiceDOTupcoming]
  @scala.inline
  def invoiceDOTupdated: invoiceDOTupdated = "invoice.updated".asInstanceOf[invoiceDOTupdated]
  @scala.inline
  def invoiceDOTvoided: invoiceDOTvoided = "invoice.voided".asInstanceOf[invoiceDOTvoided]
  @scala.inline
  def invoice_too_large: invoice_too_large = "invoice_too_large".asInstanceOf[invoice_too_large]
  @scala.inline
  def invoice_too_small: invoice_too_small = "invoice_too_small".asInstanceOf[invoice_too_small]
  @scala.inline
  def invoiceitem: invoiceitem = "invoiceitem".asInstanceOf[invoiceitem]
  @scala.inline
  def invoiceitemDOTcreated: invoiceitemDOTcreated = "invoiceitem.created".asInstanceOf[invoiceitemDOTcreated]
  @scala.inline
  def invoiceitemDOTdeleted: invoiceitemDOTdeleted = "invoiceitem.deleted".asInstanceOf[invoiceitemDOTdeleted]
  @scala.inline
  def invoiceitemDOTupdated: invoiceitemDOTupdated = "invoiceitem.updated".asInstanceOf[invoiceitemDOTupdated]
  @scala.inline
  def issued: issued = "issued".asInstanceOf[issued]
  @scala.inline
  def issuer_declined: issuer_declined = "issuer_declined".asInstanceOf[issuer_declined]
  @scala.inline
  def issuing_authorizationDOTcreated: issuing_authorizationDOTcreated = "issuing_authorization.created".asInstanceOf[issuing_authorizationDOTcreated]
  @scala.inline
  def issuing_authorizationDOTrequest: issuing_authorizationDOTrequest = "issuing_authorization.request".asInstanceOf[issuing_authorizationDOTrequest]
  @scala.inline
  def issuing_authorizationDOTupdated: issuing_authorizationDOTupdated = "issuing_authorization.updated".asInstanceOf[issuing_authorizationDOTupdated]
  @scala.inline
  def issuing_cardDOTcreated: issuing_cardDOTcreated = "issuing_card.created".asInstanceOf[issuing_cardDOTcreated]
  @scala.inline
  def issuing_cardDOTupdated: issuing_cardDOTupdated = "issuing_card.updated".asInstanceOf[issuing_cardDOTupdated]
  @scala.inline
  def issuing_cardholderDOTcreated: issuing_cardholderDOTcreated = "issuing_cardholder.created".asInstanceOf[issuing_cardholderDOTcreated]
  @scala.inline
  def issuing_cardholderDOTupdated: issuing_cardholderDOTupdated = "issuing_cardholder.updated".asInstanceOf[issuing_cardholderDOTupdated]
  @scala.inline
  def issuing_disputeDOTcreated: issuing_disputeDOTcreated = "issuing_dispute.created".asInstanceOf[issuing_disputeDOTcreated]
  @scala.inline
  def issuing_disputeDOTupdated: issuing_disputeDOTupdated = "issuing_dispute.updated".asInstanceOf[issuing_disputeDOTupdated]
  @scala.inline
  def issuing_settlementDOTcreated: issuing_settlementDOTcreated = "issuing_settlement.created".asInstanceOf[issuing_settlementDOTcreated]
  @scala.inline
  def issuing_settlementDOTupdated: issuing_settlementDOTupdated = "issuing_settlement.updated".asInstanceOf[issuing_settlementDOTupdated]
  @scala.inline
  def issuing_transactionDOTcreated: issuing_transactionDOTcreated = "issuing_transaction.created".asInstanceOf[issuing_transactionDOTcreated]
  @scala.inline
  def issuing_transactionDOTupdated: issuing_transactionDOTupdated = "issuing_transaction.updated".asInstanceOf[issuing_transactionDOTupdated]
  @scala.inline
  def it: it = "it".asInstanceOf[it]
  @scala.inline
  def ja: ja = "ja".asInstanceOf[ja]
  @scala.inline
  def jcb_ : jcb_ = "jcb".asInstanceOf[jcb_]
  @scala.inline
  def jpg: jpg = "jpg".asInstanceOf[jpg]
  @scala.inline
  def klarna: klarna = "klarna".asInstanceOf[klarna]
  @scala.inline
  def last_during_period: last_during_period = "last_during_period".asInstanceOf[last_during_period]
  @scala.inline
  def last_ever: last_ever = "last_ever".asInstanceOf[last_ever]
  @scala.inline
  def licensed: licensed = "licensed".asInstanceOf[licensed]
  @scala.inline
  def limited: limited = "limited".asInstanceOf[limited]
  @scala.inline
  def line_item: line_item = "line_item".asInstanceOf[line_item]
  @scala.inline
  def list: list = "list".asInstanceOf[list]
  @scala.inline
  def login_link: login_link = "login_link".asInstanceOf[login_link]
  @scala.inline
  def lost: lost = "lost".asInstanceOf[lost]
  @scala.inline
  def lost_or_stolen_card: lost_or_stolen_card = "lost_or_stolen_card".asInstanceOf[lost_or_stolen_card]
  @scala.inline
  def male: male = "male".asInstanceOf[male]
  @scala.inline
  def mandateDOTupdated: mandateDOTupdated = "mandate.updated".asInstanceOf[mandateDOTupdated]
  @scala.inline
  def manual: manual = "manual".asInstanceOf[manual]
  @scala.inline
  def manual_review: manual_review = "manual_review".asInstanceOf[manual_review]
  @scala.inline
  def mastercard_ : mastercard_ = "mastercard".asInstanceOf[mastercard_]
  @scala.inline
  def masterpass: masterpass = "masterpass".asInstanceOf[masterpass]
  @scala.inline
  def max: max = "max".asInstanceOf[max]
  @scala.inline
  def metered: metered = "metered".asInstanceOf[metered]
  @scala.inline
  def missing: missing = "missing".asInstanceOf[missing]
  @scala.inline
  def monday: monday = "monday".asInstanceOf[monday]
  @scala.inline
  def month: month = "month".asInstanceOf[month]
  @scala.inline
  def monthly: monthly = "monthly".asInstanceOf[monthly]
  @scala.inline
  def multibanco: multibanco = "multibanco".asInstanceOf[multibanco]
  @scala.inline
  def nb: nb = "nb".asInstanceOf[nb]
  @scala.inline
  def needs_response: needs_response = "needs_response".asInstanceOf[needs_response]
  @scala.inline
  def network_cost: network_cost = "network_cost".asInstanceOf[network_cost]
  @scala.inline
  def `new`: `new` = "new".asInstanceOf[`new`]
  @scala.inline
  def nl: nl = "nl".asInstanceOf[nl]
  @scala.inline
  def no_vat: no_vat = "no_vat".asInstanceOf[no_vat]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def not_required: not_required = "not_required".asInstanceOf[not_required]
  @scala.inline
  def not_sent_to_network: not_sent_to_network = "not_sent_to_network".asInstanceOf[not_sent_to_network]
  @scala.inline
  def now: now = "now".asInstanceOf[now]
  @scala.inline
  def nz_gst: nz_gst = "nz_gst".asInstanceOf[nz_gst]
  @scala.inline
  def off_session: off_session = "off_session".asInstanceOf[off_session]
  @scala.inline
  def offline: offline = "offline".asInstanceOf[offline]
  @scala.inline
  def on_session: on_session = "on_session".asInstanceOf[on_session]
  @scala.inline
  def once: once = "once".asInstanceOf[once]
  @scala.inline
  def one_time: one_time = "one_time".asInstanceOf[one_time]
  @scala.inline
  def online: online = "online".asInstanceOf[online]
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  @scala.inline
  def order: order = "order".asInstanceOf[order]
  @scala.inline
  def orderDOTcreated: orderDOTcreated = "order.created".asInstanceOf[orderDOTcreated]
  @scala.inline
  def orderDOTpayment_failed: orderDOTpayment_failed = "order.payment_failed".asInstanceOf[orderDOTpayment_failed]
  @scala.inline
  def orderDOTpayment_succeeded: orderDOTpayment_succeeded = "order.payment_succeeded".asInstanceOf[orderDOTpayment_succeeded]
  @scala.inline
  def orderDOTupdated: orderDOTupdated = "order.updated".asInstanceOf[orderDOTupdated]
  @scala.inline
  def order_change: order_change = "order_change".asInstanceOf[order_change]
  @scala.inline
  def order_item: order_item = "order_item".asInstanceOf[order_item]
  @scala.inline
  def order_returnDOTcreated: order_returnDOTcreated = "order_return.created".asInstanceOf[order_returnDOTcreated]
  @scala.inline
  def other: other = "other".asInstanceOf[other]
  @scala.inline
  def out_of_stock: out_of_stock = "out_of_stock".asInstanceOf[out_of_stock]
  @scala.inline
  def p24: p24 = "p24".asInstanceOf[p24]
  @scala.inline
  def paid: paid = "paid".asInstanceOf[paid]
  @scala.inline
  def pass: pass = "pass".asInstanceOf[pass]
  @scala.inline
  def past_due: past_due = "past_due".asInstanceOf[past_due]
  @scala.inline
  def pay: pay = "pay".asInstanceOf[pay]
  @scala.inline
  def payment: payment = "payment".asInstanceOf[payment]
  @scala.inline
  def payment_intent: payment_intent = "payment_intent".asInstanceOf[payment_intent]
  @scala.inline
  def payment_intentDOTamount_capturable_updated: payment_intentDOTamount_capturable_updated = "payment_intent.amount_capturable_updated".asInstanceOf[payment_intentDOTamount_capturable_updated]
  @scala.inline
  def payment_intentDOTcanceled: payment_intentDOTcanceled = "payment_intent.canceled".asInstanceOf[payment_intentDOTcanceled]
  @scala.inline
  def payment_intentDOTcreated: payment_intentDOTcreated = "payment_intent.created".asInstanceOf[payment_intentDOTcreated]
  @scala.inline
  def payment_intentDOTpayment_failed: payment_intentDOTpayment_failed = "payment_intent.payment_failed".asInstanceOf[payment_intentDOTpayment_failed]
  @scala.inline
  def payment_intentDOTsucceeded: payment_intentDOTsucceeded = "payment_intent.succeeded".asInstanceOf[payment_intentDOTsucceeded]
  @scala.inline
  def payment_method: payment_method = "payment_method".asInstanceOf[payment_method]
  @scala.inline
  def payment_methodDOTattached: payment_methodDOTattached = "payment_method.attached".asInstanceOf[payment_methodDOTattached]
  @scala.inline
  def payment_methodDOTcard_automatically_updated: payment_methodDOTcard_automatically_updated = "payment_method.card_automatically_updated".asInstanceOf[payment_methodDOTcard_automatically_updated]
  @scala.inline
  def payment_methodDOTdetached: payment_methodDOTdetached = "payment_method.detached".asInstanceOf[payment_methodDOTdetached]
  @scala.inline
  def payment_methodDOTupdated: payment_methodDOTupdated = "payment_method.updated".asInstanceOf[payment_methodDOTupdated]
  @scala.inline
  def payout: payout = "payout".asInstanceOf[payout]
  @scala.inline
  def payoutDOTcanceled: payoutDOTcanceled = "payout.canceled".asInstanceOf[payoutDOTcanceled]
  @scala.inline
  def payoutDOTcreated: payoutDOTcreated = "payout.created".asInstanceOf[payoutDOTcreated]
  @scala.inline
  def payoutDOTfailed: payoutDOTfailed = "payout.failed".asInstanceOf[payoutDOTfailed]
  @scala.inline
  def payoutDOTpaid: payoutDOTpaid = "payout.paid".asInstanceOf[payoutDOTpaid]
  @scala.inline
  def payoutDOTupdated: payoutDOTupdated = "payout.updated".asInstanceOf[payoutDOTupdated]
  @scala.inline
  def payout_failure: payout_failure = "payout_failure".asInstanceOf[payout_failure]
  @scala.inline
  def pdf: pdf = "pdf".asInstanceOf[pdf]
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  @scala.inline
  def per_unit: per_unit = "per_unit".asInstanceOf[per_unit]
  @scala.inline
  def person: person = "person".asInstanceOf[person]
  @scala.inline
  def personDOTcreated: personDOTcreated = "person.created".asInstanceOf[personDOTcreated]
  @scala.inline
  def personDOTdeleted: personDOTdeleted = "person.deleted".asInstanceOf[personDOTdeleted]
  @scala.inline
  def personDOTupdated: personDOTupdated = "person.updated".asInstanceOf[personDOTupdated]
  @scala.inline
  def pl: pl = "pl".asInstanceOf[pl]
  @scala.inline
  def plan: plan = "plan".asInstanceOf[plan]
  @scala.inline
  def planDOTcreated: planDOTcreated = "plan.created".asInstanceOf[planDOTcreated]
  @scala.inline
  def planDOTdeleted: planDOTdeleted = "plan.deleted".asInstanceOf[planDOTdeleted]
  @scala.inline
  def planDOTupdated: planDOTupdated = "plan.updated".asInstanceOf[planDOTupdated]
  @scala.inline
  def png: png = "png".asInstanceOf[png]
  @scala.inline
  def post_payment: post_payment = "post_payment".asInstanceOf[post_payment]
  @scala.inline
  def pre_payment: pre_payment = "pre_payment".asInstanceOf[pre_payment]
  @scala.inline
  def prepaid: prepaid = "prepaid".asInstanceOf[prepaid]
  @scala.inline
  def processing: processing = "processing".asInstanceOf[processing]
  @scala.inline
  def processing_error: processing_error = "processing_error".asInstanceOf[processing_error]
  @scala.inline
  def product: product = "product".asInstanceOf[product]
  @scala.inline
  def productDOTcreated: productDOTcreated = "product.created".asInstanceOf[productDOTcreated]
  @scala.inline
  def productDOTdeleted: productDOTdeleted = "product.deleted".asInstanceOf[productDOTdeleted]
  @scala.inline
  def productDOTupdated: productDOTupdated = "product.updated".asInstanceOf[productDOTupdated]
  @scala.inline
  def product_not_received: product_not_received = "product_not_received".asInstanceOf[product_not_received]
  @scala.inline
  def product_unacceptable: product_unacceptable = "product_unacceptable".asInstanceOf[product_unacceptable]
  @scala.inline
  def product_unsatisfactory: product_unsatisfactory = "product_unsatisfactory".asInstanceOf[product_unsatisfactory]
  @scala.inline
  def pt: pt = "pt".asInstanceOf[pt]
  @scala.inline
  def publishable: publishable = "publishable".asInstanceOf[publishable]
  @scala.inline
  def radarDOTearly_fraud_warningDOTcreated: radarDOTearly_fraud_warningDOTcreated = "radar.early_fraud_warning.created".asInstanceOf[radarDOTearly_fraud_warningDOTcreated]
  @scala.inline
  def radarDOTearly_fraud_warningDOTupdated: radarDOTearly_fraud_warningDOTupdated = "radar.early_fraud_warning.updated".asInstanceOf[radarDOTearly_fraud_warningDOTupdated]
  @scala.inline
  def range: range = "range".asInstanceOf[range]
  @scala.inline
  def receiver: receiver = "receiver".asInstanceOf[receiver]
  @scala.inline
  def recipientDOTcreated: recipientDOTcreated = "recipient.created".asInstanceOf[recipientDOTcreated]
  @scala.inline
  def recipientDOTdeleted: recipientDOTdeleted = "recipient.deleted".asInstanceOf[recipientDOTdeleted]
  @scala.inline
  def recipientDOTupdated: recipientDOTupdated = "recipient.updated".asInstanceOf[recipientDOTupdated]
  @scala.inline
  def redirect: redirect = "redirect".asInstanceOf[redirect]
  @scala.inline
  def redirect_to_url: redirect_to_url = "redirect_to_url".asInstanceOf[redirect_to_url]
  @scala.inline
  def refresh_token: refresh_token = "refresh_token".asInstanceOf[refresh_token]
  @scala.inline
  def refund: refund = "refund".asInstanceOf[refund]
  @scala.inline
  def refunded: refunded = "refunded".asInstanceOf[refunded]
  @scala.inline
  def refunded_as_fraud: refunded_as_fraud = "refunded_as_fraud".asInstanceOf[refunded_as_fraud]
  @scala.inline
  def refused: refused = "refused".asInstanceOf[refused]
  @scala.inline
  def repeating: repeating = "repeating".asInstanceOf[repeating]
  @scala.inline
  def reportingDOTreport_runDOTfailed: reportingDOTreport_runDOTfailed = "reporting.report_run.failed".asInstanceOf[reportingDOTreport_runDOTfailed]
  @scala.inline
  def reportingDOTreport_runDOTsucceeded: reportingDOTreport_runDOTsucceeded = "reporting.report_run.succeeded".asInstanceOf[reportingDOTreport_runDOTsucceeded]
  @scala.inline
  def reportingDOTreport_typeDOTupdated: reportingDOTreport_typeDOTupdated = "reporting.report_type.updated".asInstanceOf[reportingDOTreport_typeDOTupdated]
  @scala.inline
  def request: request = "request".asInstanceOf[request]
  @scala.inline
  def requested: requested = "requested".asInstanceOf[requested]
  @scala.inline
  def requested_by_customer: requested_by_customer = "requested_by_customer".asInstanceOf[requested_by_customer]
  @scala.inline
  def required: required = "required".asInstanceOf[required]
  @scala.inline
  def requires_action: requires_action = "requires_action".asInstanceOf[requires_action]
  @scala.inline
  def requires_capture: requires_capture = "requires_capture".asInstanceOf[requires_capture]
  @scala.inline
  def requires_confirmation: requires_confirmation = "requires_confirmation".asInstanceOf[requires_confirmation]
  @scala.inline
  def requires_payment_method: requires_payment_method = "requires_payment_method".asInstanceOf[requires_payment_method]
  @scala.inline
  def response: response = "response".asInstanceOf[response]
  @scala.inline
  def response_disabled: response_disabled = "response_disabled".asInstanceOf[response_disabled]
  @scala.inline
  def returned: returned = "returned".asInstanceOf[returned]
  @scala.inline
  def reusable: reusable = "reusable".asInstanceOf[reusable]
  @scala.inline
  def reverse: reverse = "reverse".asInstanceOf[reverse]
  @scala.inline
  def reversed: reversed = "reversed".asInstanceOf[reversed]
  @scala.inline
  def reversed_after_approval: reversed_after_approval = "reversed_after_approval".asInstanceOf[reversed_after_approval]
  @scala.inline
  def review: review = "review".asInstanceOf[review]
  @scala.inline
  def reviewDOTclosed: reviewDOTclosed = "review.closed".asInstanceOf[reviewDOTclosed]
  @scala.inline
  def reviewDOTopened: reviewDOTopened = "review.opened".asInstanceOf[reviewDOTopened]
  @scala.inline
  def rule: rule = "rule".asInstanceOf[rule]
  @scala.inline
  def safe: safe = "safe".asInstanceOf[safe]
  @scala.inline
  def samsung_pay: samsung_pay = "samsung_pay".asInstanceOf[samsung_pay]
  @scala.inline
  def saturday: saturday = "saturday".asInstanceOf[saturday]
  @scala.inline
  def scheduled: scheduled = "scheduled".asInstanceOf[scheduled]
  @scala.inline
  def secret: secret = "secret".asInstanceOf[secret]
  @scala.inline
  def send_invoice: send_invoice = "send_invoice".asInstanceOf[send_invoice]
  @scala.inline
  def sepa_debit: sepa_debit = "sepa_debit".asInstanceOf[sepa_debit]
  @scala.inline
  def service: service = "service".asInstanceOf[service]
  @scala.inline
  def set: set = "set".asInstanceOf[set]
  @scala.inline
  def setup: setup = "setup".asInstanceOf[setup]
  @scala.inline
  def setup_intent: setup_intent = "setup_intent".asInstanceOf[setup_intent]
  @scala.inline
  def setup_intentDOTcanceled: setup_intentDOTcanceled = "setup_intent.canceled".asInstanceOf[setup_intentDOTcanceled]
  @scala.inline
  def setup_intentDOTcreated: setup_intentDOTcreated = "setup_intent.created".asInstanceOf[setup_intentDOTcreated]
  @scala.inline
  def setup_intentDOTsetup_failed: setup_intentDOTsetup_failed = "setup_intent.setup_failed".asInstanceOf[setup_intentDOTsetup_failed]
  @scala.inline
  def setup_intentDOTsucceeded: setup_intentDOTsucceeded = "setup_intent.succeeded".asInstanceOf[setup_intentDOTsucceeded]
  @scala.inline
  def shipping: shipping = "shipping".asInstanceOf[shipping]
  @scala.inline
  def sigmaDOTscheduled_query_runDOTcreated: sigmaDOTscheduled_query_runDOTcreated = "sigma.scheduled_query_run.created".asInstanceOf[sigmaDOTscheduled_query_runDOTcreated]
  @scala.inline
  def single_use: single_use = "single_use".asInstanceOf[single_use]
  @scala.inline
  def sku: sku = "sku".asInstanceOf[sku]
  @scala.inline
  def skuDOTcreated: skuDOTcreated = "sku.created".asInstanceOf[skuDOTcreated]
  @scala.inline
  def skuDOTdeleted: skuDOTdeleted = "sku.deleted".asInstanceOf[skuDOTdeleted]
  @scala.inline
  def skuDOTupdated: skuDOTupdated = "sku.updated".asInstanceOf[skuDOTupdated]
  @scala.inline
  def sofort: sofort = "sofort".asInstanceOf[sofort]
  @scala.inline
  def source: source = "source".asInstanceOf[source]
  @scala.inline
  def sourceDOTcanceled: sourceDOTcanceled = "source.canceled".asInstanceOf[sourceDOTcanceled]
  @scala.inline
  def sourceDOTchargeable: sourceDOTchargeable = "source.chargeable".asInstanceOf[sourceDOTchargeable]
  @scala.inline
  def sourceDOTfailed: sourceDOTfailed = "source.failed".asInstanceOf[sourceDOTfailed]
  @scala.inline
  def sourceDOTmandate_notification: sourceDOTmandate_notification = "source.mandate_notification".asInstanceOf[sourceDOTmandate_notification]
  @scala.inline
  def sourceDOTrefund_attributes_required: sourceDOTrefund_attributes_required = "source.refund_attributes_required".asInstanceOf[sourceDOTrefund_attributes_required]
  @scala.inline
  def sourceDOTtransactionDOTcreated: sourceDOTtransactionDOTcreated = "source.transaction.created".asInstanceOf[sourceDOTtransactionDOTcreated]
  @scala.inline
  def sourceDOTtransactionDOTupdated: sourceDOTtransactionDOTupdated = "source.transaction.updated".asInstanceOf[sourceDOTtransactionDOTupdated]
  @scala.inline
  def standard: standard = "standard".asInstanceOf[standard]
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  @scala.inline
  def stripe_account: stripe_account = "stripe_account".asInstanceOf[stripe_account]
  @scala.inline
  def stripe_fee: stripe_fee = "stripe_fee".asInstanceOf[stripe_fee]
  @scala.inline
  def subscription: subscription = "subscription".asInstanceOf[subscription]
  @scala.inline
  def subscription_canceled: subscription_canceled = "subscription_canceled".asInstanceOf[subscription_canceled]
  @scala.inline
  def subscription_create: subscription_create = "subscription_create".asInstanceOf[subscription_create]
  @scala.inline
  def subscription_cycle: subscription_cycle = "subscription_cycle".asInstanceOf[subscription_cycle]
  @scala.inline
  def subscription_item: subscription_item = "subscription_item".asInstanceOf[subscription_item]
  @scala.inline
  def subscription_scheduleDOTaborted: subscription_scheduleDOTaborted = "subscription_schedule.aborted".asInstanceOf[subscription_scheduleDOTaborted]
  @scala.inline
  def subscription_scheduleDOTcanceled: subscription_scheduleDOTcanceled = "subscription_schedule.canceled".asInstanceOf[subscription_scheduleDOTcanceled]
  @scala.inline
  def subscription_scheduleDOTcompleted: subscription_scheduleDOTcompleted = "subscription_schedule.completed".asInstanceOf[subscription_scheduleDOTcompleted]
  @scala.inline
  def subscription_scheduleDOTcreated: subscription_scheduleDOTcreated = "subscription_schedule.created".asInstanceOf[subscription_scheduleDOTcreated]
  @scala.inline
  def subscription_scheduleDOTexpiring: subscription_scheduleDOTexpiring = "subscription_schedule.expiring".asInstanceOf[subscription_scheduleDOTexpiring]
  @scala.inline
  def subscription_scheduleDOTreleased: subscription_scheduleDOTreleased = "subscription_schedule.released".asInstanceOf[subscription_scheduleDOTreleased]
  @scala.inline
  def subscription_scheduleDOTupdated: subscription_scheduleDOTupdated = "subscription_schedule.updated".asInstanceOf[subscription_scheduleDOTupdated]
  @scala.inline
  def subscription_threshold: subscription_threshold = "subscription_threshold".asInstanceOf[subscription_threshold]
  @scala.inline
  def subscription_update: subscription_update = "subscription_update".asInstanceOf[subscription_update]
  @scala.inline
  def succeeded: succeeded = "succeeded".asInstanceOf[succeeded]
  @scala.inline
  def sum: sum = "sum".asInstanceOf[sum]
  @scala.inline
  def sunday: sunday = "sunday".asInstanceOf[sunday]
  @scala.inline
  def sv: sv = "sv".asInstanceOf[sv]
  @scala.inline
  def tax: tax = "tax".asInstanceOf[tax]
  @scala.inline
  def tax_id: tax_id = "tax_id".asInstanceOf[tax_id]
  @scala.inline
  def tax_rate: tax_rate = "tax_rate".asInstanceOf[tax_rate]
  @scala.inline
  def tax_rateDOTcreated: tax_rateDOTcreated = "tax_rate.created".asInstanceOf[tax_rateDOTcreated]
  @scala.inline
  def tax_rateDOTupdated: tax_rateDOTupdated = "tax_rate.updated".asInstanceOf[tax_rateDOTupdated]
  @scala.inline
  def terms_of_service: terms_of_service = "terms_of_service".asInstanceOf[terms_of_service]
  @scala.inline
  def three_d_secure: three_d_secure = "three_d_secure".asInstanceOf[three_d_secure]
  @scala.inline
  def thursday: thursday = "thursday".asInstanceOf[thursday]
  @scala.inline
  def tiered: tiered = "tiered".asInstanceOf[tiered]
  @scala.inline
  def token: token = "token".asInstanceOf[token]
  @scala.inline
  def topup: topup = "topup".asInstanceOf[topup]
  @scala.inline
  def topupDOTcreated: topupDOTcreated = "topup.created".asInstanceOf[topupDOTcreated]
  @scala.inline
  def topupDOTfailed: topupDOTfailed = "topup.failed".asInstanceOf[topupDOTfailed]
  @scala.inline
  def topupDOTreversed: topupDOTreversed = "topup.reversed".asInstanceOf[topupDOTreversed]
  @scala.inline
  def topupDOTsucceeded: topupDOTsucceeded = "topup.succeeded".asInstanceOf[topupDOTsucceeded]
  @scala.inline
  def transfer: transfer = "transfer".asInstanceOf[transfer]
  @scala.inline
  def transferDOTcreated: transferDOTcreated = "transfer.created".asInstanceOf[transferDOTcreated]
  @scala.inline
  def transferDOTfailed: transferDOTfailed = "transfer.failed".asInstanceOf[transferDOTfailed]
  @scala.inline
  def transferDOTpaid: transferDOTpaid = "transfer.paid".asInstanceOf[transferDOTpaid]
  @scala.inline
  def transferDOTreversed: transferDOTreversed = "transfer.reversed".asInstanceOf[transferDOTreversed]
  @scala.inline
  def transferDOTupdated: transferDOTupdated = "transfer.updated".asInstanceOf[transferDOTupdated]
  @scala.inline
  def transfer_reversal: transfer_reversal = "transfer_reversal".asInstanceOf[transfer_reversal]
  @scala.inline
  def trialing: trialing = "trialing".asInstanceOf[trialing]
  @scala.inline
  def tuesday: tuesday = "tuesday".asInstanceOf[tuesday]
  @scala.inline
  def unavailable: unavailable = "unavailable".asInstanceOf[unavailable]
  @scala.inline
  def unchanged: unchanged = "unchanged".asInstanceOf[unchanged]
  @scala.inline
  def unchecked: unchecked = "unchecked".asInstanceOf[unchecked]
  @scala.inline
  def uncollectible: uncollectible = "uncollectible".asInstanceOf[uncollectible]
  @scala.inline
  def under_review: under_review = "under_review".asInstanceOf[under_review]
  @scala.inline
  def unionpay: unionpay = "unionpay".asInstanceOf[unionpay]
  @scala.inline
  def unknown_ : unknown_ = "unknown".asInstanceOf[unknown_]
  @scala.inline
  def unpaid: unpaid = "unpaid".asInstanceOf[unpaid]
  @scala.inline
  def unrecognized: unrecognized = "unrecognized".asInstanceOf[unrecognized]
  @scala.inline
  def unspent_receiver_credit: unspent_receiver_credit = "unspent_receiver_credit".asInstanceOf[unspent_receiver_credit]
  @scala.inline
  def unverified: unverified = "unverified".asInstanceOf[unverified]
  @scala.inline
  def up: up = "up".asInstanceOf[up]
  @scala.inline
  def upcoming: upcoming = "upcoming".asInstanceOf[upcoming]
  @scala.inline
  def usage_record: usage_record = "usage_record".asInstanceOf[usage_record]
  @scala.inline
  def use_stripe_sdk: use_stripe_sdk = "use_stripe_sdk".asInstanceOf[use_stripe_sdk]
  @scala.inline
  def user_abort: user_abort = "user_abort".asInstanceOf[user_abort]
  @scala.inline
  def validated: validated = "validated".asInstanceOf[validated]
  @scala.inline
  def variable: variable = "variable".asInstanceOf[variable]
  @scala.inline
  def verification_failed: verification_failed = "verification_failed".asInstanceOf[verification_failed]
  @scala.inline
  def verified: verified = "verified".asInstanceOf[verified]
  @scala.inline
  def visa_ : visa_ = "visa".asInstanceOf[visa_]
  @scala.inline
  def visa_checkout: visa_checkout = "visa_checkout".asInstanceOf[visa_checkout]
  @scala.inline
  def void: void = "void".asInstanceOf[void]
  @scala.inline
  def void_invoice: void_invoice = "void_invoice".asInstanceOf[void_invoice]
  @scala.inline
  def volume: volume = "volume".asInstanceOf[volume]
  @scala.inline
  def warning_closed: warning_closed = "warning_closed".asInstanceOf[warning_closed]
  @scala.inline
  def warning_needs_response: warning_needs_response = "warning_needs_response".asInstanceOf[warning_needs_response]
  @scala.inline
  def warning_under_review: warning_under_review = "warning_under_review".asInstanceOf[warning_under_review]
  @scala.inline
  def webhook_endpoint: webhook_endpoint = "webhook_endpoint".asInstanceOf[webhook_endpoint]
  @scala.inline
  def wechat: wechat = "wechat".asInstanceOf[wechat]
  @scala.inline
  def wednesday: wednesday = "wednesday".asInstanceOf[wednesday]
  @scala.inline
  def week: week = "week".asInstanceOf[week]
  @scala.inline
  def weekly: weekly = "weekly".asInstanceOf[weekly]
  @scala.inline
  def won: won = "won".asInstanceOf[won]
  @scala.inline
  def year: year = "year".asInstanceOf[year]
  @scala.inline
  def zh: zh = "zh".asInstanceOf[zh]
}

