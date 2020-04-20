package typings.vkOpenapi.vk.OpenAPI.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistOptions extends js.Object {
  var width: js.UndefOr[Double] = js.undefined
}

object PlaylistOptions {
  @scala.inline
  def apply(width: Int | Double = null): PlaylistOptions = {
    val __obj = js.Dynamic.literal()
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaylistOptions]
  }
}

