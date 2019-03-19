package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShowToastOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 提示的延迟时间，单位毫秒，默认：1500
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 图标
    * - success: 显示成功图标
    * - loading: 显示加载图标
    * - none: 不显示图标
    */
  var icon: js.UndefOr[
    uniDashAppLib.uniDashAppLibStrings.success | uniDashAppLib.uniDashAppLibStrings.loading | uniDashAppLib.uniDashAppLibStrings.none
  ] = js.undefined
  /**
    * 自定义图标的本地路径，image 的优先级高于 icon
    */
  var image: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 是否显示透明蒙层，防止触摸穿透，默认：false
    */
  var mask: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 提示的内容
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object ShowToastOptions {
  @scala.inline
  def apply(
    complete: () => scala.Unit = null,
    duration: scala.Int | scala.Double = null,
    fail: () => scala.Unit = null,
    icon: uniDashAppLib.uniDashAppLibStrings.success | uniDashAppLib.uniDashAppLibStrings.loading | uniDashAppLib.uniDashAppLibStrings.none = null,
    image: java.lang.String = null,
    mask: js.UndefOr[scala.Boolean] = js.undefined,
    success: () => scala.Unit = null,
    title: java.lang.String = null
  ): ShowToastOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image)
    if (!js.isUndefined(mask)) __obj.updateDynamic("mask")(mask)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ShowToastOptions]
  }
}

