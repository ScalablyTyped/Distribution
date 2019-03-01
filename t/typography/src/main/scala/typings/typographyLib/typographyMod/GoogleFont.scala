package typings
package typographyLib.typographyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleFont extends js.Object {
  var name: java.lang.String
  var styles: js.Array[java.lang.String]
}

object GoogleFont {
  @scala.inline
  def apply(name: java.lang.String, styles: js.Array[java.lang.String]): GoogleFont = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("styles")(styles)
    __obj.asInstanceOf[GoogleFont]
  }
}

