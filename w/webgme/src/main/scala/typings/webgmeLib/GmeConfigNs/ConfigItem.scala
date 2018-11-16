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

