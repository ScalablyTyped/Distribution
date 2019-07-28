package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartHCEOptions extends js.Object {
  /**
    * 需要注册到系统的 AID 列表，每个 AID 为 String 类型
    */
  var aid_list: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object StartHCEOptions {
  @scala.inline
  def apply(
    aid_list: js.Array[_] = null,
    complete: () => Unit = null,
    fail: () => Unit = null,
    success: () => Unit = null
  ): StartHCEOptions = {
    val __obj = js.Dynamic.literal()
    if (aid_list != null) __obj.updateDynamic("aid_list")(aid_list)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[StartHCEOptions]
  }
}

