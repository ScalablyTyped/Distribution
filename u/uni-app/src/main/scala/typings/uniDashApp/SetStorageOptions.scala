package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetStorageOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 需要存储的内容，只支持原生类型、及能够通过 JSON.stringify 序列化的对象
    */
  var data: js.UndefOr[js.Any] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 本地缓存中的指定的 key
    */
  var key: js.UndefOr[String] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object SetStorageOptions {
  @scala.inline
  def apply(
    complete: () => Unit = null,
    data: js.Any = null,
    fail: () => Unit = null,
    key: String = null,
    success: () => Unit = null
  ): SetStorageOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (data != null) __obj.updateDynamic("data")(data)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (key != null) __obj.updateDynamic("key")(key)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[SetStorageOptions]
  }
}

