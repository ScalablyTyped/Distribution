package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.MD5
import typings.wechatMiniprogram.wechatMiniprogramStrings.RSA
import typings.wechatMiniprogram.wechatMiniprogramStrings.`HMAC-SHA256`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestPaymentOption extends StObject {
  
  /** 统一下单接口返回的 prepay_id 参数值，提交格式如：prepay_id=*** */
  @JSName("package")
  var _package: String
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[RequestPaymentCompleteCallback] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[RequestPaymentFailCallback] = js.undefined
  
  /** 随机字符串，长度为32个字符以下 */
  var nonceStr: String
  
  /** 签名，具体见微信支付文档 */
  var paySign: String
  
  /** 签名算法，应与后台下单时的值一致
    *
    * 可选值：
    * - 'MD5': 仅在 v2 版本接口适用;
    * - 'HMAC-SHA256': 仅在 v2 版本接口适用;
    * - 'RSA': 仅在 v3 版本接口适用; */
  var signType: js.UndefOr[MD5 | `HMAC-SHA256` | RSA] = js.undefined
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[RequestPaymentSuccessCallback] = js.undefined
  
  /** 时间戳，从 1970 年 1 月 1 日 00:00:00 至今的秒数，即当前的时间 */
  var timeStamp: String
}
object RequestPaymentOption {
  
  inline def apply(_package: String, nonceStr: String, paySign: String, timeStamp: String): RequestPaymentOption = {
    val __obj = js.Dynamic.literal(nonceStr = nonceStr.asInstanceOf[js.Any], paySign = paySign.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestPaymentOption]
  }
  
  extension [Self <: RequestPaymentOption](x: Self) {
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setNonceStr(value: String): Self = StObject.set(x, "nonceStr", value.asInstanceOf[js.Any])
    
    inline def setPaySign(value: String): Self = StObject.set(x, "paySign", value.asInstanceOf[js.Any])
    
    inline def setSignType(value: MD5 | `HMAC-SHA256` | RSA): Self = StObject.set(x, "signType", value.asInstanceOf[js.Any])
    
    inline def setSignTypeUndefined: Self = StObject.set(x, "signType", js.undefined)
    
    inline def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTimeStamp(value: String): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    inline def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}
