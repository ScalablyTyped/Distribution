package typings.waterline.mod

import typings.std.Date
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeValidations extends js.Object {
  var custom: js.UndefOr[AttributeValidation[js.Function]] = js.undefined
  var isAfter: js.UndefOr[AttributeValidation[Date]] = js.undefined
  var isBefore: js.UndefOr[AttributeValidation[Date]] = js.undefined
  var isBoolean: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var isCreditCard: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var isEmail: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var isHexColor: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var isIP: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var isIn: js.UndefOr[AttributeValidation[js.Array[String]]] = js.undefined
  var isInteger: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var isNotEmptyString: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var isNotIn: js.UndefOr[AttributeValidation[js.Array[String]]] = js.undefined
  var isNumber: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var isString: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var isURL: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var isUUID: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var max: js.UndefOr[AttributeValidation[Double]] = js.undefined
  var maxLength: js.UndefOr[AttributeValidation[Double]] = js.undefined
  var min: js.UndefOr[AttributeValidation[Double]] = js.undefined
  var minLength: js.UndefOr[AttributeValidation[Double]] = js.undefined
  var regex: js.UndefOr[AttributeValidation[RegExp]] = js.undefined
}

object AttributeValidations {
  @scala.inline
  def apply(
    custom: AttributeValidation[js.Function] = null,
    isAfter: AttributeValidation[Date] = null,
    isBefore: AttributeValidation[Date] = null,
    isBoolean: AttributeValidation[Boolean] = null,
    isCreditCard: AttributeValidation[Boolean] = null,
    isEmail: AttributeValidation[Boolean] = null,
    isHexColor: AttributeValidation[Boolean] = null,
    isIP: AttributeValidation[Boolean] = null,
    isIn: AttributeValidation[js.Array[String]] = null,
    isInteger: AttributeValidation[Boolean] = null,
    isNotEmptyString: AttributeValidation[Boolean] = null,
    isNotIn: AttributeValidation[js.Array[String]] = null,
    isNumber: AttributeValidation[Boolean] = null,
    isString: AttributeValidation[Boolean] = null,
    isURL: AttributeValidation[Boolean] = null,
    isUUID: AttributeValidation[Boolean] = null,
    max: AttributeValidation[Double] = null,
    maxLength: AttributeValidation[Double] = null,
    min: AttributeValidation[Double] = null,
    minLength: AttributeValidation[Double] = null,
    regex: AttributeValidation[RegExp] = null
  ): AttributeValidations = {
    val __obj = js.Dynamic.literal()
    if (custom != null) __obj.updateDynamic("custom")(custom.asInstanceOf[js.Any])
    if (isAfter != null) __obj.updateDynamic("isAfter")(isAfter.asInstanceOf[js.Any])
    if (isBefore != null) __obj.updateDynamic("isBefore")(isBefore.asInstanceOf[js.Any])
    if (isBoolean != null) __obj.updateDynamic("isBoolean")(isBoolean.asInstanceOf[js.Any])
    if (isCreditCard != null) __obj.updateDynamic("isCreditCard")(isCreditCard.asInstanceOf[js.Any])
    if (isEmail != null) __obj.updateDynamic("isEmail")(isEmail.asInstanceOf[js.Any])
    if (isHexColor != null) __obj.updateDynamic("isHexColor")(isHexColor.asInstanceOf[js.Any])
    if (isIP != null) __obj.updateDynamic("isIP")(isIP.asInstanceOf[js.Any])
    if (isIn != null) __obj.updateDynamic("isIn")(isIn.asInstanceOf[js.Any])
    if (isInteger != null) __obj.updateDynamic("isInteger")(isInteger.asInstanceOf[js.Any])
    if (isNotEmptyString != null) __obj.updateDynamic("isNotEmptyString")(isNotEmptyString.asInstanceOf[js.Any])
    if (isNotIn != null) __obj.updateDynamic("isNotIn")(isNotIn.asInstanceOf[js.Any])
    if (isNumber != null) __obj.updateDynamic("isNumber")(isNumber.asInstanceOf[js.Any])
    if (isString != null) __obj.updateDynamic("isString")(isString.asInstanceOf[js.Any])
    if (isURL != null) __obj.updateDynamic("isURL")(isURL.asInstanceOf[js.Any])
    if (isUUID != null) __obj.updateDynamic("isUUID")(isUUID.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeValidations]
  }
}

