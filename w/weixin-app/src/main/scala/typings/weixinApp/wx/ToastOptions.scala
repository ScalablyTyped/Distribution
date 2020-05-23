package typings.weixinApp.wx

import typings.weixinApp.weixinAppStrings.loading
import typings.weixinApp.weixinAppStrings.none
import typings.weixinApp.weixinAppStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region 界面API列表
trait ToastOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
    * 提示的延迟时间，单位毫秒，默认：1500
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * 图标，只支持 "success", "loading", "none"
    */
  var icon: js.UndefOr[success | loading | none] = js.undefined
  /**
    * 自定义图标的本地路径，image 的优先级高于 icon
    */
  var image: js.UndefOr[String] = js.undefined
  /**
    * 是否显示透明蒙层，防止触摸穿透，默认：false
    */
  var mask: js.UndefOr[Boolean] = js.undefined
  /**
    * 提示的内容
    */
  var title: String
}

object ToastOptions {
  @scala.inline
  def apply(
    title: String,
    complete: /* res */ js.Any => Unit = null,
    duration: js.UndefOr[Double] = js.undefined,
    fail: js.Any => Unit = null,
    icon: success | loading | none = null,
    image: String = null,
    mask: js.UndefOr[Boolean] = js.undefined,
    success: js.Any => Unit = null
  ): ToastOptions = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask.get.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[ToastOptions]
  }
}

