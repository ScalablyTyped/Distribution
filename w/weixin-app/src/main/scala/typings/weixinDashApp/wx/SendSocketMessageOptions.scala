package typings.weixinDashApp.wx

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendSocketMessageOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 需要发送的内容 */
  var data: String | ArrayBuffer
}

object SendSocketMessageOptions {
  @scala.inline
  def apply(
    data: String | ArrayBuffer,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null
  ): SendSocketMessageOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[SendSocketMessageOptions]
  }
}

