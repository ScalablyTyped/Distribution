package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestPaymentOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 随机字符串，长度为32个字符以下，微信小程序独有 。
    */
  var nonceStr: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 订单数据
    */
  var orderInfo: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 统一下单接口返回的 prepay_id 参数值，提交格式如：prepay_id=xx，微信小程序独有
    */
  var `package`: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 签名，具体签名方案参见小程序支付接口文档，微信小程序独有
    */
  var paySign: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 支付服务提供商，通过 uni.getProvider 获取
    * - alipay: 支付宝支付
    * - wxpay: 微信支付
    * - baidu: 百度收银台
    * - appleiap: 苹果应用内支付
    */
  var provider: js.UndefOr[
    uniDashAppLib.uniDashAppLibStrings.alipay | uniDashAppLib.uniDashAppLibStrings.wxpay | uniDashAppLib.uniDashAppLibStrings.baidu | uniDashAppLib.uniDashAppLibStrings.appleiap
  ] = js.undefined
  /**
    * 签名算法，暂支持 MD5 ，微信小程序独有
    */
  var signType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 时间戳从1970年1月1日至今的秒数，即当前的时间，微信小程序独有
    */
  var timeStamp: js.UndefOr[java.lang.String] = js.undefined
}

object RequestPaymentOptions {
  @scala.inline
  def apply(
    complete: () => scala.Unit = null,
    fail: () => scala.Unit = null,
    nonceStr: java.lang.String = null,
    orderInfo: java.lang.String = null,
    `package`: java.lang.String = null,
    paySign: java.lang.String = null,
    provider: uniDashAppLib.uniDashAppLibStrings.alipay | uniDashAppLib.uniDashAppLibStrings.wxpay | uniDashAppLib.uniDashAppLibStrings.baidu | uniDashAppLib.uniDashAppLibStrings.appleiap = null,
    signType: java.lang.String = null,
    success: () => scala.Unit = null,
    timeStamp: java.lang.String = null
  ): RequestPaymentOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (nonceStr != null) __obj.updateDynamic("nonceStr")(nonceStr)
    if (orderInfo != null) __obj.updateDynamic("orderInfo")(orderInfo)
    if (`package` != null) __obj.updateDynamic("package")(`package`)
    if (paySign != null) __obj.updateDynamic("paySign")(paySign)
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (signType != null) __obj.updateDynamic("signType")(signType)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    if (timeStamp != null) __obj.updateDynamic("timeStamp")(timeStamp)
    __obj.asInstanceOf[RequestPaymentOptions]
  }
}

