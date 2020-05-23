package typings.yandexMaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContentString extends js.Object {
  var content: js.UndefOr[String] = js.undefined
}

object ContentString {
  @scala.inline
  def apply(content: String = null): ContentString = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentString]
  }
}

