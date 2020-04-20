package typings.stripe

import typings.stripe.mod.charges.IPaymentMethodType
import typings.stripe.mod.creditNotes.CreditNoteReason
import typings.stripe.mod.customerBalanceTransactions.CustomerBalanceTransactionType
import typings.stripe.mod.customerTaxIds.TaxIdType
import typings.stripe.mod.errors.RawType
import typings.stripe.mod.events.EventType
import typings.stripe.mod.files.IPurpose
import typings.stripe.mod.issuing.authorizations.AuthorizationMethod
import typings.stripe.mod.issuing.authorizations.AuthorizationStatus
import typings.stripe.mod.issuing.authorizations.WalletProvider
import typings.stripe.mod.issuing.cardholders.CardholderStatus
import typings.stripe.mod.issuing.cardholders.CardholderType
import typings.stripe.mod.issuing.cardholders.SpendingLimitInterval
import typings.stripe.mod.issuing.cards.IssuingCardReplacementReason
import typings.stripe.mod.issuing.cards.IssuingCardStatus
import typings.stripe.mod.issuing.cards.IssuingCardType
import typings.stripe.mod.issuing.disputes.IssuingDisputeReason
import typings.stripe.mod.issuing.disputes.IssuingDisputeStatus
import typings.stripe.mod.issuing.transactions.TransactionType
import typings.stripe.mod.orders.OrderStatus
import typings.stripe.mod.paymentIntents.PaymentIntendDataFutureUsageOptions
import typings.stripe.mod.paymentIntents.PaymentIntentDataCaptureMethodOptions
import typings.stripe.mod.paymentIntents.PaymentIntentFutureUsageType
import typings.stripe.mod.paymentIntents.PaymentIntentPaymentMethodType
import typings.stripe.mod.paymentIntents.PaymentIntentStripeProvidedCancellationReason
import typings.stripe.mod.paymentIntents.PaymentIntentUserProvidedCancellationReason
import typings.stripe.mod.paymentMethods.CardBrand
import typings.stripe.mod.paymentMethods.CardWalletType
import typings.stripe.mod.payouts.PayoutMethods
import typings.stripe.mod.payouts.PayoutTypes
import typings.stripe.mod.plans.IntervalUnit
import typings.stripe.mod.products.ProductType
import typings.stripe.mod.setupIntents.SetupIntentCancelationReason
import typings.stripe.mod.setupIntents.SetupIntentUsageType
import typings.stripe.mod.subscriptions.SubscriptionBilling
import typings.stripe.mod.subscriptions.SubscriptionStatus
import typings.stripe.mod.transfers.SourceTypes
import typings.stripe.mod.transfers.Statuses
import typings.stripe.mod.usageRecords.IUsageRecordAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object stripeStrings {
  @js.native
  sealed trait `American Express` extends js.Object
  
  @js.native
  sealed trait Asterisk extends EventType
  
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
  sealed trait accountDotapplicationDotauthorized extends EventType
  
  @js.native
  sealed trait accountDotapplicationDotdeauthorized extends EventType
  
  @js.native
  sealed trait accountDotexternal_accountDotcreated extends EventType
  
  @js.native
  sealed trait accountDotexternal_accountDotdeleted extends EventType
  
  @js.native
  sealed trait accountDotexternal_accountDotupdated extends EventType
  
  @js.native
  sealed trait accountDotupdated extends EventType
  
  @js.native
  sealed trait account_compliance_disabled extends js.Object
  
  @js.native
  sealed trait account_inactive extends js.Object
  
  @js.native
  sealed trait ach_credit_transfer extends IPaymentMethodType
  
  @js.native
  sealed trait ach_debit extends IPaymentMethodType
  
  @js.native
  sealed trait active
    extends CardholderStatus
       with IssuingCardStatus
       with SubscriptionStatus
  
  @js.native
  sealed trait adjustment extends CustomerBalanceTransactionType
  
  @js.native
  sealed trait alipay extends IPaymentMethodType
  
  @js.native
  sealed trait alipay_account extends SourceTypes
  
  @js.native
  sealed trait all extends js.Object
  
  @js.native
  sealed trait all_time extends SpendingLimitInterval
  
  @js.native
  sealed trait allowed_categories extends js.Object
  
  @js.native
  sealed trait always_invoice extends js.Object
  
  @js.native
  sealed trait amex extends CardBrand
  
  @js.native
  sealed trait amex_express_checkout extends CardWalletType
  
  @js.native
  sealed trait android_pay extends js.Object
  
  @js.native
  sealed trait any extends js.Object
  
  @js.native
  sealed trait api_error extends RawType
  
  @js.native
  sealed trait apple_pay
    extends CardWalletType
       with WalletProvider
  
  @js.native
  sealed trait application extends js.Object
  
  @js.native
  sealed trait `applicationSlashoctet-stream` extends js.Object
  
  @js.native
  sealed trait application_fee extends js.Object
  
  @js.native
  sealed trait application_feeDotcreated extends EventType
  
  @js.native
  sealed trait application_feeDotrefundDotupdated extends EventType
  
  @js.native
  sealed trait application_feeDotrefunded extends EventType
  
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
  sealed trait authentication_failed extends js.Object
  
  @js.native
  sealed trait authorization_code extends js.Object
  
  @js.native
  sealed trait authorization_controls extends js.Object
  
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
  sealed trait balanceDotavailable extends EventType
  
  @js.native
  sealed trait bancontact extends IPaymentMethodType
  
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
  sealed trait blocked extends CardholderStatus
  
  @js.native
  sealed trait blocked_categories extends js.Object
  
  @js.native
  sealed trait book extends js.Object
  
  @js.native
  sealed trait bucket extends js.Object
  
  @js.native
  sealed trait bulk extends js.Object
  
  @js.native
  sealed trait business_entity extends CardholderType
  
  @js.native
  sealed trait business_logo extends IPurpose
  
  @js.native
  sealed trait canceled
    extends IssuingCardStatus
       with OrderStatus
       with Statuses
       with SubscriptionStatus
  
  @js.native
  sealed trait capabilityDotupdated extends EventType
  
  @js.native
  sealed trait capture extends TransactionType
  
  @js.native
  sealed trait card
    extends IPaymentMethodType
       with typings.stripe.mod.paymentMethods.IPaymentMethodType
       with PaymentIntentPaymentMethodType
       with PayoutTypes
       with SourceTypes
  
  @js.native
  sealed trait card_active extends js.Object
  
  @js.native
  sealed trait card_error extends RawType
  
  @js.native
  sealed trait card_inactive extends js.Object
  
  @js.native
  sealed trait card_present
    extends IPaymentMethodType
       with typings.stripe.mod.paymentMethods.IPaymentMethodType
  
  @js.native
  sealed trait cardholder extends js.Object
  
  @js.native
  sealed trait cash_withdrawal extends TransactionType
  
  @js.native
  sealed trait challenge_only extends js.Object
  
  @js.native
  sealed trait charge extends js.Object
  
  @js.native
  sealed trait chargeDotcaptured extends EventType
  
  @js.native
  sealed trait chargeDotdisputeDotclosed extends EventType
  
  @js.native
  sealed trait chargeDotdisputeDotcreated extends EventType
  
  @js.native
  sealed trait chargeDotdisputeDotfunds_reinstated extends EventType
  
  @js.native
  sealed trait chargeDotdisputeDotfunds_withdrawn extends EventType
  
  @js.native
  sealed trait chargeDotdisputeDotupdated extends EventType
  
  @js.native
  sealed trait chargeDotexpired extends EventType
  
  @js.native
  sealed trait chargeDotfailed extends EventType
  
  @js.native
  sealed trait chargeDotpending extends EventType
  
  @js.native
  sealed trait chargeDotrefundDotupdated extends EventType
  
  @js.native
  sealed trait chargeDotrefunded extends EventType
  
  @js.native
  sealed trait chargeDotsucceeded extends EventType
  
  @js.native
  sealed trait chargeDotupdated extends EventType
  
  @js.native
  sealed trait charge_automatically extends SubscriptionBilling
  
  @js.native
  sealed trait charge_refunded extends js.Object
  
  @js.native
  sealed trait chargeable extends js.Object
  
  @js.native
  sealed trait checkoutDotsessionDotcompleted extends EventType
  
  @js.native
  sealed trait chip extends AuthorizationMethod
  
  @js.native
  sealed trait closed extends AuthorizationStatus
  
  @js.native
  sealed trait code_verification extends js.Object
  
  @js.native
  sealed trait company extends js.Object
  
  @js.native
  sealed trait consumed extends js.Object
  
  @js.native
  sealed trait contactless extends AuthorizationMethod
  
  @js.native
  sealed trait country_spec extends js.Object
  
  @js.native
  sealed trait coupon extends js.Object
  
  @js.native
  sealed trait couponDotcreated extends EventType
  
  @js.native
  sealed trait couponDotdeleted extends EventType
  
  @js.native
  sealed trait couponDotupdated extends EventType
  
  @js.native
  sealed trait create_prorations extends js.Object
  
  @js.native
  sealed trait created extends OrderStatus
  
  @js.native
  sealed trait credit extends js.Object
  
  @js.native
  sealed trait credit_not_processed extends js.Object
  
  @js.native
  sealed trait credit_note extends CustomerBalanceTransactionType
  
  @js.native
  sealed trait credit_noteDotcreated extends EventType
  
  @js.native
  sealed trait credit_noteDotupdated extends EventType
  
  @js.native
  sealed trait credit_noteDotvoided extends EventType
  
  @js.native
  sealed trait custom extends js.Object
  
  @js.native
  sealed trait customer extends js.Object
  
  @js.native
  sealed trait customerDotcreated extends EventType
  
  @js.native
  sealed trait customerDotdeleted extends EventType
  
  @js.native
  sealed trait customerDotdiscountDotcreated extends EventType
  
  @js.native
  sealed trait customerDotdiscountDotdeleted extends EventType
  
  @js.native
  sealed trait customerDotdiscountDotupdated extends EventType
  
  @js.native
  sealed trait customerDotsourceDotcreated extends EventType
  
  @js.native
  sealed trait customerDotsourceDotdeleted extends EventType
  
  @js.native
  sealed trait customerDotsourceDotexpiring extends EventType
  
  @js.native
  sealed trait customerDotsourceDotupdated extends EventType
  
  @js.native
  sealed trait customerDotsubscriptionDotcreated extends EventType
  
  @js.native
  sealed trait customerDotsubscriptionDotdeleted extends EventType
  
  @js.native
  sealed trait customerDotsubscriptionDottrial_will_end extends EventType
  
  @js.native
  sealed trait customerDotsubscriptionDotupdated extends EventType
  
  @js.native
  sealed trait customerDottax_idDotcreated extends EventType
  
  @js.native
  sealed trait customerDottax_idDotdeleted extends EventType
  
  @js.native
  sealed trait customerDottax_idDotupdated extends EventType
  
  @js.native
  sealed trait customerDotupdated extends EventType
  
  @js.native
  sealed trait customer_balance_transaction extends js.Object
  
  @js.native
  sealed trait da extends js.Object
  
  @js.native
  sealed trait daily extends SpendingLimitInterval
  
  @js.native
  sealed trait damage extends IssuingCardReplacementReason
  
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
  sealed trait delivered extends js.Object
  
  @js.native
  sealed trait diners extends CardBrand
  
  @js.native
  sealed trait disabled extends js.Object
  
  @js.native
  sealed trait discount extends js.Object
  
  @js.native
  sealed trait discover_ extends CardBrand
  
  @js.native
  sealed trait dispute extends TransactionType
  
  @js.native
  sealed trait dispute_evidence extends IPurpose
  
  @js.native
  sealed trait dispute_loss extends TransactionType
  
  @js.native
  sealed trait disputed extends js.Object
  
  @js.native
  sealed trait document_address_mismatch extends js.Object
  
  @js.native
  sealed trait document_dob_mismatch extends js.Object
  
  @js.native
  sealed trait document_duplicate_type extends js.Object
  
  @js.native
  sealed trait document_id_number_mismatch extends js.Object
  
  @js.native
  sealed trait document_name_mismatch extends js.Object
  
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
  sealed trait eps extends IPaymentMethodType
  
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
  sealed trait expiration extends IssuingCardReplacementReason
  
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
  sealed trait failed_keyed_identity extends js.Object
  
  @js.native
  sealed trait failed_other extends js.Object
  
  @js.native
  sealed trait failure extends js.Object
  
  @js.native
  sealed trait female extends js.Object
  
  @js.native
  sealed trait fi extends js.Object
  
  @js.native
  sealed trait file extends js.Object
  
  @js.native
  sealed trait fileDotcreated extends EventType
  
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
  sealed trait fraudlent extends IssuingDisputeReason
  
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
  sealed trait giropay extends IPaymentMethodType
  
  @js.native
  sealed trait good extends ProductType
  
  @js.native
  sealed trait google_pay
    extends CardWalletType
       with WalletProvider
  
  @js.native
  sealed trait graduated extends js.Object
  
  @js.native
  sealed trait ideal
    extends IPaymentMethodType
       with PaymentIntentPaymentMethodType
  
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
  sealed trait inactive
    extends CardholderStatus
       with IssuingCardStatus
  
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
  sealed trait individual extends CardholderType
  
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
  sealed trait invoiceDotcreated extends EventType
  
  @js.native
  sealed trait invoiceDotdeleted extends EventType
  
  @js.native
  sealed trait invoiceDotfinalized extends EventType
  
  @js.native
  sealed trait invoiceDotmarked_uncollectible extends EventType
  
  @js.native
  sealed trait invoiceDotpayment_action_required extends EventType
  
  @js.native
  sealed trait invoiceDotpayment_failed extends EventType
  
  @js.native
  sealed trait invoiceDotpayment_succeeded extends EventType
  
  @js.native
  sealed trait invoiceDotsent extends EventType
  
  @js.native
  sealed trait invoiceDotupcoming extends EventType
  
  @js.native
  sealed trait invoiceDotupdated extends EventType
  
  @js.native
  sealed trait invoiceDotvoided extends EventType
  
  @js.native
  sealed trait invoice_too_large extends CustomerBalanceTransactionType
  
  @js.native
  sealed trait invoice_too_small extends CustomerBalanceTransactionType
  
  @js.native
  sealed trait invoiceitem extends js.Object
  
  @js.native
  sealed trait invoiceitemDotcreated extends EventType
  
  @js.native
  sealed trait invoiceitemDotdeleted extends EventType
  
  @js.native
  sealed trait invoiceitemDotupdated extends EventType
  
  @js.native
  sealed trait issued extends js.Object
  
  @js.native
  sealed trait issuer_declined extends js.Object
  
  @js.native
  sealed trait issuingDotauthorization extends js.Object
  
  @js.native
  sealed trait issuingDotcard extends js.Object
  
  @js.native
  sealed trait issuingDotcard_details extends js.Object
  
  @js.native
  sealed trait issuingDotcardholder extends js.Object
  
  @js.native
  sealed trait issuingDotdispute extends js.Object
  
  @js.native
  sealed trait issuingDottransaction extends js.Object
  
  @js.native
  sealed trait issuing_authorizationDotcreated extends EventType
  
  @js.native
  sealed trait issuing_authorizationDotrequest extends EventType
  
  @js.native
  sealed trait issuing_authorizationDotupdated extends EventType
  
  @js.native
  sealed trait issuing_cardDotcreated extends EventType
  
  @js.native
  sealed trait issuing_cardDotupdated extends EventType
  
  @js.native
  sealed trait issuing_cardholderDotcreated extends EventType
  
  @js.native
  sealed trait issuing_cardholderDotupdated extends EventType
  
  @js.native
  sealed trait issuing_disputeDotcreated extends EventType
  
  @js.native
  sealed trait issuing_disputeDotupdated extends EventType
  
  @js.native
  sealed trait issuing_settlementDotcreated extends EventType
  
  @js.native
  sealed trait issuing_settlementDotupdated extends EventType
  
  @js.native
  sealed trait issuing_transactionDotcreated extends EventType
  
  @js.native
  sealed trait issuing_transactionDotupdated extends EventType
  
  @js.native
  sealed trait it extends js.Object
  
  @js.native
  sealed trait ja extends js.Object
  
  @js.native
  sealed trait jcb_ extends CardBrand
  
  @js.native
  sealed trait jpg extends js.Object
  
  @js.native
  sealed trait keyed_in extends AuthorizationMethod
  
  @js.native
  sealed trait klarna extends IPaymentMethodType
  
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
  sealed trait listed extends js.Object
  
  @js.native
  sealed trait login_link extends js.Object
  
  @js.native
  sealed trait loss extends IssuingCardReplacementReason
  
  @js.native
  sealed trait lost
    extends IssuingCardStatus
       with IssuingDisputeStatus
  
  @js.native
  sealed trait lost_or_stolen_card extends js.Object
  
  @js.native
  sealed trait male extends js.Object
  
  @js.native
  sealed trait mandateDotupdated extends EventType
  
  @js.native
  sealed trait manual extends PaymentIntentDataCaptureMethodOptions
  
  @js.native
  sealed trait manual_review extends js.Object
  
  @js.native
  sealed trait mastercard_ extends CardBrand
  
  @js.native
  sealed trait masterpass extends CardWalletType
  
  @js.native
  sealed trait `match` extends js.Object
  
  @js.native
  sealed trait max extends js.Object
  
  @js.native
  sealed trait max_amount extends js.Object
  
  @js.native
  sealed trait max_approvals extends js.Object
  
  @js.native
  sealed trait metered extends js.Object
  
  @js.native
  sealed trait mismatch extends js.Object
  
  @js.native
  sealed trait missing extends js.Object
  
  @js.native
  sealed trait monday extends js.Object
  
  @js.native
  sealed trait month extends IntervalUnit
  
  @js.native
  sealed trait monthly extends SpendingLimitInterval
  
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
  sealed trait not_provided extends js.Object
  
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
  sealed trait online extends AuthorizationMethod
  
  @js.native
  sealed trait open extends js.Object
  
  @js.native
  sealed trait order extends js.Object
  
  @js.native
  sealed trait orderDotcreated extends EventType
  
  @js.native
  sealed trait orderDotpayment_failed extends EventType
  
  @js.native
  sealed trait orderDotpayment_succeeded extends EventType
  
  @js.native
  sealed trait orderDotupdated extends EventType
  
  @js.native
  sealed trait order_change extends CreditNoteReason
  
  @js.native
  sealed trait order_item extends js.Object
  
  @js.native
  sealed trait order_returnDotcreated extends EventType
  
  @js.native
  sealed trait other extends IssuingDisputeReason
  
  @js.native
  sealed trait out_of_stock extends js.Object
  
  @js.native
  sealed trait p24 extends IPaymentMethodType
  
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
  sealed trait payment_intentDotamount_capturable_updated extends EventType
  
  @js.native
  sealed trait payment_intentDotcanceled extends EventType
  
  @js.native
  sealed trait payment_intentDotcreated extends EventType
  
  @js.native
  sealed trait payment_intentDotpayment_failed extends EventType
  
  @js.native
  sealed trait payment_intentDotsucceeded extends EventType
  
  @js.native
  sealed trait payment_method extends js.Object
  
  @js.native
  sealed trait payment_methodDotattached extends EventType
  
  @js.native
  sealed trait payment_methodDotcard_automatically_updated extends EventType
  
  @js.native
  sealed trait payment_methodDotdetached extends EventType
  
  @js.native
  sealed trait payment_methodDotupdated extends EventType
  
  @js.native
  sealed trait payout extends js.Object
  
  @js.native
  sealed trait payoutDotcanceled extends EventType
  
  @js.native
  sealed trait payoutDotcreated extends EventType
  
  @js.native
  sealed trait payoutDotfailed extends EventType
  
  @js.native
  sealed trait payoutDotpaid extends EventType
  
  @js.native
  sealed trait payoutDotupdated extends EventType
  
  @js.native
  sealed trait payout_failure extends js.Object
  
  @js.native
  sealed trait pdf extends js.Object
  
  @js.native
  sealed trait pending
    extends AuthorizationStatus
       with Statuses
  
  @js.native
  sealed trait per_authorization extends SpendingLimitInterval
  
  @js.native
  sealed trait per_unit extends js.Object
  
  @js.native
  sealed trait person extends js.Object
  
  @js.native
  sealed trait personDotcreated extends EventType
  
  @js.native
  sealed trait personDotdeleted extends EventType
  
  @js.native
  sealed trait personDotupdated extends EventType
  
  @js.native
  sealed trait physical extends IssuingCardType
  
  @js.native
  sealed trait pl extends js.Object
  
  @js.native
  sealed trait plan extends js.Object
  
  @js.native
  sealed trait planDotcreated extends EventType
  
  @js.native
  sealed trait planDotdeleted extends EventType
  
  @js.native
  sealed trait planDotupdated extends EventType
  
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
  sealed trait productDotcreated extends EventType
  
  @js.native
  sealed trait productDotdeleted extends EventType
  
  @js.native
  sealed trait productDotupdated extends EventType
  
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
  sealed trait radarDotearly_fraud_warningDotcreated extends EventType
  
  @js.native
  sealed trait radarDotearly_fraud_warningDotupdated extends EventType
  
  @js.native
  sealed trait range extends js.Object
  
  @js.native
  sealed trait receiver extends js.Object
  
  @js.native
  sealed trait recipientDotcreated extends EventType
  
  @js.native
  sealed trait recipientDotdeleted extends EventType
  
  @js.native
  sealed trait recipientDotupdated extends EventType
  
  @js.native
  sealed trait redirect extends js.Object
  
  @js.native
  sealed trait redirect_to_url extends js.Object
  
  @js.native
  sealed trait refresh_token extends js.Object
  
  @js.native
  sealed trait refund extends TransactionType
  
  @js.native
  sealed trait refund_reversal extends TransactionType
  
  @js.native
  sealed trait refunded extends js.Object
  
  @js.native
  sealed trait refunded_as_fraud extends js.Object
  
  @js.native
  sealed trait refused extends js.Object
  
  @js.native
  sealed trait rejectedDotlisted extends js.Object
  
  @js.native
  sealed trait repeating extends js.Object
  
  @js.native
  sealed trait reportingDotreport_runDotfailed extends EventType
  
  @js.native
  sealed trait reportingDotreport_runDotsucceeded extends EventType
  
  @js.native
  sealed trait reportingDotreport_typeDotupdated extends EventType
  
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
  sealed trait reversed extends AuthorizationStatus
  
  @js.native
  sealed trait reversed_after_approval extends js.Object
  
  @js.native
  sealed trait review extends js.Object
  
  @js.native
  sealed trait reviewDotclosed extends EventType
  
  @js.native
  sealed trait reviewDotopened extends EventType
  
  @js.native
  sealed trait rule extends js.Object
  
  @js.native
  sealed trait safe extends js.Object
  
  @js.native
  sealed trait samsung_pay
    extends CardWalletType
       with WalletProvider
  
  @js.native
  sealed trait saturday extends js.Object
  
  @js.native
  sealed trait scheduled extends js.Object
  
  @js.native
  sealed trait secret extends js.Object
  
  @js.native
  sealed trait send_invoice extends SubscriptionBilling
  
  @js.native
  sealed trait sepa_debit extends PaymentIntentPaymentMethodType
  
  @js.native
  sealed trait service extends ProductType
  
  @js.native
  sealed trait set extends IUsageRecordAction
  
  @js.native
  sealed trait setup extends js.Object
  
  @js.native
  sealed trait setup_intent extends js.Object
  
  @js.native
  sealed trait setup_intentDotcanceled extends EventType
  
  @js.native
  sealed trait setup_intentDotcreated extends EventType
  
  @js.native
  sealed trait setup_intentDotsetup_failed extends EventType
  
  @js.native
  sealed trait setup_intentDotsucceeded extends EventType
  
  @js.native
  sealed trait shipped extends js.Object
  
  @js.native
  sealed trait shipping extends js.Object
  
  @js.native
  sealed trait sigmaDotscheduled_query_runDotcreated extends EventType
  
  @js.native
  sealed trait single_use extends js.Object
  
  @js.native
  sealed trait sku extends js.Object
  
  @js.native
  sealed trait skuDotcreated extends EventType
  
  @js.native
  sealed trait skuDotdeleted extends EventType
  
  @js.native
  sealed trait skuDotupdated extends EventType
  
  @js.native
  sealed trait sofort extends IPaymentMethodType
  
  @js.native
  sealed trait source extends js.Object
  
  @js.native
  sealed trait sourceDotcanceled extends EventType
  
  @js.native
  sealed trait sourceDotchargeable extends EventType
  
  @js.native
  sealed trait sourceDotfailed extends EventType
  
  @js.native
  sealed trait sourceDotmandate_notification extends EventType
  
  @js.native
  sealed trait sourceDotrefund_attributes_required extends EventType
  
  @js.native
  sealed trait sourceDottransactionDotcreated extends EventType
  
  @js.native
  sealed trait sourceDottransactionDotupdated extends EventType
  
  @js.native
  sealed trait spending_limits extends js.Object
  
  @js.native
  sealed trait standard extends PayoutMethods
  
  @js.native
  sealed trait stolen extends IssuingCardStatus
  
  @js.native
  sealed trait string extends js.Object
  
  @js.native
  sealed trait stripe_account extends IPaymentMethodType
  
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
  sealed trait subscription_scheduleDotaborted extends EventType
  
  @js.native
  sealed trait subscription_scheduleDotcanceled extends EventType
  
  @js.native
  sealed trait subscription_scheduleDotcompleted extends EventType
  
  @js.native
  sealed trait subscription_scheduleDotcreated extends EventType
  
  @js.native
  sealed trait subscription_scheduleDotexpiring extends EventType
  
  @js.native
  sealed trait subscription_scheduleDotreleased extends EventType
  
  @js.native
  sealed trait subscription_scheduleDotupdated extends EventType
  
  @js.native
  sealed trait subscription_threshold extends js.Object
  
  @js.native
  sealed trait subscription_update extends js.Object
  
  @js.native
  sealed trait succeeded extends js.Object
  
  @js.native
  sealed trait success extends js.Object
  
  @js.native
  sealed trait sum extends js.Object
  
  @js.native
  sealed trait sunday extends js.Object
  
  @js.native
  sealed trait suspected_fraud extends js.Object
  
  @js.native
  sealed trait sv extends js.Object
  
  @js.native
  sealed trait swipe extends AuthorizationMethod
  
  @js.native
  sealed trait tax extends js.Object
  
  @js.native
  sealed trait tax_id extends js.Object
  
  @js.native
  sealed trait tax_rate extends js.Object
  
  @js.native
  sealed trait tax_rateDotcreated extends EventType
  
  @js.native
  sealed trait tax_rateDotupdated extends EventType
  
  @js.native
  sealed trait terms_of_service extends js.Object
  
  @js.native
  sealed trait theft extends IssuingCardReplacementReason
  
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
  sealed trait topupDotcreated extends EventType
  
  @js.native
  sealed trait topupDotfailed extends EventType
  
  @js.native
  sealed trait topupDotreversed extends EventType
  
  @js.native
  sealed trait topupDotsucceeded extends EventType
  
  @js.native
  sealed trait transfer extends js.Object
  
  @js.native
  sealed trait transferDotcreated extends EventType
  
  @js.native
  sealed trait transferDotfailed extends EventType
  
  @js.native
  sealed trait transferDotpaid extends EventType
  
  @js.native
  sealed trait transferDotreversed extends EventType
  
  @js.native
  sealed trait transferDotupdated extends EventType
  
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
  sealed trait under_review extends IssuingDisputeStatus
  
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
  sealed trait unsubmitted extends IssuingDisputeStatus
  
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
  sealed trait virtual extends IssuingCardType
  
  @js.native
  sealed trait visa_ extends CardBrand
  
  @js.native
  sealed trait visa_checkout extends CardWalletType
  
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
  sealed trait webhook_approved extends js.Object
  
  @js.native
  sealed trait webhook_declined extends js.Object
  
  @js.native
  sealed trait webhook_endpoint extends js.Object
  
  @js.native
  sealed trait webhook_timeout extends js.Object
  
  @js.native
  sealed trait wechat extends IPaymentMethodType
  
  @js.native
  sealed trait wednesday extends js.Object
  
  @js.native
  sealed trait week extends IntervalUnit
  
  @js.native
  sealed trait weekly extends SpendingLimitInterval
  
  @js.native
  sealed trait won extends IssuingDisputeStatus
  
  @js.native
  sealed trait year extends IntervalUnit
  
  @js.native
  sealed trait yearly extends SpendingLimitInterval
  
  @js.native
  sealed trait zh extends js.Object
  
  @scala.inline
  def `American Express`: `American Express` = ("American Express").asInstanceOf[`American Express`]
  @scala.inline
  def Asterisk: Asterisk = "*".asInstanceOf[Asterisk]
  @scala.inline
  def `Diners Club`: `Diners Club` = ("Diners Club").asInstanceOf[`Diners Club`]
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
  def accountDotapplicationDotauthorized: accountDotapplicationDotauthorized = "account.application.authorized".asInstanceOf[accountDotapplicationDotauthorized]
  @scala.inline
  def accountDotapplicationDotdeauthorized: accountDotapplicationDotdeauthorized = "account.application.deauthorized".asInstanceOf[accountDotapplicationDotdeauthorized]
  @scala.inline
  def accountDotexternal_accountDotcreated: accountDotexternal_accountDotcreated = "account.external_account.created".asInstanceOf[accountDotexternal_accountDotcreated]
  @scala.inline
  def accountDotexternal_accountDotdeleted: accountDotexternal_accountDotdeleted = "account.external_account.deleted".asInstanceOf[accountDotexternal_accountDotdeleted]
  @scala.inline
  def accountDotexternal_accountDotupdated: accountDotexternal_accountDotupdated = "account.external_account.updated".asInstanceOf[accountDotexternal_accountDotupdated]
  @scala.inline
  def accountDotupdated: accountDotupdated = "account.updated".asInstanceOf[accountDotupdated]
  @scala.inline
  def account_compliance_disabled: account_compliance_disabled = "account_compliance_disabled".asInstanceOf[account_compliance_disabled]
  @scala.inline
  def account_inactive: account_inactive = "account_inactive".asInstanceOf[account_inactive]
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
  def all_time: all_time = "all_time".asInstanceOf[all_time]
  @scala.inline
  def allowed_categories: allowed_categories = "allowed_categories".asInstanceOf[allowed_categories]
  @scala.inline
  def always_invoice: always_invoice = "always_invoice".asInstanceOf[always_invoice]
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
  def `applicationSlashoctet-stream`: `applicationSlashoctet-stream` = "application/octet-stream".asInstanceOf[`applicationSlashoctet-stream`]
  @scala.inline
  def application_fee: application_fee = "application_fee".asInstanceOf[application_fee]
  @scala.inline
  def application_feeDotcreated: application_feeDotcreated = "application_fee.created".asInstanceOf[application_feeDotcreated]
  @scala.inline
  def application_feeDotrefundDotupdated: application_feeDotrefundDotupdated = "application_fee.refund.updated".asInstanceOf[application_feeDotrefundDotupdated]
  @scala.inline
  def application_feeDotrefunded: application_feeDotrefunded = "application_fee.refunded".asInstanceOf[application_feeDotrefunded]
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
  def authentication_failed: authentication_failed = "authentication_failed".asInstanceOf[authentication_failed]
  @scala.inline
  def authorization_code: authorization_code = "authorization_code".asInstanceOf[authorization_code]
  @scala.inline
  def authorization_controls: authorization_controls = "authorization_controls".asInstanceOf[authorization_controls]
  @scala.inline
  def authorized: authorized = "authorized".asInstanceOf[authorized]
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def automatic: automatic = "automatic".asInstanceOf[automatic]
  @scala.inline
  def available: available = "available".asInstanceOf[available]
  @scala.inline
  def balanceDotavailable: balanceDotavailable = "balance.available".asInstanceOf[balanceDotavailable]
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
  def blocked_categories: blocked_categories = "blocked_categories".asInstanceOf[blocked_categories]
  @scala.inline
  def book: book = "book".asInstanceOf[book]
  @scala.inline
  def bucket: bucket = "bucket".asInstanceOf[bucket]
  @scala.inline
  def bulk: bulk = "bulk".asInstanceOf[bulk]
  @scala.inline
  def business_entity: business_entity = "business_entity".asInstanceOf[business_entity]
  @scala.inline
  def business_logo: business_logo = "business_logo".asInstanceOf[business_logo]
  @scala.inline
  def canceled: canceled = "canceled".asInstanceOf[canceled]
  @scala.inline
  def capabilityDotupdated: capabilityDotupdated = "capability.updated".asInstanceOf[capabilityDotupdated]
  @scala.inline
  def capture: capture = "capture".asInstanceOf[capture]
  @scala.inline
  def card: card = "card".asInstanceOf[card]
  @scala.inline
  def card_active: card_active = "card_active".asInstanceOf[card_active]
  @scala.inline
  def card_error: card_error = "card_error".asInstanceOf[card_error]
  @scala.inline
  def card_inactive: card_inactive = "card_inactive".asInstanceOf[card_inactive]
  @scala.inline
  def card_present: card_present = "card_present".asInstanceOf[card_present]
  @scala.inline
  def cardholder: cardholder = "cardholder".asInstanceOf[cardholder]
  @scala.inline
  def cash_withdrawal: cash_withdrawal = "cash_withdrawal".asInstanceOf[cash_withdrawal]
  @scala.inline
  def challenge_only: challenge_only = "challenge_only".asInstanceOf[challenge_only]
  @scala.inline
  def charge: charge = "charge".asInstanceOf[charge]
  @scala.inline
  def chargeDotcaptured: chargeDotcaptured = "charge.captured".asInstanceOf[chargeDotcaptured]
  @scala.inline
  def chargeDotdisputeDotclosed: chargeDotdisputeDotclosed = "charge.dispute.closed".asInstanceOf[chargeDotdisputeDotclosed]
  @scala.inline
  def chargeDotdisputeDotcreated: chargeDotdisputeDotcreated = "charge.dispute.created".asInstanceOf[chargeDotdisputeDotcreated]
  @scala.inline
  def chargeDotdisputeDotfunds_reinstated: chargeDotdisputeDotfunds_reinstated = "charge.dispute.funds_reinstated".asInstanceOf[chargeDotdisputeDotfunds_reinstated]
  @scala.inline
  def chargeDotdisputeDotfunds_withdrawn: chargeDotdisputeDotfunds_withdrawn = "charge.dispute.funds_withdrawn".asInstanceOf[chargeDotdisputeDotfunds_withdrawn]
  @scala.inline
  def chargeDotdisputeDotupdated: chargeDotdisputeDotupdated = "charge.dispute.updated".asInstanceOf[chargeDotdisputeDotupdated]
  @scala.inline
  def chargeDotexpired: chargeDotexpired = "charge.expired".asInstanceOf[chargeDotexpired]
  @scala.inline
  def chargeDotfailed: chargeDotfailed = "charge.failed".asInstanceOf[chargeDotfailed]
  @scala.inline
  def chargeDotpending: chargeDotpending = "charge.pending".asInstanceOf[chargeDotpending]
  @scala.inline
  def chargeDotrefundDotupdated: chargeDotrefundDotupdated = "charge.refund.updated".asInstanceOf[chargeDotrefundDotupdated]
  @scala.inline
  def chargeDotrefunded: chargeDotrefunded = "charge.refunded".asInstanceOf[chargeDotrefunded]
  @scala.inline
  def chargeDotsucceeded: chargeDotsucceeded = "charge.succeeded".asInstanceOf[chargeDotsucceeded]
  @scala.inline
  def chargeDotupdated: chargeDotupdated = "charge.updated".asInstanceOf[chargeDotupdated]
  @scala.inline
  def charge_automatically: charge_automatically = "charge_automatically".asInstanceOf[charge_automatically]
  @scala.inline
  def charge_refunded: charge_refunded = "charge_refunded".asInstanceOf[charge_refunded]
  @scala.inline
  def chargeable: chargeable = "chargeable".asInstanceOf[chargeable]
  @scala.inline
  def checkoutDotsessionDotcompleted: checkoutDotsessionDotcompleted = "checkout.session.completed".asInstanceOf[checkoutDotsessionDotcompleted]
  @scala.inline
  def chip: chip = "chip".asInstanceOf[chip]
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  @scala.inline
  def code_verification: code_verification = "code_verification".asInstanceOf[code_verification]
  @scala.inline
  def company: company = "company".asInstanceOf[company]
  @scala.inline
  def consumed: consumed = "consumed".asInstanceOf[consumed]
  @scala.inline
  def contactless: contactless = "contactless".asInstanceOf[contactless]
  @scala.inline
  def country_spec: country_spec = "country_spec".asInstanceOf[country_spec]
  @scala.inline
  def coupon: coupon = "coupon".asInstanceOf[coupon]
  @scala.inline
  def couponDotcreated: couponDotcreated = "coupon.created".asInstanceOf[couponDotcreated]
  @scala.inline
  def couponDotdeleted: couponDotdeleted = "coupon.deleted".asInstanceOf[couponDotdeleted]
  @scala.inline
  def couponDotupdated: couponDotupdated = "coupon.updated".asInstanceOf[couponDotupdated]
  @scala.inline
  def create_prorations: create_prorations = "create_prorations".asInstanceOf[create_prorations]
  @scala.inline
  def created: created = "created".asInstanceOf[created]
  @scala.inline
  def credit: credit = "credit".asInstanceOf[credit]
  @scala.inline
  def credit_not_processed: credit_not_processed = "credit_not_processed".asInstanceOf[credit_not_processed]
  @scala.inline
  def credit_note: credit_note = "credit_note".asInstanceOf[credit_note]
  @scala.inline
  def credit_noteDotcreated: credit_noteDotcreated = "credit_note.created".asInstanceOf[credit_noteDotcreated]
  @scala.inline
  def credit_noteDotupdated: credit_noteDotupdated = "credit_note.updated".asInstanceOf[credit_noteDotupdated]
  @scala.inline
  def credit_noteDotvoided: credit_noteDotvoided = "credit_note.voided".asInstanceOf[credit_noteDotvoided]
  @scala.inline
  def custom: custom = "custom".asInstanceOf[custom]
  @scala.inline
  def customer: customer = "customer".asInstanceOf[customer]
  @scala.inline
  def customerDotcreated: customerDotcreated = "customer.created".asInstanceOf[customerDotcreated]
  @scala.inline
  def customerDotdeleted: customerDotdeleted = "customer.deleted".asInstanceOf[customerDotdeleted]
  @scala.inline
  def customerDotdiscountDotcreated: customerDotdiscountDotcreated = "customer.discount.created".asInstanceOf[customerDotdiscountDotcreated]
  @scala.inline
  def customerDotdiscountDotdeleted: customerDotdiscountDotdeleted = "customer.discount.deleted".asInstanceOf[customerDotdiscountDotdeleted]
  @scala.inline
  def customerDotdiscountDotupdated: customerDotdiscountDotupdated = "customer.discount.updated".asInstanceOf[customerDotdiscountDotupdated]
  @scala.inline
  def customerDotsourceDotcreated: customerDotsourceDotcreated = "customer.source.created".asInstanceOf[customerDotsourceDotcreated]
  @scala.inline
  def customerDotsourceDotdeleted: customerDotsourceDotdeleted = "customer.source.deleted".asInstanceOf[customerDotsourceDotdeleted]
  @scala.inline
  def customerDotsourceDotexpiring: customerDotsourceDotexpiring = "customer.source.expiring".asInstanceOf[customerDotsourceDotexpiring]
  @scala.inline
  def customerDotsourceDotupdated: customerDotsourceDotupdated = "customer.source.updated".asInstanceOf[customerDotsourceDotupdated]
  @scala.inline
  def customerDotsubscriptionDotcreated: customerDotsubscriptionDotcreated = "customer.subscription.created".asInstanceOf[customerDotsubscriptionDotcreated]
  @scala.inline
  def customerDotsubscriptionDotdeleted: customerDotsubscriptionDotdeleted = "customer.subscription.deleted".asInstanceOf[customerDotsubscriptionDotdeleted]
  @scala.inline
  def customerDotsubscriptionDottrial_will_end: customerDotsubscriptionDottrial_will_end = "customer.subscription.trial_will_end".asInstanceOf[customerDotsubscriptionDottrial_will_end]
  @scala.inline
  def customerDotsubscriptionDotupdated: customerDotsubscriptionDotupdated = "customer.subscription.updated".asInstanceOf[customerDotsubscriptionDotupdated]
  @scala.inline
  def customerDottax_idDotcreated: customerDottax_idDotcreated = "customer.tax_id.created".asInstanceOf[customerDottax_idDotcreated]
  @scala.inline
  def customerDottax_idDotdeleted: customerDottax_idDotdeleted = "customer.tax_id.deleted".asInstanceOf[customerDottax_idDotdeleted]
  @scala.inline
  def customerDottax_idDotupdated: customerDottax_idDotupdated = "customer.tax_id.updated".asInstanceOf[customerDottax_idDotupdated]
  @scala.inline
  def customerDotupdated: customerDotupdated = "customer.updated".asInstanceOf[customerDotupdated]
  @scala.inline
  def customer_balance_transaction: customer_balance_transaction = "customer_balance_transaction".asInstanceOf[customer_balance_transaction]
  @scala.inline
  def da: da = "da".asInstanceOf[da]
  @scala.inline
  def daily: daily = "daily".asInstanceOf[daily]
  @scala.inline
  def damage: damage = "damage".asInstanceOf[damage]
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
  def delivered: delivered = "delivered".asInstanceOf[delivered]
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
  def dispute_loss: dispute_loss = "dispute_loss".asInstanceOf[dispute_loss]
  @scala.inline
  def disputed: disputed = "disputed".asInstanceOf[disputed]
  @scala.inline
  def document_address_mismatch: document_address_mismatch = "document_address_mismatch".asInstanceOf[document_address_mismatch]
  @scala.inline
  def document_dob_mismatch: document_dob_mismatch = "document_dob_mismatch".asInstanceOf[document_dob_mismatch]
  @scala.inline
  def document_duplicate_type: document_duplicate_type = "document_duplicate_type".asInstanceOf[document_duplicate_type]
  @scala.inline
  def document_id_number_mismatch: document_id_number_mismatch = "document_id_number_mismatch".asInstanceOf[document_id_number_mismatch]
  @scala.inline
  def document_name_mismatch: document_name_mismatch = "document_name_mismatch".asInstanceOf[document_name_mismatch]
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
  def expiration: expiration = "expiration".asInstanceOf[expiration]
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
  def failed_keyed_identity: failed_keyed_identity = "failed_keyed_identity".asInstanceOf[failed_keyed_identity]
  @scala.inline
  def failed_other: failed_other = "failed_other".asInstanceOf[failed_other]
  @scala.inline
  def failure: failure = "failure".asInstanceOf[failure]
  @scala.inline
  def female: female = "female".asInstanceOf[female]
  @scala.inline
  def fi: fi = "fi".asInstanceOf[fi]
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  @scala.inline
  def fileDotcreated: fileDotcreated = "file.created".asInstanceOf[fileDotcreated]
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
  def fraudlent: fraudlent = "fraudlent".asInstanceOf[fraudlent]
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
  def invoiceDotcreated: invoiceDotcreated = "invoice.created".asInstanceOf[invoiceDotcreated]
  @scala.inline
  def invoiceDotdeleted: invoiceDotdeleted = "invoice.deleted".asInstanceOf[invoiceDotdeleted]
  @scala.inline
  def invoiceDotfinalized: invoiceDotfinalized = "invoice.finalized".asInstanceOf[invoiceDotfinalized]
  @scala.inline
  def invoiceDotmarked_uncollectible: invoiceDotmarked_uncollectible = "invoice.marked_uncollectible".asInstanceOf[invoiceDotmarked_uncollectible]
  @scala.inline
  def invoiceDotpayment_action_required: invoiceDotpayment_action_required = "invoice.payment_action_required".asInstanceOf[invoiceDotpayment_action_required]
  @scala.inline
  def invoiceDotpayment_failed: invoiceDotpayment_failed = "invoice.payment_failed".asInstanceOf[invoiceDotpayment_failed]
  @scala.inline
  def invoiceDotpayment_succeeded: invoiceDotpayment_succeeded = "invoice.payment_succeeded".asInstanceOf[invoiceDotpayment_succeeded]
  @scala.inline
  def invoiceDotsent: invoiceDotsent = "invoice.sent".asInstanceOf[invoiceDotsent]
  @scala.inline
  def invoiceDotupcoming: invoiceDotupcoming = "invoice.upcoming".asInstanceOf[invoiceDotupcoming]
  @scala.inline
  def invoiceDotupdated: invoiceDotupdated = "invoice.updated".asInstanceOf[invoiceDotupdated]
  @scala.inline
  def invoiceDotvoided: invoiceDotvoided = "invoice.voided".asInstanceOf[invoiceDotvoided]
  @scala.inline
  def invoice_too_large: invoice_too_large = "invoice_too_large".asInstanceOf[invoice_too_large]
  @scala.inline
  def invoice_too_small: invoice_too_small = "invoice_too_small".asInstanceOf[invoice_too_small]
  @scala.inline
  def invoiceitem: invoiceitem = "invoiceitem".asInstanceOf[invoiceitem]
  @scala.inline
  def invoiceitemDotcreated: invoiceitemDotcreated = "invoiceitem.created".asInstanceOf[invoiceitemDotcreated]
  @scala.inline
  def invoiceitemDotdeleted: invoiceitemDotdeleted = "invoiceitem.deleted".asInstanceOf[invoiceitemDotdeleted]
  @scala.inline
  def invoiceitemDotupdated: invoiceitemDotupdated = "invoiceitem.updated".asInstanceOf[invoiceitemDotupdated]
  @scala.inline
  def issued: issued = "issued".asInstanceOf[issued]
  @scala.inline
  def issuer_declined: issuer_declined = "issuer_declined".asInstanceOf[issuer_declined]
  @scala.inline
  def issuingDotauthorization: issuingDotauthorization = "issuing.authorization".asInstanceOf[issuingDotauthorization]
  @scala.inline
  def issuingDotcard: issuingDotcard = "issuing.card".asInstanceOf[issuingDotcard]
  @scala.inline
  def issuingDotcard_details: issuingDotcard_details = "issuing.card_details".asInstanceOf[issuingDotcard_details]
  @scala.inline
  def issuingDotcardholder: issuingDotcardholder = "issuing.cardholder".asInstanceOf[issuingDotcardholder]
  @scala.inline
  def issuingDotdispute: issuingDotdispute = "issuing.dispute".asInstanceOf[issuingDotdispute]
  @scala.inline
  def issuingDottransaction: issuingDottransaction = "issuing.transaction".asInstanceOf[issuingDottransaction]
  @scala.inline
  def issuing_authorizationDotcreated: issuing_authorizationDotcreated = "issuing_authorization.created".asInstanceOf[issuing_authorizationDotcreated]
  @scala.inline
  def issuing_authorizationDotrequest: issuing_authorizationDotrequest = "issuing_authorization.request".asInstanceOf[issuing_authorizationDotrequest]
  @scala.inline
  def issuing_authorizationDotupdated: issuing_authorizationDotupdated = "issuing_authorization.updated".asInstanceOf[issuing_authorizationDotupdated]
  @scala.inline
  def issuing_cardDotcreated: issuing_cardDotcreated = "issuing_card.created".asInstanceOf[issuing_cardDotcreated]
  @scala.inline
  def issuing_cardDotupdated: issuing_cardDotupdated = "issuing_card.updated".asInstanceOf[issuing_cardDotupdated]
  @scala.inline
  def issuing_cardholderDotcreated: issuing_cardholderDotcreated = "issuing_cardholder.created".asInstanceOf[issuing_cardholderDotcreated]
  @scala.inline
  def issuing_cardholderDotupdated: issuing_cardholderDotupdated = "issuing_cardholder.updated".asInstanceOf[issuing_cardholderDotupdated]
  @scala.inline
  def issuing_disputeDotcreated: issuing_disputeDotcreated = "issuing_dispute.created".asInstanceOf[issuing_disputeDotcreated]
  @scala.inline
  def issuing_disputeDotupdated: issuing_disputeDotupdated = "issuing_dispute.updated".asInstanceOf[issuing_disputeDotupdated]
  @scala.inline
  def issuing_settlementDotcreated: issuing_settlementDotcreated = "issuing_settlement.created".asInstanceOf[issuing_settlementDotcreated]
  @scala.inline
  def issuing_settlementDotupdated: issuing_settlementDotupdated = "issuing_settlement.updated".asInstanceOf[issuing_settlementDotupdated]
  @scala.inline
  def issuing_transactionDotcreated: issuing_transactionDotcreated = "issuing_transaction.created".asInstanceOf[issuing_transactionDotcreated]
  @scala.inline
  def issuing_transactionDotupdated: issuing_transactionDotupdated = "issuing_transaction.updated".asInstanceOf[issuing_transactionDotupdated]
  @scala.inline
  def it: it = "it".asInstanceOf[it]
  @scala.inline
  def ja: ja = "ja".asInstanceOf[ja]
  @scala.inline
  def jcb_ : jcb_ = "jcb".asInstanceOf[jcb_]
  @scala.inline
  def jpg: jpg = "jpg".asInstanceOf[jpg]
  @scala.inline
  def keyed_in: keyed_in = "keyed_in".asInstanceOf[keyed_in]
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
  def listed: listed = "listed".asInstanceOf[listed]
  @scala.inline
  def login_link: login_link = "login_link".asInstanceOf[login_link]
  @scala.inline
  def loss: loss = "loss".asInstanceOf[loss]
  @scala.inline
  def lost: lost = "lost".asInstanceOf[lost]
  @scala.inline
  def lost_or_stolen_card: lost_or_stolen_card = "lost_or_stolen_card".asInstanceOf[lost_or_stolen_card]
  @scala.inline
  def male: male = "male".asInstanceOf[male]
  @scala.inline
  def mandateDotupdated: mandateDotupdated = "mandate.updated".asInstanceOf[mandateDotupdated]
  @scala.inline
  def manual: manual = "manual".asInstanceOf[manual]
  @scala.inline
  def manual_review: manual_review = "manual_review".asInstanceOf[manual_review]
  @scala.inline
  def mastercard_ : mastercard_ = "mastercard".asInstanceOf[mastercard_]
  @scala.inline
  def masterpass: masterpass = "masterpass".asInstanceOf[masterpass]
  @scala.inline
  def `match`: `match` = "match".asInstanceOf[`match`]
  @scala.inline
  def max: max = "max".asInstanceOf[max]
  @scala.inline
  def max_amount: max_amount = "max_amount".asInstanceOf[max_amount]
  @scala.inline
  def max_approvals: max_approvals = "max_approvals".asInstanceOf[max_approvals]
  @scala.inline
  def metered: metered = "metered".asInstanceOf[metered]
  @scala.inline
  def mismatch: mismatch = "mismatch".asInstanceOf[mismatch]
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
  def not_provided: not_provided = "not_provided".asInstanceOf[not_provided]
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
  def orderDotcreated: orderDotcreated = "order.created".asInstanceOf[orderDotcreated]
  @scala.inline
  def orderDotpayment_failed: orderDotpayment_failed = "order.payment_failed".asInstanceOf[orderDotpayment_failed]
  @scala.inline
  def orderDotpayment_succeeded: orderDotpayment_succeeded = "order.payment_succeeded".asInstanceOf[orderDotpayment_succeeded]
  @scala.inline
  def orderDotupdated: orderDotupdated = "order.updated".asInstanceOf[orderDotupdated]
  @scala.inline
  def order_change: order_change = "order_change".asInstanceOf[order_change]
  @scala.inline
  def order_item: order_item = "order_item".asInstanceOf[order_item]
  @scala.inline
  def order_returnDotcreated: order_returnDotcreated = "order_return.created".asInstanceOf[order_returnDotcreated]
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
  def payment_intentDotamount_capturable_updated: payment_intentDotamount_capturable_updated = "payment_intent.amount_capturable_updated".asInstanceOf[payment_intentDotamount_capturable_updated]
  @scala.inline
  def payment_intentDotcanceled: payment_intentDotcanceled = "payment_intent.canceled".asInstanceOf[payment_intentDotcanceled]
  @scala.inline
  def payment_intentDotcreated: payment_intentDotcreated = "payment_intent.created".asInstanceOf[payment_intentDotcreated]
  @scala.inline
  def payment_intentDotpayment_failed: payment_intentDotpayment_failed = "payment_intent.payment_failed".asInstanceOf[payment_intentDotpayment_failed]
  @scala.inline
  def payment_intentDotsucceeded: payment_intentDotsucceeded = "payment_intent.succeeded".asInstanceOf[payment_intentDotsucceeded]
  @scala.inline
  def payment_method: payment_method = "payment_method".asInstanceOf[payment_method]
  @scala.inline
  def payment_methodDotattached: payment_methodDotattached = "payment_method.attached".asInstanceOf[payment_methodDotattached]
  @scala.inline
  def payment_methodDotcard_automatically_updated: payment_methodDotcard_automatically_updated = "payment_method.card_automatically_updated".asInstanceOf[payment_methodDotcard_automatically_updated]
  @scala.inline
  def payment_methodDotdetached: payment_methodDotdetached = "payment_method.detached".asInstanceOf[payment_methodDotdetached]
  @scala.inline
  def payment_methodDotupdated: payment_methodDotupdated = "payment_method.updated".asInstanceOf[payment_methodDotupdated]
  @scala.inline
  def payout: payout = "payout".asInstanceOf[payout]
  @scala.inline
  def payoutDotcanceled: payoutDotcanceled = "payout.canceled".asInstanceOf[payoutDotcanceled]
  @scala.inline
  def payoutDotcreated: payoutDotcreated = "payout.created".asInstanceOf[payoutDotcreated]
  @scala.inline
  def payoutDotfailed: payoutDotfailed = "payout.failed".asInstanceOf[payoutDotfailed]
  @scala.inline
  def payoutDotpaid: payoutDotpaid = "payout.paid".asInstanceOf[payoutDotpaid]
  @scala.inline
  def payoutDotupdated: payoutDotupdated = "payout.updated".asInstanceOf[payoutDotupdated]
  @scala.inline
  def payout_failure: payout_failure = "payout_failure".asInstanceOf[payout_failure]
  @scala.inline
  def pdf: pdf = "pdf".asInstanceOf[pdf]
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  @scala.inline
  def per_authorization: per_authorization = "per_authorization".asInstanceOf[per_authorization]
  @scala.inline
  def per_unit: per_unit = "per_unit".asInstanceOf[per_unit]
  @scala.inline
  def person: person = "person".asInstanceOf[person]
  @scala.inline
  def personDotcreated: personDotcreated = "person.created".asInstanceOf[personDotcreated]
  @scala.inline
  def personDotdeleted: personDotdeleted = "person.deleted".asInstanceOf[personDotdeleted]
  @scala.inline
  def personDotupdated: personDotupdated = "person.updated".asInstanceOf[personDotupdated]
  @scala.inline
  def physical: physical = "physical".asInstanceOf[physical]
  @scala.inline
  def pl: pl = "pl".asInstanceOf[pl]
  @scala.inline
  def plan: plan = "plan".asInstanceOf[plan]
  @scala.inline
  def planDotcreated: planDotcreated = "plan.created".asInstanceOf[planDotcreated]
  @scala.inline
  def planDotdeleted: planDotdeleted = "plan.deleted".asInstanceOf[planDotdeleted]
  @scala.inline
  def planDotupdated: planDotupdated = "plan.updated".asInstanceOf[planDotupdated]
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
  def productDotcreated: productDotcreated = "product.created".asInstanceOf[productDotcreated]
  @scala.inline
  def productDotdeleted: productDotdeleted = "product.deleted".asInstanceOf[productDotdeleted]
  @scala.inline
  def productDotupdated: productDotupdated = "product.updated".asInstanceOf[productDotupdated]
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
  def radarDotearly_fraud_warningDotcreated: radarDotearly_fraud_warningDotcreated = "radar.early_fraud_warning.created".asInstanceOf[radarDotearly_fraud_warningDotcreated]
  @scala.inline
  def radarDotearly_fraud_warningDotupdated: radarDotearly_fraud_warningDotupdated = "radar.early_fraud_warning.updated".asInstanceOf[radarDotearly_fraud_warningDotupdated]
  @scala.inline
  def range: range = "range".asInstanceOf[range]
  @scala.inline
  def receiver: receiver = "receiver".asInstanceOf[receiver]
  @scala.inline
  def recipientDotcreated: recipientDotcreated = "recipient.created".asInstanceOf[recipientDotcreated]
  @scala.inline
  def recipientDotdeleted: recipientDotdeleted = "recipient.deleted".asInstanceOf[recipientDotdeleted]
  @scala.inline
  def recipientDotupdated: recipientDotupdated = "recipient.updated".asInstanceOf[recipientDotupdated]
  @scala.inline
  def redirect: redirect = "redirect".asInstanceOf[redirect]
  @scala.inline
  def redirect_to_url: redirect_to_url = "redirect_to_url".asInstanceOf[redirect_to_url]
  @scala.inline
  def refresh_token: refresh_token = "refresh_token".asInstanceOf[refresh_token]
  @scala.inline
  def refund: refund = "refund".asInstanceOf[refund]
  @scala.inline
  def refund_reversal: refund_reversal = "refund_reversal".asInstanceOf[refund_reversal]
  @scala.inline
  def refunded: refunded = "refunded".asInstanceOf[refunded]
  @scala.inline
  def refunded_as_fraud: refunded_as_fraud = "refunded_as_fraud".asInstanceOf[refunded_as_fraud]
  @scala.inline
  def refused: refused = "refused".asInstanceOf[refused]
  @scala.inline
  def rejectedDotlisted: rejectedDotlisted = "rejected.listed".asInstanceOf[rejectedDotlisted]
  @scala.inline
  def repeating: repeating = "repeating".asInstanceOf[repeating]
  @scala.inline
  def reportingDotreport_runDotfailed: reportingDotreport_runDotfailed = "reporting.report_run.failed".asInstanceOf[reportingDotreport_runDotfailed]
  @scala.inline
  def reportingDotreport_runDotsucceeded: reportingDotreport_runDotsucceeded = "reporting.report_run.succeeded".asInstanceOf[reportingDotreport_runDotsucceeded]
  @scala.inline
  def reportingDotreport_typeDotupdated: reportingDotreport_typeDotupdated = "reporting.report_type.updated".asInstanceOf[reportingDotreport_typeDotupdated]
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
  def reviewDotclosed: reviewDotclosed = "review.closed".asInstanceOf[reviewDotclosed]
  @scala.inline
  def reviewDotopened: reviewDotopened = "review.opened".asInstanceOf[reviewDotopened]
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
  def setup_intentDotcanceled: setup_intentDotcanceled = "setup_intent.canceled".asInstanceOf[setup_intentDotcanceled]
  @scala.inline
  def setup_intentDotcreated: setup_intentDotcreated = "setup_intent.created".asInstanceOf[setup_intentDotcreated]
  @scala.inline
  def setup_intentDotsetup_failed: setup_intentDotsetup_failed = "setup_intent.setup_failed".asInstanceOf[setup_intentDotsetup_failed]
  @scala.inline
  def setup_intentDotsucceeded: setup_intentDotsucceeded = "setup_intent.succeeded".asInstanceOf[setup_intentDotsucceeded]
  @scala.inline
  def shipped: shipped = "shipped".asInstanceOf[shipped]
  @scala.inline
  def shipping: shipping = "shipping".asInstanceOf[shipping]
  @scala.inline
  def sigmaDotscheduled_query_runDotcreated: sigmaDotscheduled_query_runDotcreated = "sigma.scheduled_query_run.created".asInstanceOf[sigmaDotscheduled_query_runDotcreated]
  @scala.inline
  def single_use: single_use = "single_use".asInstanceOf[single_use]
  @scala.inline
  def sku: sku = "sku".asInstanceOf[sku]
  @scala.inline
  def skuDotcreated: skuDotcreated = "sku.created".asInstanceOf[skuDotcreated]
  @scala.inline
  def skuDotdeleted: skuDotdeleted = "sku.deleted".asInstanceOf[skuDotdeleted]
  @scala.inline
  def skuDotupdated: skuDotupdated = "sku.updated".asInstanceOf[skuDotupdated]
  @scala.inline
  def sofort: sofort = "sofort".asInstanceOf[sofort]
  @scala.inline
  def source: source = "source".asInstanceOf[source]
  @scala.inline
  def sourceDotcanceled: sourceDotcanceled = "source.canceled".asInstanceOf[sourceDotcanceled]
  @scala.inline
  def sourceDotchargeable: sourceDotchargeable = "source.chargeable".asInstanceOf[sourceDotchargeable]
  @scala.inline
  def sourceDotfailed: sourceDotfailed = "source.failed".asInstanceOf[sourceDotfailed]
  @scala.inline
  def sourceDotmandate_notification: sourceDotmandate_notification = "source.mandate_notification".asInstanceOf[sourceDotmandate_notification]
  @scala.inline
  def sourceDotrefund_attributes_required: sourceDotrefund_attributes_required = "source.refund_attributes_required".asInstanceOf[sourceDotrefund_attributes_required]
  @scala.inline
  def sourceDottransactionDotcreated: sourceDottransactionDotcreated = "source.transaction.created".asInstanceOf[sourceDottransactionDotcreated]
  @scala.inline
  def sourceDottransactionDotupdated: sourceDottransactionDotupdated = "source.transaction.updated".asInstanceOf[sourceDottransactionDotupdated]
  @scala.inline
  def spending_limits: spending_limits = "spending_limits".asInstanceOf[spending_limits]
  @scala.inline
  def standard: standard = "standard".asInstanceOf[standard]
  @scala.inline
  def stolen: stolen = "stolen".asInstanceOf[stolen]
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
  def subscription_scheduleDotaborted: subscription_scheduleDotaborted = "subscription_schedule.aborted".asInstanceOf[subscription_scheduleDotaborted]
  @scala.inline
  def subscription_scheduleDotcanceled: subscription_scheduleDotcanceled = "subscription_schedule.canceled".asInstanceOf[subscription_scheduleDotcanceled]
  @scala.inline
  def subscription_scheduleDotcompleted: subscription_scheduleDotcompleted = "subscription_schedule.completed".asInstanceOf[subscription_scheduleDotcompleted]
  @scala.inline
  def subscription_scheduleDotcreated: subscription_scheduleDotcreated = "subscription_schedule.created".asInstanceOf[subscription_scheduleDotcreated]
  @scala.inline
  def subscription_scheduleDotexpiring: subscription_scheduleDotexpiring = "subscription_schedule.expiring".asInstanceOf[subscription_scheduleDotexpiring]
  @scala.inline
  def subscription_scheduleDotreleased: subscription_scheduleDotreleased = "subscription_schedule.released".asInstanceOf[subscription_scheduleDotreleased]
  @scala.inline
  def subscription_scheduleDotupdated: subscription_scheduleDotupdated = "subscription_schedule.updated".asInstanceOf[subscription_scheduleDotupdated]
  @scala.inline
  def subscription_threshold: subscription_threshold = "subscription_threshold".asInstanceOf[subscription_threshold]
  @scala.inline
  def subscription_update: subscription_update = "subscription_update".asInstanceOf[subscription_update]
  @scala.inline
  def succeeded: succeeded = "succeeded".asInstanceOf[succeeded]
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  @scala.inline
  def sum: sum = "sum".asInstanceOf[sum]
  @scala.inline
  def sunday: sunday = "sunday".asInstanceOf[sunday]
  @scala.inline
  def suspected_fraud: suspected_fraud = "suspected_fraud".asInstanceOf[suspected_fraud]
  @scala.inline
  def sv: sv = "sv".asInstanceOf[sv]
  @scala.inline
  def swipe: swipe = "swipe".asInstanceOf[swipe]
  @scala.inline
  def tax: tax = "tax".asInstanceOf[tax]
  @scala.inline
  def tax_id: tax_id = "tax_id".asInstanceOf[tax_id]
  @scala.inline
  def tax_rate: tax_rate = "tax_rate".asInstanceOf[tax_rate]
  @scala.inline
  def tax_rateDotcreated: tax_rateDotcreated = "tax_rate.created".asInstanceOf[tax_rateDotcreated]
  @scala.inline
  def tax_rateDotupdated: tax_rateDotupdated = "tax_rate.updated".asInstanceOf[tax_rateDotupdated]
  @scala.inline
  def terms_of_service: terms_of_service = "terms_of_service".asInstanceOf[terms_of_service]
  @scala.inline
  def theft: theft = "theft".asInstanceOf[theft]
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
  def topupDotcreated: topupDotcreated = "topup.created".asInstanceOf[topupDotcreated]
  @scala.inline
  def topupDotfailed: topupDotfailed = "topup.failed".asInstanceOf[topupDotfailed]
  @scala.inline
  def topupDotreversed: topupDotreversed = "topup.reversed".asInstanceOf[topupDotreversed]
  @scala.inline
  def topupDotsucceeded: topupDotsucceeded = "topup.succeeded".asInstanceOf[topupDotsucceeded]
  @scala.inline
  def transfer: transfer = "transfer".asInstanceOf[transfer]
  @scala.inline
  def transferDotcreated: transferDotcreated = "transfer.created".asInstanceOf[transferDotcreated]
  @scala.inline
  def transferDotfailed: transferDotfailed = "transfer.failed".asInstanceOf[transferDotfailed]
  @scala.inline
  def transferDotpaid: transferDotpaid = "transfer.paid".asInstanceOf[transferDotpaid]
  @scala.inline
  def transferDotreversed: transferDotreversed = "transfer.reversed".asInstanceOf[transferDotreversed]
  @scala.inline
  def transferDotupdated: transferDotupdated = "transfer.updated".asInstanceOf[transferDotupdated]
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
  def unsubmitted: unsubmitted = "unsubmitted".asInstanceOf[unsubmitted]
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
  def virtual: virtual = "virtual".asInstanceOf[virtual]
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
  def webhook_approved: webhook_approved = "webhook_approved".asInstanceOf[webhook_approved]
  @scala.inline
  def webhook_declined: webhook_declined = "webhook_declined".asInstanceOf[webhook_declined]
  @scala.inline
  def webhook_endpoint: webhook_endpoint = "webhook_endpoint".asInstanceOf[webhook_endpoint]
  @scala.inline
  def webhook_timeout: webhook_timeout = "webhook_timeout".asInstanceOf[webhook_timeout]
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
  def yearly: yearly = "yearly".asInstanceOf[yearly]
  @scala.inline
  def zh: zh = "zh".asInstanceOf[zh]
}

