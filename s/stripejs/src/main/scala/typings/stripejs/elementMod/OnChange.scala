package typings.stripejs.elementMod

import typings.stripejs.stripejsMod.StripeError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnChange extends js.Object {
  /**
    * The financial institution that services the account whose IBAN was entered into the Element.
    * NOTE: This is only available when the element is of IBAN type
    */
  var bankName: String
  /**
    * The type of card that was used
    * @example 'visa'
    * NOTE: This is only available when the element is of Card or Cardnumber type
    */
  var brand: js.UndefOr[String] = js.undefined
  /**
    * true if the value is well-formed and potentially complete
    */
  var complete: Boolean
  /**
    * The country code of the entered IBAN
    * NOTE: This is only available when the element is of IBAN type
    */
  var country: js.UndefOr[String] = js.undefined
  /**
    * The type of the Element that changed.
    */
  var elementType: ElementType
  /**
    * true if the value is empty
    */
  var empty: Boolean
  /**
    * The current validation error if any
    */
  var error: StripeError
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
  var value: js.UndefOr[js.Any] = js.undefined
}

object OnChange {
  @scala.inline
  def apply(
    bankName: String,
    complete: Boolean,
    elementType: ElementType,
    empty: Boolean,
    error: StripeError,
    brand: String = null,
    country: String = null,
    value: js.Any = null
  ): OnChange = {
    val __obj = js.Dynamic.literal(bankName = bankName, complete = complete, elementType = elementType, empty = empty, error = error)
    if (brand != null) __obj.updateDynamic("brand")(brand)
    if (country != null) __obj.updateDynamic("country")(country)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[OnChange]
  }
}

