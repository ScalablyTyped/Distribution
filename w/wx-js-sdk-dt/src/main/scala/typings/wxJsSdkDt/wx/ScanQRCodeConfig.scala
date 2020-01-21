package typings.wxJsSdkDt.wx

import typings.wxJsSdkDt.AnonResultStr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScanQRCodeConfig extends WxBaseRequestConfig {
  /**
    * 默认为0，扫描结果由微信处理，1则直接返回扫描结果，
    */
  var needResult: js.UndefOr[Double] = js.undefined
  /**
    * ["qrCode","barCode"], 可以指定扫二维码还是一维码，默认二者都有
    */
  var scanType: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * resultStr 是当 needResult 为 1 时，扫码返回的结果
    */
  @JSName("success")
  var success_ScanQRCodeConfig: js.UndefOr[js.Function1[/* res */ AnonResultStr, Unit]] = js.undefined
}

object ScanQRCodeConfig {
  @scala.inline
  def apply(
    cancel: () => Unit = null,
    complete: /* res */ js.UndefOr[js.Any] => Unit = null,
    fail: /* error */ js.UndefOr[js.Any] => Unit = null,
    needResult: Int | Double = null,
    scanType: js.Array[String] = null,
    success: /* res */ AnonResultStr => Unit = null
  ): ScanQRCodeConfig = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (needResult != null) __obj.updateDynamic("needResult")(needResult.asInstanceOf[js.Any])
    if (scanType != null) __obj.updateDynamic("scanType")(scanType.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[ScanQRCodeConfig]
  }
}

