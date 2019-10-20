package typings.uniDashApp

import typings.uniDashApp.uniDashAppStrings.high
import typings.uniDashApp.uniDashAppStrings.low
import typings.uniDashApp.uniDashAppStrings.normal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CameraContextTakePhotoOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 成像质量，值为high, normal, low，默认normal
    * - normal: 普通质量
    * - high: 高质量
    * - low: 低质量
    */
  var quality: js.UndefOr[normal | high | low] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function1[/* result */ CameraContextTakePhotoResult, Unit]] = js.undefined
}

object CameraContextTakePhotoOptions {
  @scala.inline
  def apply(
    complete: () => Unit = null,
    fail: () => Unit = null,
    quality: normal | high | low = null,
    success: /* result */ CameraContextTakePhotoResult => Unit = null
  ): CameraContextTakePhotoOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[CameraContextTakePhotoOptions]
  }
}

