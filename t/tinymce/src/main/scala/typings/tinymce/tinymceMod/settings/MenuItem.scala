package typings.tinymce.tinymceMod.settings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuItem extends js.Object {
  var items: String
  var title: String
}

object MenuItem {
  @scala.inline
  def apply(items: String, title: String): MenuItem = {
    val __obj = js.Dynamic.literal(items = items, title = title)
  
    __obj.asInstanceOf[MenuItem]
  }
}

