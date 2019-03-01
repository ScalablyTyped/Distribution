package typings
package tinymceLib.tinymceMod.settingsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItem extends js.Object {
  var items: java.lang.String
  var title: java.lang.String
}

object MenuItem {
  @scala.inline
  def apply(items: java.lang.String, title: java.lang.String): MenuItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("items")(items)
    __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[MenuItem]
  }
}

