package typings.stripejs

import typings.stripejs.customerMod.checkStatus
import typings.stripejs.elementMod.ElementType
import typings.stripejs.mod.errorType
import typings.stripejs.paymentMod.completeStatus
import typings.stripejs.sourceMod.paymentOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stripejsStrings {
  
  @js.native
  sealed trait default extends StObject
  inline def default: default = "default".asInstanceOf[default]
  
  @js.native
  sealed trait `American Express` extends StObject
  inline def `American Express`: `American Express` = ("American Express").asInstanceOf[`American Express`]
  
  @js.native
  sealed trait `Diners Club` extends StObject
  inline def `Diners Club`: `Diners Club` = ("Diners Club").asInstanceOf[`Diners Club`]
  
  @js.native
  sealed trait Discover extends StObject
  inline def Discover: Discover = "Discover".asInstanceOf[Discover]
  
  @js.native
  sealed trait JCB extends StObject
  inline def JCB: JCB = "JCB".asInstanceOf[JCB]
  
  @js.native
  sealed trait MasterCard extends StObject
  inline def MasterCard: MasterCard = "MasterCard".asInstanceOf[MasterCard]
  
  @js.native
  sealed trait UnionPay extends StObject
  inline def UnionPay: UnionPay = "UnionPay".asInstanceOf[UnionPay]
  
  @js.native
  sealed trait Unknown extends StObject
  inline def Unknown: Unknown = "Unknown".asInstanceOf[Unknown]
  
  @js.native
  sealed trait Visa extends StObject
  inline def Visa: Visa = "Visa".asInstanceOf[Visa]
  
  @js.native
  sealed trait accepted extends StObject
  inline def accepted: accepted = "accepted".asInstanceOf[accepted]
  
  @js.native
  sealed trait account extends StObject
  inline def account: account = "account".asInstanceOf[account]
  
  @js.native
  sealed trait ach_credit_transfer
    extends StObject
       with paymentOptions
  inline def ach_credit_transfer: ach_credit_transfer = "ach_credit_transfer".asInstanceOf[ach_credit_transfer]
  
  @js.native
  sealed trait ach_debit
    extends StObject
       with paymentOptions
  inline def ach_debit: ach_debit = "ach_debit".asInstanceOf[ach_debit]
  
  @js.native
  sealed trait alipay
    extends StObject
       with paymentOptions
  inline def alipay: alipay = "alipay".asInstanceOf[alipay]
  
  @js.native
  sealed trait android_pay extends StObject
  inline def android_pay: android_pay = "android_pay".asInstanceOf[android_pay]
  
  @js.native
  sealed trait api_connection_error
    extends StObject
       with errorType
  inline def api_connection_error: api_connection_error = "api_connection_error".asInstanceOf[api_connection_error]
  
  @js.native
  sealed trait api_error
    extends StObject
       with errorType
  inline def api_error: api_error = "api_error".asInstanceOf[api_error]
  
  @js.native
  sealed trait apple_pay extends StObject
  inline def apple_pay: apple_pay = "apple_pay".asInstanceOf[apple_pay]
  
  @js.native
  sealed trait attempts_remaining extends StObject
  inline def attempts_remaining: attempts_remaining = "attempts_remaining".asInstanceOf[attempts_remaining]
  
  @js.native
  sealed trait authentication_error
    extends StObject
       with errorType
  inline def authentication_error: authentication_error = "authentication_error".asInstanceOf[authentication_error]
  
  @js.native
  sealed trait auto extends StObject
  inline def auto: auto = "auto".asInstanceOf[auto]
  
  @js.native
  sealed trait bancontact
    extends StObject
       with paymentOptions
  inline def bancontact: bancontact = "bancontact".asInstanceOf[bancontact]
  
  @js.native
  sealed trait bank_account extends StObject
  inline def bank_account: bank_account = "bank_account".asInstanceOf[bank_account]
  
  @js.native
  sealed trait blur extends StObject
  inline def blur: blur = "blur".asInstanceOf[blur]
  
  @js.native
  sealed trait bold extends StObject
  inline def bold: bold = "bold".asInstanceOf[bold]
  
  @js.native
  sealed trait bolder extends StObject
  inline def bolder: bolder = "bolder".asInstanceOf[bolder]
  
  @js.native
  sealed trait buy extends StObject
  inline def buy: buy = "buy".asInstanceOf[buy]
  
  @js.native
  sealed trait cancel extends StObject
  inline def cancel: cancel = "cancel".asInstanceOf[cancel]
  
  @js.native
  sealed trait canceled extends StObject
  inline def canceled: canceled = "canceled".asInstanceOf[canceled]
  
  @js.native
  sealed trait card
    extends StObject
       with ElementType
       with paymentOptions
  inline def card: card = "card".asInstanceOf[card]
  
  @js.native
  sealed trait cardCvc
    extends StObject
       with ElementType
  inline def cardCvc: cardCvc = "cardCvc".asInstanceOf[cardCvc]
  
  @js.native
  sealed trait cardExpiry
    extends StObject
       with ElementType
  inline def cardExpiry: cardExpiry = "cardExpiry".asInstanceOf[cardExpiry]
  
  @js.native
  sealed trait cardNumber
    extends StObject
       with ElementType
  inline def cardNumber: cardNumber = "cardNumber".asInstanceOf[cardNumber]
  
  @js.native
  sealed trait card_error
    extends StObject
       with errorType
  inline def card_error: card_error = "card_error".asInstanceOf[card_error]
  
  @js.native
  sealed trait card_present
    extends StObject
       with paymentOptions
  inline def card_present: card_present = "card_present".asInstanceOf[card_present]
  
  @js.native
  sealed trait change extends StObject
  inline def change: change = "change".asInstanceOf[change]
  
  @js.native
  sealed trait chargeable extends StObject
  inline def chargeable: chargeable = "chargeable".asInstanceOf[chargeable]
  
  @js.native
  sealed trait click extends StObject
  inline def click: click = "click".asInstanceOf[click]
  
  @js.native
  sealed trait code_verification extends StObject
  inline def code_verification: code_verification = "code_verification".asInstanceOf[code_verification]
  
  @js.native
  sealed trait company extends StObject
  inline def company: company = "company".asInstanceOf[company]
  
  @js.native
  sealed trait consumed extends StObject
  inline def consumed: consumed = "consumed".asInstanceOf[consumed]
  
  @js.native
  sealed trait credit extends StObject
  inline def credit: credit = "credit".asInstanceOf[credit]
  
  @js.native
  sealed trait da extends StObject
  inline def da: da = "da".asInstanceOf[da]
  
  @js.native
  sealed trait dark extends StObject
  inline def dark: dark = "dark".asInstanceOf[dark]
  
  @js.native
  sealed trait de extends StObject
  inline def de: de = "de".asInstanceOf[de]
  
  @js.native
  sealed trait debit extends StObject
  inline def debit: debit = "debit".asInstanceOf[debit]
  
  @js.native
  sealed trait declined extends StObject
  inline def declined: declined = "declined".asInstanceOf[declined]
  
  @js.native
  sealed trait donate extends StObject
  inline def donate: donate = "donate".asInstanceOf[donate]
  
  @js.native
  sealed trait email extends StObject
  inline def email: email = "email".asInstanceOf[email]
  
  @js.native
  sealed trait en extends StObject
  inline def en: en = "en".asInstanceOf[en]
  
  @js.native
  sealed trait eps
    extends StObject
       with paymentOptions
  inline def eps: eps = "eps".asInstanceOf[eps]
  
  @js.native
  sealed trait errored extends StObject
  inline def errored: errored = "errored".asInstanceOf[errored]
  
  @js.native
  sealed trait es extends StObject
  inline def es: es = "es".asInstanceOf[es]
  
  @js.native
  sealed trait fail
    extends StObject
       with checkStatus
       with completeStatus
  inline def fail: fail = "fail".asInstanceOf[fail]
  
  @js.native
  sealed trait failed extends StObject
  inline def failed: failed = "failed".asInstanceOf[failed]
  
  @js.native
  sealed trait fi extends StObject
  inline def fi: fi = "fi".asInstanceOf[fi]
  
  @js.native
  sealed trait focus extends StObject
  inline def focus: focus = "focus".asInstanceOf[focus]
  
  @js.native
  sealed trait fr extends StObject
  inline def fr: fr = "fr".asInstanceOf[fr]
  
  @js.native
  sealed trait giropay
    extends StObject
       with paymentOptions
  inline def giropay: giropay = "giropay".asInstanceOf[giropay]
  
  @js.native
  sealed trait ideal
    extends StObject
       with paymentOptions
  inline def ideal: ideal = "ideal".asInstanceOf[ideal]
  
  @js.native
  sealed trait idempotency_error
    extends StObject
       with errorType
  inline def idempotency_error: idempotency_error = "idempotency_error".asInstanceOf[idempotency_error]
  
  @js.native
  sealed trait individual extends StObject
  inline def individual: individual = "individual".asInstanceOf[individual]
  
  @js.native
  sealed trait inherit extends StObject
  inline def inherit: inherit = "inherit".asInstanceOf[inherit]
  
  @js.native
  sealed trait initial extends StObject
  inline def initial: initial = "initial".asInstanceOf[initial]
  
  @js.native
  sealed trait instant extends StObject
  inline def instant: instant = "instant".asInstanceOf[instant]
  
  @js.native
  sealed trait invalid_payer_email
    extends StObject
       with completeStatus
  inline def invalid_payer_email: invalid_payer_email = "invalid_payer_email".asInstanceOf[invalid_payer_email]
  
  @js.native
  sealed trait invalid_payer_name
    extends StObject
       with completeStatus
  inline def invalid_payer_name: invalid_payer_name = "invalid_payer_name".asInstanceOf[invalid_payer_name]
  
  @js.native
  sealed trait invalid_payer_phone
    extends StObject
       with completeStatus
  inline def invalid_payer_phone: invalid_payer_phone = "invalid_payer_phone".asInstanceOf[invalid_payer_phone]
  
  @js.native
  sealed trait invalid_request_error
    extends StObject
       with errorType
  inline def invalid_request_error: invalid_request_error = "invalid_request_error".asInstanceOf[invalid_request_error]
  
  @js.native
  sealed trait invalid_shipping_address
    extends StObject
       with completeStatus
  inline def invalid_shipping_address: invalid_shipping_address = "invalid_shipping_address".asInstanceOf[invalid_shipping_address]
  
  @js.native
  sealed trait it extends StObject
  inline def it: it = "it".asInstanceOf[it]
  
  @js.native
  sealed trait italic extends StObject
  inline def italic: italic = "italic".asInstanceOf[italic]
  
  @js.native
  sealed trait ja extends StObject
  inline def ja: ja = "ja".asInstanceOf[ja]
  
  @js.native
  sealed trait light extends StObject
  inline def light: light = "light".asInstanceOf[light]
  
  @js.native
  sealed trait `light-outline` extends StObject
  inline def `light-outline`: `light-outline` = "light-outline".asInstanceOf[`light-outline`]
  
  @js.native
  sealed trait lighter extends StObject
  inline def lighter: lighter = "lighter".asInstanceOf[lighter]
  
  @js.native
  sealed trait manual extends StObject
  inline def manual: manual = "manual".asInstanceOf[manual]
  
  @js.native
  sealed trait multibanco
    extends StObject
       with paymentOptions
  inline def multibanco: multibanco = "multibanco".asInstanceOf[multibanco]
  
  @js.native
  sealed trait `new` extends StObject
  inline def `new`: `new` = "new".asInstanceOf[`new`]
  
  @js.native
  sealed trait nl extends StObject
  inline def nl: nl = "nl".asInstanceOf[nl]
  
  @js.native
  sealed trait no extends StObject
  inline def no: no = "no".asInstanceOf[no]
  
  @js.native
  sealed trait none extends StObject
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait normal extends StObject
  inline def normal: normal = "normal".asInstanceOf[normal]
  
  @js.native
  sealed trait not_required extends StObject
  inline def not_required: not_required = "not_required".asInstanceOf[not_required]
  
  @js.native
  sealed trait oblique extends StObject
  inline def oblique: oblique = "oblique".asInstanceOf[oblique]
  
  @js.native
  sealed trait p24
    extends StObject
       with paymentOptions
  inline def p24: p24 = "p24".asInstanceOf[p24]
  
  @js.native
  sealed trait paper_check
    extends StObject
       with paymentOptions
  inline def paper_check: paper_check = "paper_check".asInstanceOf[paper_check]
  
  @js.native
  sealed trait pass
    extends StObject
       with checkStatus
  inline def pass: pass = "pass".asInstanceOf[pass]
  
  @js.native
  sealed trait paymentRequestButton
    extends StObject
       with ElementType
  inline def paymentRequestButton: paymentRequestButton = "paymentRequestButton".asInstanceOf[paymentRequestButton]
  
  @js.native
  sealed trait pending extends StObject
  inline def pending: pending = "pending".asInstanceOf[pending]
  
  @js.native
  sealed trait pii extends StObject
  inline def pii: pii = "pii".asInstanceOf[pii]
  
  @js.native
  sealed trait postalCode
    extends StObject
       with ElementType
  inline def postalCode: postalCode = "postalCode".asInstanceOf[postalCode]
  
  @js.native
  sealed trait prepaid extends StObject
  inline def prepaid: prepaid = "prepaid".asInstanceOf[prepaid]
  
  @js.native
  sealed trait processing_error extends StObject
  inline def processing_error: processing_error = "processing_error".asInstanceOf[processing_error]
  
  @js.native
  sealed trait rate_limit_error
    extends StObject
       with errorType
  inline def rate_limit_error: rate_limit_error = "rate_limit_error".asInstanceOf[rate_limit_error]
  
  @js.native
  sealed trait ready extends StObject
  inline def ready: ready = "ready".asInstanceOf[ready]
  
  @js.native
  sealed trait receiver extends StObject
  inline def receiver: receiver = "receiver".asInstanceOf[receiver]
  
  @js.native
  sealed trait redirect extends StObject
  inline def redirect: redirect = "redirect".asInstanceOf[redirect]
  
  @js.native
  sealed trait refused extends StObject
  inline def refused: refused = "refused".asInstanceOf[refused]
  
  @js.native
  sealed trait reusable extends StObject
  inline def reusable: reusable = "reusable".asInstanceOf[reusable]
  
  @js.native
  sealed trait revert extends StObject
  inline def revert: revert = "revert".asInstanceOf[revert]
  
  @js.native
  sealed trait sepa_credit_transfer
    extends StObject
       with paymentOptions
  inline def sepa_credit_transfer: sepa_credit_transfer = "sepa_credit_transfer".asInstanceOf[sepa_credit_transfer]
  
  @js.native
  sealed trait sepa_debit
    extends StObject
       with paymentOptions
  inline def sepa_debit: sepa_debit = "sepa_debit".asInstanceOf[sepa_debit]
  
  @js.native
  sealed trait shippingaddresschange extends StObject
  inline def shippingaddresschange: shippingaddresschange = "shippingaddresschange".asInstanceOf[shippingaddresschange]
  
  @js.native
  sealed trait shippingoptionchange extends StObject
  inline def shippingoptionchange: shippingoptionchange = "shippingoptionchange".asInstanceOf[shippingoptionchange]
  
  @js.native
  sealed trait single_use extends StObject
  inline def single_use: single_use = "single_use".asInstanceOf[single_use]
  
  @js.native
  sealed trait sofort
    extends StObject
       with paymentOptions
  inline def sofort: sofort = "sofort".asInstanceOf[sofort]
  
  @js.native
  sealed trait solid extends StObject
  inline def solid: solid = "solid".asInstanceOf[solid]
  
  @js.native
  sealed trait source extends StObject
  inline def source: source = "source".asInstanceOf[source]
  
  @js.native
  sealed trait standard extends StObject
  inline def standard: standard = "standard".asInstanceOf[standard]
  
  @js.native
  sealed trait succeeded extends StObject
  inline def succeeded: succeeded = "succeeded".asInstanceOf[succeeded]
  
  @js.native
  sealed trait success
    extends StObject
       with completeStatus
  inline def success: success = "success".asInstanceOf[success]
  
  @js.native
  sealed trait sv extends StObject
  inline def sv: sv = "sv".asInstanceOf[sv]
  
  @js.native
  sealed trait three_d_secure
    extends StObject
       with paymentOptions
  inline def three_d_secure: three_d_secure = "three_d_secure".asInstanceOf[three_d_secure]
  
  @js.native
  sealed trait token extends StObject
  inline def token: token = "token".asInstanceOf[token]
  
  @js.native
  sealed trait unavailable
    extends StObject
       with checkStatus
  inline def unavailable: unavailable = "unavailable".asInstanceOf[unavailable]
  
  @js.native
  sealed trait unchecked
    extends StObject
       with checkStatus
  inline def unchecked: unchecked = "unchecked".asInstanceOf[unchecked]
  
  @js.native
  sealed trait unknown_ extends StObject
  inline def unknown_ : unknown_ = "unknown".asInstanceOf[unknown_]
  
  @js.native
  sealed trait unset extends StObject
  inline def unset: unset = "unset".asInstanceOf[unset]
  
  @js.native
  sealed trait user_abort extends StObject
  inline def user_abort: user_abort = "user_abort".asInstanceOf[user_abort]
  
  @js.native
  sealed trait validated extends StObject
  inline def validated: validated = "validated".asInstanceOf[validated]
  
  @js.native
  sealed trait verification_failed extends StObject
  inline def verification_failed: verification_failed = "verification_failed".asInstanceOf[verification_failed]
  
  @js.native
  sealed trait verified extends StObject
  inline def verified: verified = "verified".asInstanceOf[verified]
  
  @js.native
  sealed trait zh extends StObject
  inline def zh: zh = "zh".asInstanceOf[zh]
}
