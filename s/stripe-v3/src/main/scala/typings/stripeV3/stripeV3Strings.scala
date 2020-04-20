package typings.stripeV3

import typings.stripeV3.stripe.ErrorType
import typings.stripeV3.stripe.billingAddressCollectionType
import typings.stripeV3.stripe.brandType
import typings.stripeV3.stripe.checkType
import typings.stripeV3.stripe.elements.elementsType
import typings.stripeV3.stripe.elements.eventTypes
import typings.stripeV3.stripe.fundingType
import typings.stripeV3.stripe.paymentIntents.PaymentIntentCancelationReason
import typings.stripeV3.stripe.paymentIntents.PaymentIntentStatus
import typings.stripeV3.stripe.paymentMethod.paymentMethodCardBrand
import typings.stripeV3.stripe.paymentMethod.paymentMethodType
import typings.stripeV3.stripe.setupIntents.SetupIntentCancelationReason
import typings.stripeV3.stripe.setupIntents.SetupIntentStatus
import typings.stripeV3.stripe.statusType
import typings.stripeV3.stripe.tokenizationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object stripeV3Strings {
  @js.native
  sealed trait `American Express` extends brandType
  
  @js.native
  sealed trait `Diners Club` extends brandType
  
  @js.native
  sealed trait Discover extends brandType
  
  @js.native
  sealed trait JCB extends brandType
  
  @js.native
  sealed trait MasterCard extends brandType
  
  @js.native
  sealed trait Unknown extends brandType
  
  @js.native
  sealed trait Visa extends brandType
  
  @js.native
  sealed trait _empty extends billingAddressCollectionType
  
  @js.native
  sealed trait abandoned
    extends PaymentIntentCancelationReason
       with SetupIntentCancelationReason
  
  @js.native
  sealed trait abn_amro extends js.Object
  
  @js.native
  sealed trait accepted extends js.Object
  
  @js.native
  sealed trait ach_credit_transfer extends js.Object
  
  @js.native
  sealed trait ach_debit extends js.Object
  
  @js.native
  sealed trait alipay extends js.Object
  
  @js.native
  sealed trait amex extends paymentMethodCardBrand
  
  @js.native
  sealed trait amex_express_checkout extends js.Object
  
  @js.native
  sealed trait android_pay extends tokenizationType
  
  @js.native
  sealed trait api_connection_error extends ErrorType
  
  @js.native
  sealed trait api_error extends ErrorType
  
  @js.native
  sealed trait apple_pay extends tokenizationType
  
  @js.native
  sealed trait approved_by_network extends js.Object
  
  @js.native
  sealed trait asn_bank extends js.Object
  
  @js.native
  sealed trait authentication_error extends ErrorType
  
  @js.native
  sealed trait authorized extends js.Object
  
  @js.native
  sealed trait auto extends billingAddressCollectionType
  
  @js.native
  sealed trait automatic extends PaymentIntentCancelationReason
  
  @js.native
  sealed trait bancontact extends js.Object
  
  @js.native
  sealed trait bank_account extends js.Object
  
  @js.native
  sealed trait blocked extends js.Object
  
  @js.native
  sealed trait blur extends eventTypes
  
  @js.native
  sealed trait bunq extends js.Object
  
  @js.native
  sealed trait buy extends js.Object
  
  @js.native
  sealed trait cancel extends js.Object
  
  @js.native
  sealed trait canceled
    extends PaymentIntentStatus
       with SetupIntentStatus
  
  @js.native
  sealed trait card
    extends elementsType
       with paymentMethodType
  
  @js.native
  sealed trait cardCvc extends elementsType
  
  @js.native
  sealed trait cardExpiry extends elementsType
  
  @js.native
  sealed trait cardNumber extends elementsType
  
  @js.native
  sealed trait card_error extends ErrorType
  
  @js.native
  sealed trait card_present extends paymentMethodType
  
  @js.native
  sealed trait change extends eventTypes
  
  @js.native
  sealed trait charge extends js.Object
  
  @js.native
  sealed trait click extends js.Object
  
  @js.native
  sealed trait code_verification extends js.Object
  
  @js.native
  sealed trait company extends js.Object
  
  @js.native
  sealed trait credit extends fundingType
  
  @js.native
  sealed trait dark extends js.Object
  
  @js.native
  sealed trait de extends js.Object
  
  @js.native
  sealed trait debit extends fundingType
  
  @js.native
  sealed trait declined_by_network extends js.Object
  
  @js.native
  sealed trait default extends js.Object
  
  @js.native
  sealed trait diners extends paymentMethodCardBrand
  
  @js.native
  sealed trait discover_ extends paymentMethodCardBrand
  
  @js.native
  sealed trait donate extends js.Object
  
  @js.native
  sealed trait duplicate
    extends PaymentIntentCancelationReason
       with SetupIntentCancelationReason
  
  @js.native
  sealed trait elevated extends js.Object
  
  @js.native
  sealed trait elevated_risk_level extends js.Object
  
  @js.native
  sealed trait email extends js.Object
  
  @js.native
  sealed trait en extends js.Object
  
  @js.native
  sealed trait eps extends js.Object
  
  @js.native
  sealed trait errored extends statusType
  
  @js.native
  sealed trait es extends js.Object
  
  @js.native
  sealed trait expired_or_canceled_card extends js.Object
  
  @js.native
  sealed trait fail extends checkType
  
  @js.native
  sealed trait failed extends js.Object
  
  @js.native
  sealed trait failed_invoice extends PaymentIntentCancelationReason
  
  @js.native
  sealed trait focus extends eventTypes
  
  @js.native
  sealed trait fr extends js.Object
  
  @js.native
  sealed trait fraudulent extends PaymentIntentCancelationReason
  
  @js.native
  sealed trait giropay extends js.Object
  
  @js.native
  sealed trait google_pay extends js.Object
  
  @js.native
  sealed trait handelsbanken extends js.Object
  
  @js.native
  sealed trait highest extends js.Object
  
  @js.native
  sealed trait highest_risk_level extends js.Object
  
  @js.native
  sealed trait iban extends elementsType
  
  @js.native
  sealed trait ideal extends js.Object
  
  @js.native
  sealed trait idealBank extends elementsType
  
  @js.native
  sealed trait idempotency_error extends ErrorType
  
  @js.native
  sealed trait individual extends js.Object
  
  @js.native
  sealed trait ing extends js.Object
  
  @js.native
  sealed trait invalid extends js.Object
  
  @js.native
  sealed trait invalid_request_error extends ErrorType
  
  @js.native
  sealed trait invalid_shipping_address extends js.Object
  
  @js.native
  sealed trait issuer_declined extends js.Object
  
  @js.native
  sealed trait it extends js.Object
  
  @js.native
  sealed trait jcb_ extends paymentMethodCardBrand
  
  @js.native
  sealed trait knab extends js.Object
  
  @js.native
  sealed trait light extends js.Object
  
  @js.native
  sealed trait `light-outline` extends js.Object
  
  @js.native
  sealed trait list extends js.Object
  
  @js.native
  sealed trait lost_or_stolen_card extends js.Object
  
  @js.native
  sealed trait manual extends js.Object
  
  @js.native
  sealed trait manual_review extends js.Object
  
  @js.native
  sealed trait mastercard_ extends paymentMethodCardBrand
  
  @js.native
  sealed trait masterpass extends js.Object
  
  @js.native
  sealed trait moneyou extends js.Object
  
  @js.native
  sealed trait multibanco extends js.Object
  
  @js.native
  sealed trait `new` extends statusType
  
  @js.native
  sealed trait nl extends js.Object
  
  @js.native
  sealed trait none extends js.Object
  
  @js.native
  sealed trait normal extends js.Object
  
  @js.native
  sealed trait not_assessed extends js.Object
  
  @js.native
  sealed trait not_sent_to_network extends js.Object
  
  @js.native
  sealed trait not_supported extends js.Object
  
  @js.native
  sealed trait off_session extends js.Object
  
  @js.native
  sealed trait offline extends js.Object
  
  @js.native
  sealed trait on_session extends js.Object
  
  @js.native
  sealed trait one_time extends js.Object
  
  @js.native
  sealed trait online extends js.Object
  
  @js.native
  sealed trait optional extends js.Object
  
  @js.native
  sealed trait p24 extends js.Object
  
  @js.native
  sealed trait pass extends checkType
  
  @js.native
  sealed trait paymentRequestButton extends elementsType
  
  @js.native
  sealed trait payment_intent extends js.Object
  
  @js.native
  sealed trait payment_method extends js.Object
  
  @js.native
  sealed trait paymentmethod extends js.Object
  
  @js.native
  sealed trait pending extends js.Object
  
  @js.native
  sealed trait pii extends js.Object
  
  @js.native
  sealed trait pl extends js.Object
  
  @js.native
  sealed trait postalCode extends elementsType
  
  @js.native
  sealed trait prepaid extends fundingType
  
  @js.native
  sealed trait processing
    extends PaymentIntentStatus
       with SetupIntentStatus
  
  @js.native
  sealed trait rabobank extends js.Object
  
  @js.native
  sealed trait rate_limit_error extends ErrorType
  
  @js.native
  sealed trait ready extends eventTypes
  
  @js.native
  sealed trait receiver extends js.Object
  
  @js.native
  sealed trait recommended extends js.Object
  
  @js.native
  sealed trait redirect extends js.Object
  
  @js.native
  sealed trait redirect_to_url extends js.Object
  
  @js.native
  sealed trait refund extends js.Object
  
  @js.native
  sealed trait refused extends js.Object
  
  @js.native
  sealed trait regiobank extends js.Object
  
  @js.native
  sealed trait requested_by_customer
    extends PaymentIntentCancelationReason
       with SetupIntentCancelationReason
  
  @js.native
  sealed trait required extends billingAddressCollectionType
  
  @js.native
  sealed trait requires_action
    extends PaymentIntentStatus
       with SetupIntentStatus
  
  @js.native
  sealed trait requires_capture extends PaymentIntentStatus
  
  @js.native
  sealed trait requires_confirmation
    extends PaymentIntentStatus
       with SetupIntentStatus
  
  @js.native
  sealed trait requires_payment_method
    extends PaymentIntentStatus
       with SetupIntentStatus
  
  @js.native
  sealed trait reusable extends js.Object
  
  @js.native
  sealed trait reversed_after_approval extends js.Object
  
  @js.native
  sealed trait rule extends js.Object
  
  @js.native
  sealed trait safe extends js.Object
  
  @js.native
  sealed trait samsung_pay extends js.Object
  
  @js.native
  sealed trait scheduled extends js.Object
  
  @js.native
  sealed trait sepa_debit extends js.Object
  
  @js.native
  sealed trait setup_intent extends js.Object
  
  @js.native
  sealed trait shippingaddresschange extends js.Object
  
  @js.native
  sealed trait shippingoptionchange extends js.Object
  
  @js.native
  sealed trait single_use extends js.Object
  
  @js.native
  sealed trait sns_bank extends js.Object
  
  @js.native
  sealed trait sofort extends js.Object
  
  @js.native
  sealed trait solid extends js.Object
  
  @js.native
  sealed trait source extends js.Object
  
  @js.native
  sealed trait stripe_account extends js.Object
  
  @js.native
  sealed trait succeeded
    extends PaymentIntentStatus
       with SetupIntentStatus
  
  @js.native
  sealed trait success extends js.Object
  
  @js.native
  sealed trait token extends js.Object
  
  @js.native
  sealed trait triodos_bank extends js.Object
  
  @js.native
  sealed trait unavailable extends checkType
  
  @js.native
  sealed trait unchecked extends checkType
  
  @js.native
  sealed trait unionpay extends paymentMethodCardBrand
  
  @js.native
  sealed trait unknown_
    extends fundingType
       with paymentMethodCardBrand
  
  @js.native
  sealed trait use_stripe_sdk extends js.Object
  
  @js.native
  sealed trait validated extends statusType
  
  @js.native
  sealed trait validation_error extends ErrorType
  
  @js.native
  sealed trait van_lanschot extends js.Object
  
  @js.native
  sealed trait variable extends js.Object
  
  @js.native
  sealed trait verification_failed extends statusType
  
  @js.native
  sealed trait verified extends statusType
  
  @js.native
  sealed trait visa_ extends paymentMethodCardBrand
  
  @js.native
  sealed trait visa_checkout extends js.Object
  
  @js.native
  sealed trait void_invoice extends PaymentIntentCancelationReason
  
  @js.native
  sealed trait wechat extends js.Object
  
  @scala.inline
  def `American Express`: `American Express` = ("American Express").asInstanceOf[`American Express`]
  @scala.inline
  def `Diners Club`: `Diners Club` = ("Diners Club").asInstanceOf[`Diners Club`]
  @scala.inline
  def Discover: Discover = "Discover".asInstanceOf[Discover]
  @scala.inline
  def JCB: JCB = "JCB".asInstanceOf[JCB]
  @scala.inline
  def MasterCard: MasterCard = "MasterCard".asInstanceOf[MasterCard]
  @scala.inline
  def Unknown: Unknown = "Unknown".asInstanceOf[Unknown]
  @scala.inline
  def Visa: Visa = "Visa".asInstanceOf[Visa]
  @scala.inline
  def _empty: _empty = "".asInstanceOf[_empty]
  @scala.inline
  def abandoned: abandoned = "abandoned".asInstanceOf[abandoned]
  @scala.inline
  def abn_amro: abn_amro = "abn_amro".asInstanceOf[abn_amro]
  @scala.inline
  def accepted: accepted = "accepted".asInstanceOf[accepted]
  @scala.inline
  def ach_credit_transfer: ach_credit_transfer = "ach_credit_transfer".asInstanceOf[ach_credit_transfer]
  @scala.inline
  def ach_debit: ach_debit = "ach_debit".asInstanceOf[ach_debit]
  @scala.inline
  def alipay: alipay = "alipay".asInstanceOf[alipay]
  @scala.inline
  def amex: amex = "amex".asInstanceOf[amex]
  @scala.inline
  def amex_express_checkout: amex_express_checkout = "amex_express_checkout".asInstanceOf[amex_express_checkout]
  @scala.inline
  def android_pay: android_pay = "android_pay".asInstanceOf[android_pay]
  @scala.inline
  def api_connection_error: api_connection_error = "api_connection_error".asInstanceOf[api_connection_error]
  @scala.inline
  def api_error: api_error = "api_error".asInstanceOf[api_error]
  @scala.inline
  def apple_pay: apple_pay = "apple_pay".asInstanceOf[apple_pay]
  @scala.inline
  def approved_by_network: approved_by_network = "approved_by_network".asInstanceOf[approved_by_network]
  @scala.inline
  def asn_bank: asn_bank = "asn_bank".asInstanceOf[asn_bank]
  @scala.inline
  def authentication_error: authentication_error = "authentication_error".asInstanceOf[authentication_error]
  @scala.inline
  def authorized: authorized = "authorized".asInstanceOf[authorized]
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  @scala.inline
  def automatic: automatic = "automatic".asInstanceOf[automatic]
  @scala.inline
  def bancontact: bancontact = "bancontact".asInstanceOf[bancontact]
  @scala.inline
  def bank_account: bank_account = "bank_account".asInstanceOf[bank_account]
  @scala.inline
  def blocked: blocked = "blocked".asInstanceOf[blocked]
  @scala.inline
  def blur: blur = "blur".asInstanceOf[blur]
  @scala.inline
  def bunq: bunq = "bunq".asInstanceOf[bunq]
  @scala.inline
  def buy: buy = "buy".asInstanceOf[buy]
  @scala.inline
  def cancel: cancel = "cancel".asInstanceOf[cancel]
  @scala.inline
  def canceled: canceled = "canceled".asInstanceOf[canceled]
  @scala.inline
  def card: card = "card".asInstanceOf[card]
  @scala.inline
  def cardCvc: cardCvc = "cardCvc".asInstanceOf[cardCvc]
  @scala.inline
  def cardExpiry: cardExpiry = "cardExpiry".asInstanceOf[cardExpiry]
  @scala.inline
  def cardNumber: cardNumber = "cardNumber".asInstanceOf[cardNumber]
  @scala.inline
  def card_error: card_error = "card_error".asInstanceOf[card_error]
  @scala.inline
  def card_present: card_present = "card_present".asInstanceOf[card_present]
  @scala.inline
  def change: change = "change".asInstanceOf[change]
  @scala.inline
  def charge: charge = "charge".asInstanceOf[charge]
  @scala.inline
  def click: click = "click".asInstanceOf[click]
  @scala.inline
  def code_verification: code_verification = "code_verification".asInstanceOf[code_verification]
  @scala.inline
  def company: company = "company".asInstanceOf[company]
  @scala.inline
  def credit: credit = "credit".asInstanceOf[credit]
  @scala.inline
  def dark: dark = "dark".asInstanceOf[dark]
  @scala.inline
  def de: de = "de".asInstanceOf[de]
  @scala.inline
  def debit: debit = "debit".asInstanceOf[debit]
  @scala.inline
  def declined_by_network: declined_by_network = "declined_by_network".asInstanceOf[declined_by_network]
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  @scala.inline
  def diners: diners = "diners".asInstanceOf[diners]
  @scala.inline
  def discover_ : discover_ = "discover".asInstanceOf[discover_]
  @scala.inline
  def donate: donate = "donate".asInstanceOf[donate]
  @scala.inline
  def duplicate: duplicate = "duplicate".asInstanceOf[duplicate]
  @scala.inline
  def elevated: elevated = "elevated".asInstanceOf[elevated]
  @scala.inline
  def elevated_risk_level: elevated_risk_level = "elevated_risk_level".asInstanceOf[elevated_risk_level]
  @scala.inline
  def email: email = "email".asInstanceOf[email]
  @scala.inline
  def en: en = "en".asInstanceOf[en]
  @scala.inline
  def eps: eps = "eps".asInstanceOf[eps]
  @scala.inline
  def errored: errored = "errored".asInstanceOf[errored]
  @scala.inline
  def es: es = "es".asInstanceOf[es]
  @scala.inline
  def expired_or_canceled_card: expired_or_canceled_card = "expired_or_canceled_card".asInstanceOf[expired_or_canceled_card]
  @scala.inline
  def fail: fail = "fail".asInstanceOf[fail]
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  @scala.inline
  def failed_invoice: failed_invoice = "failed_invoice".asInstanceOf[failed_invoice]
  @scala.inline
  def focus: focus = "focus".asInstanceOf[focus]
  @scala.inline
  def fr: fr = "fr".asInstanceOf[fr]
  @scala.inline
  def fraudulent: fraudulent = "fraudulent".asInstanceOf[fraudulent]
  @scala.inline
  def giropay: giropay = "giropay".asInstanceOf[giropay]
  @scala.inline
  def google_pay: google_pay = "google_pay".asInstanceOf[google_pay]
  @scala.inline
  def handelsbanken: handelsbanken = "handelsbanken".asInstanceOf[handelsbanken]
  @scala.inline
  def highest: highest = "highest".asInstanceOf[highest]
  @scala.inline
  def highest_risk_level: highest_risk_level = "highest_risk_level".asInstanceOf[highest_risk_level]
  @scala.inline
  def iban: iban = "iban".asInstanceOf[iban]
  @scala.inline
  def ideal: ideal = "ideal".asInstanceOf[ideal]
  @scala.inline
  def idealBank: idealBank = "idealBank".asInstanceOf[idealBank]
  @scala.inline
  def idempotency_error: idempotency_error = "idempotency_error".asInstanceOf[idempotency_error]
  @scala.inline
  def individual: individual = "individual".asInstanceOf[individual]
  @scala.inline
  def ing: ing = "ing".asInstanceOf[ing]
  @scala.inline
  def invalid: invalid = "invalid".asInstanceOf[invalid]
  @scala.inline
  def invalid_request_error: invalid_request_error = "invalid_request_error".asInstanceOf[invalid_request_error]
  @scala.inline
  def invalid_shipping_address: invalid_shipping_address = "invalid_shipping_address".asInstanceOf[invalid_shipping_address]
  @scala.inline
  def issuer_declined: issuer_declined = "issuer_declined".asInstanceOf[issuer_declined]
  @scala.inline
  def it: it = "it".asInstanceOf[it]
  @scala.inline
  def jcb_ : jcb_ = "jcb".asInstanceOf[jcb_]
  @scala.inline
  def knab: knab = "knab".asInstanceOf[knab]
  @scala.inline
  def light: light = "light".asInstanceOf[light]
  @scala.inline
  def `light-outline`: `light-outline` = "light-outline".asInstanceOf[`light-outline`]
  @scala.inline
  def list: list = "list".asInstanceOf[list]
  @scala.inline
  def lost_or_stolen_card: lost_or_stolen_card = "lost_or_stolen_card".asInstanceOf[lost_or_stolen_card]
  @scala.inline
  def manual: manual = "manual".asInstanceOf[manual]
  @scala.inline
  def manual_review: manual_review = "manual_review".asInstanceOf[manual_review]
  @scala.inline
  def mastercard_ : mastercard_ = "mastercard".asInstanceOf[mastercard_]
  @scala.inline
  def masterpass: masterpass = "masterpass".asInstanceOf[masterpass]
  @scala.inline
  def moneyou: moneyou = "moneyou".asInstanceOf[moneyou]
  @scala.inline
  def multibanco: multibanco = "multibanco".asInstanceOf[multibanco]
  @scala.inline
  def `new`: `new` = "new".asInstanceOf[`new`]
  @scala.inline
  def nl: nl = "nl".asInstanceOf[nl]
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  @scala.inline
  def not_assessed: not_assessed = "not_assessed".asInstanceOf[not_assessed]
  @scala.inline
  def not_sent_to_network: not_sent_to_network = "not_sent_to_network".asInstanceOf[not_sent_to_network]
  @scala.inline
  def not_supported: not_supported = "not_supported".asInstanceOf[not_supported]
  @scala.inline
  def off_session: off_session = "off_session".asInstanceOf[off_session]
  @scala.inline
  def offline: offline = "offline".asInstanceOf[offline]
  @scala.inline
  def on_session: on_session = "on_session".asInstanceOf[on_session]
  @scala.inline
  def one_time: one_time = "one_time".asInstanceOf[one_time]
  @scala.inline
  def online: online = "online".asInstanceOf[online]
  @scala.inline
  def optional: optional = "optional".asInstanceOf[optional]
  @scala.inline
  def p24: p24 = "p24".asInstanceOf[p24]
  @scala.inline
  def pass: pass = "pass".asInstanceOf[pass]
  @scala.inline
  def paymentRequestButton: paymentRequestButton = "paymentRequestButton".asInstanceOf[paymentRequestButton]
  @scala.inline
  def payment_intent: payment_intent = "payment_intent".asInstanceOf[payment_intent]
  @scala.inline
  def payment_method: payment_method = "payment_method".asInstanceOf[payment_method]
  @scala.inline
  def paymentmethod: paymentmethod = "paymentmethod".asInstanceOf[paymentmethod]
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  @scala.inline
  def pii: pii = "pii".asInstanceOf[pii]
  @scala.inline
  def pl: pl = "pl".asInstanceOf[pl]
  @scala.inline
  def postalCode: postalCode = "postalCode".asInstanceOf[postalCode]
  @scala.inline
  def prepaid: prepaid = "prepaid".asInstanceOf[prepaid]
  @scala.inline
  def processing: processing = "processing".asInstanceOf[processing]
  @scala.inline
  def rabobank: rabobank = "rabobank".asInstanceOf[rabobank]
  @scala.inline
  def rate_limit_error: rate_limit_error = "rate_limit_error".asInstanceOf[rate_limit_error]
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
  @scala.inline
  def receiver: receiver = "receiver".asInstanceOf[receiver]
  @scala.inline
  def recommended: recommended = "recommended".asInstanceOf[recommended]
  @scala.inline
  def redirect: redirect = "redirect".asInstanceOf[redirect]
  @scala.inline
  def redirect_to_url: redirect_to_url = "redirect_to_url".asInstanceOf[redirect_to_url]
  @scala.inline
  def refund: refund = "refund".asInstanceOf[refund]
  @scala.inline
  def refused: refused = "refused".asInstanceOf[refused]
  @scala.inline
  def regiobank: regiobank = "regiobank".asInstanceOf[regiobank]
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
  def reusable: reusable = "reusable".asInstanceOf[reusable]
  @scala.inline
  def reversed_after_approval: reversed_after_approval = "reversed_after_approval".asInstanceOf[reversed_after_approval]
  @scala.inline
  def rule: rule = "rule".asInstanceOf[rule]
  @scala.inline
  def safe: safe = "safe".asInstanceOf[safe]
  @scala.inline
  def samsung_pay: samsung_pay = "samsung_pay".asInstanceOf[samsung_pay]
  @scala.inline
  def scheduled: scheduled = "scheduled".asInstanceOf[scheduled]
  @scala.inline
  def sepa_debit: sepa_debit = "sepa_debit".asInstanceOf[sepa_debit]
  @scala.inline
  def setup_intent: setup_intent = "setup_intent".asInstanceOf[setup_intent]
  @scala.inline
  def shippingaddresschange: shippingaddresschange = "shippingaddresschange".asInstanceOf[shippingaddresschange]
  @scala.inline
  def shippingoptionchange: shippingoptionchange = "shippingoptionchange".asInstanceOf[shippingoptionchange]
  @scala.inline
  def single_use: single_use = "single_use".asInstanceOf[single_use]
  @scala.inline
  def sns_bank: sns_bank = "sns_bank".asInstanceOf[sns_bank]
  @scala.inline
  def sofort: sofort = "sofort".asInstanceOf[sofort]
  @scala.inline
  def solid: solid = "solid".asInstanceOf[solid]
  @scala.inline
  def source: source = "source".asInstanceOf[source]
  @scala.inline
  def stripe_account: stripe_account = "stripe_account".asInstanceOf[stripe_account]
  @scala.inline
  def succeeded: succeeded = "succeeded".asInstanceOf[succeeded]
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  @scala.inline
  def token: token = "token".asInstanceOf[token]
  @scala.inline
  def triodos_bank: triodos_bank = "triodos_bank".asInstanceOf[triodos_bank]
  @scala.inline
  def unavailable: unavailable = "unavailable".asInstanceOf[unavailable]
  @scala.inline
  def unchecked: unchecked = "unchecked".asInstanceOf[unchecked]
  @scala.inline
  def unionpay: unionpay = "unionpay".asInstanceOf[unionpay]
  @scala.inline
  def unknown_ : unknown_ = "unknown".asInstanceOf[unknown_]
  @scala.inline
  def use_stripe_sdk: use_stripe_sdk = "use_stripe_sdk".asInstanceOf[use_stripe_sdk]
  @scala.inline
  def validated: validated = "validated".asInstanceOf[validated]
  @scala.inline
  def validation_error: validation_error = "validation_error".asInstanceOf[validation_error]
  @scala.inline
  def van_lanschot: van_lanschot = "van_lanschot".asInstanceOf[van_lanschot]
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
  def void_invoice: void_invoice = "void_invoice".asInstanceOf[void_invoice]
  @scala.inline
  def wechat: wechat = "wechat".asInstanceOf[wechat]
}

