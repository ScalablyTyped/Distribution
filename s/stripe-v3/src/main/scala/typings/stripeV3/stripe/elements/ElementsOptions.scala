package typings.stripeV3.stripe.elements

import org.scalablytyped.runtime.StringDictionary
import typings.stripeV3.anon.Base
import typings.stripeV3.anon.Complete
import typings.stripeV3.stripe.paymentRequest.StripePaymentRequest
import typings.stripeV3.stripeV3Strings.default
import typings.stripeV3.stripeV3Strings.solid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementsOptions extends js.Object {
  var classes: js.UndefOr[Base] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var hideIcon: js.UndefOr[Boolean] = js.native
  var hidePostalCode: js.UndefOr[Boolean] = js.native
  var iconStyle: js.UndefOr[solid | default] = js.native
  var paymentRequest: js.UndefOr[StripePaymentRequest] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var placeholderCountry: js.UndefOr[String] = js.native
  var showIcon: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[Complete] = js.native
  var supportedCountries: js.UndefOr[js.Array[String]] = js.native
  var value: js.UndefOr[String | StringDictionary[String]] = js.native
}

object ElementsOptions {
  @scala.inline
  def apply(): ElementsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementsOptions]
  }
  @scala.inline
  implicit class ElementsOptionsOps[Self <: ElementsOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClasses(value: Base): Self = this.set("classes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setHideIcon(value: Boolean): Self = this.set("hideIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideIcon: Self = this.set("hideIcon", js.undefined)
    @scala.inline
    def setHidePostalCode(value: Boolean): Self = this.set("hidePostalCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidePostalCode: Self = this.set("hidePostalCode", js.undefined)
    @scala.inline
    def setIconStyle(value: solid | default): Self = this.set("iconStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconStyle: Self = this.set("iconStyle", js.undefined)
    @scala.inline
    def setPaymentRequest(value: StripePaymentRequest): Self = this.set("paymentRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaymentRequest: Self = this.set("paymentRequest", js.undefined)
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    @scala.inline
    def setPlaceholderCountry(value: String): Self = this.set("placeholderCountry", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlaceholderCountry: Self = this.set("placeholderCountry", js.undefined)
    @scala.inline
    def setShowIcon(value: Boolean): Self = this.set("showIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowIcon: Self = this.set("showIcon", js.undefined)
    @scala.inline
    def setStyle(value: Complete): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setSupportedCountriesVarargs(value: String*): Self = this.set("supportedCountries", js.Array(value :_*))
    @scala.inline
    def setSupportedCountries(value: js.Array[String]): Self = this.set("supportedCountries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportedCountries: Self = this.set("supportedCountries", js.undefined)
    @scala.inline
    def setValue(value: String | StringDictionary[String]): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

