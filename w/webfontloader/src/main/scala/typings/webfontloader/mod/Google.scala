package typings.webfontloader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Google extends js.Object {
  var families: js.Array[String]
  var text: js.UndefOr[String] = js.undefined
}

object Google {
  @scala.inline
  def apply(families: js.Array[String], text: String = null): Google = {
    val __obj = js.Dynamic.literal(families = families.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Google]
  }
}

