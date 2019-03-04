package typings
package webgmeLib.GmeConfigNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigItem extends js.Object {
  // a detailed description fo the item
  var description: java.lang.String
  // a human comprehensible name
  var displayName: java.lang.String
  // a unique name for the configuration item
  var name: webgmeLib.GmeCommonNs.Name
  // can the value be changed?
  var readOnly: js.UndefOr[scala.Boolean] = js.undefined
  // a regular expression limiting the values allowed.
  // e.g. '^[a-zA-Z]+$'
  var regex: js.UndefOr[stdLib.RegExp] = js.undefined
  // a description of the regex grammar
  // e.g. 'Name can only contain English characters!'
  var regexMessage: js.UndefOr[java.lang.String] = js.undefined
  // the value of the item: if valueItem is provided it must be one of those values.
  var value: java.lang.String
  // an enumeration of the allowed values for the value field
  var valueItems: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  // the datatype of the value: 'string', 'integer', ...
  var valueType: java.lang.String
}

object ConfigItem {
  @scala.inline
  def apply(
    description: java.lang.String,
    displayName: java.lang.String,
    name: webgmeLib.GmeCommonNs.Name,
    value: java.lang.String,
    valueType: java.lang.String,
    readOnly: js.UndefOr[scala.Boolean] = js.undefined,
    regex: stdLib.RegExp = null,
    regexMessage: java.lang.String = null,
    valueItems: js.Array[java.lang.String] = null
  ): ConfigItem = {
    val __obj = js.Dynamic.literal(description = description, displayName = displayName, name = name, value = value, valueType = valueType)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (regex != null) __obj.updateDynamic("regex")(regex)
    if (regexMessage != null) __obj.updateDynamic("regexMessage")(regexMessage)
    if (valueItems != null) __obj.updateDynamic("valueItems")(valueItems)
    __obj.asInstanceOf[ConfigItem]
  }
}

