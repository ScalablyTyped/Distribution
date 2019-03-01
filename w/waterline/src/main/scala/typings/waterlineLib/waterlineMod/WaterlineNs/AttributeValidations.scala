package typings
package waterlineLib.waterlineMod.WaterlineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeValidations extends js.Object {
  var after: js.UndefOr[AttributeValidation[java.lang.String]] = js.undefined
  var alpha: js.UndefOr[AttributeValidation[scala.Boolean]] = js.undefined
  var alphanumeric: js.UndefOr[AttributeValidation[scala.Boolean]] = js.undefined
  var array: js.UndefOr[AttributeValidation[scala.Boolean]] = js.undefined
  var before: js.UndefOr[AttributeValidation[java.lang.String]] = js.undefined
  var boolean: js.UndefOr[AttributeValidation[scala.Boolean]] = js.undefined
  var contains: js.UndefOr[AttributeValidation[java.lang.String]] = js.undefined
  var creditcard: js.UndefOr[AttributeValidation[scala.Boolean]] = js.undefined
  var date: js.UndefOr[AttributeValidation[scala.Boolean]] = js.undefined
  var decimal: js.UndefOr[AttributeValidation[scala.Boolean]] = js.undefined
  var email: js.UndefOr[AttributeValidation[scala.Boolean]] = js.undefined
  var empty: js.UndefOr[AttributeValidation[scala.Boolean]] = js.undefined
  @JSName("equals")
  var equals_FAttributeValidations: js.UndefOr[AttributeValidation[_]] = js.undefined
  var falsey: js.UndefOr[AttributeValidation[scala.Boolean]] = js.undefined
  var finite: js.UndefOr[AttributeValidation[scala.Boolean]] = js.undefined
  var float: js.UndefOr[AttributeValidation[scala.Boolean]] = js.undefined
  var hexColor: js.UndefOr[AttributeValidation[scala.Boolean]] = js.undefined
  var hexadecimal: js.UndefOr[AttributeValidation[scala.Boolean]] = js.undefined
  var in: js.UndefOr[AttributeValidation[js.Array[java.lang.String]]] = js.undefined
  var int: js.UndefOr[AttributeValidation[scala.Boolean]] = js.undefined
  var integer: js.UndefOr[AttributeValidation[scala.Boolean]] = js.undefined
  var ip: js.UndefOr[AttributeValidation[scala.Boolean]] = js.undefined
  var ipv4: js.UndefOr[AttributeValidation[scala.Boolean]] = js.undefined
  var ipv6: js.UndefOr[AttributeValidation[scala.Boolean]] = js.undefined
  var is: js.UndefOr[AttributeValidation[stdLib.RegExp]] = js.undefined
  var len: js.UndefOr[AttributeValidation[scala.Double]] = js.undefined
  var lowercase: js.UndefOr[AttributeValidation[scala.Boolean]] = js.undefined
  var max: js.UndefOr[AttributeValidation[scala.Double]] = js.undefined
  var maxLength: js.UndefOr[AttributeValidation[scala.Double]] = js.undefined
  var min: js.UndefOr[AttributeValidation[scala.Double]] = js.undefined
  var minLength: js.UndefOr[AttributeValidation[scala.Double]] = js.undefined
  var not: js.UndefOr[AttributeValidation[stdLib.RegExp]] = js.undefined
  var notContains: js.UndefOr[AttributeValidation[java.lang.String]] = js.undefined
  var notEmpty: js.UndefOr[AttributeValidation[scala.Boolean]] = js.undefined
  var notIn: js.UndefOr[AttributeValidation[js.Array[java.lang.String]]] = js.undefined
  var notNull: js.UndefOr[AttributeValidation[scala.Boolean]] = js.undefined
  var notRegex: js.UndefOr[AttributeValidation[stdLib.RegExp]] = js.undefined
  var `null`: js.UndefOr[AttributeValidation[scala.Boolean]] = js.undefined
  var number: js.UndefOr[AttributeValidation[scala.Boolean]] = js.undefined
  var numeric: js.UndefOr[AttributeValidation[scala.Boolean]] = js.undefined
  var regex: js.UndefOr[AttributeValidation[stdLib.RegExp]] = js.undefined
  var required: js.UndefOr[AttributeValidation[scala.Boolean]] = js.undefined
  var string: js.UndefOr[AttributeValidation[scala.Boolean]] = js.undefined
  var truthy: js.UndefOr[AttributeValidation[scala.Boolean]] = js.undefined
  var undefined: js.UndefOr[AttributeValidation[scala.Boolean]] = js.undefined
  var uppercase: js.UndefOr[AttributeValidation[scala.Boolean]] = js.undefined
  var url: js.UndefOr[AttributeValidation[scala.Boolean]] = js.undefined
  var urlish: js.UndefOr[AttributeValidation[scala.Boolean]] = js.undefined
  var uuid: js.UndefOr[AttributeValidation[scala.Boolean]] = js.undefined
  var uuidv3: js.UndefOr[AttributeValidation[scala.Boolean]] = js.undefined
  var uuidv4: js.UndefOr[AttributeValidation[scala.Boolean]] = js.undefined
}

object AttributeValidations {
  @scala.inline
  def apply(
    after: AttributeValidation[java.lang.String] = null,
    alpha: AttributeValidation[scala.Boolean] = null,
    alphanumeric: AttributeValidation[scala.Boolean] = null,
    array: AttributeValidation[scala.Boolean] = null,
    before: AttributeValidation[java.lang.String] = null,
    boolean: AttributeValidation[scala.Boolean] = null,
    contains: AttributeValidation[java.lang.String] = null,
    creditcard: AttributeValidation[scala.Boolean] = null,
    date: AttributeValidation[scala.Boolean] = null,
    decimal: AttributeValidation[scala.Boolean] = null,
    email: AttributeValidation[scala.Boolean] = null,
    empty: AttributeValidation[scala.Boolean] = null,
    equals: AttributeValidation[_] = null,
    falsey: AttributeValidation[scala.Boolean] = null,
    finite: AttributeValidation[scala.Boolean] = null,
    float: AttributeValidation[scala.Boolean] = null,
    hexColor: AttributeValidation[scala.Boolean] = null,
    hexadecimal: AttributeValidation[scala.Boolean] = null,
    in: AttributeValidation[js.Array[java.lang.String]] = null,
    int: AttributeValidation[scala.Boolean] = null,
    integer: AttributeValidation[scala.Boolean] = null,
    ip: AttributeValidation[scala.Boolean] = null,
    ipv4: AttributeValidation[scala.Boolean] = null,
    ipv6: AttributeValidation[scala.Boolean] = null,
    is: AttributeValidation[stdLib.RegExp] = null,
    len: AttributeValidation[scala.Double] = null,
    lowercase: AttributeValidation[scala.Boolean] = null,
    max: AttributeValidation[scala.Double] = null,
    maxLength: AttributeValidation[scala.Double] = null,
    min: AttributeValidation[scala.Double] = null,
    minLength: AttributeValidation[scala.Double] = null,
    not: AttributeValidation[stdLib.RegExp] = null,
    notContains: AttributeValidation[java.lang.String] = null,
    notEmpty: AttributeValidation[scala.Boolean] = null,
    notIn: AttributeValidation[js.Array[java.lang.String]] = null,
    notNull: AttributeValidation[scala.Boolean] = null,
    notRegex: AttributeValidation[stdLib.RegExp] = null,
    `null`: AttributeValidation[scala.Boolean] = null,
    number: AttributeValidation[scala.Boolean] = null,
    numeric: AttributeValidation[scala.Boolean] = null,
    regex: AttributeValidation[stdLib.RegExp] = null,
    required: AttributeValidation[scala.Boolean] = null,
    string: AttributeValidation[scala.Boolean] = null,
    truthy: AttributeValidation[scala.Boolean] = null,
    undefined: AttributeValidation[scala.Boolean] = null,
    uppercase: AttributeValidation[scala.Boolean] = null,
    url: AttributeValidation[scala.Boolean] = null,
    urlish: AttributeValidation[scala.Boolean] = null,
    uuid: AttributeValidation[scala.Boolean] = null,
    uuidv3: AttributeValidation[scala.Boolean] = null,
    uuidv4: AttributeValidation[scala.Boolean] = null
  ): AttributeValidations = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (alphanumeric != null) __obj.updateDynamic("alphanumeric")(alphanumeric.asInstanceOf[js.Any])
    if (array != null) __obj.updateDynamic("array")(array.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (boolean != null) __obj.updateDynamic("boolean")(boolean.asInstanceOf[js.Any])
    if (contains != null) __obj.updateDynamic("contains")(contains.asInstanceOf[js.Any])
    if (creditcard != null) __obj.updateDynamic("creditcard")(creditcard.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (decimal != null) __obj.updateDynamic("decimal")(decimal.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    if (equals != null) __obj.updateDynamic("equals")(equals.asInstanceOf[js.Any])
    if (falsey != null) __obj.updateDynamic("falsey")(falsey.asInstanceOf[js.Any])
    if (finite != null) __obj.updateDynamic("finite")(finite.asInstanceOf[js.Any])
    if (float != null) __obj.updateDynamic("float")(float.asInstanceOf[js.Any])
    if (hexColor != null) __obj.updateDynamic("hexColor")(hexColor.asInstanceOf[js.Any])
    if (hexadecimal != null) __obj.updateDynamic("hexadecimal")(hexadecimal.asInstanceOf[js.Any])
    if (in != null) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (int != null) __obj.updateDynamic("int")(int.asInstanceOf[js.Any])
    if (integer != null) __obj.updateDynamic("integer")(integer.asInstanceOf[js.Any])
    if (ip != null) __obj.updateDynamic("ip")(ip.asInstanceOf[js.Any])
    if (ipv4 != null) __obj.updateDynamic("ipv4")(ipv4.asInstanceOf[js.Any])
    if (ipv6 != null) __obj.updateDynamic("ipv6")(ipv6.asInstanceOf[js.Any])
    if (is != null) __obj.updateDynamic("is")(is.asInstanceOf[js.Any])
    if (len != null) __obj.updateDynamic("len")(len.asInstanceOf[js.Any])
    if (lowercase != null) __obj.updateDynamic("lowercase")(lowercase.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxLength != null) __obj.updateDynamic("maxLength")(maxLength.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minLength != null) __obj.updateDynamic("minLength")(minLength.asInstanceOf[js.Any])
    if (not != null) __obj.updateDynamic("not")(not.asInstanceOf[js.Any])
    if (notContains != null) __obj.updateDynamic("notContains")(notContains.asInstanceOf[js.Any])
    if (notEmpty != null) __obj.updateDynamic("notEmpty")(notEmpty.asInstanceOf[js.Any])
    if (notIn != null) __obj.updateDynamic("notIn")(notIn.asInstanceOf[js.Any])
    if (notNull != null) __obj.updateDynamic("notNull")(notNull.asInstanceOf[js.Any])
    if (notRegex != null) __obj.updateDynamic("notRegex")(notRegex.asInstanceOf[js.Any])
    if (`null` != null) __obj.updateDynamic("null")(`null`.asInstanceOf[js.Any])
    if (number != null) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    if (numeric != null) __obj.updateDynamic("numeric")(numeric.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    if (truthy != null) __obj.updateDynamic("truthy")(truthy.asInstanceOf[js.Any])
    if (undefined != null) __obj.updateDynamic("undefined")(undefined.asInstanceOf[js.Any])
    if (uppercase != null) __obj.updateDynamic("uppercase")(uppercase.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (urlish != null) __obj.updateDynamic("urlish")(urlish.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    if (uuidv3 != null) __obj.updateDynamic("uuidv3")(uuidv3.asInstanceOf[js.Any])
    if (uuidv4 != null) __obj.updateDynamic("uuidv4")(uuidv4.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeValidations]
  }
}

