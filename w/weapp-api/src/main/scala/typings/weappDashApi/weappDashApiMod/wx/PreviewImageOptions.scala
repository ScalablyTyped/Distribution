package typings.weappDashApi.weappDashApiMod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreviewImageOptions extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ResponseCallback] = js.undefined
  /** 当前显示图片的链接，不填则默认为 urls 的第一张 */
  var current: js.UndefOr[String] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ResponseCallback] = js.undefined
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ResponseCallback] = js.undefined
  /** 需要预览的图片链接列表 */
  var urls: js.Array[String]
}

object PreviewImageOptions {
  @scala.inline
  def apply(
    urls: js.Array[String],
    complete: /* res */ js.Any => Unit = null,
    current: String = null,
    fail: /* res */ js.Any => Unit = null,
    success: /* res */ js.Any => Unit = null
  ): PreviewImageOptions = {
    val __obj = js.Dynamic.literal(urls = urls)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (current != null) __obj.updateDynamic("current")(current)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[PreviewImageOptions]
  }
}

