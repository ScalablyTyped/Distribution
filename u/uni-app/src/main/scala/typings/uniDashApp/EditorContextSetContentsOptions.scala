package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorContextSetContentsOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 表示内容的delta对象
    */
  var delta: js.UndefOr[js.Any] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 带标签的HTML内容
    */
  var html: js.UndefOr[String] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object EditorContextSetContentsOptions {
  @scala.inline
  def apply(
    complete: () => Unit = null,
    delta: js.Any = null,
    fail: () => Unit = null,
    html: String = null,
    success: () => Unit = null
  ): EditorContextSetContentsOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (delta != null) __obj.updateDynamic("delta")(delta)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (html != null) __obj.updateDynamic("html")(html)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[EditorContextSetContentsOptions]
  }
}

