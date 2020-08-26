package typings.stripejs.elementMod

import typings.stripejs.mod.StripeError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnChange extends js.Object {
  /**
    * The financial institution that services the account whose IBAN was entered into the Element.
    * NOTE: This is only available when the element is of IBAN type
    */
  var bankName: String = js.native
  /**
    * The type of card that was used
    * @example 'visa'
    * NOTE: This is only available when the element is of Card or Cardnumber type
    */
  var brand: js.UndefOr[String] = js.native
  /**
    * true if the value is well-formed and potentially complete
    */
  var complete: Boolean = js.native
  /**
    * The country code of the entered IBAN
    * NOTE: This is only available when the element is of IBAN type
    */
  var country: js.UndefOr[String] = js.native
  /**
    * The type of the Element that changed.
    */
  var elementType: ElementType = js.native
  /**
    * true if the value is empty
    */
  var empty: Boolean = js.native
  /**
    * The current validation error if any
    */
  var error: StripeError = js.native
  /**
    * The value of the element
    * @see CardElementOptions.value for more information
    * NOTE: This is only filled is the element is of a Card type
    *
    * -----
    *
    * The selected bank. Can be one of the banks listed in the
    * @see https://stripe.com/docs/sources/ideal#optional-specifying-the-customers-bank
    * NOTE: This is also filled when the element is of IdealBank type
    */
  var value: js.UndefOr[js.Any] = js.native
}

object OnChange {
  @scala.inline
  def apply(bankName: String, complete: Boolean, elementType: ElementType, empty: Boolean, error: StripeError): OnChange = {
    val __obj = js.Dynamic.literal(bankName = bankName.asInstanceOf[js.Any], complete = complete.asInstanceOf[js.Any], elementType = elementType.asInstanceOf[js.Any], empty = empty.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnChange]
  }
  @scala.inline
  implicit class OnChangeOps[Self <: OnChange] (val x: Self) extends AnyVal {
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
    def setBankName(value: String): Self = this.set("bankName", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: Boolean): Self = this.set("complete", value.asInstanceOf[js.Any])
    @scala.inline
    def setElementType(value: ElementType): Self = this.set("elementType", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmpty(value: Boolean): Self = this.set("empty", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: StripeError): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setBrand(value: String): Self = this.set("brand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrand: Self = this.set("brand", js.undefined)
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

