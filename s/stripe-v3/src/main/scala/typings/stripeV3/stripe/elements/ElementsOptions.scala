package typings.stripeV3.stripe.elements

import org.scalablytyped.runtime.StringDictionary
import typings.stripeV3.AnonBase
import typings.stripeV3.AnonBaseComplete
import typings.stripeV3.stripe.paymentRequest.StripePaymentRequest
import typings.stripeV3.stripeV3Strings.default
import typings.stripeV3.stripeV3Strings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElementsOptions extends js.Object {
  var classes: js.UndefOr[AnonBase] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var hideIcon: js.UndefOr[Boolean] = js.undefined
  var hidePostalCode: js.UndefOr[Boolean] = js.undefined
  var iconStyle: js.UndefOr[solid | default] = js.undefined
  var paymentRequest: js.UndefOr[StripePaymentRequest] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var placeholderCountry: js.UndefOr[String] = js.undefined
  var style: js.UndefOr[AnonBaseComplete] = js.undefined
  var supportedCountries: js.UndefOr[js.Array[String]] = js.undefined
  var value: js.UndefOr[String | StringDictionary[String]] = js.undefined
}

object ElementsOptions {
  @scala.inline
  def apply(
    classes: AnonBase = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    hideIcon: js.UndefOr[Boolean] = js.undefined,
    hidePostalCode: js.UndefOr[Boolean] = js.undefined,
    iconStyle: solid | default = null,
    paymentRequest: StripePaymentRequest = null,
    placeholder: String = null,
    placeholderCountry: String = null,
    style: AnonBaseComplete = null,
    supportedCountries: js.Array[String] = null,
    value: String | StringDictionary[String] = null
  ): ElementsOptions = {
    val __obj = js.Dynamic.literal()
    if (classes != null) __obj.updateDynamic("classes")(classes.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (!js.isUndefined(hideIcon)) __obj.updateDynamic("hideIcon")(hideIcon.asInstanceOf[js.Any])
    if (!js.isUndefined(hidePostalCode)) __obj.updateDynamic("hidePostalCode")(hidePostalCode.asInstanceOf[js.Any])
    if (iconStyle != null) __obj.updateDynamic("iconStyle")(iconStyle.asInstanceOf[js.Any])
    if (paymentRequest != null) __obj.updateDynamic("paymentRequest")(paymentRequest.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (placeholderCountry != null) __obj.updateDynamic("placeholderCountry")(placeholderCountry.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (supportedCountries != null) __obj.updateDynamic("supportedCountries")(supportedCountries.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementsOptions]
  }
}

