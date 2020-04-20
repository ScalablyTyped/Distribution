package typings.vkOpenapi.vk.OpenAPI.Widgets

import typings.vkOpenapi.vk.OpenAPI.NumericBoolean
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentsOptions extends js.Object {
  var attach: js.UndefOr[String] = js.undefined
  var autoPublish: js.UndefOr[NumericBoolean] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var limit: js.UndefOr[Double] = js.undefined
  var norealtime: js.UndefOr[NumericBoolean] = js.undefined
  var pageUrl: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object CommentsOptions {
  @scala.inline
  def apply(
    attach: String = null,
    autoPublish: NumericBoolean = null,
    height: Int | Double = null,
    limit: Int | Double = null,
    norealtime: NumericBoolean = null,
    pageUrl: String = null,
    width: Int | Double = null
  ): CommentsOptions = {
    val __obj = js.Dynamic.literal()
    if (attach != null) __obj.updateDynamic("attach")(attach.asInstanceOf[js.Any])
    if (autoPublish != null) __obj.updateDynamic("autoPublish")(autoPublish.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (norealtime != null) __obj.updateDynamic("norealtime")(norealtime.asInstanceOf[js.Any])
    if (pageUrl != null) __obj.updateDynamic("pageUrl")(pageUrl.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentsOptions]
  }
}

