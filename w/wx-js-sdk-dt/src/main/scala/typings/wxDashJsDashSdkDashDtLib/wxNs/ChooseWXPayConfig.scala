package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChooseWXPayConfig extends WxBaseRequestConfig {
  /**
    * 支付签名随机串，不长于 32 位
    */
  var nonceStr: java.lang.String
  /**
    * 统一支付接口返回的 prepay_id 参数值，提交格式如：prepay_id=***
    */
  var `package`: java.lang.String
  /**
    * 支付签名
    */
  var paySign: java.lang.String
  /**
    * 签名方式，默认为'SHA1'，使用新版支付需传入'MD5'
    */
  var signType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 支付签名时间戳，注意微信jssdk中的所有使用 timestamp 字段均为小写。但最新版的支付后台生成签名使用的 timeStamp 字段名需大写其中的S字符
    */
  var timestamp: scala.Double
}

object ChooseWXPayConfig {
  @scala.inline
  def apply(
    nonceStr: java.lang.String,
    `package`: java.lang.String,
    paySign: java.lang.String,
    timestamp: scala.Double,
    cancel: js.Function0[scala.Unit] = null,
    complete: js.Function1[/* res */ js.UndefOr[js.Any], scala.Unit] = null,
    fail: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit] = null,
    signType: java.lang.String = null,
    success: js.Function1[/* res */ js.UndefOr[js.Any], scala.Unit] = null
  ): ChooseWXPayConfig = {
    val __obj = js.Dynamic.literal(nonceStr = nonceStr, paySign = paySign, timestamp = timestamp)
    __obj.updateDynamic("package")(`package`)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (signType != null) __obj.updateDynamic("signType")(signType)
    if (success != null) __obj.updateDynamic("success")(success)
    __obj.asInstanceOf[ChooseWXPayConfig]
  }
}

