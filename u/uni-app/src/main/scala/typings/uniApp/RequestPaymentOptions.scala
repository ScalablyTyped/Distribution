package typings.uniApp

import typings.uniApp.uniAppStrings.alipay
import typings.uniApp.uniAppStrings.appleiap
import typings.uniApp.uniAppStrings.baidu
import typings.uniApp.uniAppStrings.wxpay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestPaymentOptions extends StObject {
  
  /**
    * 统一下单接口返回的 prepay_id 参数值，提交格式如：prepay_id=xx，微信小程序独有
    */
  @JSName("package")
  var _package: js.UndefOr[String] = js.undefined
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 随机字符串，长度为32个字符以下，微信小程序独有 。
    */
  var nonceStr: js.UndefOr[String] = js.undefined
  
  /**
    * 订单数据
    */
  var orderInfo: js.UndefOr[String] = js.undefined
  
  /**
    * 签名，具体签名方案参见小程序支付接口文档，微信小程序独有
    */
  var paySign: js.UndefOr[String] = js.undefined
  
  /**
    * 支付服务提供商，通过 uni.getProvider 获取
    * - alipay: 支付宝支付
    * - wxpay: 微信支付
    * - baidu: 百度收银台
    * - appleiap: 苹果应用内支付
    */
  var provider: js.UndefOr[alipay | wxpay | baidu | appleiap] = js.undefined
  
  /**
    * 签名算法，暂支持 MD5 ，微信小程序独有
    */
  var signType: js.UndefOr[String] = js.undefined
  
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 时间戳从1970年1月1日至今的秒数，即当前的时间，微信小程序独有
    */
  var timeStamp: js.UndefOr[String] = js.undefined
}
object RequestPaymentOptions {
  
  inline def apply(): RequestPaymentOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestPaymentOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestPaymentOptions] (val x: Self) extends AnyVal {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setNonceStr(value: String): Self = StObject.set(x, "nonceStr", value.asInstanceOf[js.Any])
    
    inline def setNonceStrUndefined: Self = StObject.set(x, "nonceStr", js.undefined)
    
    inline def setOrderInfo(value: String): Self = StObject.set(x, "orderInfo", value.asInstanceOf[js.Any])
    
    inline def setOrderInfoUndefined: Self = StObject.set(x, "orderInfo", js.undefined)
    
    inline def setPaySign(value: String): Self = StObject.set(x, "paySign", value.asInstanceOf[js.Any])
    
    inline def setPaySignUndefined: Self = StObject.set(x, "paySign", js.undefined)
    
    inline def setProvider(value: alipay | wxpay | baidu | appleiap): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setSignType(value: String): Self = StObject.set(x, "signType", value.asInstanceOf[js.Any])
    
    inline def setSignTypeUndefined: Self = StObject.set(x, "signType", js.undefined)
    
    inline def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTimeStamp(value: String): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    inline def setTimeStampUndefined: Self = StObject.set(x, "timeStamp", js.undefined)
    
    inline def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    
    inline def set_packageUndefined: Self = StObject.set(x, "package", js.undefined)
  }
}
