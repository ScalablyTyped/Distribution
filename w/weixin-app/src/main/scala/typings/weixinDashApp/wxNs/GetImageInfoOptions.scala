package typings.weixinDashApp.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetImageInfoOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 图片的路径，可以是相对路径，临时文件路径，存储文件路径，网络图片路径
  		 */
  var src: String
}

object GetImageInfoOptions {
  @scala.inline
  def apply(
    src: String,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null
  ): GetImageInfoOptions = {
    val __obj = js.Dynamic.literal(src = src)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetImageInfoOptions]
  }
}

