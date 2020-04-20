package typings.tabris

import typings.tabris.mod.ImageValue
import typings.tabris.tabrisStrings.cancel
import typings.tabris.tabrisStrings.default
import typings.tabris.tabrisStrings.destructive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImage extends js.Object {
  var image: js.UndefOr[ImageValue] = js.undefined
  var style: js.UndefOr[default | cancel | destructive] = js.undefined
  var title: String
}

object AnonImage {
  @scala.inline
  def apply(title: String, image: ImageValue = null, style: default | cancel | destructive = null): AnonImage = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImage]
  }
}

