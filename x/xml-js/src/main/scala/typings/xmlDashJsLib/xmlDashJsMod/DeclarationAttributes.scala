package typings
package xmlDashJsLib.xmlDashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationAttributes extends js.Object {
  var encoding: js.UndefOr[xmlDashJsLib.xmlDashJsLibStrings.`utf-8` | java.lang.String] = js.undefined
  var standalone: js.UndefOr[xmlDashJsLib.xmlDashJsLibStrings.yes | xmlDashJsLib.xmlDashJsLibStrings.no] = js.undefined
  var version: js.UndefOr[java.lang.String | scala.Double] = js.undefined
}

object DeclarationAttributes {
  @scala.inline
  def apply(
    encoding: xmlDashJsLib.xmlDashJsLibStrings.`utf-8` | java.lang.String = null,
    standalone: xmlDashJsLib.xmlDashJsLibStrings.yes | xmlDashJsLib.xmlDashJsLibStrings.no = null,
    version: java.lang.String | scala.Double = null
  ): DeclarationAttributes = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (standalone != null) __obj.updateDynamic("standalone")(standalone.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarationAttributes]
  }
}

