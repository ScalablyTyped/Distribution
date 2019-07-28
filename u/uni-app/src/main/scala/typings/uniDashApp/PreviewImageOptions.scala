package typings.uniDashApp

import typings.uniDashApp.uniDashAppStrings.default
import typings.uniDashApp.uniDashAppStrings.none
import typings.uniDashApp.uniDashAppStrings.number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviewImageOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 当前显示图片的链接，不填则默认为 urls 的第一张
    */
  var count: js.UndefOr[String] = js.undefined
  /**
    * current 为当前显示图片的链接/索引值，不填或填写的值无效则为 urls 的第一张。App平台在 1.9.5至1.9.8之间，current为必填。不填会报错
    */
  var current: js.UndefOr[String] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 图片指示器样式
    * - default: 底部圆点指示器
    * - number: 顶部数字指示器
    * - none: 不显示指示器
    */
  var indicator: js.UndefOr[default | number | none] = js.undefined
  /**
    * 长按图片显示操作菜单，如不填默认为保存相册，1.9.5 起支持。
    */
  var longPressActions: js.UndefOr[LongPressActionsOptions] = js.undefined
  /**
    * 是否可循环预览
    */
  var loop: js.UndefOr[Boolean] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 需要预览的图片链接列表
    */
  var urls: js.UndefOr[String | js.Array[_]] = js.undefined
}

object PreviewImageOptions {
  @scala.inline
  def apply(
    complete: () => Unit = null,
    count: String = null,
    current: String = null,
    fail: () => Unit = null,
    indicator: default | number | none = null,
    longPressActions: LongPressActionsOptions = null,
    loop: js.UndefOr[Boolean] = js.undefined,
    success: () => Unit = null,
    urls: String | js.Array[_] = null
  ): PreviewImageOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (count != null) __obj.updateDynamic("count")(count)
    if (current != null) __obj.updateDynamic("current")(current)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (indicator != null) __obj.updateDynamic("indicator")(indicator.asInstanceOf[js.Any])
    if (longPressActions != null) __obj.updateDynamic("longPressActions")(longPressActions)
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewImageOptions]
  }
}

