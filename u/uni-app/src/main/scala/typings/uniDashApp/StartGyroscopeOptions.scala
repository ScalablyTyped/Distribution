package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartGyroscopeOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 监听陀螺仪数据回调函数的执行频率：game（20ms/次）、ui（60ms/次）、normal （200ms/次）
    */
  var interval: js.UndefOr[String] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object StartGyroscopeOptions {
  @scala.inline
  def apply(
    complete: () => Unit = null,
    fail: () => Unit = null,
    interval: String = null,
    success: () => Unit = null
  ): StartGyroscopeOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (interval != null) __obj.updateDynamic("interval")(interval)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[StartGyroscopeOptions]
  }
}

