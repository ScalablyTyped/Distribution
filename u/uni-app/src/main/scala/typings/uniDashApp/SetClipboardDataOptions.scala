package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetClipboardDataOptions extends js.Object {
  /**
    * 结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 需要设置的内容
    */
  var data: js.UndefOr[String] = js.undefined
  /**
    * 失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 成功返回的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object SetClipboardDataOptions {
  @scala.inline
  def apply(
    complete: () => Unit = null,
    data: String = null,
    fail: () => Unit = null,
    success: () => Unit = null
  ): SetClipboardDataOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (data != null) __obj.updateDynamic("data")(data)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[SetClipboardDataOptions]
  }
}

