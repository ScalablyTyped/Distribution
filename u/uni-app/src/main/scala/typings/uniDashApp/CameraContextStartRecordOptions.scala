package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraContextStartRecordOptions extends js.Object {
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
  /**
    * 超过30s或页面onHide时会结束录像，res = { tempThumbPath, tempVideoPath }
    */
  var timeoutCallback: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object CameraContextStartRecordOptions {
  @scala.inline
  def apply(
    complete: () => Unit = null,
    fail: () => Unit = null,
    success: () => Unit = null,
    timeoutCallback: () => Unit = null
  ): CameraContextStartRecordOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    if (timeoutCallback != null) __obj.updateDynamic("timeoutCallback")(js.Any.fromFunction0(timeoutCallback))
    __obj.asInstanceOf[CameraContextStartRecordOptions]
  }
}

