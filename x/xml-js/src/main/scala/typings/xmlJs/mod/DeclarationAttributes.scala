package typings.xmlJs.mod

import typings.xmlJs.xmlJsStrings.`utf-8`
import typings.xmlJs.xmlJsStrings.no
import typings.xmlJs.xmlJsStrings.yes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationAttributes extends js.Object {
  var encoding: js.UndefOr[`utf-8` | String] = js.undefined
  var standalone: js.UndefOr[yes | no] = js.undefined
  var version: js.UndefOr[String | Double] = js.undefined
}

object DeclarationAttributes {
  @scala.inline
  def apply(encoding: `utf-8` | String = null, standalone: yes | no = null, version: String | Double = null): DeclarationAttributes = {
    val __obj = js.Dynamic.literal()
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (standalone != null) __obj.updateDynamic("standalone")(standalone.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarationAttributes]
  }
}

