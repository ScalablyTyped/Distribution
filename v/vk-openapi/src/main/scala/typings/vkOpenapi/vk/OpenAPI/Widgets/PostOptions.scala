package typings.vkOpenapi.vk.OpenAPI.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostOptions extends js.Object {
  var width: js.UndefOr[Double] = js.undefined
}

object PostOptions {
  @scala.inline
  def apply(width: js.UndefOr[Double] = js.undefined): PostOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostOptions]
  }
}

