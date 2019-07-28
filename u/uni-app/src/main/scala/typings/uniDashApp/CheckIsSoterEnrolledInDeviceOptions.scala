package typings.uniDashApp

import typings.uniDashApp.uniDashAppStrings.facial
import typings.uniDashApp.uniDashAppStrings.fingerPrint
import typings.uniDashApp.uniDashAppStrings.speech
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckIsSoterEnrolledInDeviceOptions extends js.Object {
  /**
    * 认证方式
    * - fingerPrint: 指纹识别
    * - facial: 人脸识别（暂未支持）
    * - speech: 声纹识别（暂未支持）
    */
  var checkAuthMode: js.UndefOr[fingerPrint | facial | speech] = js.undefined
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

object CheckIsSoterEnrolledInDeviceOptions {
  @scala.inline
  def apply(
    checkAuthMode: fingerPrint | facial | speech = null,
    complete: () => Unit = null,
    fail: () => Unit = null,
    success: () => Unit = null
  ): CheckIsSoterEnrolledInDeviceOptions = {
    val __obj = js.Dynamic.literal()
    if (checkAuthMode != null) __obj.updateDynamic("checkAuthMode")(checkAuthMode.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[CheckIsSoterEnrolledInDeviceOptions]
  }
}

