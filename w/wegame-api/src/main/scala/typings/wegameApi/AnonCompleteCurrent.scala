package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCompleteCurrent extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 当前显示图片的链接，默认为urls的第一张
    */
  var current: js.UndefOr[String] = js.undefined
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 需要预览的图片链接列表
    */
  var urls: js.Array[String]
}

object AnonCompleteCurrent {
  @scala.inline
  def apply(
    urls: js.Array[String],
    complete: () => Unit = null,
    current: String = null,
    fail: () => Unit = null,
    success: () => Unit = null
  ): AnonCompleteCurrent = {
    val __obj = js.Dynamic.literal(urls = urls.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[AnonCompleteCurrent]
  }
}

