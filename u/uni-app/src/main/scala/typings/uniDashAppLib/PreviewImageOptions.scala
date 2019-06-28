package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviewImageOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 当前显示图片的链接，不填则默认为 urls 的第一张
    */
  var count: js.UndefOr[java.lang.String] = js.undefined
  /**
    * current 为当前显示图片的链接/索引值，不填或填写的值无效则为 urls 的第一张。App平台在 1.9.5至1.9.8之间，current为必填。不填会报错
    */
  var current: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 需要预览的图片链接列表
    */
  var urls: js.UndefOr[java.lang.String | js.Array[_]] = js.undefined
}

object PreviewImageOptions {
  @scala.inline
  def apply(
    complete: () => scala.Unit = null,
    count: java.lang.String = null,
    current: java.lang.String = null,
    fail: () => scala.Unit = null,
    success: () => scala.Unit = null,
    urls: java.lang.String | js.Array[_] = null
  ): PreviewImageOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (count != null) __obj.updateDynamic("count")(count)
    if (current != null) __obj.updateDynamic("current")(current)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    if (urls != null) __obj.updateDynamic("urls")(urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewImageOptions]
  }
}

