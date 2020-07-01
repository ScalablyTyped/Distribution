package typings.webfontloader.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Google extends js.Object {
  var api: js.UndefOr[String] = js.undefined
  var families: js.Array[String]
  var text: js.UndefOr[String] = js.undefined
}

object Google {
  @scala.inline
  def apply(families: js.Array[String], api: String = null, text: String = null): Google = {
    val __obj = js.Dynamic.literal(families = families.asInstanceOf[js.Any])
    if (api != null) __obj.updateDynamic("api")(api.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Google]
  }
}

