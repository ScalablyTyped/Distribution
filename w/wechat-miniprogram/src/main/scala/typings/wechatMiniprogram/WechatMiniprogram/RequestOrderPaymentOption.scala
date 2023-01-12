package typings.wechatMiniprogram.WechatMiniprogram

import typings.wechatMiniprogram.wechatMiniprogramStrings.MD5
import typings.wechatMiniprogram.wechatMiniprogramStrings.RSA
import typings.wechatMiniprogram.wechatMiniprogramStrings.`HMAC-SHA256`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestOrderPaymentOption extends StObject {
  
  /** 统一下单接口返回的 prepay_id 参数值，提交格式如：prepay_id=*** */
  @JSName("package")
  var _package: String
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[RequestOrderPaymentCompleteCallback] = js.undefined
  
  /** 外部APP用户ID */
  var extUserUin: js.UndefOr[String] = js.undefined
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[RequestOrderPaymentFailCallback] = js.undefined
  
  /** 随机字符串，长度为32个字符以下 */
  var nonceStr: String
  
  /** 订单信息，仅在需要校验的场景下需要传递，具体见[接口说明](/miniprogram/dev/framework/ministore/minishopopencomponent2/API/order/requestOrderPayment) */
  var orderInfo: js.UndefOr[IAnyObject] = js.undefined
  
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
  var success: js.UndefOr[RequestOrderPaymentSuccessCallback] = js.undefined
  
  /** 时间戳，从 1970 年 1 月 1 日 00:00:00 至今的秒数，即当前的时间 */
  var timeStamp: String
}
object RequestOrderPaymentOption {
  
  inline def apply(_package: String, nonceStr: String, paySign: String, timeStamp: String): RequestOrderPaymentOption = {
    val __obj = js.Dynamic.literal(nonceStr = nonceStr.asInstanceOf[js.Any], paySign = paySign.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOrderPaymentOption]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestOrderPaymentOption] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setExtUserUin(value: String): Self = StObject.set(x, "extUserUin", value.asInstanceOf[js.Any])
    
    inline def setExtUserUinUndefined: Self = StObject.set(x, "extUserUin", js.undefined)
    
    inline def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setNonceStr(value: String): Self = StObject.set(x, "nonceStr", value.asInstanceOf[js.Any])
    
    inline def setOrderInfo(value: IAnyObject): Self = StObject.set(x, "orderInfo", value.asInstanceOf[js.Any])
    
    inline def setOrderInfoUndefined: Self = StObject.set(x, "orderInfo", js.undefined)
    
    inline def setPaySign(value: String): Self = StObject.set(x, "paySign", value.asInstanceOf[js.Any])
    
    inline def setSignType(value: MD5 | `HMAC-SHA256` | RSA): Self = StObject.set(x, "signType", value.asInstanceOf[js.Any])
    
    inline def setSignTypeUndefined: Self = StObject.set(x, "signType", js.undefined)
    
    inline def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTimeStamp(value: String): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    inline def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}
