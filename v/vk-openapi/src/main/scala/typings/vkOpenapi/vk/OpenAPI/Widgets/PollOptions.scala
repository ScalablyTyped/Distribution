package typings.vkOpenapi.vk.OpenAPI.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PollOptions extends js.Object {
  var pageUrl: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object PollOptions {
  @scala.inline
  def apply(pageUrl: String = null, width: Int | Double = null): PollOptions = {
    val __obj = js.Dynamic.literal()
    if (pageUrl != null) __obj.updateDynamic("pageUrl")(pageUrl.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollOptions]
  }
}

