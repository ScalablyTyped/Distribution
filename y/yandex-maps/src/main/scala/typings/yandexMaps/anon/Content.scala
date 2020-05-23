package typings.yandexMaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content extends js.Object {
  var content: js.UndefOr[String] = js.undefined
  var image: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Content {
  @scala.inline
  def apply(content: String = null, image: String = null, title: String = null): Content = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
}

