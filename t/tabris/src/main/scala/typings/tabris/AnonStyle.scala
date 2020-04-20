package typings.tabris

import typings.tabris.mod.ImageValue
import typings.tabris.tabrisStrings.cancel
import typings.tabris.tabrisStrings.default
import typings.tabris.tabrisStrings.destructive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStyle extends js.Object {
  var children: js.UndefOr[String] = js.undefined
  var image: js.UndefOr[ImageValue] = js.undefined
  var style: js.UndefOr[default | cancel | destructive] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object AnonStyle {
  @scala.inline
  def apply(
    children: String = null,
    image: ImageValue = null,
    style: default | cancel | destructive = null,
    title: String = null
  ): AnonStyle = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStyle]
  }
}

