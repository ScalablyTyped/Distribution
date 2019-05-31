package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object stripeLibStrings {
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
  sealed trait accepted extends js.Object
  
  @js.native
  sealed trait ach_credit_transfer extends js.Object
  
  @js.native
  sealed trait ach_debit extends js.Object
  
  @js.native
  sealed trait active
    extends stripeLib.stripeMod.subscriptionsNs.SubscriptionStatus
  
  @js.native
  sealed trait adjustment extends js.Object
  
  @js.native
  sealed trait alipay extends js.Object
  
  @js.native
  sealed trait alipay_account
    extends stripeLib.stripeMod.transfersNs.SourceTypes
  
  @js.native
  sealed trait all extends js.Object
  
  @js.native
  sealed trait android_pay extends js.Object
  
  @js.native
  sealed trait api_error
    extends stripeLib.stripeMod.errorsNs.RawType
  
  @js.native
  sealed trait apple_pay extends js.Object
  
  @js.native
  sealed trait application extends js.Object
  
  @js.native
  sealed trait `application/octet-stream` extends js.Object
  
  @js.native
  sealed trait application_fee extends js.Object
  
  @js.native
  sealed trait application_fee_refund extends js.Object
  
  @js.native
  sealed trait approved extends js.Object
  
  @js.native
  sealed trait approved_by_network extends js.Object
  
  @js.native
  sealed trait authorized extends js.Object
  
  @js.native
  sealed trait automatic extends js.Object
  
  @js.native
  sealed trait available extends js.Object
  
  @js.native
  sealed trait bancontact extends js.Object
  
  @js.native
  sealed trait bank_account
    extends stripeLib.stripeMod.payoutsNs.PayoutTypes
       with stripeLib.stripeMod.transfersNs.SourceTypes
  
  @js.native
  sealed trait bank_cannot_process extends js.Object
  
  @js.native
  sealed trait bitcoin_receiver
    extends stripeLib.stripeMod.transfersNs.SourceTypes
  
  @js.native
  sealed trait blocked extends js.Object
  
  @js.native
  sealed trait bucket extends js.Object
  
  @js.native
  sealed trait business_logo
    extends stripeLib.stripeMod.fileUploadsNs.IPurpose
  
  @js.native
  sealed trait canceled
    extends stripeLib.stripeMod.ordersNs.OrderStatus
       with stripeLib.stripeMod.transfersNs.Statuses
       with stripeLib.stripeMod.subscriptionsNs.SubscriptionStatus
  
  @js.native
  sealed trait card
    extends stripeLib.stripeMod.payoutsNs.PayoutTypes
       with stripeLib.stripeMod.transfersNs.SourceTypes
  
  @js.native
  sealed trait card_error
    extends stripeLib.stripeMod.errorsNs.RawType
  
  @js.native
  sealed trait card_present extends js.Object
  
  @js.native
  sealed trait charge extends js.Object
  
  @js.native
  sealed trait charge_automatically
    extends stripeLib.stripeMod.subscriptionsNs.SubscriptionBilling
  
  @js.native
  sealed trait charge_refunded extends js.Object
  
  @js.native
  sealed trait chargeable extends js.Object
  
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
  sealed trait created
    extends stripeLib.stripeMod.ordersNs.OrderStatus
  
  @js.native
  sealed trait credit extends js.Object
  
  @js.native
  sealed trait credit_not_processed extends js.Object
  
  @js.native
  sealed trait custom extends js.Object
  
  @js.native
  sealed trait customer extends js.Object
  
  @js.native
  sealed trait daily extends js.Object
  
  @js.native
  sealed trait day
    extends stripeLib.stripeMod.plansNs.IntervalUnit
  
  @js.native
  sealed trait debit extends js.Object
  
  @js.native
  sealed trait debit_not_authorized extends js.Object
  
  @js.native
  sealed trait declined extends js.Object
  
  @js.native
  sealed trait declined_by_network extends js.Object
  
  @js.native
  sealed trait discount extends js.Object
  
  @js.native
  sealed trait dispute extends js.Object
  
  @js.native
  sealed trait dispute_evidence
    extends stripeLib.stripeMod.fileUploadsNs.IPurpose
  
  @js.native
  sealed trait disputed extends js.Object
  
  @js.native
  sealed trait down extends js.Object
  
  @js.native
  sealed trait draft extends js.Object
  
  @js.native
  sealed trait duplicate
    extends stripeLib.stripeMod.paymentIntentsNs.PaymentIntentCancelationReason
  
  @js.native
  sealed trait email extends js.Object
  
  @js.native
  sealed trait ephemeral_key extends js.Object
  
  @js.native
  sealed trait eps extends js.Object
  
  @js.native
  sealed trait errored extends js.Object
  
  @js.native
  sealed trait event extends js.Object
  
  @js.native
  sealed trait exact extends js.Object
  
  @js.native
  sealed trait expired_or_canceled_card extends js.Object
  
  @js.native
  sealed trait fail extends js.Object
  
  @js.native
  sealed trait failed
    extends stripeLib.stripeMod.transfersNs.Statuses
  
  @js.native
  sealed trait failed_invoice
    extends stripeLib.stripeMod.paymentIntentsNs.PaymentIntentCancelationReason
  
  @js.native
  sealed trait female extends js.Object
  
  @js.native
  sealed trait file_upload extends js.Object
  
  @js.native
  sealed trait finite extends js.Object
  
  @js.native
  sealed trait forever extends js.Object
  
  @js.native
  sealed trait fraud extends js.Object
  
  @js.native
  sealed trait fraudulent
    extends stripeLib.stripeMod.paymentIntentsNs.PaymentIntentCancelationReason
  
  @js.native
  sealed trait friday extends js.Object
  
  @js.native
  sealed trait fulfilled
    extends stripeLib.stripeMod.ordersNs.OrderStatus
  
  @js.native
  sealed trait general extends js.Object
  
  @js.native
  sealed trait giropay extends js.Object
  
  @js.native
  sealed trait good
    extends stripeLib.stripeMod.productsNs.ProductType
  
  @js.native
  sealed trait graduated extends js.Object
  
  @js.native
  sealed trait ideal extends js.Object
  
  @js.native
  sealed trait idempotency_error
    extends stripeLib.stripeMod.errorsNs.RawType
  
  @js.native
  sealed trait identity_document
    extends stripeLib.stripeMod.fileUploadsNs.IPurpose
  
  @js.native
  sealed trait in_stock extends js.Object
  
  @js.native
  sealed trait in_transit
    extends stripeLib.stripeMod.transfersNs.Statuses
  
  @js.native
  sealed trait incomplete
    extends stripeLib.stripeMod.subscriptionsNs.SubscriptionStatus
  
  @js.native
  sealed trait incomplete_expired
    extends stripeLib.stripeMod.subscriptionsNs.SubscriptionStatus
  
  @js.native
  sealed trait incorporation_article
    extends stripeLib.stripeMod.fileUploadsNs.IPurpose
  
  @js.native
  sealed trait incorporation_document
    extends stripeLib.stripeMod.fileUploadsNs.IPurpose
  
  @js.native
  sealed trait incorrect_account_details extends js.Object
  
  @js.native
  sealed trait increment
    extends stripeLib.stripeMod.usageRecordsNs.IUsageRecordAction
  
  @js.native
  sealed trait individual extends js.Object
  
  @js.native
  sealed trait infinite extends js.Object
  
  @js.native
  sealed trait instant
    extends stripeLib.stripeMod.payoutsNs.PayoutMethods
  
  @js.native
  sealed trait insufficient_funds extends js.Object
  
  @js.native
  sealed trait invalid extends js.Object
  
  @js.native
  sealed trait invalid_request_error
    extends stripeLib.stripeMod.errorsNs.RawType
  
  @js.native
  sealed trait invoice extends js.Object
  
  @js.native
  sealed trait invoiceitem extends js.Object
  
  @js.native
  sealed trait issuer_declined extends js.Object
  
  @js.native
  sealed trait jpg extends js.Object
  
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
  sealed trait manual extends js.Object
  
  @js.native
  sealed trait manual_review extends js.Object
  
  @js.native
  sealed trait max extends js.Object
  
  @js.native
  sealed trait metered extends js.Object
  
  @js.native
  sealed trait missing extends js.Object
  
  @js.native
  sealed trait monday extends js.Object
  
  @js.native
  sealed trait month
    extends stripeLib.stripeMod.plansNs.IntervalUnit
  
  @js.native
  sealed trait monthly extends js.Object
  
  @js.native
  sealed trait multibanco extends js.Object
  
  @js.native
  sealed trait needs_response extends js.Object
  
  @js.native
  sealed trait network_cost extends js.Object
  
  @js.native
  sealed trait `new` extends js.Object
  
  @js.native
  sealed trait none extends js.Object
  
  @js.native
  sealed trait not_required extends js.Object
  
  @js.native
  sealed trait not_sent_to_network extends js.Object
  
  @js.native
  sealed trait now extends js.Object
  
  @js.native
  sealed trait offline extends js.Object
  
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
  sealed trait order_item extends js.Object
  
  @js.native
  sealed trait other extends js.Object
  
  @js.native
  sealed trait out_of_stock extends js.Object
  
  @js.native
  sealed trait p24 extends js.Object
  
  @js.native
  sealed trait paid
    extends stripeLib.stripeMod.ordersNs.OrderStatus
       with stripeLib.stripeMod.transfersNs.Statuses
  
  @js.native
  sealed trait pass extends js.Object
  
  @js.native
  sealed trait past_due
    extends stripeLib.stripeMod.subscriptionsNs.SubscriptionStatus
  
  @js.native
  sealed trait payment extends js.Object
  
  @js.native
  sealed trait payment_intent extends js.Object
  
  @js.native
  sealed trait payout extends js.Object
  
  @js.native
  sealed trait payout_failure extends js.Object
  
  @js.native
  sealed trait pdf extends js.Object
  
  @js.native
  sealed trait pending
    extends stripeLib.stripeMod.transfersNs.Statuses
  
  @js.native
  sealed trait per_unit extends js.Object
  
  @js.native
  sealed trait plan extends js.Object
  
  @js.native
  sealed trait png extends js.Object
  
  @js.native
  sealed trait prepaid extends js.Object
  
  @js.native
  sealed trait processing extends js.Object
  
  @js.native
  sealed trait processing_error extends js.Object
  
  @js.native
  sealed trait product extends js.Object
  
  @js.native
  sealed trait product_not_received extends js.Object
  
  @js.native
  sealed trait product_unacceptable extends js.Object
  
  @js.native
  sealed trait publishable extends js.Object
  
  @js.native
  sealed trait range extends js.Object
  
  @js.native
  sealed trait receiver extends js.Object
  
  @js.native
  sealed trait redirect extends js.Object
  
  @js.native
  sealed trait redirect_to_url extends js.Object
  
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
  sealed trait requested extends js.Object
  
  @js.native
  sealed trait requested_by_customer
    extends stripeLib.stripeMod.paymentIntentsNs.PaymentIntentCancelationReason
  
  @js.native
  sealed trait requires_action extends js.Object
  
  @js.native
  sealed trait requires_authorization extends js.Object
  
  @js.native
  sealed trait requires_capture extends js.Object
  
  @js.native
  sealed trait requires_payment_method extends js.Object
  
  @js.native
  sealed trait response_disabled extends js.Object
  
  @js.native
  sealed trait returned
    extends stripeLib.stripeMod.ordersNs.OrderStatus
  
  @js.native
  sealed trait reusable extends js.Object
  
  @js.native
  sealed trait reversed_after_approval extends js.Object
  
  @js.native
  sealed trait review extends js.Object
  
  @js.native
  sealed trait rule extends js.Object
  
  @js.native
  sealed trait safe extends js.Object
  
  @js.native
  sealed trait saturday extends js.Object
  
  @js.native
  sealed trait scheduled extends js.Object
  
  @js.native
  sealed trait secret extends js.Object
  
  @js.native
  sealed trait send_invoice
    extends stripeLib.stripeMod.subscriptionsNs.SubscriptionBilling
  
  @js.native
  sealed trait sepa_debit extends js.Object
  
  @js.native
  sealed trait service
    extends stripeLib.stripeMod.productsNs.ProductType
  
  @js.native
  sealed trait set
    extends stripeLib.stripeMod.usageRecordsNs.IUsageRecordAction
  
  @js.native
  sealed trait shipping extends js.Object
  
  @js.native
  sealed trait single_use extends js.Object
  
  @js.native
  sealed trait sku extends js.Object
  
  @js.native
  sealed trait sofort extends js.Object
  
  @js.native
  sealed trait source extends js.Object
  
  @js.native
  sealed trait standard
    extends stripeLib.stripeMod.payoutsNs.PayoutMethods
  
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
  sealed trait tax extends js.Object
  
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
  sealed trait transfer extends js.Object
  
  @js.native
  sealed trait transfer_reversal extends js.Object
  
  @js.native
  sealed trait trialing
    extends stripeLib.stripeMod.subscriptionsNs.SubscriptionStatus
  
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
  sealed trait unknown extends js.Object
  
  @js.native
  sealed trait unpaid
    extends stripeLib.stripeMod.subscriptionsNs.SubscriptionStatus
  
  @js.native
  sealed trait unrecognized extends js.Object
  
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
  sealed trait void extends js.Object
  
  @js.native
  sealed trait volume extends js.Object
  
  @js.native
  sealed trait warning_closed extends js.Object
  
  @js.native
  sealed trait warning_needs_response extends js.Object
  
  @js.native
  sealed trait warning_under_review extends js.Object
  
  @js.native
  sealed trait wechat extends js.Object
  
  @js.native
  sealed trait wednesday extends js.Object
  
  @js.native
  sealed trait week
    extends stripeLib.stripeMod.plansNs.IntervalUnit
  
  @js.native
  sealed trait weekly extends js.Object
  
  @js.native
  sealed trait won extends js.Object
  
  @js.native
  sealed trait year
    extends stripeLib.stripeMod.plansNs.IntervalUnit
  
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
  def accepted: accepted = "accepted".asInstanceOf[accepted]
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
  def android_pay: android_pay = "android_pay".asInstanceOf[android_pay]
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
  def application_fee_refund: application_fee_refund = "application_fee_refund".asInstanceOf[application_fee_refund]
  @scala.inline
  def approved: approved = "approved".asInstanceOf[approved]
  @scala.inline
  def approved_by_network: approved_by_network = "approved_by_network".asInstanceOf[approved_by_network]
  @scala.inline
  def authorized: authorized = "authorized".asInstanceOf[authorized]
  @scala.inline
  def automatic: automatic = "automatic".asInstanceOf[automatic]
  @scala.inline
  def available: available = "available".asInstanceOf[available]
  @scala.inline
  def bancontact: bancontact = "bancontact".asInstanceOf[bancontact]
  @scala.inline
  def bank_account: bank_account = "bank_account".asInstanceOf[bank_account]
  @scala.inline
  def bank_cannot_process: bank_cannot_process = "bank_cannot_process".asInstanceOf[bank_cannot_process]
  @scala.inline
  def bitcoin_receiver: bitcoin_receiver = "bitcoin_receiver".asInstanceOf[bitcoin_receiver]
  @scala.inline
  def blocked: blocked = "blocked".asInstanceOf[blocked]
  @scala.inline
  def bucket: bucket = "bucket".asInstanceOf[bucket]
  @scala.inline
  def business_logo: business_logo = "business_logo".asInstanceOf[business_logo]
  @scala.inline
  def canceled: canceled = "canceled".asInstanceOf[canceled]
  @scala.inline
  def card: card = "card".asInstanceOf[card]
  @scala.inline
  def card_error: card_error = "card_error".asInstanceOf[card_error]
  @scala.inline
  def card_present: card_present = "card_present".asInstanceOf[card_present]
  @scala.inline
  def charge: charge = "charge".asInstanceOf[charge]
  @scala.inline
  def charge_automatically: charge_automatically = "charge_automatically".asInstanceOf[charge_automatically]
  @scala.inline
  def charge_refunded: charge_refunded = "charge_refunded".asInstanceOf[charge_refunded]
  @scala.inline
  def chargeable: chargeable = "chargeable".asInstanceOf[chargeable]
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
  def created: created = "created".asInstanceOf[created]
  @scala.inline
  def credit: credit = "credit".asInstanceOf[credit]
  @scala.inline
  def credit_not_processed: credit_not_processed = "credit_not_processed".asInstanceOf[credit_not_processed]
  @scala.inline
  def custom: custom = "custom".asInstanceOf[custom]
  @scala.inline
  def customer: customer = "customer".asInstanceOf[customer]
  @scala.inline
  def daily: daily = "daily".asInstanceOf[daily]
  @scala.inline
  def day: day = "day".asInstanceOf[day]
  @scala.inline
  def debit: debit = "debit".asInstanceOf[debit]
  @scala.inline
  def debit_not_authorized: debit_not_authorized = "debit_not_authorized".asInstanceOf[debit_not_authorized]
  @scala.inline
  def declined: declined = "declined".asInstanceOf[declined]
  @scala.inline
  def declined_by_network: declined_by_network = "declined_by_network".asInstanceOf[declined_by_network]
  @scala.inline
  def discount: discount = "discount".asInstanceOf[discount]
  @scala.inline
  def dispute: dispute = "dispute".asInstanceOf[dispute]
  @scala.inline
  def dispute_evidence: dispute_evidence = "dispute_evidence".asInstanceOf[dispute_evidence]
  @scala.inline
  def disputed: disputed = "disputed".asInstanceOf[disputed]
  @scala.inline
  def down: down = "down".asInstanceOf[down]
  @scala.inline
  def draft: draft = "draft".asInstanceOf[draft]
  @scala.inline
  def duplicate: duplicate = "duplicate".asInstanceOf[duplicate]
  @scala.inline
  def email: email = "email".asInstanceOf[email]
  @scala.inline
  def ephemeral_key: ephemeral_key = "ephemeral_key".asInstanceOf[ephemeral_key]
  @scala.inline
  def eps: eps = "eps".asInstanceOf[eps]
  @scala.inline
  def errored: errored = "errored".asInstanceOf[errored]
  @scala.inline
  def event: event = "event".asInstanceOf[event]
  @scala.inline
  def exact: exact = "exact".asInstanceOf[exact]
  @scala.inline
  def expired_or_canceled_card: expired_or_canceled_card = "expired_or_canceled_card".asInstanceOf[expired_or_canceled_card]
  @scala.inline
  def fail: fail = "fail".asInstanceOf[fail]
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  @scala.inline
  def failed_invoice: failed_invoice = "failed_invoice".asInstanceOf[failed_invoice]
  @scala.inline
  def female: female = "female".asInstanceOf[female]
  @scala.inline
  def file_upload: file_upload = "file_upload".asInstanceOf[file_upload]
  @scala.inline
  def finite: finite = "finite".asInstanceOf[finite]
  @scala.inline
  def forever: forever = "forever".asInstanceOf[forever]
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
  def graduated: graduated = "graduated".asInstanceOf[graduated]
  @scala.inline
  def ideal: ideal = "ideal".asInstanceOf[ideal]
  @scala.inline
  def idempotency_error: idempotency_error = "idempotency_error".asInstanceOf[idempotency_error]
  @scala.inline
  def identity_document: identity_document = "identity_document".asInstanceOf[identity_document]
  @scala.inline
  def in_stock: in_stock = "in_stock".asInstanceOf[in_stock]
  @scala.inline
  def in_transit: in_transit = "in_transit".asInstanceOf[in_transit]
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
  def infinite: infinite = "infinite".asInstanceOf[infinite]
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
  def invoiceitem: invoiceitem = "invoiceitem".asInstanceOf[invoiceitem]
  @scala.inline
  def issuer_declined: issuer_declined = "issuer_declined".asInstanceOf[issuer_declined]
  @scala.inline
  def jpg: jpg = "jpg".asInstanceOf[jpg]
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
  def manual: manual = "manual".asInstanceOf[manual]
  @scala.inline
  def manual_review: manual_review = "manual_review".asInstanceOf[manual_review]
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
  def needs_response: needs_response = "needs_response".asInstanceOf[needs_response]
  @scala.inline
  def network_cost: network_cost = "network_cost".asInstanceOf[network_cost]
  @scala.inline
  def `new`: `new` = "new".asInstanceOf[`new`]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def not_required: not_required = "not_required".asInstanceOf[not_required]
  @scala.inline
  def not_sent_to_network: not_sent_to_network = "not_sent_to_network".asInstanceOf[not_sent_to_network]
  @scala.inline
  def now: now = "now".asInstanceOf[now]
  @scala.inline
  def offline: offline = "offline".asInstanceOf[offline]
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
  def order_item: order_item = "order_item".asInstanceOf[order_item]
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
  def payment: payment = "payment".asInstanceOf[payment]
  @scala.inline
  def payment_intent: payment_intent = "payment_intent".asInstanceOf[payment_intent]
  @scala.inline
  def payout: payout = "payout".asInstanceOf[payout]
  @scala.inline
  def payout_failure: payout_failure = "payout_failure".asInstanceOf[payout_failure]
  @scala.inline
  def pdf: pdf = "pdf".asInstanceOf[pdf]
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  @scala.inline
  def per_unit: per_unit = "per_unit".asInstanceOf[per_unit]
  @scala.inline
  def plan: plan = "plan".asInstanceOf[plan]
  @scala.inline
  def png: png = "png".asInstanceOf[png]
  @scala.inline
  def prepaid: prepaid = "prepaid".asInstanceOf[prepaid]
  @scala.inline
  def processing: processing = "processing".asInstanceOf[processing]
  @scala.inline
  def processing_error: processing_error = "processing_error".asInstanceOf[processing_error]
  @scala.inline
  def product: product = "product".asInstanceOf[product]
  @scala.inline
  def product_not_received: product_not_received = "product_not_received".asInstanceOf[product_not_received]
  @scala.inline
  def product_unacceptable: product_unacceptable = "product_unacceptable".asInstanceOf[product_unacceptable]
  @scala.inline
  def publishable: publishable = "publishable".asInstanceOf[publishable]
  @scala.inline
  def range: range = "range".asInstanceOf[range]
  @scala.inline
  def receiver: receiver = "receiver".asInstanceOf[receiver]
  @scala.inline
  def redirect: redirect = "redirect".asInstanceOf[redirect]
  @scala.inline
  def redirect_to_url: redirect_to_url = "redirect_to_url".asInstanceOf[redirect_to_url]
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
  def requested: requested = "requested".asInstanceOf[requested]
  @scala.inline
  def requested_by_customer: requested_by_customer = "requested_by_customer".asInstanceOf[requested_by_customer]
  @scala.inline
  def requires_action: requires_action = "requires_action".asInstanceOf[requires_action]
  @scala.inline
  def requires_authorization: requires_authorization = "requires_authorization".asInstanceOf[requires_authorization]
  @scala.inline
  def requires_capture: requires_capture = "requires_capture".asInstanceOf[requires_capture]
  @scala.inline
  def requires_payment_method: requires_payment_method = "requires_payment_method".asInstanceOf[requires_payment_method]
  @scala.inline
  def response_disabled: response_disabled = "response_disabled".asInstanceOf[response_disabled]
  @scala.inline
  def returned: returned = "returned".asInstanceOf[returned]
  @scala.inline
  def reusable: reusable = "reusable".asInstanceOf[reusable]
  @scala.inline
  def reversed_after_approval: reversed_after_approval = "reversed_after_approval".asInstanceOf[reversed_after_approval]
  @scala.inline
  def review: review = "review".asInstanceOf[review]
  @scala.inline
  def rule: rule = "rule".asInstanceOf[rule]
  @scala.inline
  def safe: safe = "safe".asInstanceOf[safe]
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
  def shipping: shipping = "shipping".asInstanceOf[shipping]
  @scala.inline
  def single_use: single_use = "single_use".asInstanceOf[single_use]
  @scala.inline
  def sku: sku = "sku".asInstanceOf[sku]
  @scala.inline
  def sofort: sofort = "sofort".asInstanceOf[sofort]
  @scala.inline
  def source: source = "source".asInstanceOf[source]
  @scala.inline
  def standard: standard = "standard".asInstanceOf[standard]
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
  def tax: tax = "tax".asInstanceOf[tax]
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
  def transfer: transfer = "transfer".asInstanceOf[transfer]
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
  def unknown: unknown = "unknown".asInstanceOf[unknown]
  @scala.inline
  def unpaid: unpaid = "unpaid".asInstanceOf[unpaid]
  @scala.inline
  def unrecognized: unrecognized = "unrecognized".asInstanceOf[unrecognized]
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
  def void: void = "void".asInstanceOf[void]
  @scala.inline
  def volume: volume = "volume".asInstanceOf[volume]
  @scala.inline
  def warning_closed: warning_closed = "warning_closed".asInstanceOf[warning_closed]
  @scala.inline
  def warning_needs_response: warning_needs_response = "warning_needs_response".asInstanceOf[warning_needs_response]
  @scala.inline
  def warning_under_review: warning_under_review = "warning_under_review".asInstanceOf[warning_under_review]
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
}

