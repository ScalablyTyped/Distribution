package typings.yandexMaps.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Image extends js.Object {
  var image: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Image {
  @scala.inline
  def apply(image: String = null, title: String = null): Image = {
    val __obj = js.Dynamic.literal()
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Image]
  }
}

