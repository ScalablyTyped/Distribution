package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScanQRCodeConfig extends WxBaseRequestConfig {
  /**
    * 默认为0，扫描结果由微信处理，1则直接返回扫描结果，
    */
  var needResult: js.UndefOr[scala.Double] = js.undefined
  /**
    * ["qrCode","barCode"], 可以指定扫二维码还是一维码，默认二者都有
    */
  var scanType: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * resultStr 是当 needResult 为 1 时，扫码返回的结果
    */
  @JSName("success")
  var success_ScanQRCodeConfig: js.UndefOr[js.Function1[/* res */ wxDashJsDashSdkDashDtLib.Anon_ResultStr, scala.Unit]] = js.undefined
}

object ScanQRCodeConfig {
  @scala.inline
  def apply(
    cancel: () => scala.Unit = null,
    complete: /* res */ js.UndefOr[js.Any] => scala.Unit = null,
    fail: /* error */ js.UndefOr[js.Any] => scala.Unit = null,
    needResult: scala.Int | scala.Double = null,
    scanType: js.Array[java.lang.String] = null,
    success: /* res */ wxDashJsDashSdkDashDtLib.Anon_ResultStr => scala.Unit = null
  ): ScanQRCodeConfig = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (needResult != null) __obj.updateDynamic("needResult")(needResult.asInstanceOf[js.Any])
    if (scanType != null) __obj.updateDynamic("scanType")(scanType)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[ScanQRCodeConfig]
  }
}

