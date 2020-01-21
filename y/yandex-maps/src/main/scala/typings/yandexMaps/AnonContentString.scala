package typings.yandexMaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContentString extends js.Object {
  var content: js.UndefOr[String] = js.undefined
}

object AnonContentString {
  @scala.inline
  def apply(content: String = null): AnonContentString = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContentString]
  }
}

