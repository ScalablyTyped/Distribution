package typings.webgme.GmeConfig

import typings.std.RegExp
import typings.webgme.GmeCommon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigItem extends js.Object {
  // a detailed description fo the item
  var description: String
  // a human comprehensible name
  var displayName: String
  // a unique name for the configuration item
  var name: Name
  // can the value be changed?
  var readOnly: js.UndefOr[Boolean] = js.undefined
  // a regular expression limiting the values allowed.
  // e.g. '^[a-zA-Z]+$'
  var regex: js.UndefOr[RegExp] = js.undefined
  // a description of the regex grammar
  // e.g. 'Name can only contain English characters!'
  var regexMessage: js.UndefOr[String] = js.undefined
  // the value of the item: if valueItem is provided it must be one of those values.
  var value: String
  // an enumeration of the allowed values for the value field
  var valueItems: js.UndefOr[js.Array[String]] = js.undefined
  // the datatype of the value: 'string', 'integer', ...
  var valueType: String
}

object ConfigItem {
  @scala.inline
  def apply(
    description: String,
    displayName: String,
    name: Name,
    value: String,
    valueType: String,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    regex: RegExp = null,
    regexMessage: String = null,
    valueItems: js.Array[String] = null
  ): ConfigItem = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueType = valueType.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (regex != null) __obj.updateDynamic("regex")(regex.asInstanceOf[js.Any])
    if (regexMessage != null) __obj.updateDynamic("regexMessage")(regexMessage.asInstanceOf[js.Any])
    if (valueItems != null) __obj.updateDynamic("valueItems")(valueItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigItem]
  }
}

