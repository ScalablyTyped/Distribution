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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stripeStrings {
  
  @js.native
  sealed trait `American Express` extends StObject
  @scala.inline
  def `American Express`: `American Express` = ("American Express").asInstanceOf[`American Express`]
  
  @js.native
  sealed trait Asterisk
    extends StObject
       with EventType
  @scala.inline
  def Asterisk: Asterisk = "*".asInstanceOf[Asterisk]
  
  @js.native
  sealed trait `Diners Club` extends StObject
  @scala.inline
  def `Diners Club`: `Diners Club` = ("Diners Club").asInstanceOf[`Diners Club`]
  
  @js.native
  sealed trait Discover extends StObject
  @scala.inline
  def Discover: Discover = "Discover".asInstanceOf[Discover]
  
  @js.native
  sealed trait JCB extends StObject
  @scala.inline
  def JCB: JCB = "JCB".asInstanceOf[JCB]
  
  @js.native
  sealed trait MasterCard extends StObject
  @scala.inline
  def MasterCard: MasterCard = "MasterCard".asInstanceOf[MasterCard]
  
  @js.native
  sealed trait StripeAPIError extends StObject
  @scala.inline
  def StripeAPIError: StripeAPIError = "StripeAPIError".asInstanceOf[StripeAPIError]
  
  @js.native
  sealed trait StripeAuthenticationError extends StObject
  @scala.inline
  def StripeAuthenticationError: StripeAuthenticationError = "StripeAuthenticationError".asInstanceOf[StripeAuthenticationError]
  
  @js.native
  sealed trait StripeCardError extends StObject
  @scala.inline
  def StripeCardError: StripeCardError = "StripeCardError".asInstanceOf[StripeCardError]
  
  @js.native
  sealed trait StripeConnectionError extends StObject
  @scala.inline
  def StripeConnectionError: StripeConnectionError = "StripeConnectionError".asInstanceOf[StripeConnectionError]
  
  @js.native
  sealed trait StripeIdempotencyError extends StObject
  @scala.inline
  def StripeIdempotencyError: StripeIdempotencyError = "StripeIdempotencyError".asInstanceOf[StripeIdempotencyError]
  
  @js.native
  sealed trait StripeInvalidRequestError extends StObject
  @scala.inline
  def StripeInvalidRequestError: StripeInvalidRequestError = "StripeInvalidRequestError".asInstanceOf[StripeInvalidRequestError]
  
  @js.native
  sealed trait StripePermissionError extends StObject
  @scala.inline
  def StripePermissionError: StripePermissionError = "StripePermissionError".asInstanceOf[StripePermissionError]
  
  @js.native
  sealed trait StripeRateLimitError extends StObject
  @scala.inline
  def StripeRateLimitError: StripeRateLimitError = "StripeRateLimitError".asInstanceOf[StripeRateLimitError]
  
  @js.native
  sealed trait StripeSignatureVerificationError extends StObject
  @scala.inline
  def StripeSignatureVerificationError: StripeSignatureVerificationError = "StripeSignatureVerificationError".asInstanceOf[StripeSignatureVerificationError]
  
  @js.native
  sealed trait Unknown extends StObject
  @scala.inline
  def Unknown: Unknown = "Unknown".asInstanceOf[Unknown]
  
  @js.native
  sealed trait Visa extends StObject
  @scala.inline
  def Visa: Visa = "Visa".asInstanceOf[Visa]
  
  @js.native
  sealed trait abandoned
    extends StObject
       with PaymentIntentUserProvidedCancellationReason
       with SetupIntentCancelationReason
  @scala.inline
  def abandoned: abandoned = "abandoned".asInstanceOf[abandoned]
  
  @js.native
  sealed trait accepted extends StObject
  @scala.inline
  def accepted: accepted = "accepted".asInstanceOf[accepted]
  
  @js.native
  sealed trait account extends StObject
  @scala.inline
  def account: account = "account".asInstanceOf[account]
  
  @js.native
  sealed trait accountDotapplicationDotauthorized
    extends StObject
       with EventType
  @scala.inline
  def accountDotapplicationDotauthorized: accountDotapplicationDotauthorized = "account.application.authorized".asInstanceOf[accountDotapplicationDotauthorized]
  
  @js.native
  sealed trait accountDotapplicationDotdeauthorized
    extends StObject
       with EventType
  @scala.inline
  def accountDotapplicationDotdeauthorized: accountDotapplicationDotdeauthorized = "account.application.deauthorized".asInstanceOf[accountDotapplicationDotdeauthorized]
  
  @js.native
  sealed trait accountDotexternal_accountDotcreated
    extends StObject
       with EventType
  @scala.inline
  def accountDotexternal_accountDotcreated: accountDotexternal_accountDotcreated = "account.external_account.created".asInstanceOf[accountDotexternal_accountDotcreated]
  
  @js.native
  sealed trait accountDotexternal_accountDotdeleted
    extends StObject
       with EventType
  @scala.inline
  def accountDotexternal_accountDotdeleted: accountDotexternal_accountDotdeleted = "account.external_account.deleted".asInstanceOf[accountDotexternal_accountDotdeleted]
  
  @js.native
  sealed trait accountDotexternal_accountDotupdated
    extends StObject
       with EventType
  @scala.inline
  def accountDotexternal_accountDotupdated: accountDotexternal_accountDotupdated = "account.external_account.updated".asInstanceOf[accountDotexternal_accountDotupdated]
  
  @js.native
  sealed trait accountDotupdated
    extends StObject
       with EventType
  @scala.inline
  def accountDotupdated: accountDotupdated = "account.updated".asInstanceOf[accountDotupdated]
  
  @js.native
  sealed trait account_compliance_disabled extends StObject
  @scala.inline
  def account_compliance_disabled: account_compliance_disabled = "account_compliance_disabled".asInstanceOf[account_compliance_disabled]
  
  @js.native
  sealed trait account_inactive extends StObject
  @scala.inline
  def account_inactive: account_inactive = "account_inactive".asInstanceOf[account_inactive]
  
  @js.native
  sealed trait ach_credit_transfer
    extends StObject
       with IPaymentMethodType
  @scala.inline
  def ach_credit_transfer: ach_credit_transfer = "ach_credit_transfer".asInstanceOf[ach_credit_transfer]
  
  @js.native
  sealed trait ach_debit
    extends StObject
       with IPaymentMethodType
  @scala.inline
  def ach_debit: ach_debit = "ach_debit".asInstanceOf[ach_debit]
  
  @js.native
  sealed trait active
    extends StObject
       with CardholderStatus
       with IssuingCardStatus
       with SubscriptionStatus
  @scala.inline
  def active: active = "active".asInstanceOf[active]
  
  @js.native
  sealed trait adjustment
    extends StObject
       with CustomerBalanceTransactionType
  @scala.inline
  def adjustment: adjustment = "adjustment".asInstanceOf[adjustment]
  
  @js.native
  sealed trait alipay
    extends StObject
       with IPaymentMethodType
  @scala.inline
  def alipay: alipay = "alipay".asInstanceOf[alipay]
  
  @js.native
  sealed trait alipay_account
    extends StObject
       with SourceTypes
  @scala.inline
  def alipay_account: alipay_account = "alipay_account".asInstanceOf[alipay_account]
  
  @js.native
  sealed trait all extends StObject
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait all_time
    extends StObject
       with SpendingLimitInterval
  @scala.inline
  def all_time: all_time = "all_time".asInstanceOf[all_time]
  
  @js.native
  sealed trait allowed_categories extends StObject
  @scala.inline
  def allowed_categories: allowed_categories = "allowed_categories".asInstanceOf[allowed_categories]
  
  @js.native
  sealed trait always_invoice extends StObject
  @scala.inline
  def always_invoice: always_invoice = "always_invoice".asInstanceOf[always_invoice]
  
  @js.native
  sealed trait amex
    extends StObject
       with CardBrand
  @scala.inline
  def amex: amex = "amex".asInstanceOf[amex]
  
  @js.native
  sealed trait amex_express_checkout
    extends StObject
       with CardWalletType
  @scala.inline
  def amex_express_checkout: amex_express_checkout = "amex_express_checkout".asInstanceOf[amex_express_checkout]
  
  @js.native
  sealed trait android_pay extends StObject
  @scala.inline
  def android_pay: android_pay = "android_pay".asInstanceOf[android_pay]
  
  @js.native
  sealed trait any extends StObject
  @scala.inline
  def any: any = "any".asInstanceOf[any]
  
  @js.native
  sealed trait api_error
    extends StObject
       with RawType
  @scala.inline
  def api_error: api_error = "api_error".asInstanceOf[api_error]
  
  @js.native
  sealed trait apple_pay
    extends StObject
       with CardWalletType
       with WalletProvider
  @scala.inline
  def apple_pay: apple_pay = "apple_pay".asInstanceOf[apple_pay]
  
  @js.native
  sealed trait application extends StObject
  @scala.inline
  def application: application = "application".asInstanceOf[application]
  
  @js.native
  sealed trait `applicationSlashoctet-stream` extends StObject
  @scala.inline
  def `applicationSlashoctet-stream`: `applicationSlashoctet-stream` = "application/octet-stream".asInstanceOf[`applicationSlashoctet-stream`]
  
  @js.native
  sealed trait application_fee extends StObject
  @scala.inline
  def application_fee: application_fee = "application_fee".asInstanceOf[application_fee]
  
  @js.native
  sealed trait application_feeDotcreated
    extends StObject
       with EventType
  @scala.inline
  def application_feeDotcreated: application_feeDotcreated = "application_fee.created".asInstanceOf[application_feeDotcreated]
  
  @js.native
  sealed trait application_feeDotrefundDotupdated
    extends StObject
       with EventType
  @scala.inline
  def application_feeDotrefundDotupdated: application_feeDotrefundDotupdated = "application_fee.refund.updated".asInstanceOf[application_feeDotrefundDotupdated]
  
  @js.native
  sealed trait application_feeDotrefunded
    extends StObject
       with EventType
  @scala.inline
  def application_feeDotrefunded: application_feeDotrefunded = "application_fee.refunded".asInstanceOf[application_feeDotrefunded]
  
  @js.native
  sealed trait application_fee_refund extends StObject
  @scala.inline
  def application_fee_refund: application_fee_refund = "application_fee_refund".asInstanceOf[application_fee_refund]
  
  @js.native
  sealed trait applied_to_invoice
    extends StObject
       with CustomerBalanceTransactionType
  @scala.inline
  def applied_to_invoice: applied_to_invoice = "applied_to_invoice".asInstanceOf[applied_to_invoice]
  
  @js.native
  sealed trait approved extends StObject
  @scala.inline
  def approved: approved = "approved".asInstanceOf[approved]
  
  @js.native
  sealed trait approved_by_network extends StObject
  @scala.inline
  def approved_by_network: approved_by_network = "approved_by_network".asInstanceOf[approved_by_network]
  
  @js.native
  sealed trait au_abn
    extends StObject
       with TaxIdType
  @scala.inline
  def au_abn: au_abn = "au_abn".asInstanceOf[au_abn]
  
  @js.native
  sealed trait authentication_failed extends StObject
  @scala.inline
  def authentication_failed: authentication_failed = "authentication_failed".asInstanceOf[authentication_failed]
  
  @js.native
  sealed trait authorization_code extends StObject
  @scala.inline
  def authorization_code: authorization_code = "authorization_code".asInstanceOf[authorization_code]
  
  @js.native
  sealed trait authorization_controls extends StObject
  @scala.inline
  def authorization_controls: authorization_controls = "authorization_controls".asInstanceOf[authorization_controls]
  
  @js.native
  sealed trait authorized extends StObject
  @scala.inline
  def authorized: authorized = "authorized".asInstanceOf[authorized]
  
  @js.native
  sealed trait auto extends StObject
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait automatic
    extends StObject
       with PaymentIntentDataCaptureMethodOptions
       with PaymentIntentStripeProvidedCancellationReason
  @scala.inline
  def automatic: automatic = "automatic".asInstanceOf[automatic]
  
  @js.native
  sealed trait available extends StObject
  @scala.inline
  def available: available = "available".asInstanceOf[available]
  
  @js.native
  sealed trait balanceDotavailable
    extends StObject
       with EventType
  @scala.inline
  def balanceDotavailable: balanceDotavailable = "balance.available".asInstanceOf[balanceDotavailable]
  
  @js.native
  sealed trait bancontact
    extends StObject
       with IPaymentMethodType
  @scala.inline
  def bancontact: bancontact = "bancontact".asInstanceOf[bancontact]
  
  @js.native
  sealed trait bank_account
    extends StObject
       with PayoutTypes
       with SourceTypes
  @scala.inline
  def bank_account: bank_account = "bank_account".asInstanceOf[bank_account]
  
  @js.native
  sealed trait bank_cannot_process extends StObject
  @scala.inline
  def bank_cannot_process: bank_cannot_process = "bank_cannot_process".asInstanceOf[bank_cannot_process]
  
  @js.native
  sealed trait bearer extends StObject
  @scala.inline
  def bearer: bearer = "bearer".asInstanceOf[bearer]
  
  @js.native
  sealed trait bitcoin_receiver
    extends StObject
       with SourceTypes
  @scala.inline
  def bitcoin_receiver: bitcoin_receiver = "bitcoin_receiver".asInstanceOf[bitcoin_receiver]
  
  @js.native
  sealed trait blocked
    extends StObject
       with CardholderStatus
  @scala.inline
  def blocked: blocked = "blocked".asInstanceOf[blocked]
  
  @js.native
  sealed trait blocked_categories extends StObject
  @scala.inline
  def blocked_categories: blocked_categories = "blocked_categories".asInstanceOf[blocked_categories]
  
  @js.native
  sealed trait book extends StObject
  @scala.inline
  def book: book = "book".asInstanceOf[book]
  
  @js.native
  sealed trait bucket extends StObject
  @scala.inline
  def bucket: bucket = "bucket".asInstanceOf[bucket]
  
  @js.native
  sealed trait bulk extends StObject
  @scala.inline
  def bulk: bulk = "bulk".asInstanceOf[bulk]
  
  @js.native
  sealed trait business_entity
    extends StObject
       with CardholderType
  @scala.inline
  def business_entity: business_entity = "business_entity".asInstanceOf[business_entity]
  
  @js.native
  sealed trait business_logo
    extends StObject
       with IPurpose
  @scala.inline
  def business_logo: business_logo = "business_logo".asInstanceOf[business_logo]
  
  @js.native
  sealed trait canceled
    extends StObject
       with IssuingCardStatus
       with OrderStatus
       with Statuses
       with SubscriptionStatus
  @scala.inline
  def canceled: canceled = "canceled".asInstanceOf[canceled]
  
  @js.native
  sealed trait capabilityDotupdated
    extends StObject
       with EventType
  @scala.inline
  def capabilityDotupdated: capabilityDotupdated = "capability.updated".asInstanceOf[capabilityDotupdated]
  
  @js.native
  sealed trait capture
    extends StObject
       with TransactionType
  @scala.inline
  def capture: capture = "capture".asInstanceOf[capture]
  
  @js.native
  sealed trait card
    extends StObject
       with IPaymentMethodType
       with typings.stripe.mod.paymentMethods.IPaymentMethodType
       with PaymentIntentPaymentMethodType
       with PayoutTypes
       with SourceTypes
  @scala.inline
  def card: card = "card".asInstanceOf[card]
  
  @js.native
  sealed trait card_active extends StObject
  @scala.inline
  def card_active: card_active = "card_active".asInstanceOf[card_active]
  
  @js.native
  sealed trait card_error
    extends StObject
       with RawType
  @scala.inline
  def card_error: card_error = "card_error".asInstanceOf[card_error]
  
  @js.native
  sealed trait card_inactive extends StObject
  @scala.inline
  def card_inactive: card_inactive = "card_inactive".asInstanceOf[card_inactive]
  
  @js.native
  sealed trait card_present
    extends StObject
       with IPaymentMethodType
       with typings.stripe.mod.paymentMethods.IPaymentMethodType
  @scala.inline
  def card_present: card_present = "card_present".asInstanceOf[card_present]
  
  @js.native
  sealed trait cardholder extends StObject
  @scala.inline
  def cardholder: cardholder = "cardholder".asInstanceOf[cardholder]
  
  @js.native
  sealed trait cash_withdrawal
    extends StObject
       with TransactionType
  @scala.inline
  def cash_withdrawal: cash_withdrawal = "cash_withdrawal".asInstanceOf[cash_withdrawal]
  
  @js.native
  sealed trait challenge_only extends StObject
  @scala.inline
  def challenge_only: challenge_only = "challenge_only".asInstanceOf[challenge_only]
  
  @js.native
  sealed trait charge extends StObject
  @scala.inline
  def charge: charge = "charge".asInstanceOf[charge]
  
  @js.native
  sealed trait chargeDotcaptured
    extends StObject
       with EventType
  @scala.inline
  def chargeDotcaptured: chargeDotcaptured = "charge.captured".asInstanceOf[chargeDotcaptured]
  
  @js.native
  sealed trait chargeDotdisputeDotclosed
    extends StObject
       with EventType
  @scala.inline
  def chargeDotdisputeDotclosed: chargeDotdisputeDotclosed = "charge.dispute.closed".asInstanceOf[chargeDotdisputeDotclosed]
  
  @js.native
  sealed trait chargeDotdisputeDotcreated
    extends StObject
       with EventType
  @scala.inline
  def chargeDotdisputeDotcreated: chargeDotdisputeDotcreated = "charge.dispute.created".asInstanceOf[chargeDotdisputeDotcreated]
  
  @js.native
  sealed trait chargeDotdisputeDotfunds_reinstated
    extends StObject
       with EventType
  @scala.inline
  def chargeDotdisputeDotfunds_reinstated: chargeDotdisputeDotfunds_reinstated = "charge.dispute.funds_reinstated".asInstanceOf[chargeDotdisputeDotfunds_reinstated]
  
  @js.native
  sealed trait chargeDotdisputeDotfunds_withdrawn
    extends StObject
       with EventType
  @scala.inline
  def chargeDotdisputeDotfunds_withdrawn: chargeDotdisputeDotfunds_withdrawn = "charge.dispute.funds_withdrawn".asInstanceOf[chargeDotdisputeDotfunds_withdrawn]
  
  @js.native
  sealed trait chargeDotdisputeDotupdated
    extends StObject
       with EventType
  @scala.inline
  def chargeDotdisputeDotupdated: chargeDotdisputeDotupdated = "charge.dispute.updated".asInstanceOf[chargeDotdisputeDotupdated]
  
  @js.native
  sealed trait chargeDotexpired
    extends StObject
       with EventType
  @scala.inline
  def chargeDotexpired: chargeDotexpired = "charge.expired".asInstanceOf[chargeDotexpired]
  
  @js.native
  sealed trait chargeDotfailed
    extends StObject
       with EventType
  @scala.inline
  def chargeDotfailed: chargeDotfailed = "charge.failed".asInstanceOf[chargeDotfailed]
  
  @js.native
  sealed trait chargeDotpending
    extends StObject
       with EventType
  @scala.inline
  def chargeDotpending: chargeDotpending = "charge.pending".asInstanceOf[chargeDotpending]
  
  @js.native
  sealed trait chargeDotrefundDotupdated
    extends StObject
       with EventType
  @scala.inline
  def chargeDotrefundDotupdated: chargeDotrefundDotupdated = "charge.refund.updated".asInstanceOf[chargeDotrefundDotupdated]
  
  @js.native
  sealed trait chargeDotrefunded
    extends StObject
       with EventType
  @scala.inline
  def chargeDotrefunded: chargeDotrefunded = "charge.refunded".asInstanceOf[chargeDotrefunded]
  
  @js.native
  sealed trait chargeDotsucceeded
    extends StObject
       with EventType
  @scala.inline
  def chargeDotsucceeded: chargeDotsucceeded = "charge.succeeded".asInstanceOf[chargeDotsucceeded]
  
  @js.native
  sealed trait chargeDotupdated
    extends StObject
       with EventType
  @scala.inline
  def chargeDotupdated: chargeDotupdated = "charge.updated".asInstanceOf[chargeDotupdated]
  
  @js.native
  sealed trait charge_automatically
    extends StObject
       with SubscriptionBilling
  @scala.inline
  def charge_automatically: charge_automatically = "charge_automatically".asInstanceOf[charge_automatically]
  
  @js.native
  sealed trait charge_refunded extends StObject
  @scala.inline
  def charge_refunded: charge_refunded = "charge_refunded".asInstanceOf[charge_refunded]
  
  @js.native
  sealed trait chargeable extends StObject
  @scala.inline
  def chargeable: chargeable = "chargeable".asInstanceOf[chargeable]
  
  @js.native
  sealed trait checkoutDotsessionDotcompleted
    extends StObject
       with EventType
  @scala.inline
  def checkoutDotsessionDotcompleted: checkoutDotsessionDotcompleted = "checkout.session.completed".asInstanceOf[checkoutDotsessionDotcompleted]
  
  @js.native
  sealed trait chip
    extends StObject
       with AuthorizationMethod
  @scala.inline
  def chip: chip = "chip".asInstanceOf[chip]
  
  @js.native
  sealed trait closed
    extends StObject
       with AuthorizationStatus
  @scala.inline
  def closed: closed = "closed".asInstanceOf[closed]
  
  @js.native
  sealed trait code_verification extends StObject
  @scala.inline
  def code_verification: code_verification = "code_verification".asInstanceOf[code_verification]
  
  @js.native
  sealed trait company extends StObject
  @scala.inline
  def company: company = "company".asInstanceOf[company]
  
  @js.native
  sealed trait consumed extends StObject
  @scala.inline
  def consumed: consumed = "consumed".asInstanceOf[consumed]
  
  @js.native
  sealed trait contactless
    extends StObject
       with AuthorizationMethod
  @scala.inline
  def contactless: contactless = "contactless".asInstanceOf[contactless]
  
  @js.native
  sealed trait country_spec extends StObject
  @scala.inline
  def country_spec: country_spec = "country_spec".asInstanceOf[country_spec]
  
  @js.native
  sealed trait coupon extends StObject
  @scala.inline
  def coupon: coupon = "coupon".asInstanceOf[coupon]
  
  @js.native
  sealed trait couponDotcreated
    extends StObject
       with EventType
  @scala.inline
  def couponDotcreated: couponDotcreated = "coupon.created".asInstanceOf[couponDotcreated]
  
  @js.native
  sealed trait couponDotdeleted
    extends StObject
       with EventType
  @scala.inline
  def couponDotdeleted: couponDotdeleted = "coupon.deleted".asInstanceOf[couponDotdeleted]
  
  @js.native
  sealed trait couponDotupdated
    extends StObject
       with EventType
  @scala.inline
  def couponDotupdated: couponDotupdated = "coupon.updated".asInstanceOf[couponDotupdated]
  
  @js.native
  sealed trait create_prorations extends StObject
  @scala.inline
  def create_prorations: create_prorations = "create_prorations".asInstanceOf[create_prorations]
  
  @js.native
  sealed trait created
    extends StObject
       with OrderStatus
  @scala.inline
  def created: created = "created".asInstanceOf[created]
  
  @js.native
  sealed trait credit extends StObject
  @scala.inline
  def credit: credit = "credit".asInstanceOf[credit]
  
  @js.native
  sealed trait credit_not_processed extends StObject
  @scala.inline
  def credit_not_processed: credit_not_processed = "credit_not_processed".asInstanceOf[credit_not_processed]
  
  @js.native
  sealed trait credit_note
    extends StObject
       with CustomerBalanceTransactionType
  @scala.inline
  def credit_note: credit_note = "credit_note".asInstanceOf[credit_note]
  
  @js.native
  sealed trait credit_noteDotcreated
    extends StObject
       with EventType
  @scala.inline
  def credit_noteDotcreated: credit_noteDotcreated = "credit_note.created".asInstanceOf[credit_noteDotcreated]
  
  @js.native
  sealed trait credit_noteDotupdated
    extends StObject
       with EventType
  @scala.inline
  def credit_noteDotupdated: credit_noteDotupdated = "credit_note.updated".asInstanceOf[credit_noteDotupdated]
  
  @js.native
  sealed trait credit_noteDotvoided
    extends StObject
       with EventType
  @scala.inline
  def credit_noteDotvoided: credit_noteDotvoided = "credit_note.voided".asInstanceOf[credit_noteDotvoided]
  
  @js.native
  sealed trait custom extends StObject
  @scala.inline
  def custom: custom = "custom".asInstanceOf[custom]
  
  @js.native
  sealed trait customer extends StObject
  @scala.inline
  def customer: customer = "customer".asInstanceOf[customer]
  
  @js.native
  sealed trait customerDotcreated
    extends StObject
       with EventType
  @scala.inline
  def customerDotcreated: customerDotcreated = "customer.created".asInstanceOf[customerDotcreated]
  
  @js.native
  sealed trait customerDotdeleted
    extends StObject
       with EventType
  @scala.inline
  def customerDotdeleted: customerDotdeleted = "customer.deleted".asInstanceOf[customerDotdeleted]
  
  @js.native
  sealed trait customerDotdiscountDotcreated
    extends StObject
       with EventType
  @scala.inline
  def customerDotdiscountDotcreated: customerDotdiscountDotcreated = "customer.discount.created".asInstanceOf[customerDotdiscountDotcreated]
  
  @js.native
  sealed trait customerDotdiscountDotdeleted
    extends StObject
       with EventType
  @scala.inline
  def customerDotdiscountDotdeleted: customerDotdiscountDotdeleted = "customer.discount.deleted".asInstanceOf[customerDotdiscountDotdeleted]
  
  @js.native
  sealed trait customerDotdiscountDotupdated
    extends StObject
       with EventType
  @scala.inline
  def customerDotdiscountDotupdated: customerDotdiscountDotupdated = "customer.discount.updated".asInstanceOf[customerDotdiscountDotupdated]
  
  @js.native
  sealed trait customerDotsourceDotcreated
    extends StObject
       with EventType
  @scala.inline
  def customerDotsourceDotcreated: customerDotsourceDotcreated = "customer.source.created".asInstanceOf[customerDotsourceDotcreated]
  
  @js.native
  sealed trait customerDotsourceDotdeleted
    extends StObject
       with EventType
  @scala.inline
  def customerDotsourceDotdeleted: customerDotsourceDotdeleted = "customer.source.deleted".asInstanceOf[customerDotsourceDotdeleted]
  
  @js.native
  sealed trait customerDotsourceDotexpiring
    extends StObject
       with EventType
  @scala.inline
  def customerDotsourceDotexpiring: customerDotsourceDotexpiring = "customer.source.expiring".asInstanceOf[customerDotsourceDotexpiring]
  
  @js.native
  sealed trait customerDotsourceDotupdated
    extends StObject
       with EventType
  @scala.inline
  def customerDotsourceDotupdated: customerDotsourceDotupdated = "customer.source.updated".asInstanceOf[customerDotsourceDotupdated]
  
  @js.native
  sealed trait customerDotsubscriptionDotcreated
    extends StObject
       with EventType
  @scala.inline
  def customerDotsubscriptionDotcreated: customerDotsubscriptionDotcreated = "customer.subscription.created".asInstanceOf[customerDotsubscriptionDotcreated]
  
  @js.native
  sealed trait customerDotsubscriptionDotdeleted
    extends StObject
       with EventType
  @scala.inline
  def customerDotsubscriptionDotdeleted: customerDotsubscriptionDotdeleted = "customer.subscription.deleted".asInstanceOf[customerDotsubscriptionDotdeleted]
  
  @js.native
  sealed trait customerDotsubscriptionDottrial_will_end
    extends StObject
       with EventType
  @scala.inline
  def customerDotsubscriptionDottrial_will_end: customerDotsubscriptionDottrial_will_end = "customer.subscription.trial_will_end".asInstanceOf[customerDotsubscriptionDottrial_will_end]
  
  @js.native
  sealed trait customerDotsubscriptionDotupdated
    extends StObject
       with EventType
  @scala.inline
  def customerDotsubscriptionDotupdated: customerDotsubscriptionDotupdated = "customer.subscription.updated".asInstanceOf[customerDotsubscriptionDotupdated]
  
  @js.native
  sealed trait customerDottax_idDotcreated
    extends StObject
       with EventType
  @scala.inline
  def customerDottax_idDotcreated: customerDottax_idDotcreated = "customer.tax_id.created".asInstanceOf[customerDottax_idDotcreated]
  
  @js.native
  sealed trait customerDottax_idDotdeleted
    extends StObject
       with EventType
  @scala.inline
  def customerDottax_idDotdeleted: customerDottax_idDotdeleted = "customer.tax_id.deleted".asInstanceOf[customerDottax_idDotdeleted]
  
  @js.native
  sealed trait customerDottax_idDotupdated
    extends StObject
       with EventType
  @scala.inline
  def customerDottax_idDotupdated: customerDottax_idDotupdated = "customer.tax_id.updated".asInstanceOf[customerDottax_idDotupdated]
  
  @js.native
  sealed trait customerDotupdated
    extends StObject
       with EventType
  @scala.inline
  def customerDotupdated: customerDotupdated = "customer.updated".asInstanceOf[customerDotupdated]
  
  @js.native
  sealed trait customer_balance_transaction extends StObject
  @scala.inline
  def customer_balance_transaction: customer_balance_transaction = "customer_balance_transaction".asInstanceOf[customer_balance_transaction]
  
  @js.native
  sealed trait da extends StObject
  @scala.inline
  def da: da = "da".asInstanceOf[da]
  
  @js.native
  sealed trait daily
    extends StObject
       with SpendingLimitInterval
  @scala.inline
  def daily: daily = "daily".asInstanceOf[daily]
  
  @js.native
  sealed trait damage
    extends StObject
       with IssuingCardReplacementReason
  @scala.inline
  def damage: damage = "damage".asInstanceOf[damage]
  
  @js.native
  sealed trait day
    extends StObject
       with IntervalUnit
  @scala.inline
  def day: day = "day".asInstanceOf[day]
  
  @js.native
  sealed trait de extends StObject
  @scala.inline
  def de: de = "de".asInstanceOf[de]
  
  @js.native
  sealed trait debit extends StObject
  @scala.inline
  def debit: debit = "debit".asInstanceOf[debit]
  
  @js.native
  sealed trait debit_not_authorized extends StObject
  @scala.inline
  def debit_not_authorized: debit_not_authorized = "debit_not_authorized".asInstanceOf[debit_not_authorized]
  
  @js.native
  sealed trait declined extends StObject
  @scala.inline
  def declined: declined = "declined".asInstanceOf[declined]
  
  @js.native
  sealed trait declined_by_network extends StObject
  @scala.inline
  def declined_by_network: declined_by_network = "declined_by_network".asInstanceOf[declined_by_network]
  
  @js.native
  sealed trait delivered extends StObject
  @scala.inline
  def delivered: delivered = "delivered".asInstanceOf[delivered]
  
  @js.native
  sealed trait diners
    extends StObject
       with CardBrand
  @scala.inline
  def diners: diners = "diners".asInstanceOf[diners]
  
  @js.native
  sealed trait disabled extends StObject
  @scala.inline
  def disabled: disabled = "disabled".asInstanceOf[disabled]
  
  @js.native
  sealed trait discount extends StObject
  @scala.inline
  def discount: discount = "discount".asInstanceOf[discount]
  
  @js.native
  sealed trait discover_
    extends StObject
       with CardBrand
  @scala.inline
  def discover_ : discover_ = "discover".asInstanceOf[discover_]
  
  @js.native
  sealed trait dispute
    extends StObject
       with TransactionType
  @scala.inline
  def dispute: dispute = "dispute".asInstanceOf[dispute]
  
  @js.native
  sealed trait dispute_evidence
    extends StObject
       with IPurpose
  @scala.inline
  def dispute_evidence: dispute_evidence = "dispute_evidence".asInstanceOf[dispute_evidence]
  
  @js.native
  sealed trait dispute_loss
    extends StObject
       with TransactionType
  @scala.inline
  def dispute_loss: dispute_loss = "dispute_loss".asInstanceOf[dispute_loss]
  
  @js.native
  sealed trait disputed extends StObject
  @scala.inline
  def disputed: disputed = "disputed".asInstanceOf[disputed]
  
  @js.native
  sealed trait document_address_mismatch extends StObject
  @scala.inline
  def document_address_mismatch: document_address_mismatch = "document_address_mismatch".asInstanceOf[document_address_mismatch]
  
  @js.native
  sealed trait document_dob_mismatch extends StObject
  @scala.inline
  def document_dob_mismatch: document_dob_mismatch = "document_dob_mismatch".asInstanceOf[document_dob_mismatch]
  
  @js.native
  sealed trait document_duplicate_type extends StObject
  @scala.inline
  def document_duplicate_type: document_duplicate_type = "document_duplicate_type".asInstanceOf[document_duplicate_type]
  
  @js.native
  sealed trait document_id_number_mismatch extends StObject
  @scala.inline
  def document_id_number_mismatch: document_id_number_mismatch = "document_id_number_mismatch".asInstanceOf[document_id_number_mismatch]
  
  @js.native
  sealed trait document_name_mismatch extends StObject
  @scala.inline
  def document_name_mismatch: document_name_mismatch = "document_name_mismatch".asInstanceOf[document_name_mismatch]
  
  @js.native
  sealed trait donate extends StObject
  @scala.inline
  def donate: donate = "donate".asInstanceOf[donate]
  
  @js.native
  sealed trait down extends StObject
  @scala.inline
  def down: down = "down".asInstanceOf[down]
  
  @js.native
  sealed trait draft extends StObject
  @scala.inline
  def draft: draft = "draft".asInstanceOf[draft]
  
  @js.native
  sealed trait duplicate
    extends StObject
       with CreditNoteReason
       with PaymentIntentUserProvidedCancellationReason
       with SetupIntentCancelationReason
  @scala.inline
  def duplicate: duplicate = "duplicate".asInstanceOf[duplicate]
  
  @js.native
  sealed trait email extends StObject
  @scala.inline
  def email: email = "email".asInstanceOf[email]
  
  @js.native
  sealed trait en extends StObject
  @scala.inline
  def en: en = "en".asInstanceOf[en]
  
  @js.native
  sealed trait enabled extends StObject
  @scala.inline
  def enabled: enabled = "enabled".asInstanceOf[enabled]
  
  @js.native
  sealed trait ephemeral_key extends StObject
  @scala.inline
  def ephemeral_key: ephemeral_key = "ephemeral_key".asInstanceOf[ephemeral_key]
  
  @js.native
  sealed trait eps
    extends StObject
       with IPaymentMethodType
  @scala.inline
  def eps: eps = "eps".asInstanceOf[eps]
  
  @js.native
  sealed trait errored extends StObject
  @scala.inline
  def errored: errored = "errored".asInstanceOf[errored]
  
  @js.native
  sealed trait es extends StObject
  @scala.inline
  def es: es = "es".asInstanceOf[es]
  
  @js.native
  sealed trait eu_vat
    extends StObject
       with TaxIdType
  @scala.inline
  def eu_vat: eu_vat = "eu_vat".asInstanceOf[eu_vat]
  
  @js.native
  sealed trait event extends StObject
  @scala.inline
  def event: event = "event".asInstanceOf[event]
  
  @js.native
  sealed trait exact extends StObject
  @scala.inline
  def exact: exact = "exact".asInstanceOf[exact]
  
  @js.native
  sealed trait exempt extends StObject
  @scala.inline
  def exempt: exempt = "exempt".asInstanceOf[exempt]
  
  @js.native
  sealed trait expiration
    extends StObject
       with IssuingCardReplacementReason
  @scala.inline
  def expiration: expiration = "expiration".asInstanceOf[expiration]
  
  @js.native
  sealed trait expired_or_canceled_card extends StObject
  @scala.inline
  def expired_or_canceled_card: expired_or_canceled_card = "expired_or_canceled_card".asInstanceOf[expired_or_canceled_card]
  
  @js.native
  sealed trait express extends StObject
  @scala.inline
  def express: express = "express".asInstanceOf[express]
  
  @js.native
  sealed trait fail extends StObject
  @scala.inline
  def fail: fail = "fail".asInstanceOf[fail]
  
  @js.native
  sealed trait failed
    extends StObject
       with Statuses
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait failed_invoice
    extends StObject
       with PaymentIntentStripeProvidedCancellationReason
  @scala.inline
  def failed_invoice: failed_invoice = "failed_invoice".asInstanceOf[failed_invoice]
  
  @js.native
  sealed trait failed_keyed_identity extends StObject
  @scala.inline
  def failed_keyed_identity: failed_keyed_identity = "failed_keyed_identity".asInstanceOf[failed_keyed_identity]
  
  @js.native
  sealed trait failed_other extends StObject
  @scala.inline
  def failed_other: failed_other = "failed_other".asInstanceOf[failed_other]
  
  @js.native
  sealed trait failure extends StObject
  @scala.inline
  def failure: failure = "failure".asInstanceOf[failure]
  
  @js.native
  sealed trait female extends StObject
  @scala.inline
  def female: female = "female".asInstanceOf[female]
  
  @js.native
  sealed trait fi extends StObject
  @scala.inline
  def fi: fi = "fi".asInstanceOf[fi]
  
  @js.native
  sealed trait file extends StObject
  @scala.inline
  def file: file = "file".asInstanceOf[file]
  
  @js.native
  sealed trait fileDotcreated
    extends StObject
       with EventType
  @scala.inline
  def fileDotcreated: fileDotcreated = "file.created".asInstanceOf[fileDotcreated]
  
  @js.native
  sealed trait file_link extends StObject
  @scala.inline
  def file_link: file_link = "file_link".asInstanceOf[file_link]
  
  @js.native
  sealed trait finite extends StObject
  @scala.inline
  def finite: finite = "finite".asInstanceOf[finite]
  
  @js.native
  sealed trait forever extends StObject
  @scala.inline
  def forever: forever = "forever".asInstanceOf[forever]
  
  @js.native
  sealed trait fr extends StObject
  @scala.inline
  def fr: fr = "fr".asInstanceOf[fr]
  
  @js.native
  sealed trait fraud extends StObject
  @scala.inline
  def fraud: fraud = "fraud".asInstanceOf[fraud]
  
  @js.native
  sealed trait fraudlent
    extends StObject
       with IssuingDisputeReason
  @scala.inline
  def fraudlent: fraudlent = "fraudlent".asInstanceOf[fraudlent]
  
  @js.native
  sealed trait fraudulent
    extends StObject
       with CreditNoteReason
       with PaymentIntentUserProvidedCancellationReason
  @scala.inline
  def fraudulent: fraudulent = "fraudulent".asInstanceOf[fraudulent]
  
  @js.native
  sealed trait friday extends StObject
  @scala.inline
  def friday: friday = "friday".asInstanceOf[friday]
  
  @js.native
  sealed trait fulfilled
    extends StObject
       with OrderStatus
  @scala.inline
  def fulfilled: fulfilled = "fulfilled".asInstanceOf[fulfilled]
  
  @js.native
  sealed trait general extends StObject
  @scala.inline
  def general: general = "general".asInstanceOf[general]
  
  @js.native
  sealed trait giropay
    extends StObject
       with IPaymentMethodType
  @scala.inline
  def giropay: giropay = "giropay".asInstanceOf[giropay]
  
  @js.native
  sealed trait good
    extends StObject
       with ProductType
  @scala.inline
  def good: good = "good".asInstanceOf[good]
  
  @js.native
  sealed trait google_pay
    extends StObject
       with CardWalletType
       with WalletProvider
  @scala.inline
  def google_pay: google_pay = "google_pay".asInstanceOf[google_pay]
  
  @js.native
  sealed trait graduated extends StObject
  @scala.inline
  def graduated: graduated = "graduated".asInstanceOf[graduated]
  
  @js.native
  sealed trait ideal
    extends StObject
       with IPaymentMethodType
       with PaymentIntentPaymentMethodType
  @scala.inline
  def ideal: ideal = "ideal".asInstanceOf[ideal]
  
  @js.native
  sealed trait idempotency_error
    extends StObject
       with RawType
  @scala.inline
  def idempotency_error: idempotency_error = "idempotency_error".asInstanceOf[idempotency_error]
  
  @js.native
  sealed trait identity_document
    extends StObject
       with IPurpose
  @scala.inline
  def identity_document: identity_document = "identity_document".asInstanceOf[identity_document]
  
  @js.native
  sealed trait in_gst
    extends StObject
       with TaxIdType
  @scala.inline
  def in_gst: in_gst = "in_gst".asInstanceOf[in_gst]
  
  @js.native
  sealed trait in_stock extends StObject
  @scala.inline
  def in_stock: in_stock = "in_stock".asInstanceOf[in_stock]
  
  @js.native
  sealed trait in_transit
    extends StObject
       with Statuses
  @scala.inline
  def in_transit: in_transit = "in_transit".asInstanceOf[in_transit]
  
  @js.native
  sealed trait inactive
    extends StObject
       with CardholderStatus
       with IssuingCardStatus
  @scala.inline
  def inactive: inactive = "inactive".asInstanceOf[inactive]
  
  @js.native
  sealed trait incomplete
    extends StObject
       with SubscriptionStatus
  @scala.inline
  def incomplete: incomplete = "incomplete".asInstanceOf[incomplete]
  
  @js.native
  sealed trait incomplete_expired
    extends StObject
       with SubscriptionStatus
  @scala.inline
  def incomplete_expired: incomplete_expired = "incomplete_expired".asInstanceOf[incomplete_expired]
  
  @js.native
  sealed trait incorporation_article
    extends StObject
       with IPurpose
  @scala.inline
  def incorporation_article: incorporation_article = "incorporation_article".asInstanceOf[incorporation_article]
  
  @js.native
  sealed trait incorporation_document
    extends StObject
       with IPurpose
  @scala.inline
  def incorporation_document: incorporation_document = "incorporation_document".asInstanceOf[incorporation_document]
  
  @js.native
  sealed trait incorrect_account_details extends StObject
  @scala.inline
  def incorrect_account_details: incorrect_account_details = "incorrect_account_details".asInstanceOf[incorrect_account_details]
  
  @js.native
  sealed trait increment
    extends StObject
       with IUsageRecordAction
  @scala.inline
  def increment: increment = "increment".asInstanceOf[increment]
  
  @js.native
  sealed trait individual
    extends StObject
       with CardholderType
  @scala.inline
  def individual: individual = "individual".asInstanceOf[individual]
  
  @js.native
  sealed trait inf extends StObject
  @scala.inline
  def inf: inf = "inf".asInstanceOf[inf]
  
  @js.native
  sealed trait infinite extends StObject
  @scala.inline
  def infinite: infinite = "infinite".asInstanceOf[infinite]
  
  @js.native
  sealed trait initial
    extends StObject
       with CustomerBalanceTransactionType
  @scala.inline
  def initial: initial = "initial".asInstanceOf[initial]
  
  @js.native
  sealed trait instant
    extends StObject
       with PayoutMethods
  @scala.inline
  def instant: instant = "instant".asInstanceOf[instant]
  
  @js.native
  sealed trait insufficient_funds extends StObject
  @scala.inline
  def insufficient_funds: insufficient_funds = "insufficient_funds".asInstanceOf[insufficient_funds]
  
  @js.native
  sealed trait invalid extends StObject
  @scala.inline
  def invalid: invalid = "invalid".asInstanceOf[invalid]
  
  @js.native
  sealed trait invalid_request_error
    extends StObject
       with RawType
  @scala.inline
  def invalid_request_error: invalid_request_error = "invalid_request_error".asInstanceOf[invalid_request_error]
  
  @js.native
  sealed trait invoice extends StObject
  @scala.inline
  def invoice: invoice = "invoice".asInstanceOf[invoice]
  
  @js.native
  sealed trait invoiceDotcreated
    extends StObject
       with EventType
  @scala.inline
  def invoiceDotcreated: invoiceDotcreated = "invoice.created".asInstanceOf[invoiceDotcreated]
  
  @js.native
  sealed trait invoiceDotdeleted
    extends StObject
       with EventType
  @scala.inline
  def invoiceDotdeleted: invoiceDotdeleted = "invoice.deleted".asInstanceOf[invoiceDotdeleted]
  
  @js.native
  sealed trait invoiceDotfinalized
    extends StObject
       with EventType
  @scala.inline
  def invoiceDotfinalized: invoiceDotfinalized = "invoice.finalized".asInstanceOf[invoiceDotfinalized]
  
  @js.native
  sealed trait invoiceDotmarked_uncollectible
    extends StObject
       with EventType
  @scala.inline
  def invoiceDotmarked_uncollectible: invoiceDotmarked_uncollectible = "invoice.marked_uncollectible".asInstanceOf[invoiceDotmarked_uncollectible]
  
  @js.native
  sealed trait invoiceDotpayment_action_required
    extends StObject
       with EventType
  @scala.inline
  def invoiceDotpayment_action_required: invoiceDotpayment_action_required = "invoice.payment_action_required".asInstanceOf[invoiceDotpayment_action_required]
  
  @js.native
  sealed trait invoiceDotpayment_failed
    extends StObject
       with EventType
  @scala.inline
  def invoiceDotpayment_failed: invoiceDotpayment_failed = "invoice.payment_failed".asInstanceOf[invoiceDotpayment_failed]
  
  @js.native
  sealed trait invoiceDotpayment_succeeded
    extends StObject
       with EventType
  @scala.inline
  def invoiceDotpayment_succeeded: invoiceDotpayment_succeeded = "invoice.payment_succeeded".asInstanceOf[invoiceDotpayment_succeeded]
  
  @js.native
  sealed trait invoiceDotsent
    extends StObject
       with EventType
  @scala.inline
  def invoiceDotsent: invoiceDotsent = "invoice.sent".asInstanceOf[invoiceDotsent]
  
  @js.native
  sealed trait invoiceDotupcoming
    extends StObject
       with EventType
  @scala.inline
  def invoiceDotupcoming: invoiceDotupcoming = "invoice.upcoming".asInstanceOf[invoiceDotupcoming]
  
  @js.native
  sealed trait invoiceDotupdated
    extends StObject
       with EventType
  @scala.inline
  def invoiceDotupdated: invoiceDotupdated = "invoice.updated".asInstanceOf[invoiceDotupdated]
  
  @js.native
  sealed trait invoiceDotvoided
    extends StObject
       with EventType
  @scala.inline
  def invoiceDotvoided: invoiceDotvoided = "invoice.voided".asInstanceOf[invoiceDotvoided]
  
  @js.native
  sealed trait invoice_too_large
    extends StObject
       with CustomerBalanceTransactionType
  @scala.inline
  def invoice_too_large: invoice_too_large = "invoice_too_large".asInstanceOf[invoice_too_large]
  
  @js.native
  sealed trait invoice_too_small
    extends StObject
       with CustomerBalanceTransactionType
  @scala.inline
  def invoice_too_small: invoice_too_small = "invoice_too_small".asInstanceOf[invoice_too_small]
  
  @js.native
  sealed trait invoiceitem extends StObject
  @scala.inline
  def invoiceitem: invoiceitem = "invoiceitem".asInstanceOf[invoiceitem]
  
  @js.native
  sealed trait invoiceitemDotcreated
    extends StObject
       with EventType
  @scala.inline
  def invoiceitemDotcreated: invoiceitemDotcreated = "invoiceitem.created".asInstanceOf[invoiceitemDotcreated]
  
  @js.native
  sealed trait invoiceitemDotdeleted
    extends StObject
       with EventType
  @scala.inline
  def invoiceitemDotdeleted: invoiceitemDotdeleted = "invoiceitem.deleted".asInstanceOf[invoiceitemDotdeleted]
  
  @js.native
  sealed trait invoiceitemDotupdated
    extends StObject
       with EventType
  @scala.inline
  def invoiceitemDotupdated: invoiceitemDotupdated = "invoiceitem.updated".asInstanceOf[invoiceitemDotupdated]
  
  @js.native
  sealed trait issued extends StObject
  @scala.inline
  def issued: issued = "issued".asInstanceOf[issued]
  
  @js.native
  sealed trait issuer_declined extends StObject
  @scala.inline
  def issuer_declined: issuer_declined = "issuer_declined".asInstanceOf[issuer_declined]
  
  @js.native
  sealed trait issuingDotauthorization extends StObject
  @scala.inline
  def issuingDotauthorization: issuingDotauthorization = "issuing.authorization".asInstanceOf[issuingDotauthorization]
  
  @js.native
  sealed trait issuingDotcard extends StObject
  @scala.inline
  def issuingDotcard: issuingDotcard = "issuing.card".asInstanceOf[issuingDotcard]
  
  @js.native
  sealed trait issuingDotcard_details extends StObject
  @scala.inline
  def issuingDotcard_details: issuingDotcard_details = "issuing.card_details".asInstanceOf[issuingDotcard_details]
  
  @js.native
  sealed trait issuingDotcardholder extends StObject
  @scala.inline
  def issuingDotcardholder: issuingDotcardholder = "issuing.cardholder".asInstanceOf[issuingDotcardholder]
  
  @js.native
  sealed trait issuingDotdispute extends StObject
  @scala.inline
  def issuingDotdispute: issuingDotdispute = "issuing.dispute".asInstanceOf[issuingDotdispute]
  
  @js.native
  sealed trait issuingDottransaction extends StObject
  @scala.inline
  def issuingDottransaction: issuingDottransaction = "issuing.transaction".asInstanceOf[issuingDottransaction]
  
  @js.native
  sealed trait issuing_authorizationDotcreated
    extends StObject
       with EventType
  @scala.inline
  def issuing_authorizationDotcreated: issuing_authorizationDotcreated = "issuing_authorization.created".asInstanceOf[issuing_authorizationDotcreated]
  
  @js.native
  sealed trait issuing_authorizationDotrequest
    extends StObject
       with EventType
  @scala.inline
  def issuing_authorizationDotrequest: issuing_authorizationDotrequest = "issuing_authorization.request".asInstanceOf[issuing_authorizationDotrequest]
  
  @js.native
  sealed trait issuing_authorizationDotupdated
    extends StObject
       with EventType
  @scala.inline
  def issuing_authorizationDotupdated: issuing_authorizationDotupdated = "issuing_authorization.updated".asInstanceOf[issuing_authorizationDotupdated]
  
  @js.native
  sealed trait issuing_cardDotcreated
    extends StObject
       with EventType
  @scala.inline
  def issuing_cardDotcreated: issuing_cardDotcreated = "issuing_card.created".asInstanceOf[issuing_cardDotcreated]
  
  @js.native
  sealed trait issuing_cardDotupdated
    extends StObject
       with EventType
  @scala.inline
  def issuing_cardDotupdated: issuing_cardDotupdated = "issuing_card.updated".asInstanceOf[issuing_cardDotupdated]
  
  @js.native
  sealed trait issuing_cardholderDotcreated
    extends StObject
       with EventType
  @scala.inline
  def issuing_cardholderDotcreated: issuing_cardholderDotcreated = "issuing_cardholder.created".asInstanceOf[issuing_cardholderDotcreated]
  
  @js.native
  sealed trait issuing_cardholderDotupdated
    extends StObject
       with EventType
  @scala.inline
  def issuing_cardholderDotupdated: issuing_cardholderDotupdated = "issuing_cardholder.updated".asInstanceOf[issuing_cardholderDotupdated]
  
  @js.native
  sealed trait issuing_disputeDotcreated
    extends StObject
       with EventType
  @scala.inline
  def issuing_disputeDotcreated: issuing_disputeDotcreated = "issuing_dispute.created".asInstanceOf[issuing_disputeDotcreated]
  
  @js.native
  sealed trait issuing_disputeDotupdated
    extends StObject
       with EventType
  @scala.inline
  def issuing_disputeDotupdated: issuing_disputeDotupdated = "issuing_dispute.updated".asInstanceOf[issuing_disputeDotupdated]
  
  @js.native
  sealed trait issuing_settlementDotcreated
    extends StObject
       with EventType
  @scala.inline
  def issuing_settlementDotcreated: issuing_settlementDotcreated = "issuing_settlement.created".asInstanceOf[issuing_settlementDotcreated]
  
  @js.native
  sealed trait issuing_settlementDotupdated
    extends StObject
       with EventType
  @scala.inline
  def issuing_settlementDotupdated: issuing_settlementDotupdated = "issuing_settlement.updated".asInstanceOf[issuing_settlementDotupdated]
  
  @js.native
  sealed trait issuing_transactionDotcreated
    extends StObject
       with EventType
  @scala.inline
  def issuing_transactionDotcreated: issuing_transactionDotcreated = "issuing_transaction.created".asInstanceOf[issuing_transactionDotcreated]
  
  @js.native
  sealed trait issuing_transactionDotupdated
    extends StObject
       with EventType
  @scala.inline
  def issuing_transactionDotupdated: issuing_transactionDotupdated = "issuing_transaction.updated".asInstanceOf[issuing_transactionDotupdated]
  
  @js.native
  sealed trait it extends StObject
  @scala.inline
  def it: it = "it".asInstanceOf[it]
  
  @js.native
  sealed trait ja extends StObject
  @scala.inline
  def ja: ja = "ja".asInstanceOf[ja]
  
  @js.native
  sealed trait jcb_
    extends StObject
       with CardBrand
  @scala.inline
  def jcb_ : jcb_ = "jcb".asInstanceOf[jcb_]
  
  @js.native
  sealed trait jpg extends StObject
  @scala.inline
  def jpg: jpg = "jpg".asInstanceOf[jpg]
  
  @js.native
  sealed trait keyed_in
    extends StObject
       with AuthorizationMethod
  @scala.inline
  def keyed_in: keyed_in = "keyed_in".asInstanceOf[keyed_in]
  
  @js.native
  sealed trait klarna
    extends StObject
       with IPaymentMethodType
  @scala.inline
  def klarna: klarna = "klarna".asInstanceOf[klarna]
  
  @js.native
  sealed trait last_during_period extends StObject
  @scala.inline
  def last_during_period: last_during_period = "last_during_period".asInstanceOf[last_during_period]
  
  @js.native
  sealed trait last_ever extends StObject
  @scala.inline
  def last_ever: last_ever = "last_ever".asInstanceOf[last_ever]
  
  @js.native
  sealed trait licensed extends StObject
  @scala.inline
  def licensed: licensed = "licensed".asInstanceOf[licensed]
  
  @js.native
  sealed trait limited extends StObject
  @scala.inline
  def limited: limited = "limited".asInstanceOf[limited]
  
  @js.native
  sealed trait line_item extends StObject
  @scala.inline
  def line_item: line_item = "line_item".asInstanceOf[line_item]
  
  @js.native
  sealed trait list extends StObject
  @scala.inline
  def list: list = "list".asInstanceOf[list]
  
  @js.native
  sealed trait listed extends StObject
  @scala.inline
  def listed: listed = "listed".asInstanceOf[listed]
  
  @js.native
  sealed trait login_link extends StObject
  @scala.inline
  def login_link: login_link = "login_link".asInstanceOf[login_link]
  
  @js.native
  sealed trait loss
    extends StObject
       with IssuingCardReplacementReason
  @scala.inline
  def loss: loss = "loss".asInstanceOf[loss]
  
  @js.native
  sealed trait lost
    extends StObject
       with IssuingCardStatus
       with IssuingDisputeStatus
  @scala.inline
  def lost: lost = "lost".asInstanceOf[lost]
  
  @js.native
  sealed trait lost_or_stolen_card extends StObject
  @scala.inline
  def lost_or_stolen_card: lost_or_stolen_card = "lost_or_stolen_card".asInstanceOf[lost_or_stolen_card]
  
  @js.native
  sealed trait male extends StObject
  @scala.inline
  def male: male = "male".asInstanceOf[male]
  
  @js.native
  sealed trait mandateDotupdated
    extends StObject
       with EventType
  @scala.inline
  def mandateDotupdated: mandateDotupdated = "mandate.updated".asInstanceOf[mandateDotupdated]
  
  @js.native
  sealed trait manual
    extends StObject
       with PaymentIntentDataCaptureMethodOptions
  @scala.inline
  def manual: manual = "manual".asInstanceOf[manual]
  
  @js.native
  sealed trait manual_review extends StObject
  @scala.inline
  def manual_review: manual_review = "manual_review".asInstanceOf[manual_review]
  
  @js.native
  sealed trait mastercard_
    extends StObject
       with CardBrand
  @scala.inline
  def mastercard_ : mastercard_ = "mastercard".asInstanceOf[mastercard_]
  
  @js.native
  sealed trait masterpass
    extends StObject
       with CardWalletType
  @scala.inline
  def masterpass: masterpass = "masterpass".asInstanceOf[masterpass]
  
  @js.native
  sealed trait `match` extends StObject
  @scala.inline
  def `match`: `match` = "match".asInstanceOf[`match`]
  
  @js.native
  sealed trait max extends StObject
  @scala.inline
  def max: max = "max".asInstanceOf[max]
  
  @js.native
  sealed trait max_amount extends StObject
  @scala.inline
  def max_amount: max_amount = "max_amount".asInstanceOf[max_amount]
  
  @js.native
  sealed trait max_approvals extends StObject
  @scala.inline
  def max_approvals: max_approvals = "max_approvals".asInstanceOf[max_approvals]
  
  @js.native
  sealed trait metered extends StObject
  @scala.inline
  def metered: metered = "metered".asInstanceOf[metered]
  
  @js.native
  sealed trait mismatch extends StObject
  @scala.inline
  def mismatch: mismatch = "mismatch".asInstanceOf[mismatch]
  
  @js.native
  sealed trait missing extends StObject
  @scala.inline
  def missing: missing = "missing".asInstanceOf[missing]
  
  @js.native
  sealed trait monday extends StObject
  @scala.inline
  def monday: monday = "monday".asInstanceOf[monday]
  
  @js.native
  sealed trait month
    extends StObject
       with IntervalUnit
  @scala.inline
  def month: month = "month".asInstanceOf[month]
  
  @js.native
  sealed trait monthly
    extends StObject
       with SpendingLimitInterval
  @scala.inline
  def monthly: monthly = "monthly".asInstanceOf[monthly]
  
  @js.native
  sealed trait multibanco extends StObject
  @scala.inline
  def multibanco: multibanco = "multibanco".asInstanceOf[multibanco]
  
  @js.native
  sealed trait nb extends StObject
  @scala.inline
  def nb: nb = "nb".asInstanceOf[nb]
  
  @js.native
  sealed trait needs_response extends StObject
  @scala.inline
  def needs_response: needs_response = "needs_response".asInstanceOf[needs_response]
  
  @js.native
  sealed trait network_cost extends StObject
  @scala.inline
  def network_cost: network_cost = "network_cost".asInstanceOf[network_cost]
  
  @js.native
  sealed trait `new` extends StObject
  @scala.inline
  def `new`: `new` = "new".asInstanceOf[`new`]
  
  @js.native
  sealed trait nl extends StObject
  @scala.inline
  def nl: nl = "nl".asInstanceOf[nl]
  
  @js.native
  sealed trait no_vat
    extends StObject
       with TaxIdType
  @scala.inline
  def no_vat: no_vat = "no_vat".asInstanceOf[no_vat]
  
  @js.native
  sealed trait none extends StObject
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait not_provided extends StObject
  @scala.inline
  def not_provided: not_provided = "not_provided".asInstanceOf[not_provided]
  
  @js.native
  sealed trait not_required extends StObject
  @scala.inline
  def not_required: not_required = "not_required".asInstanceOf[not_required]
  
  @js.native
  sealed trait not_sent_to_network extends StObject
  @scala.inline
  def not_sent_to_network: not_sent_to_network = "not_sent_to_network".asInstanceOf[not_sent_to_network]
  
  @js.native
  sealed trait now extends StObject
  @scala.inline
  def now: now = "now".asInstanceOf[now]
  
  @js.native
  sealed trait nz_gst
    extends StObject
       with TaxIdType
  @scala.inline
  def nz_gst: nz_gst = "nz_gst".asInstanceOf[nz_gst]
  
  @js.native
  sealed trait off_session
    extends StObject
       with PaymentIntendDataFutureUsageOptions
       with PaymentIntentFutureUsageType
       with SetupIntentUsageType
  @scala.inline
  def off_session: off_session = "off_session".asInstanceOf[off_session]
  
  @js.native
  sealed trait offline extends StObject
  @scala.inline
  def offline: offline = "offline".asInstanceOf[offline]
  
  @js.native
  sealed trait on_session
    extends StObject
       with PaymentIntendDataFutureUsageOptions
       with PaymentIntentFutureUsageType
       with SetupIntentUsageType
  @scala.inline
  def on_session: on_session = "on_session".asInstanceOf[on_session]
  
  @js.native
  sealed trait once extends StObject
  @scala.inline
  def once: once = "once".asInstanceOf[once]
  
  @js.native
  sealed trait one_time extends StObject
  @scala.inline
  def one_time: one_time = "one_time".asInstanceOf[one_time]
  
  @js.native
  sealed trait online
    extends StObject
       with AuthorizationMethod
  @scala.inline
  def online: online = "online".asInstanceOf[online]
  
  @js.native
  sealed trait open extends StObject
  @scala.inline
  def open: open = "open".asInstanceOf[open]
  
  @js.native
  sealed trait order extends StObject
  @scala.inline
  def order: order = "order".asInstanceOf[order]
  
  @js.native
  sealed trait orderDotcreated
    extends StObject
       with EventType
  @scala.inline
  def orderDotcreated: orderDotcreated = "order.created".asInstanceOf[orderDotcreated]
  
  @js.native
  sealed trait orderDotpayment_failed
    extends StObject
       with EventType
  @scala.inline
  def orderDotpayment_failed: orderDotpayment_failed = "order.payment_failed".asInstanceOf[orderDotpayment_failed]
  
  @js.native
  sealed trait orderDotpayment_succeeded
    extends StObject
       with EventType
  @scala.inline
  def orderDotpayment_succeeded: orderDotpayment_succeeded = "order.payment_succeeded".asInstanceOf[orderDotpayment_succeeded]
  
  @js.native
  sealed trait orderDotupdated
    extends StObject
       with EventType
  @scala.inline
  def orderDotupdated: orderDotupdated = "order.updated".asInstanceOf[orderDotupdated]
  
  @js.native
  sealed trait order_change
    extends StObject
       with CreditNoteReason
  @scala.inline
  def order_change: order_change = "order_change".asInstanceOf[order_change]
  
  @js.native
  sealed trait order_item extends StObject
  @scala.inline
  def order_item: order_item = "order_item".asInstanceOf[order_item]
  
  @js.native
  sealed trait order_returnDotcreated
    extends StObject
       with EventType
  @scala.inline
  def order_returnDotcreated: order_returnDotcreated = "order_return.created".asInstanceOf[order_returnDotcreated]
  
  @js.native
  sealed trait other
    extends StObject
       with IssuingDisputeReason
  @scala.inline
  def other: other = "other".asInstanceOf[other]
  
  @js.native
  sealed trait out_of_stock extends StObject
  @scala.inline
  def out_of_stock: out_of_stock = "out_of_stock".asInstanceOf[out_of_stock]
  
  @js.native
  sealed trait p24
    extends StObject
       with IPaymentMethodType
  @scala.inline
  def p24: p24 = "p24".asInstanceOf[p24]
  
  @js.native
  sealed trait paid
    extends StObject
       with OrderStatus
       with Statuses
  @scala.inline
  def paid: paid = "paid".asInstanceOf[paid]
  
  @js.native
  sealed trait pass extends StObject
  @scala.inline
  def pass: pass = "pass".asInstanceOf[pass]
  
  @js.native
  sealed trait past_due
    extends StObject
       with SubscriptionStatus
  @scala.inline
  def past_due: past_due = "past_due".asInstanceOf[past_due]
  
  @js.native
  sealed trait pay extends StObject
  @scala.inline
  def pay: pay = "pay".asInstanceOf[pay]
  
  @js.native
  sealed trait payment extends StObject
  @scala.inline
  def payment: payment = "payment".asInstanceOf[payment]
  
  @js.native
  sealed trait payment_intent extends StObject
  @scala.inline
  def payment_intent: payment_intent = "payment_intent".asInstanceOf[payment_intent]
  
  @js.native
  sealed trait payment_intentDotamount_capturable_updated
    extends StObject
       with EventType
  @scala.inline
  def payment_intentDotamount_capturable_updated: payment_intentDotamount_capturable_updated = "payment_intent.amount_capturable_updated".asInstanceOf[payment_intentDotamount_capturable_updated]
  
  @js.native
  sealed trait payment_intentDotcanceled
    extends StObject
       with EventType
  @scala.inline
  def payment_intentDotcanceled: payment_intentDotcanceled = "payment_intent.canceled".asInstanceOf[payment_intentDotcanceled]
  
  @js.native
  sealed trait payment_intentDotcreated
    extends StObject
       with EventType
  @scala.inline
  def payment_intentDotcreated: payment_intentDotcreated = "payment_intent.created".asInstanceOf[payment_intentDotcreated]
  
  @js.native
  sealed trait payment_intentDotpayment_failed
    extends StObject
       with EventType
  @scala.inline
  def payment_intentDotpayment_failed: payment_intentDotpayment_failed = "payment_intent.payment_failed".asInstanceOf[payment_intentDotpayment_failed]
  
  @js.native
  sealed trait payment_intentDotsucceeded
    extends StObject
       with EventType
  @scala.inline
  def payment_intentDotsucceeded: payment_intentDotsucceeded = "payment_intent.succeeded".asInstanceOf[payment_intentDotsucceeded]
  
  @js.native
  sealed trait payment_method extends StObject
  @scala.inline
  def payment_method: payment_method = "payment_method".asInstanceOf[payment_method]
  
  @js.native
  sealed trait payment_methodDotattached
    extends StObject
       with EventType
  @scala.inline
  def payment_methodDotattached: payment_methodDotattached = "payment_method.attached".asInstanceOf[payment_methodDotattached]
  
  @js.native
  sealed trait payment_methodDotcard_automatically_updated
    extends StObject
       with EventType
  @scala.inline
  def payment_methodDotcard_automatically_updated: payment_methodDotcard_automatically_updated = "payment_method.card_automatically_updated".asInstanceOf[payment_methodDotcard_automatically_updated]
  
  @js.native
  sealed trait payment_methodDotdetached
    extends StObject
       with EventType
  @scala.inline
  def payment_methodDotdetached: payment_methodDotdetached = "payment_method.detached".asInstanceOf[payment_methodDotdetached]
  
  @js.native
  sealed trait payment_methodDotupdated
    extends StObject
       with EventType
  @scala.inline
  def payment_methodDotupdated: payment_methodDotupdated = "payment_method.updated".asInstanceOf[payment_methodDotupdated]
  
  @js.native
  sealed trait payout extends StObject
  @scala.inline
  def payout: payout = "payout".asInstanceOf[payout]
  
  @js.native
  sealed trait payoutDotcanceled
    extends StObject
       with EventType
  @scala.inline
  def payoutDotcanceled: payoutDotcanceled = "payout.canceled".asInstanceOf[payoutDotcanceled]
  
  @js.native
  sealed trait payoutDotcreated
    extends StObject
       with EventType
  @scala.inline
  def payoutDotcreated: payoutDotcreated = "payout.created".asInstanceOf[payoutDotcreated]
  
  @js.native
  sealed trait payoutDotfailed
    extends StObject
       with EventType
  @scala.inline
  def payoutDotfailed: payoutDotfailed = "payout.failed".asInstanceOf[payoutDotfailed]
  
  @js.native
  sealed trait payoutDotpaid
    extends StObject
       with EventType
  @scala.inline
  def payoutDotpaid: payoutDotpaid = "payout.paid".asInstanceOf[payoutDotpaid]
  
  @js.native
  sealed trait payoutDotupdated
    extends StObject
       with EventType
  @scala.inline
  def payoutDotupdated: payoutDotupdated = "payout.updated".asInstanceOf[payoutDotupdated]
  
  @js.native
  sealed trait payout_failure extends StObject
  @scala.inline
  def payout_failure: payout_failure = "payout_failure".asInstanceOf[payout_failure]
  
  @js.native
  sealed trait pdf extends StObject
  @scala.inline
  def pdf: pdf = "pdf".asInstanceOf[pdf]
  
  @js.native
  sealed trait pending
    extends StObject
       with AuthorizationStatus
       with Statuses
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait per_authorization
    extends StObject
       with SpendingLimitInterval
  @scala.inline
  def per_authorization: per_authorization = "per_authorization".asInstanceOf[per_authorization]
  
  @js.native
  sealed trait per_unit extends StObject
  @scala.inline
  def per_unit: per_unit = "per_unit".asInstanceOf[per_unit]
  
  @js.native
  sealed trait person extends StObject
  @scala.inline
  def person: person = "person".asInstanceOf[person]
  
  @js.native
  sealed trait personDotcreated
    extends StObject
       with EventType
  @scala.inline
  def personDotcreated: personDotcreated = "person.created".asInstanceOf[personDotcreated]
  
  @js.native
  sealed trait personDotdeleted
    extends StObject
       with EventType
  @scala.inline
  def personDotdeleted: personDotdeleted = "person.deleted".asInstanceOf[personDotdeleted]
  
  @js.native
  sealed trait personDotupdated
    extends StObject
       with EventType
  @scala.inline
  def personDotupdated: personDotupdated = "person.updated".asInstanceOf[personDotupdated]
  
  @js.native
  sealed trait physical
    extends StObject
       with IssuingCardType
  @scala.inline
  def physical: physical = "physical".asInstanceOf[physical]
  
  @js.native
  sealed trait pl extends StObject
  @scala.inline
  def pl: pl = "pl".asInstanceOf[pl]
  
  @js.native
  sealed trait plan extends StObject
  @scala.inline
  def plan: plan = "plan".asInstanceOf[plan]
  
  @js.native
  sealed trait planDotcreated
    extends StObject
       with EventType
  @scala.inline
  def planDotcreated: planDotcreated = "plan.created".asInstanceOf[planDotcreated]
  
  @js.native
  sealed trait planDotdeleted
    extends StObject
       with EventType
  @scala.inline
  def planDotdeleted: planDotdeleted = "plan.deleted".asInstanceOf[planDotdeleted]
  
  @js.native
  sealed trait planDotupdated
    extends StObject
       with EventType
  @scala.inline
  def planDotupdated: planDotupdated = "plan.updated".asInstanceOf[planDotupdated]
  
  @js.native
  sealed trait png extends StObject
  @scala.inline
  def png: png = "png".asInstanceOf[png]
  
  @js.native
  sealed trait post_payment extends StObject
  @scala.inline
  def post_payment: post_payment = "post_payment".asInstanceOf[post_payment]
  
  @js.native
  sealed trait pre_payment extends StObject
  @scala.inline
  def pre_payment: pre_payment = "pre_payment".asInstanceOf[pre_payment]
  
  @js.native
  sealed trait prepaid extends StObject
  @scala.inline
  def prepaid: prepaid = "prepaid".asInstanceOf[prepaid]
  
  @js.native
  sealed trait processing extends StObject
  @scala.inline
  def processing: processing = "processing".asInstanceOf[processing]
  
  @js.native
  sealed trait processing_error extends StObject
  @scala.inline
  def processing_error: processing_error = "processing_error".asInstanceOf[processing_error]
  
  @js.native
  sealed trait product extends StObject
  @scala.inline
  def product: product = "product".asInstanceOf[product]
  
  @js.native
  sealed trait productDotcreated
    extends StObject
       with EventType
  @scala.inline
  def productDotcreated: productDotcreated = "product.created".asInstanceOf[productDotcreated]
  
  @js.native
  sealed trait productDotdeleted
    extends StObject
       with EventType
  @scala.inline
  def productDotdeleted: productDotdeleted = "product.deleted".asInstanceOf[productDotdeleted]
  
  @js.native
  sealed trait productDotupdated
    extends StObject
       with EventType
  @scala.inline
  def productDotupdated: productDotupdated = "product.updated".asInstanceOf[productDotupdated]
  
  @js.native
  sealed trait product_not_received extends StObject
  @scala.inline
  def product_not_received: product_not_received = "product_not_received".asInstanceOf[product_not_received]
  
  @js.native
  sealed trait product_unacceptable extends StObject
  @scala.inline
  def product_unacceptable: product_unacceptable = "product_unacceptable".asInstanceOf[product_unacceptable]
  
  @js.native
  sealed trait product_unsatisfactory
    extends StObject
       with CreditNoteReason
  @scala.inline
  def product_unsatisfactory: product_unsatisfactory = "product_unsatisfactory".asInstanceOf[product_unsatisfactory]
  
  @js.native
  sealed trait pt extends StObject
  @scala.inline
  def pt: pt = "pt".asInstanceOf[pt]
  
  @js.native
  sealed trait publishable extends StObject
  @scala.inline
  def publishable: publishable = "publishable".asInstanceOf[publishable]
  
  @js.native
  sealed trait radarDotearly_fraud_warningDotcreated
    extends StObject
       with EventType
  @scala.inline
  def radarDotearly_fraud_warningDotcreated: radarDotearly_fraud_warningDotcreated = "radar.early_fraud_warning.created".asInstanceOf[radarDotearly_fraud_warningDotcreated]
  
  @js.native
  sealed trait radarDotearly_fraud_warningDotupdated
    extends StObject
       with EventType
  @scala.inline
  def radarDotearly_fraud_warningDotupdated: radarDotearly_fraud_warningDotupdated = "radar.early_fraud_warning.updated".asInstanceOf[radarDotearly_fraud_warningDotupdated]
  
  @js.native
  sealed trait range extends StObject
  @scala.inline
  def range: range = "range".asInstanceOf[range]
  
  @js.native
  sealed trait receiver extends StObject
  @scala.inline
  def receiver: receiver = "receiver".asInstanceOf[receiver]
  
  @js.native
  sealed trait recipientDotcreated
    extends StObject
       with EventType
  @scala.inline
  def recipientDotcreated: recipientDotcreated = "recipient.created".asInstanceOf[recipientDotcreated]
  
  @js.native
  sealed trait recipientDotdeleted
    extends StObject
       with EventType
  @scala.inline
  def recipientDotdeleted: recipientDotdeleted = "recipient.deleted".asInstanceOf[recipientDotdeleted]
  
  @js.native
  sealed trait recipientDotupdated
    extends StObject
       with EventType
  @scala.inline
  def recipientDotupdated: recipientDotupdated = "recipient.updated".asInstanceOf[recipientDotupdated]
  
  @js.native
  sealed trait redirect extends StObject
  @scala.inline
  def redirect: redirect = "redirect".asInstanceOf[redirect]
  
  @js.native
  sealed trait redirect_to_url extends StObject
  @scala.inline
  def redirect_to_url: redirect_to_url = "redirect_to_url".asInstanceOf[redirect_to_url]
  
  @js.native
  sealed trait refresh_token extends StObject
  @scala.inline
  def refresh_token: refresh_token = "refresh_token".asInstanceOf[refresh_token]
  
  @js.native
  sealed trait refund
    extends StObject
       with TransactionType
  @scala.inline
  def refund: refund = "refund".asInstanceOf[refund]
  
  @js.native
  sealed trait refund_reversal
    extends StObject
       with TransactionType
  @scala.inline
  def refund_reversal: refund_reversal = "refund_reversal".asInstanceOf[refund_reversal]
  
  @js.native
  sealed trait refunded extends StObject
  @scala.inline
  def refunded: refunded = "refunded".asInstanceOf[refunded]
  
  @js.native
  sealed trait refunded_as_fraud extends StObject
  @scala.inline
  def refunded_as_fraud: refunded_as_fraud = "refunded_as_fraud".asInstanceOf[refunded_as_fraud]
  
  @js.native
  sealed trait refused extends StObject
  @scala.inline
  def refused: refused = "refused".asInstanceOf[refused]
  
  @js.native
  sealed trait rejectedDotlisted extends StObject
  @scala.inline
  def rejectedDotlisted: rejectedDotlisted = "rejected.listed".asInstanceOf[rejectedDotlisted]
  
  @js.native
  sealed trait repeating extends StObject
  @scala.inline
  def repeating: repeating = "repeating".asInstanceOf[repeating]
  
  @js.native
  sealed trait reportingDotreport_runDotfailed
    extends StObject
       with EventType
  @scala.inline
  def reportingDotreport_runDotfailed: reportingDotreport_runDotfailed = "reporting.report_run.failed".asInstanceOf[reportingDotreport_runDotfailed]
  
  @js.native
  sealed trait reportingDotreport_runDotsucceeded
    extends StObject
       with EventType
  @scala.inline
  def reportingDotreport_runDotsucceeded: reportingDotreport_runDotsucceeded = "reporting.report_run.succeeded".asInstanceOf[reportingDotreport_runDotsucceeded]
  
  @js.native
  sealed trait reportingDotreport_typeDotupdated
    extends StObject
       with EventType
  @scala.inline
  def reportingDotreport_typeDotupdated: reportingDotreport_typeDotupdated = "reporting.report_type.updated".asInstanceOf[reportingDotreport_typeDotupdated]
  
  @js.native
  sealed trait request extends StObject
  @scala.inline
  def request: request = "request".asInstanceOf[request]
  
  @js.native
  sealed trait requested extends StObject
  @scala.inline
  def requested: requested = "requested".asInstanceOf[requested]
  
  @js.native
  sealed trait requested_by_customer
    extends StObject
       with PaymentIntentUserProvidedCancellationReason
       with SetupIntentCancelationReason
  @scala.inline
  def requested_by_customer: requested_by_customer = "requested_by_customer".asInstanceOf[requested_by_customer]
  
  @js.native
  sealed trait required extends StObject
  @scala.inline
  def required: required = "required".asInstanceOf[required]
  
  @js.native
  sealed trait requires_action extends StObject
  @scala.inline
  def requires_action: requires_action = "requires_action".asInstanceOf[requires_action]
  
  @js.native
  sealed trait requires_capture extends StObject
  @scala.inline
  def requires_capture: requires_capture = "requires_capture".asInstanceOf[requires_capture]
  
  @js.native
  sealed trait requires_confirmation extends StObject
  @scala.inline
  def requires_confirmation: requires_confirmation = "requires_confirmation".asInstanceOf[requires_confirmation]
  
  @js.native
  sealed trait requires_payment_method extends StObject
  @scala.inline
  def requires_payment_method: requires_payment_method = "requires_payment_method".asInstanceOf[requires_payment_method]
  
  @js.native
  sealed trait response extends StObject
  @scala.inline
  def response: response = "response".asInstanceOf[response]
  
  @js.native
  sealed trait response_disabled extends StObject
  @scala.inline
  def response_disabled: response_disabled = "response_disabled".asInstanceOf[response_disabled]
  
  @js.native
  sealed trait returned
    extends StObject
       with OrderStatus
  @scala.inline
  def returned: returned = "returned".asInstanceOf[returned]
  
  @js.native
  sealed trait reusable extends StObject
  @scala.inline
  def reusable: reusable = "reusable".asInstanceOf[reusable]
  
  @js.native
  sealed trait reverse extends StObject
  @scala.inline
  def reverse: reverse = "reverse".asInstanceOf[reverse]
  
  @js.native
  sealed trait reversed
    extends StObject
       with AuthorizationStatus
  @scala.inline
  def reversed: reversed = "reversed".asInstanceOf[reversed]
  
  @js.native
  sealed trait reversed_after_approval extends StObject
  @scala.inline
  def reversed_after_approval: reversed_after_approval = "reversed_after_approval".asInstanceOf[reversed_after_approval]
  
  @js.native
  sealed trait review extends StObject
  @scala.inline
  def review: review = "review".asInstanceOf[review]
  
  @js.native
  sealed trait reviewDotclosed
    extends StObject
       with EventType
  @scala.inline
  def reviewDotclosed: reviewDotclosed = "review.closed".asInstanceOf[reviewDotclosed]
  
  @js.native
  sealed trait reviewDotopened
    extends StObject
       with EventType
  @scala.inline
  def reviewDotopened: reviewDotopened = "review.opened".asInstanceOf[reviewDotopened]
  
  @js.native
  sealed trait rule extends StObject
  @scala.inline
  def rule: rule = "rule".asInstanceOf[rule]
  
  @js.native
  sealed trait safe extends StObject
  @scala.inline
  def safe: safe = "safe".asInstanceOf[safe]
  
  @js.native
  sealed trait samsung_pay
    extends StObject
       with CardWalletType
       with WalletProvider
  @scala.inline
  def samsung_pay: samsung_pay = "samsung_pay".asInstanceOf[samsung_pay]
  
  @js.native
  sealed trait saturday extends StObject
  @scala.inline
  def saturday: saturday = "saturday".asInstanceOf[saturday]
  
  @js.native
  sealed trait scheduled extends StObject
  @scala.inline
  def scheduled: scheduled = "scheduled".asInstanceOf[scheduled]
  
  @js.native
  sealed trait secret extends StObject
  @scala.inline
  def secret: secret = "secret".asInstanceOf[secret]
  
  @js.native
  sealed trait send_invoice
    extends StObject
       with SubscriptionBilling
  @scala.inline
  def send_invoice: send_invoice = "send_invoice".asInstanceOf[send_invoice]
  
  @js.native
  sealed trait sepa_debit
    extends StObject
       with PaymentIntentPaymentMethodType
  @scala.inline
  def sepa_debit: sepa_debit = "sepa_debit".asInstanceOf[sepa_debit]
  
  @js.native
  sealed trait service
    extends StObject
       with ProductType
  @scala.inline
  def service: service = "service".asInstanceOf[service]
  
  @js.native
  sealed trait set
    extends StObject
       with IUsageRecordAction
  @scala.inline
  def set: set = "set".asInstanceOf[set]
  
  @js.native
  sealed trait setup extends StObject
  @scala.inline
  def setup: setup = "setup".asInstanceOf[setup]
  
  @js.native
  sealed trait setup_intent extends StObject
  @scala.inline
  def setup_intent: setup_intent = "setup_intent".asInstanceOf[setup_intent]
  
  @js.native
  sealed trait setup_intentDotcanceled
    extends StObject
       with EventType
  @scala.inline
  def setup_intentDotcanceled: setup_intentDotcanceled = "setup_intent.canceled".asInstanceOf[setup_intentDotcanceled]
  
  @js.native
  sealed trait setup_intentDotcreated
    extends StObject
       with EventType
  @scala.inline
  def setup_intentDotcreated: setup_intentDotcreated = "setup_intent.created".asInstanceOf[setup_intentDotcreated]
  
  @js.native
  sealed trait setup_intentDotsetup_failed
    extends StObject
       with EventType
  @scala.inline
  def setup_intentDotsetup_failed: setup_intentDotsetup_failed = "setup_intent.setup_failed".asInstanceOf[setup_intentDotsetup_failed]
  
  @js.native
  sealed trait setup_intentDotsucceeded
    extends StObject
       with EventType
  @scala.inline
  def setup_intentDotsucceeded: setup_intentDotsucceeded = "setup_intent.succeeded".asInstanceOf[setup_intentDotsucceeded]
  
  @js.native
  sealed trait shipped extends StObject
  @scala.inline
  def shipped: shipped = "shipped".asInstanceOf[shipped]
  
  @js.native
  sealed trait shipping extends StObject
  @scala.inline
  def shipping: shipping = "shipping".asInstanceOf[shipping]
  
  @js.native
  sealed trait sigmaDotscheduled_query_runDotcreated
    extends StObject
       with EventType
  @scala.inline
  def sigmaDotscheduled_query_runDotcreated: sigmaDotscheduled_query_runDotcreated = "sigma.scheduled_query_run.created".asInstanceOf[sigmaDotscheduled_query_runDotcreated]
  
  @js.native
  sealed trait single_use extends StObject
  @scala.inline
  def single_use: single_use = "single_use".asInstanceOf[single_use]
  
  @js.native
  sealed trait sku extends StObject
  @scala.inline
  def sku: sku = "sku".asInstanceOf[sku]
  
  @js.native
  sealed trait skuDotcreated
    extends StObject
       with EventType
  @scala.inline
  def skuDotcreated: skuDotcreated = "sku.created".asInstanceOf[skuDotcreated]
  
  @js.native
  sealed trait skuDotdeleted
    extends StObject
       with EventType
  @scala.inline
  def skuDotdeleted: skuDotdeleted = "sku.deleted".asInstanceOf[skuDotdeleted]
  
  @js.native
  sealed trait skuDotupdated
    extends StObject
       with EventType
  @scala.inline
  def skuDotupdated: skuDotupdated = "sku.updated".asInstanceOf[skuDotupdated]
  
  @js.native
  sealed trait sofort
    extends StObject
       with IPaymentMethodType
  @scala.inline
  def sofort: sofort = "sofort".asInstanceOf[sofort]
  
  @js.native
  sealed trait source extends StObject
  @scala.inline
  def source: source = "source".asInstanceOf[source]
  
  @js.native
  sealed trait sourceDotcanceled
    extends StObject
       with EventType
  @scala.inline
  def sourceDotcanceled: sourceDotcanceled = "source.canceled".asInstanceOf[sourceDotcanceled]
  
  @js.native
  sealed trait sourceDotchargeable
    extends StObject
       with EventType
  @scala.inline
  def sourceDotchargeable: sourceDotchargeable = "source.chargeable".asInstanceOf[sourceDotchargeable]
  
  @js.native
  sealed trait sourceDotfailed
    extends StObject
       with EventType
  @scala.inline
  def sourceDotfailed: sourceDotfailed = "source.failed".asInstanceOf[sourceDotfailed]
  
  @js.native
  sealed trait sourceDotmandate_notification
    extends StObject
       with EventType
  @scala.inline
  def sourceDotmandate_notification: sourceDotmandate_notification = "source.mandate_notification".asInstanceOf[sourceDotmandate_notification]
  
  @js.native
  sealed trait sourceDotrefund_attributes_required
    extends StObject
       with EventType
  @scala.inline
  def sourceDotrefund_attributes_required: sourceDotrefund_attributes_required = "source.refund_attributes_required".asInstanceOf[sourceDotrefund_attributes_required]
  
  @js.native
  sealed trait sourceDottransactionDotcreated
    extends StObject
       with EventType
  @scala.inline
  def sourceDottransactionDotcreated: sourceDottransactionDotcreated = "source.transaction.created".asInstanceOf[sourceDottransactionDotcreated]
  
  @js.native
  sealed trait sourceDottransactionDotupdated
    extends StObject
       with EventType
  @scala.inline
  def sourceDottransactionDotupdated: sourceDottransactionDotupdated = "source.transaction.updated".asInstanceOf[sourceDottransactionDotupdated]
  
  @js.native
  sealed trait spending_limits extends StObject
  @scala.inline
  def spending_limits: spending_limits = "spending_limits".asInstanceOf[spending_limits]
  
  @js.native
  sealed trait standard
    extends StObject
       with PayoutMethods
  @scala.inline
  def standard: standard = "standard".asInstanceOf[standard]
  
  @js.native
  sealed trait stolen
    extends StObject
       with IssuingCardStatus
  @scala.inline
  def stolen: stolen = "stolen".asInstanceOf[stolen]
  
  @js.native
  sealed trait string extends StObject
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait stripe_account
    extends StObject
       with IPaymentMethodType
  @scala.inline
  def stripe_account: stripe_account = "stripe_account".asInstanceOf[stripe_account]
  
  @js.native
  sealed trait stripe_fee extends StObject
  @scala.inline
  def stripe_fee: stripe_fee = "stripe_fee".asInstanceOf[stripe_fee]
  
  @js.native
  sealed trait subscription extends StObject
  @scala.inline
  def subscription: subscription = "subscription".asInstanceOf[subscription]
  
  @js.native
  sealed trait subscription_canceled extends StObject
  @scala.inline
  def subscription_canceled: subscription_canceled = "subscription_canceled".asInstanceOf[subscription_canceled]
  
  @js.native
  sealed trait subscription_create extends StObject
  @scala.inline
  def subscription_create: subscription_create = "subscription_create".asInstanceOf[subscription_create]
  
  @js.native
  sealed trait subscription_cycle extends StObject
  @scala.inline
  def subscription_cycle: subscription_cycle = "subscription_cycle".asInstanceOf[subscription_cycle]
  
  @js.native
  sealed trait subscription_item extends StObject
  @scala.inline
  def subscription_item: subscription_item = "subscription_item".asInstanceOf[subscription_item]
  
  @js.native
  sealed trait subscription_scheduleDotaborted
    extends StObject
       with EventType
  @scala.inline
  def subscription_scheduleDotaborted: subscription_scheduleDotaborted = "subscription_schedule.aborted".asInstanceOf[subscription_scheduleDotaborted]
  
  @js.native
  sealed trait subscription_scheduleDotcanceled
    extends StObject
       with EventType
  @scala.inline
  def subscription_scheduleDotcanceled: subscription_scheduleDotcanceled = "subscription_schedule.canceled".asInstanceOf[subscription_scheduleDotcanceled]
  
  @js.native
  sealed trait subscription_scheduleDotcompleted
    extends StObject
       with EventType
  @scala.inline
  def subscription_scheduleDotcompleted: subscription_scheduleDotcompleted = "subscription_schedule.completed".asInstanceOf[subscription_scheduleDotcompleted]
  
  @js.native
  sealed trait subscription_scheduleDotcreated
    extends StObject
       with EventType
  @scala.inline
  def subscription_scheduleDotcreated: subscription_scheduleDotcreated = "subscription_schedule.created".asInstanceOf[subscription_scheduleDotcreated]
  
  @js.native
  sealed trait subscription_scheduleDotexpiring
    extends StObject
       with EventType
  @scala.inline
  def subscription_scheduleDotexpiring: subscription_scheduleDotexpiring = "subscription_schedule.expiring".asInstanceOf[subscription_scheduleDotexpiring]
  
  @js.native
  sealed trait subscription_scheduleDotreleased
    extends StObject
       with EventType
  @scala.inline
  def subscription_scheduleDotreleased: subscription_scheduleDotreleased = "subscription_schedule.released".asInstanceOf[subscription_scheduleDotreleased]
  
  @js.native
  sealed trait subscription_scheduleDotupdated
    extends StObject
       with EventType
  @scala.inline
  def subscription_scheduleDotupdated: subscription_scheduleDotupdated = "subscription_schedule.updated".asInstanceOf[subscription_scheduleDotupdated]
  
  @js.native
  sealed trait subscription_threshold extends StObject
  @scala.inline
  def subscription_threshold: subscription_threshold = "subscription_threshold".asInstanceOf[subscription_threshold]
  
  @js.native
  sealed trait subscription_update extends StObject
  @scala.inline
  def subscription_update: subscription_update = "subscription_update".asInstanceOf[subscription_update]
  
  @js.native
  sealed trait succeeded extends StObject
  @scala.inline
  def succeeded: succeeded = "succeeded".asInstanceOf[succeeded]
  
  @js.native
  sealed trait success extends StObject
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  
  @js.native
  sealed trait sum extends StObject
  @scala.inline
  def sum: sum = "sum".asInstanceOf[sum]
  
  @js.native
  sealed trait sunday extends StObject
  @scala.inline
  def sunday: sunday = "sunday".asInstanceOf[sunday]
  
  @js.native
  sealed trait suspected_fraud extends StObject
  @scala.inline
  def suspected_fraud: suspected_fraud = "suspected_fraud".asInstanceOf[suspected_fraud]
  
  @js.native
  sealed trait sv extends StObject
  @scala.inline
  def sv: sv = "sv".asInstanceOf[sv]
  
  @js.native
  sealed trait swipe
    extends StObject
       with AuthorizationMethod
  @scala.inline
  def swipe: swipe = "swipe".asInstanceOf[swipe]
  
  @js.native
  sealed trait tax extends StObject
  @scala.inline
  def tax: tax = "tax".asInstanceOf[tax]
  
  @js.native
  sealed trait tax_id extends StObject
  @scala.inline
  def tax_id: tax_id = "tax_id".asInstanceOf[tax_id]
  
  @js.native
  sealed trait tax_rate extends StObject
  @scala.inline
  def tax_rate: tax_rate = "tax_rate".asInstanceOf[tax_rate]
  
  @js.native
  sealed trait tax_rateDotcreated
    extends StObject
       with EventType
  @scala.inline
  def tax_rateDotcreated: tax_rateDotcreated = "tax_rate.created".asInstanceOf[tax_rateDotcreated]
  
  @js.native
  sealed trait tax_rateDotupdated
    extends StObject
       with EventType
  @scala.inline
  def tax_rateDotupdated: tax_rateDotupdated = "tax_rate.updated".asInstanceOf[tax_rateDotupdated]
  
  @js.native
  sealed trait terms_of_service extends StObject
  @scala.inline
  def terms_of_service: terms_of_service = "terms_of_service".asInstanceOf[terms_of_service]
  
  @js.native
  sealed trait theft
    extends StObject
       with IssuingCardReplacementReason
  @scala.inline
  def theft: theft = "theft".asInstanceOf[theft]
  
  @js.native
  sealed trait three_d_secure extends StObject
  @scala.inline
  def three_d_secure: three_d_secure = "three_d_secure".asInstanceOf[three_d_secure]
  
  @js.native
  sealed trait thursday extends StObject
  @scala.inline
  def thursday: thursday = "thursday".asInstanceOf[thursday]
  
  @js.native
  sealed trait tiered extends StObject
  @scala.inline
  def tiered: tiered = "tiered".asInstanceOf[tiered]
  
  @js.native
  sealed trait token extends StObject
  @scala.inline
  def token: token = "token".asInstanceOf[token]
  
  @js.native
  sealed trait topup extends StObject
  @scala.inline
  def topup: topup = "topup".asInstanceOf[topup]
  
  @js.native
  sealed trait topupDotcreated
    extends StObject
       with EventType
  @scala.inline
  def topupDotcreated: topupDotcreated = "topup.created".asInstanceOf[topupDotcreated]
  
  @js.native
  sealed trait topupDotfailed
    extends StObject
       with EventType
  @scala.inline
  def topupDotfailed: topupDotfailed = "topup.failed".asInstanceOf[topupDotfailed]
  
  @js.native
  sealed trait topupDotreversed
    extends StObject
       with EventType
  @scala.inline
  def topupDotreversed: topupDotreversed = "topup.reversed".asInstanceOf[topupDotreversed]
  
  @js.native
  sealed trait topupDotsucceeded
    extends StObject
       with EventType
  @scala.inline
  def topupDotsucceeded: topupDotsucceeded = "topup.succeeded".asInstanceOf[topupDotsucceeded]
  
  @js.native
  sealed trait transfer extends StObject
  @scala.inline
  def transfer: transfer = "transfer".asInstanceOf[transfer]
  
  @js.native
  sealed trait transferDotcreated
    extends StObject
       with EventType
  @scala.inline
  def transferDotcreated: transferDotcreated = "transfer.created".asInstanceOf[transferDotcreated]
  
  @js.native
  sealed trait transferDotfailed
    extends StObject
       with EventType
  @scala.inline
  def transferDotfailed: transferDotfailed = "transfer.failed".asInstanceOf[transferDotfailed]
  
  @js.native
  sealed trait transferDotpaid
    extends StObject
       with EventType
  @scala.inline
  def transferDotpaid: transferDotpaid = "transfer.paid".asInstanceOf[transferDotpaid]
  
  @js.native
  sealed trait transferDotreversed
    extends StObject
       with EventType
  @scala.inline
  def transferDotreversed: transferDotreversed = "transfer.reversed".asInstanceOf[transferDotreversed]
  
  @js.native
  sealed trait transferDotupdated
    extends StObject
       with EventType
  @scala.inline
  def transferDotupdated: transferDotupdated = "transfer.updated".asInstanceOf[transferDotupdated]
  
  @js.native
  sealed trait transfer_reversal extends StObject
  @scala.inline
  def transfer_reversal: transfer_reversal = "transfer_reversal".asInstanceOf[transfer_reversal]
  
  @js.native
  sealed trait trialing
    extends StObject
       with SubscriptionStatus
  @scala.inline
  def trialing: trialing = "trialing".asInstanceOf[trialing]
  
  @js.native
  sealed trait tuesday extends StObject
  @scala.inline
  def tuesday: tuesday = "tuesday".asInstanceOf[tuesday]
  
  @js.native
  sealed trait unavailable extends StObject
  @scala.inline
  def unavailable: unavailable = "unavailable".asInstanceOf[unavailable]
  
  @js.native
  sealed trait unchanged extends StObject
  @scala.inline
  def unchanged: unchanged = "unchanged".asInstanceOf[unchanged]
  
  @js.native
  sealed trait unchecked extends StObject
  @scala.inline
  def unchecked: unchecked = "unchecked".asInstanceOf[unchecked]
  
  @js.native
  sealed trait uncollectible extends StObject
  @scala.inline
  def uncollectible: uncollectible = "uncollectible".asInstanceOf[uncollectible]
  
  @js.native
  sealed trait under_review
    extends StObject
       with IssuingDisputeStatus
  @scala.inline
  def under_review: under_review = "under_review".asInstanceOf[under_review]
  
  @js.native
  sealed trait unionpay
    extends StObject
       with CardBrand
  @scala.inline
  def unionpay: unionpay = "unionpay".asInstanceOf[unionpay]
  
  @js.native
  sealed trait unknown_
    extends StObject
       with CardBrand
       with TaxIdType
  @scala.inline
  def unknown_ : unknown_ = "unknown".asInstanceOf[unknown_]
  
  @js.native
  sealed trait unpaid
    extends StObject
       with SubscriptionStatus
  @scala.inline
  def unpaid: unpaid = "unpaid".asInstanceOf[unpaid]
  
  @js.native
  sealed trait unrecognized extends StObject
  @scala.inline
  def unrecognized: unrecognized = "unrecognized".asInstanceOf[unrecognized]
  
  @js.native
  sealed trait unspent_receiver_credit
    extends StObject
       with CustomerBalanceTransactionType
  @scala.inline
  def unspent_receiver_credit: unspent_receiver_credit = "unspent_receiver_credit".asInstanceOf[unspent_receiver_credit]
  
  @js.native
  sealed trait unsubmitted
    extends StObject
       with IssuingDisputeStatus
  @scala.inline
  def unsubmitted: unsubmitted = "unsubmitted".asInstanceOf[unsubmitted]
  
  @js.native
  sealed trait unverified extends StObject
  @scala.inline
  def unverified: unverified = "unverified".asInstanceOf[unverified]
  
  @js.native
  sealed trait up extends StObject
  @scala.inline
  def up: up = "up".asInstanceOf[up]
  
  @js.native
  sealed trait upcoming extends StObject
  @scala.inline
  def upcoming: upcoming = "upcoming".asInstanceOf[upcoming]
  
  @js.native
  sealed trait usage_record extends StObject
  @scala.inline
  def usage_record: usage_record = "usage_record".asInstanceOf[usage_record]
  
  @js.native
  sealed trait use_stripe_sdk extends StObject
  @scala.inline
  def use_stripe_sdk: use_stripe_sdk = "use_stripe_sdk".asInstanceOf[use_stripe_sdk]
  
  @js.native
  sealed trait user_abort extends StObject
  @scala.inline
  def user_abort: user_abort = "user_abort".asInstanceOf[user_abort]
  
  @js.native
  sealed trait validated extends StObject
  @scala.inline
  def validated: validated = "validated".asInstanceOf[validated]
  
  @js.native
  sealed trait variable extends StObject
  @scala.inline
  def variable: variable = "variable".asInstanceOf[variable]
  
  @js.native
  sealed trait verification_failed extends StObject
  @scala.inline
  def verification_failed: verification_failed = "verification_failed".asInstanceOf[verification_failed]
  
  @js.native
  sealed trait verified extends StObject
  @scala.inline
  def verified: verified = "verified".asInstanceOf[verified]
  
  @js.native
  sealed trait virtual
    extends StObject
       with IssuingCardType
  @scala.inline
  def virtual: virtual = "virtual".asInstanceOf[virtual]
  
  @js.native
  sealed trait visa_
    extends StObject
       with CardBrand
  @scala.inline
  def visa_ : visa_ = "visa".asInstanceOf[visa_]
  
  @js.native
  sealed trait visa_checkout
    extends StObject
       with CardWalletType
  @scala.inline
  def visa_checkout: visa_checkout = "visa_checkout".asInstanceOf[visa_checkout]
  
  @js.native
  sealed trait void extends StObject
  @scala.inline
  def void: void = "void".asInstanceOf[void]
  
  @js.native
  sealed trait void_invoice
    extends StObject
       with PaymentIntentStripeProvidedCancellationReason
  @scala.inline
  def void_invoice: void_invoice = "void_invoice".asInstanceOf[void_invoice]
  
  @js.native
  sealed trait volume extends StObject
  @scala.inline
  def volume: volume = "volume".asInstanceOf[volume]
  
  @js.native
  sealed trait warning_closed extends StObject
  @scala.inline
  def warning_closed: warning_closed = "warning_closed".asInstanceOf[warning_closed]
  
  @js.native
  sealed trait warning_needs_response extends StObject
  @scala.inline
  def warning_needs_response: warning_needs_response = "warning_needs_response".asInstanceOf[warning_needs_response]
  
  @js.native
  sealed trait warning_under_review extends StObject
  @scala.inline
  def warning_under_review: warning_under_review = "warning_under_review".asInstanceOf[warning_under_review]
  
  @js.native
  sealed trait webhook_approved extends StObject
  @scala.inline
  def webhook_approved: webhook_approved = "webhook_approved".asInstanceOf[webhook_approved]
  
  @js.native
  sealed trait webhook_declined extends StObject
  @scala.inline
  def webhook_declined: webhook_declined = "webhook_declined".asInstanceOf[webhook_declined]
  
  @js.native
  sealed trait webhook_endpoint extends StObject
  @scala.inline
  def webhook_endpoint: webhook_endpoint = "webhook_endpoint".asInstanceOf[webhook_endpoint]
  
  @js.native
  sealed trait webhook_timeout extends StObject
  @scala.inline
  def webhook_timeout: webhook_timeout = "webhook_timeout".asInstanceOf[webhook_timeout]
  
  @js.native
  sealed trait wechat
    extends StObject
       with IPaymentMethodType
  @scala.inline
  def wechat: wechat = "wechat".asInstanceOf[wechat]
  
  @js.native
  sealed trait wednesday extends StObject
  @scala.inline
  def wednesday: wednesday = "wednesday".asInstanceOf[wednesday]
  
  @js.native
  sealed trait week
    extends StObject
       with IntervalUnit
  @scala.inline
  def week: week = "week".asInstanceOf[week]
  
  @js.native
  sealed trait weekly
    extends StObject
       with SpendingLimitInterval
  @scala.inline
  def weekly: weekly = "weekly".asInstanceOf[weekly]
  
  @js.native
  sealed trait won
    extends StObject
       with IssuingDisputeStatus
  @scala.inline
  def won: won = "won".asInstanceOf[won]
  
  @js.native
  sealed trait year
    extends StObject
       with IntervalUnit
  @scala.inline
  def year: year = "year".asInstanceOf[year]
  
  @js.native
  sealed trait yearly
    extends StObject
       with SpendingLimitInterval
  @scala.inline
  def yearly: yearly = "yearly".asInstanceOf[yearly]
  
  @js.native
  sealed trait zh extends StObject
  @scala.inline
  def zh: zh = "zh".asInstanceOf[zh]
}
