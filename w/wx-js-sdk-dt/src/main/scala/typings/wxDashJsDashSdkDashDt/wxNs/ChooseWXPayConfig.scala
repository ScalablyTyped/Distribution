package typings.wxDashJsDashSdkDashDt.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseWXPayConfig extends WxBaseRequestConfig {
  /**
    * 支付签名随机串，不长于 32 位
    */
  var nonceStr: String
  /**
    * 统一支付接口返回的 prepay_id 参数值，提交格式如：prepay_id=***
    */
  var `package`: String
  /**
    * 支付签名
    */
  var paySign: String
  /**
    * 签名方式，默认为'SHA1'，使用新版支付需传入'MD5'
    */
  var signType: js.UndefOr[String] = js.undefined
  /**
    * 支付签名时间戳，注意微信jssdk中的所有使用 timestamp 字段均为小写。但最新版的支付后台生成签名使用的 timeStamp 字段名需大写其中的S字符
    */
  var timestamp: Double
}

object ChooseWXPayConfig {
  @scala.inline
  def apply(
    nonceStr: String,
    `package`: String,
    paySign: String,
    timestamp: Double,
    cancel: () => Unit = null,
    complete: /* res */ js.UndefOr[js.Any] => Unit = null,
    fail: /* error */ js.UndefOr[js.Any] => Unit = null,
    signType: String = null,
    success: /* res */ js.UndefOr[js.Any] => Unit = null
  ): ChooseWXPayConfig = {
    val __obj = js.Dynamic.literal(nonceStr = nonceStr, paySign = paySign, timestamp = timestamp)
    __obj.updateDynamic("package")(`package`)
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (signType != null) __obj.updateDynamic("signType")(signType)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[ChooseWXPayConfig]
  }
}

