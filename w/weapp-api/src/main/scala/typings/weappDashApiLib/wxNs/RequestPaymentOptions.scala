package typings
package weappDashApiLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait RequestPaymentOptions extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ResponseCallback] = js.undefined
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ResponseCallback] = js.undefined
  /** 随机字符串，长度为32个字符以下。 */
  var nonceStr: java.lang.String
  /** 统一下单接口返回的 prepay_id 参数值，提交格式如：prepay_id=* */
  var `package`: java.lang.String
  /** 签名,具体签名方案参见微信公众号支付帮助文档; */
  var paySign: java.lang.String
  /** 签名算法，暂支持 MD5 */
  var signType: PaymentSignType
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ResponseCallback] = js.undefined
  /** 时间戳从1970年1月1日00:00:00至今的秒数,即当前的时间 */
  var timeStamp: java.lang.String | scala.Double
}

