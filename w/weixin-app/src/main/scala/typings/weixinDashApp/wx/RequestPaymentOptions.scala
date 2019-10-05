package typings.weixinDashApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestPaymentOptions
  extends BaseOptions[js.Any, js.Any] {
  /** 随机字符串，长度为32个字符以下。 */
  var nonceStr: String
  /** 统一下单接口返回的 prepay_id 参数值，提交格式如：prepay_id=* */
  var `package`: String
  /** 签名,具体签名方案参见微信公众号支付帮助文档; */
  var paySign: String
  /** 签名算法，默认为MD5，支持HMAC-SHA256和MD5 */
  var signType: PaymentSignType
  /** 时间戳从1970年1月1日00:00:00至今的秒数,即当前的时间 */
  var timeStamp: String | Double
}

object RequestPaymentOptions {
  @scala.inline
  def apply(
    nonceStr: String,
    `package`: String,
    paySign: String,
    signType: PaymentSignType,
    timeStamp: String | Double,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null,
    success: js.Any => Unit = null
  ): RequestPaymentOptions = {
    val __obj = js.Dynamic.literal(nonceStr = nonceStr, paySign = paySign, signType = signType, timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(`package`)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[RequestPaymentOptions]
  }
}

