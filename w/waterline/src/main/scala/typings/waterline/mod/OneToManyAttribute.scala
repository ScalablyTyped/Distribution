package typings.waterline.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined waterline.waterline.BaseAttribute<any> & {  collection  :string,   via  :string} */
trait OneToManyAttribute extends _Attribute {
  var after: js.UndefOr[AttributeValidation[String]] = js.undefined
  var alpha: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var alphanumeric: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var array: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var before: js.UndefOr[AttributeValidation[String]] = js.undefined
  var boolean: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var collection: String
  var columnName: js.UndefOr[String] = js.undefined
  var contains: js.UndefOr[AttributeValidation[String]] = js.undefined
  var creditcard: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var date: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var decimal: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var defaultsTo: js.UndefOr[js.Any | DefaultsToFn[_]] = js.undefined
  var email: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var empty: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var enum: js.UndefOr[js.Array[_]] = js.undefined
  @JSName("equals")
  var equals_FOneToManyAttribute: js.UndefOr[AttributeValidation[_]] = js.undefined
  var falsey: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var finite: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var float: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var hexColor: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var hexadecimal: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var in: js.UndefOr[AttributeValidation[js.Array[String]]] = js.undefined
  var index: js.UndefOr[Boolean] = js.undefined
  var int: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var integer: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var ip: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var ipv4: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var ipv6: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var is: js.UndefOr[AttributeValidation[RegExp]] = js.undefined
  var len: js.UndefOr[AttributeValidation[Double]] = js.undefined
  var lowercase: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var max: js.UndefOr[AttributeValidation[Double]] = js.undefined
  var maxLength: js.UndefOr[AttributeValidation[Double]] = js.undefined
  var min: js.UndefOr[AttributeValidation[Double]] = js.undefined
  var minLength: js.UndefOr[AttributeValidation[Double]] = js.undefined
  var not: js.UndefOr[AttributeValidation[RegExp]] = js.undefined
  var notContains: js.UndefOr[AttributeValidation[String]] = js.undefined
  var notEmpty: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var notIn: js.UndefOr[AttributeValidation[js.Array[String]]] = js.undefined
  var notNull: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var notRegex: js.UndefOr[AttributeValidation[RegExp]] = js.undefined
  var `null`: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var number: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var numeric: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var primaryKey: js.UndefOr[Boolean] = js.undefined
  var regex: js.UndefOr[AttributeValidation[RegExp]] = js.undefined
  var required: js.UndefOr[AttributeValidation[Boolean] with Boolean] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var string: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var truthy: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var undefined: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var unique: js.UndefOr[Boolean] = js.undefined
  var uppercase: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var url: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var urlish: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var uuid: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var uuidv3: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var uuidv4: js.UndefOr[AttributeValidation[Boolean]] = js.undefined
  var via: String
}

object OneToManyAttribute {
  @scala.inline
  def apply(
    collection: String,
    via: String,
    after: AttributeValidation[String] = null,
    alpha: AttributeValidation[Boolean] = null,
    alphanumeric: AttributeValidation[Boolean] = null,
    array: AttributeValidation[Boolean] = null,
    before: AttributeValidation[String] = null,
    boolean: AttributeValidation[Boolean] = null,
    columnName: String = null,
    contains: AttributeValidation[String] = null,
    creditcard: AttributeValidation[Boolean] = null,
    date: AttributeValidation[Boolean] = null,
    decimal: AttributeValidation[Boolean] = null,
    defaultsTo: js.Any | DefaultsToFn[_] = null,
    email: AttributeValidation[Boolean] = null,
    empty: AttributeValidation[Boolean] = null,
    enum: js.Array[_] = null,
    equals: AttributeValidation[_] = null,
    falsey: AttributeValidation[Boolean] = null,
    finite: AttributeValidation[Boolean] = null,
    float: AttributeValidation[Boolean] = null,
    hexColor: AttributeValidation[Boolean] = null,
    hexadecimal: AttributeValidation[Boolean] = null,
    in: AttributeValidation[js.Array[String]] = null,
    index: js.UndefOr[Boolean] = js.undefined,
    int: AttributeValidation[Boolean] = null,
    integer: AttributeValidation[Boolean] = null,
    ip: AttributeValidation[Boolean] = null,
    ipv4: AttributeValidation[Boolean] = null,
    ipv6: AttributeValidation[Boolean] = null,
    is: AttributeValidation[RegExp] = null,
    len: AttributeValidation[Double] = null,
    lowercase: AttributeValidation[Boolean] = null,
    max: AttributeValidation[Double] = null,
    maxLength: AttributeValidation[Double] = null,
    min: AttributeValidation[Double] = null,
    minLength: AttributeValidation[Double] = null,
    not: AttributeValidation[RegExp] = null,
    notContains: AttributeValidation[String] = null,
    notEmpty: AttributeValidation[Boolean] = null,
    notIn: AttributeValidation[js.Array[String]] = null,
    notNull: AttributeValidation[Boolean] = null,
    notRegex: AttributeValidation[RegExp] = null,
    `null`: AttributeValidation[Boolean] = null,
    number: AttributeValidation[Boolean] = null,
    numeric: AttributeValidation[Boolean] = null,
    primaryKey: js.UndefOr[Boolean] = js.undefined,
    regex: AttributeValidation[RegExp] = null,
    required: js.UndefOr[
      (Boolean | js.Function0[Boolean] | (js.Function1[/* cb */ js.Function1[Boolean, js.Any], Unit])) with Boolean
    ] = js.undefined,
    size: Int | Double = null,
    string: AttributeValidation[Boolean] = null,
    truthy: AttributeValidation[Boolean] = null,
    `type`: String = null,
    undefined: AttributeValidation[Boolean] = null,
    unique: js.UndefOr[Boolean] = js.undefined,
    uppercase: AttributeValidation[Boolean] = null,
    url: AttributeValidation[Boolean] = null,
    urlish: AttributeValidation[Boolean] = null,
    uuid: AttributeValidation[Boolean] = null,
    uuidv3: AttributeValidation[Boolean] = null,
    uuidv4: AttributeValidation[Boolean] = null
  ): OneToManyAttribute = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], via = via.asInstanceOf[js.Any])
    if (after != null) __obj.updateDynamic("after")(after.asInstanceOf[js.Any])
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (alphanumeric != null) __obj.updateDynamic("alphanumeric")(alphanumeric.asInstanceOf[js.Any])
    if (array != null) __obj.updateDynamic("array")(array.asInstanceOf[js.Any])
    if (before != null) __obj.updateDynamic("before")(before.asInstanceOf[js.Any])
    if (boolean != null) __obj.updateDynamic("boolean")(boolean.asInstanceOf[js.Any])
    if (columnName != null) __obj.updateDynamic("columnName")(columnName.asInstanceOf[js.Any])
    if (contains != null) __obj.updateDynamic("contains")(contains.asInstanceOf[js.Any])
    if (creditcard != null) __obj.updateDynamic("creditcard")(creditcard.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (decimal != null) __obj.updateDynamic("decimal")(decimal.asInstanceOf[js.Any])
    if (defaultsTo != null) __obj.updateDynamic("defaultsTo")(defaultsTo.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (empty != null) __obj.updateDynamic("empty")(empty.asInstanceOf[js.Any])
    if (enum != null) __obj.updateDynamic("enum")(enum.asInstanceOf[js.Any])
    if (equals != null) __obj.updateDynamic("equals")(equals.asInstanceOf[js.Any])
    if (falsey != null) __obj.updateDynamic("falsey")(falsey.asInstanceOf[js.Any])
    if (finite != null) __obj.updateDynamic("finite")(finite.asInstanceOf[js.Any])
    if (float != null) __obj.updateDynamic("float")(float.asInstanceOf[js.Any])
    if (hexColor != null) __obj.updateDynamic("hexColor")(hexColor.asInstanceOf[js.Any])
    if (hexadecimal != null) __obj.updateDynamic("hexadecimal")(hexadecimal.asInstanceOf[js.Any])
    if (in != null) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
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
    if (!js.isUndefined(primaryKey)) __obj.updateDynamic("primaryKey")(primaryKey.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    if (!js.isUndefined(required)) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (string != null) __obj.updateDynamic("string")(string.asInstanceOf[js.Any])
    if (truthy != null) __obj.updateDynamic("truthy")(truthy.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (undefined != null) __obj.updateDynamic("undefined")(undefined.asInstanceOf[js.Any])
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.asInstanceOf[js.Any])
    if (uppercase != null) __obj.updateDynamic("uppercase")(uppercase.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (urlish != null) __obj.updateDynamic("urlish")(urlish.asInstanceOf[js.Any])
    if (uuid != null) __obj.updateDynamic("uuid")(uuid.asInstanceOf[js.Any])
    if (uuidv3 != null) __obj.updateDynamic("uuidv3")(uuidv3.asInstanceOf[js.Any])
    if (uuidv4 != null) __obj.updateDynamic("uuidv4")(uuidv4.asInstanceOf[js.Any])
    __obj.asInstanceOf[OneToManyAttribute]
  }
}

