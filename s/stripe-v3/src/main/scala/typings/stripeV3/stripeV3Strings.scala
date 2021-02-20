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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stripeV3Strings {
  
  @js.native
  sealed trait default extends StObject
  @scala.inline
  def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait `American Express` extends brandType
  @scala.inline
  def `American Express`: `American Express` = ("American Express").asInstanceOf[`American Express`]
  
  @js.native
  sealed trait `Diners Club` extends brandType
  @scala.inline
  def `Diners Club`: `Diners Club` = ("Diners Club").asInstanceOf[`Diners Club`]
  
  @js.native
  sealed trait Discover extends brandType
  @scala.inline
  def Discover: Discover = "Discover".asInstanceOf[Discover]
  
  @js.native
  sealed trait JCB extends brandType
  @scala.inline
  def JCB: JCB = "JCB".asInstanceOf[JCB]
  
  @js.native
  sealed trait MasterCard extends brandType
  @scala.inline
  def MasterCard: MasterCard = "MasterCard".asInstanceOf[MasterCard]
  
  @js.native
  sealed trait Unknown extends brandType
  @scala.inline
  def Unknown: Unknown = "Unknown".asInstanceOf[Unknown]
  
  @js.native
  sealed trait Visa extends brandType
  @scala.inline
  def Visa: Visa = "Visa".asInstanceOf[Visa]
  
  @js.native
  sealed trait _empty extends billingAddressCollectionType
  @scala.inline
  def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait abandoned
    extends PaymentIntentCancelationReason
       with SetupIntentCancelationReason
  @scala.inline
  def abandoned: abandoned = "abandoned".asInstanceOf[abandoned]
  
  @js.native
  sealed trait abn_amro extends StObject
  @scala.inline
  def abn_amro: abn_amro = "abn_amro".asInstanceOf[abn_amro]
  
  @js.native
  sealed trait accepted extends StObject
  @scala.inline
  def accepted: accepted = "accepted".asInstanceOf[accepted]
  
  @js.native
  sealed trait ach_credit_transfer extends StObject
  @scala.inline
  def ach_credit_transfer: ach_credit_transfer = "ach_credit_transfer".asInstanceOf[ach_credit_transfer]
  
  @js.native
  sealed trait ach_debit extends StObject
  @scala.inline
  def ach_debit: ach_debit = "ach_debit".asInstanceOf[ach_debit]
  
  @js.native
  sealed trait alipay extends StObject
  @scala.inline
  def alipay: alipay = "alipay".asInstanceOf[alipay]
  
  @js.native
  sealed trait amex extends paymentMethodCardBrand
  @scala.inline
  def amex: amex = "amex".asInstanceOf[amex]
  
  @js.native
  sealed trait amex_express_checkout extends StObject
  @scala.inline
  def amex_express_checkout: amex_express_checkout = "amex_express_checkout".asInstanceOf[amex_express_checkout]
  
  @js.native
  sealed trait android_pay extends tokenizationType
  @scala.inline
  def android_pay: android_pay = "android_pay".asInstanceOf[android_pay]
  
  @js.native
  sealed trait api_connection_error extends ErrorType
  @scala.inline
  def api_connection_error: api_connection_error = "api_connection_error".asInstanceOf[api_connection_error]
  
  @js.native
  sealed trait api_error extends ErrorType
  @scala.inline
  def api_error: api_error = "api_error".asInstanceOf[api_error]
  
  @js.native
  sealed trait apple_pay extends tokenizationType
  @scala.inline
  def apple_pay: apple_pay = "apple_pay".asInstanceOf[apple_pay]
  
  @js.native
  sealed trait approved_by_network extends StObject
  @scala.inline
  def approved_by_network: approved_by_network = "approved_by_network".asInstanceOf[approved_by_network]
  
  @js.native
  sealed trait asn_bank extends StObject
  @scala.inline
  def asn_bank: asn_bank = "asn_bank".asInstanceOf[asn_bank]
  
  @js.native
  sealed trait authentication_error extends ErrorType
  @scala.inline
  def authentication_error: authentication_error = "authentication_error".asInstanceOf[authentication_error]
  
  @js.native
  sealed trait authorized extends StObject
  @scala.inline
  def authorized: authorized = "authorized".asInstanceOf[authorized]
  
  @js.native
  sealed trait auto extends billingAddressCollectionType
  @scala.inline
  def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait automatic extends PaymentIntentCancelationReason
  @scala.inline
  def automatic: automatic = "automatic".asInstanceOf[automatic]
  
  @js.native
  sealed trait bancontact extends StObject
  @scala.inline
  def bancontact: bancontact = "bancontact".asInstanceOf[bancontact]
  
  @js.native
  sealed trait bank_account extends StObject
  @scala.inline
  def bank_account: bank_account = "bank_account".asInstanceOf[bank_account]
  
  @js.native
  sealed trait blocked extends StObject
  @scala.inline
  def blocked: blocked = "blocked".asInstanceOf[blocked]
  
  @js.native
  sealed trait blur extends eventTypes
  @scala.inline
  def blur: blur = "blur".asInstanceOf[blur]
  
  @js.native
  sealed trait bunq extends StObject
  @scala.inline
  def bunq: bunq = "bunq".asInstanceOf[bunq]
  
  @js.native
  sealed trait buy extends StObject
  @scala.inline
  def buy: buy = "buy".asInstanceOf[buy]
  
  @js.native
  sealed trait cancel extends StObject
  @scala.inline
  def cancel: cancel = "cancel".asInstanceOf[cancel]
  
  @js.native
  sealed trait canceled
    extends PaymentIntentStatus
       with SetupIntentStatus
  @scala.inline
  def canceled: canceled = "canceled".asInstanceOf[canceled]
  
  @js.native
  sealed trait card
    extends elementsType
       with paymentMethodType
  @scala.inline
  def card: card = "card".asInstanceOf[card]
  
  @js.native
  sealed trait cardCvc extends elementsType
  @scala.inline
  def cardCvc: cardCvc = "cardCvc".asInstanceOf[cardCvc]
  
  @js.native
  sealed trait cardExpiry extends elementsType
  @scala.inline
  def cardExpiry: cardExpiry = "cardExpiry".asInstanceOf[cardExpiry]
  
  @js.native
  sealed trait cardNumber extends elementsType
  @scala.inline
  def cardNumber: cardNumber = "cardNumber".asInstanceOf[cardNumber]
  
  @js.native
  sealed trait card_error extends ErrorType
  @scala.inline
  def card_error: card_error = "card_error".asInstanceOf[card_error]
  
  @js.native
  sealed trait card_present extends paymentMethodType
  @scala.inline
  def card_present: card_present = "card_present".asInstanceOf[card_present]
  
  @js.native
  sealed trait change extends eventTypes
  @scala.inline
  def change: change = "change".asInstanceOf[change]
  
  @js.native
  sealed trait charge extends StObject
  @scala.inline
  def charge: charge = "charge".asInstanceOf[charge]
  
  @js.native
  sealed trait click extends StObject
  @scala.inline
  def click: click = "click".asInstanceOf[click]
  
  @js.native
  sealed trait code_verification extends StObject
  @scala.inline
  def code_verification: code_verification = "code_verification".asInstanceOf[code_verification]
  
  @js.native
  sealed trait company extends StObject
  @scala.inline
  def company: company = "company".asInstanceOf[company]
  
  @js.native
  sealed trait credit extends fundingType
  @scala.inline
  def credit: credit = "credit".asInstanceOf[credit]
  
  @js.native
  sealed trait dark extends StObject
  @scala.inline
  def dark: dark = "dark".asInstanceOf[dark]
  
  @js.native
  sealed trait de extends StObject
  @scala.inline
  def de: de = "de".asInstanceOf[de]
  
  @js.native
  sealed trait debit extends fundingType
  @scala.inline
  def debit: debit = "debit".asInstanceOf[debit]
  
  @js.native
  sealed trait declined_by_network extends StObject
  @scala.inline
  def declined_by_network: declined_by_network = "declined_by_network".asInstanceOf[declined_by_network]
  
  @js.native
  sealed trait diners extends paymentMethodCardBrand
  @scala.inline
  def diners: diners = "diners".asInstanceOf[diners]
  
  @js.native
  sealed trait discover_ extends paymentMethodCardBrand
  @scala.inline
  def discover_ : discover_ = "discover".asInstanceOf[discover_]
  
  @js.native
  sealed trait donate extends StObject
  @scala.inline
  def donate: donate = "donate".asInstanceOf[donate]
  
  @js.native
  sealed trait duplicate
    extends PaymentIntentCancelationReason
       with SetupIntentCancelationReason
  @scala.inline
  def duplicate: duplicate = "duplicate".asInstanceOf[duplicate]
  
  @js.native
  sealed trait elevated extends StObject
  @scala.inline
  def elevated: elevated = "elevated".asInstanceOf[elevated]
  
  @js.native
  sealed trait elevated_risk_level extends StObject
  @scala.inline
  def elevated_risk_level: elevated_risk_level = "elevated_risk_level".asInstanceOf[elevated_risk_level]
  
  @js.native
  sealed trait email extends StObject
  @scala.inline
  def email: email = "email".asInstanceOf[email]
  
  @js.native
  sealed trait en extends StObject
  @scala.inline
  def en: en = "en".asInstanceOf[en]
  
  @js.native
  sealed trait eps extends StObject
  @scala.inline
  def eps: eps = "eps".asInstanceOf[eps]
  
  @js.native
  sealed trait errored extends statusType
  @scala.inline
  def errored: errored = "errored".asInstanceOf[errored]
  
  @js.native
  sealed trait es extends StObject
  @scala.inline
  def es: es = "es".asInstanceOf[es]
  
  @js.native
  sealed trait expired_or_canceled_card extends StObject
  @scala.inline
  def expired_or_canceled_card: expired_or_canceled_card = "expired_or_canceled_card".asInstanceOf[expired_or_canceled_card]
  
  @js.native
  sealed trait fail extends checkType
  @scala.inline
  def fail: fail = "fail".asInstanceOf[fail]
  
  @js.native
  sealed trait failed extends StObject
  @scala.inline
  def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait failed_invoice extends PaymentIntentCancelationReason
  @scala.inline
  def failed_invoice: failed_invoice = "failed_invoice".asInstanceOf[failed_invoice]
  
  @js.native
  sealed trait focus extends eventTypes
  @scala.inline
  def focus: focus = "focus".asInstanceOf[focus]
  
  @js.native
  sealed trait fr extends StObject
  @scala.inline
  def fr: fr = "fr".asInstanceOf[fr]
  
  @js.native
  sealed trait fraudulent extends PaymentIntentCancelationReason
  @scala.inline
  def fraudulent: fraudulent = "fraudulent".asInstanceOf[fraudulent]
  
  @js.native
  sealed trait giropay extends StObject
  @scala.inline
  def giropay: giropay = "giropay".asInstanceOf[giropay]
  
  @js.native
  sealed trait google_pay extends StObject
  @scala.inline
  def google_pay: google_pay = "google_pay".asInstanceOf[google_pay]
  
  @js.native
  sealed trait handelsbanken extends StObject
  @scala.inline
  def handelsbanken: handelsbanken = "handelsbanken".asInstanceOf[handelsbanken]
  
  @js.native
  sealed trait highest extends StObject
  @scala.inline
  def highest: highest = "highest".asInstanceOf[highest]
  
  @js.native
  sealed trait highest_risk_level extends StObject
  @scala.inline
  def highest_risk_level: highest_risk_level = "highest_risk_level".asInstanceOf[highest_risk_level]
  
  @js.native
  sealed trait iban extends elementsType
  @scala.inline
  def iban: iban = "iban".asInstanceOf[iban]
  
  @js.native
  sealed trait ideal extends StObject
  @scala.inline
  def ideal: ideal = "ideal".asInstanceOf[ideal]
  
  @js.native
  sealed trait idealBank extends elementsType
  @scala.inline
  def idealBank: idealBank = "idealBank".asInstanceOf[idealBank]
  
  @js.native
  sealed trait idempotency_error extends ErrorType
  @scala.inline
  def idempotency_error: idempotency_error = "idempotency_error".asInstanceOf[idempotency_error]
  
  @js.native
  sealed trait individual extends StObject
  @scala.inline
  def individual: individual = "individual".asInstanceOf[individual]
  
  @js.native
  sealed trait ing extends StObject
  @scala.inline
  def ing: ing = "ing".asInstanceOf[ing]
  
  @js.native
  sealed trait invalid extends StObject
  @scala.inline
  def invalid: invalid = "invalid".asInstanceOf[invalid]
  
  @js.native
  sealed trait invalid_request_error extends ErrorType
  @scala.inline
  def invalid_request_error: invalid_request_error = "invalid_request_error".asInstanceOf[invalid_request_error]
  
  @js.native
  sealed trait invalid_shipping_address extends StObject
  @scala.inline
  def invalid_shipping_address: invalid_shipping_address = "invalid_shipping_address".asInstanceOf[invalid_shipping_address]
  
  @js.native
  sealed trait issuer_declined extends StObject
  @scala.inline
  def issuer_declined: issuer_declined = "issuer_declined".asInstanceOf[issuer_declined]
  
  @js.native
  sealed trait it extends StObject
  @scala.inline
  def it: it = "it".asInstanceOf[it]
  
  @js.native
  sealed trait jcb_ extends paymentMethodCardBrand
  @scala.inline
  def jcb_ : jcb_ = "jcb".asInstanceOf[jcb_]
  
  @js.native
  sealed trait knab extends StObject
  @scala.inline
  def knab: knab = "knab".asInstanceOf[knab]
  
  @js.native
  sealed trait light extends StObject
  @scala.inline
  def light: light = "light".asInstanceOf[light]
  
  @js.native
  sealed trait `light-outline` extends StObject
  @scala.inline
  def `light-outline`: `light-outline` = "light-outline".asInstanceOf[`light-outline`]
  
  @js.native
  sealed trait list extends StObject
  @scala.inline
  def list: list = "list".asInstanceOf[list]
  
  @js.native
  sealed trait lost_or_stolen_card extends StObject
  @scala.inline
  def lost_or_stolen_card: lost_or_stolen_card = "lost_or_stolen_card".asInstanceOf[lost_or_stolen_card]
  
  @js.native
  sealed trait manual extends StObject
  @scala.inline
  def manual: manual = "manual".asInstanceOf[manual]
  
  @js.native
  sealed trait manual_review extends StObject
  @scala.inline
  def manual_review: manual_review = "manual_review".asInstanceOf[manual_review]
  
  @js.native
  sealed trait mastercard_ extends paymentMethodCardBrand
  @scala.inline
  def mastercard_ : mastercard_ = "mastercard".asInstanceOf[mastercard_]
  
  @js.native
  sealed trait masterpass extends StObject
  @scala.inline
  def masterpass: masterpass = "masterpass".asInstanceOf[masterpass]
  
  @js.native
  sealed trait moneyou extends StObject
  @scala.inline
  def moneyou: moneyou = "moneyou".asInstanceOf[moneyou]
  
  @js.native
  sealed trait multibanco extends StObject
  @scala.inline
  def multibanco: multibanco = "multibanco".asInstanceOf[multibanco]
  
  @js.native
  sealed trait `new` extends statusType
  @scala.inline
  def `new`: `new` = "new".asInstanceOf[`new`]
  
  @js.native
  sealed trait nl extends StObject
  @scala.inline
  def nl: nl = "nl".asInstanceOf[nl]
  
  @js.native
  sealed trait none extends StObject
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait normal extends StObject
  @scala.inline
  def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait not_assessed extends StObject
  @scala.inline
  def not_assessed: not_assessed = "not_assessed".asInstanceOf[not_assessed]
  
  @js.native
  sealed trait not_sent_to_network extends StObject
  @scala.inline
  def not_sent_to_network: not_sent_to_network = "not_sent_to_network".asInstanceOf[not_sent_to_network]
  
  @js.native
  sealed trait not_supported extends StObject
  @scala.inline
  def not_supported: not_supported = "not_supported".asInstanceOf[not_supported]
  
  @js.native
  sealed trait off_session extends StObject
  @scala.inline
  def off_session: off_session = "off_session".asInstanceOf[off_session]
  
  @js.native
  sealed trait offline extends StObject
  @scala.inline
  def offline: offline = "offline".asInstanceOf[offline]
  
  @js.native
  sealed trait on_session extends StObject
  @scala.inline
  def on_session: on_session = "on_session".asInstanceOf[on_session]
  
  @js.native
  sealed trait one_time extends StObject
  @scala.inline
  def one_time: one_time = "one_time".asInstanceOf[one_time]
  
  @js.native
  sealed trait online extends StObject
  @scala.inline
  def online: online = "online".asInstanceOf[online]
  
  @js.native
  sealed trait optional extends StObject
  @scala.inline
  def optional: optional = "optional".asInstanceOf[optional]
  
  @js.native
  sealed trait p24 extends StObject
  @scala.inline
  def p24: p24 = "p24".asInstanceOf[p24]
  
  @js.native
  sealed trait pass extends checkType
  @scala.inline
  def pass: pass = "pass".asInstanceOf[pass]
  
  @js.native
  sealed trait paymentRequestButton extends elementsType
  @scala.inline
  def paymentRequestButton: paymentRequestButton = "paymentRequestButton".asInstanceOf[paymentRequestButton]
  
  @js.native
  sealed trait payment_intent extends StObject
  @scala.inline
  def payment_intent: payment_intent = "payment_intent".asInstanceOf[payment_intent]
  
  @js.native
  sealed trait payment_method extends StObject
  @scala.inline
  def payment_method: payment_method = "payment_method".asInstanceOf[payment_method]
  
  @js.native
  sealed trait paymentmethod extends StObject
  @scala.inline
  def paymentmethod: paymentmethod = "paymentmethod".asInstanceOf[paymentmethod]
  
  @js.native
  sealed trait pending extends StObject
  @scala.inline
  def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait pii extends StObject
  @scala.inline
  def pii: pii = "pii".asInstanceOf[pii]
  
  @js.native
  sealed trait pl extends StObject
  @scala.inline
  def pl: pl = "pl".asInstanceOf[pl]
  
  @js.native
  sealed trait postalCode extends elementsType
  @scala.inline
  def postalCode: postalCode = "postalCode".asInstanceOf[postalCode]
  
  @js.native
  sealed trait prepaid extends fundingType
  @scala.inline
  def prepaid: prepaid = "prepaid".asInstanceOf[prepaid]
  
  @js.native
  sealed trait processing
    extends PaymentIntentStatus
       with SetupIntentStatus
  @scala.inline
  def processing: processing = "processing".asInstanceOf[processing]
  
  @js.native
  sealed trait rabobank extends StObject
  @scala.inline
  def rabobank: rabobank = "rabobank".asInstanceOf[rabobank]
  
  @js.native
  sealed trait rate_limit_error extends ErrorType
  @scala.inline
  def rate_limit_error: rate_limit_error = "rate_limit_error".asInstanceOf[rate_limit_error]
  
  @js.native
  sealed trait ready extends eventTypes
  @scala.inline
  def ready: ready = "ready".asInstanceOf[ready]
  
  @js.native
  sealed trait receiver extends StObject
  @scala.inline
  def receiver: receiver = "receiver".asInstanceOf[receiver]
  
  @js.native
  sealed trait recommended extends StObject
  @scala.inline
  def recommended: recommended = "recommended".asInstanceOf[recommended]
  
  @js.native
  sealed trait redirect extends StObject
  @scala.inline
  def redirect: redirect = "redirect".asInstanceOf[redirect]
  
  @js.native
  sealed trait redirect_to_url extends StObject
  @scala.inline
  def redirect_to_url: redirect_to_url = "redirect_to_url".asInstanceOf[redirect_to_url]
  
  @js.native
  sealed trait refund extends StObject
  @scala.inline
  def refund: refund = "refund".asInstanceOf[refund]
  
  @js.native
  sealed trait refused extends StObject
  @scala.inline
  def refused: refused = "refused".asInstanceOf[refused]
  
  @js.native
  sealed trait regiobank extends StObject
  @scala.inline
  def regiobank: regiobank = "regiobank".asInstanceOf[regiobank]
  
  @js.native
  sealed trait requested_by_customer
    extends PaymentIntentCancelationReason
       with SetupIntentCancelationReason
  @scala.inline
  def requested_by_customer: requested_by_customer = "requested_by_customer".asInstanceOf[requested_by_customer]
  
  @js.native
  sealed trait required extends billingAddressCollectionType
  @scala.inline
  def required: required = "required".asInstanceOf[required]
  
  @js.native
  sealed trait requires_action
    extends PaymentIntentStatus
       with SetupIntentStatus
  @scala.inline
  def requires_action: requires_action = "requires_action".asInstanceOf[requires_action]
  
  @js.native
  sealed trait requires_capture extends PaymentIntentStatus
  @scala.inline
  def requires_capture: requires_capture = "requires_capture".asInstanceOf[requires_capture]
  
  @js.native
  sealed trait requires_confirmation
    extends PaymentIntentStatus
       with SetupIntentStatus
  @scala.inline
  def requires_confirmation: requires_confirmation = "requires_confirmation".asInstanceOf[requires_confirmation]
  
  @js.native
  sealed trait requires_payment_method
    extends PaymentIntentStatus
       with SetupIntentStatus
  @scala.inline
  def requires_payment_method: requires_payment_method = "requires_payment_method".asInstanceOf[requires_payment_method]
  
  @js.native
  sealed trait reusable extends StObject
  @scala.inline
  def reusable: reusable = "reusable".asInstanceOf[reusable]
  
  @js.native
  sealed trait reversed_after_approval extends StObject
  @scala.inline
  def reversed_after_approval: reversed_after_approval = "reversed_after_approval".asInstanceOf[reversed_after_approval]
  
  @js.native
  sealed trait rule extends StObject
  @scala.inline
  def rule: rule = "rule".asInstanceOf[rule]
  
  @js.native
  sealed trait safe extends StObject
  @scala.inline
  def safe: safe = "safe".asInstanceOf[safe]
  
  @js.native
  sealed trait samsung_pay extends StObject
  @scala.inline
  def samsung_pay: samsung_pay = "samsung_pay".asInstanceOf[samsung_pay]
  
  @js.native
  sealed trait scheduled extends StObject
  @scala.inline
  def scheduled: scheduled = "scheduled".asInstanceOf[scheduled]
  
  @js.native
  sealed trait sepa_debit extends StObject
  @scala.inline
  def sepa_debit: sepa_debit = "sepa_debit".asInstanceOf[sepa_debit]
  
  @js.native
  sealed trait setup_intent extends StObject
  @scala.inline
  def setup_intent: setup_intent = "setup_intent".asInstanceOf[setup_intent]
  
  @js.native
  sealed trait shippingaddresschange extends StObject
  @scala.inline
  def shippingaddresschange: shippingaddresschange = "shippingaddresschange".asInstanceOf[shippingaddresschange]
  
  @js.native
  sealed trait shippingoptionchange extends StObject
  @scala.inline
  def shippingoptionchange: shippingoptionchange = "shippingoptionchange".asInstanceOf[shippingoptionchange]
  
  @js.native
  sealed trait single_use extends StObject
  @scala.inline
  def single_use: single_use = "single_use".asInstanceOf[single_use]
  
  @js.native
  sealed trait sns_bank extends StObject
  @scala.inline
  def sns_bank: sns_bank = "sns_bank".asInstanceOf[sns_bank]
  
  @js.native
  sealed trait sofort extends StObject
  @scala.inline
  def sofort: sofort = "sofort".asInstanceOf[sofort]
  
  @js.native
  sealed trait solid extends StObject
  @scala.inline
  def solid: solid = "solid".asInstanceOf[solid]
  
  @js.native
  sealed trait source extends StObject
  @scala.inline
  def source: source = "source".asInstanceOf[source]
  
  @js.native
  sealed trait stripe_account extends StObject
  @scala.inline
  def stripe_account: stripe_account = "stripe_account".asInstanceOf[stripe_account]
  
  @js.native
  sealed trait succeeded
    extends PaymentIntentStatus
       with SetupIntentStatus
  @scala.inline
  def succeeded: succeeded = "succeeded".asInstanceOf[succeeded]
  
  @js.native
  sealed trait success extends StObject
  @scala.inline
  def success: success = "success".asInstanceOf[success]
  
  @js.native
  sealed trait token extends StObject
  @scala.inline
  def token: token = "token".asInstanceOf[token]
  
  @js.native
  sealed trait triodos_bank extends StObject
  @scala.inline
  def triodos_bank: triodos_bank = "triodos_bank".asInstanceOf[triodos_bank]
  
  @js.native
  sealed trait unavailable extends checkType
  @scala.inline
  def unavailable: unavailable = "unavailable".asInstanceOf[unavailable]
  
  @js.native
  sealed trait unchecked extends checkType
  @scala.inline
  def unchecked: unchecked = "unchecked".asInstanceOf[unchecked]
  
  @js.native
  sealed trait unionpay extends paymentMethodCardBrand
  @scala.inline
  def unionpay: unionpay = "unionpay".asInstanceOf[unionpay]
  
  @js.native
  sealed trait unknown_
    extends fundingType
       with paymentMethodCardBrand
  @scala.inline
  def unknown_ : unknown_ = "unknown".asInstanceOf[unknown_]
  
  @js.native
  sealed trait use_stripe_sdk extends StObject
  @scala.inline
  def use_stripe_sdk: use_stripe_sdk = "use_stripe_sdk".asInstanceOf[use_stripe_sdk]
  
  @js.native
  sealed trait validated extends statusType
  @scala.inline
  def validated: validated = "validated".asInstanceOf[validated]
  
  @js.native
  sealed trait validation_error extends ErrorType
  @scala.inline
  def validation_error: validation_error = "validation_error".asInstanceOf[validation_error]
  
  @js.native
  sealed trait van_lanschot extends StObject
  @scala.inline
  def van_lanschot: van_lanschot = "van_lanschot".asInstanceOf[van_lanschot]
  
  @js.native
  sealed trait variable extends StObject
  @scala.inline
  def variable: variable = "variable".asInstanceOf[variable]
  
  @js.native
  sealed trait verification_failed extends statusType
  @scala.inline
  def verification_failed: verification_failed = "verification_failed".asInstanceOf[verification_failed]
  
  @js.native
  sealed trait verified extends statusType
  @scala.inline
  def verified: verified = "verified".asInstanceOf[verified]
  
  @js.native
  sealed trait visa_ extends paymentMethodCardBrand
  @scala.inline
  def visa_ : visa_ = "visa".asInstanceOf[visa_]
  
  @js.native
  sealed trait visa_checkout extends StObject
  @scala.inline
  def visa_checkout: visa_checkout = "visa_checkout".asInstanceOf[visa_checkout]
  
  @js.native
  sealed trait void_invoice extends PaymentIntentCancelationReason
  @scala.inline
  def void_invoice: void_invoice = "void_invoice".asInstanceOf[void_invoice]
  
  @js.native
  sealed trait wechat extends StObject
  @scala.inline
  def wechat: wechat = "wechat".asInstanceOf[wechat]
}
