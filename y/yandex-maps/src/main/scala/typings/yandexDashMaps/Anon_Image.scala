package typings.yandexDashMaps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Image extends js.Object {
  var image: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object Anon_Image {
  @scala.inline
  def apply(image: String = null, title: String = null): Anon_Image = {
    val __obj = js.Dynamic.literal()
    if (image != null) __obj.updateDynamic("image")(image)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_Image]
  }
}

