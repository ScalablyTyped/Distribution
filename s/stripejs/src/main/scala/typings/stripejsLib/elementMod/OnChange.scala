package typings
package stripejsLib.elementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnChange extends js.Object {
  /**
    * The financial institution that services the account whose IBAN was entered into the Element.
    * NOTE: This is only available when the element is of IBAN type
    */
  var bankName: java.lang.String
  /**
    * The type of card that was used
    * @example 'visa'
    * NOTE: This is only available when the element is of Card or Cardnumber type
    */
  var brand: js.UndefOr[java.lang.String] = js.undefined
  /**
    * true if the value is well-formed and potentially complete
    */
  var complete: scala.Boolean
  /**
    * The country code of the entered IBAN
    * NOTE: This is only available when the element is of IBAN type
    */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /**
    * true if the value is empty
    */
  var empty: scala.Boolean
  /**
    * The current validation error if any
    */
  var error: stripejsLib.stripejsMod.StripeError
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
    bankName: java.lang.String,
    complete: scala.Boolean,
    empty: scala.Boolean,
    error: stripejsLib.stripejsMod.StripeError,
    brand: java.lang.String = null,
    country: java.lang.String = null,
    value: js.Any = null
  ): OnChange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bankName")(bankName)
    __obj.updateDynamic("complete")(complete)
    __obj.updateDynamic("empty")(empty)
    __obj.updateDynamic("error")(error)
    if (brand != null) __obj.updateDynamic("brand")(brand)
    if (country != null) __obj.updateDynamic("country")(country)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[OnChange]
  }
}

