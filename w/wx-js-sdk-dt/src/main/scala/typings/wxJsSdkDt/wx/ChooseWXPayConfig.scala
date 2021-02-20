package typings.wxJsSdkDt.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChooseWXPayConfig extends WxBaseRequestConfig {
  
  /**
    * 统一支付接口返回的 prepay_id 参数值，提交格式如：prepay_id=***
    */
  @JSName("package")
  var _package: String = js.native
  
  /**
    * 支付签名随机串，不长于 32 位
    */
  var nonceStr: String = js.native
  
  /**
    * 支付签名
    */
  var paySign: String = js.native
  
  /**
    * 签名方式，默认为'SHA1'，使用新版支付需传入'MD5'
    */
  var signType: js.UndefOr[String] = js.native
  
  /**
    * 支付签名时间戳，注意微信jssdk中的所有使用 timestamp 字段均为小写。但最新版的支付后台生成签名使用的 timeStamp 字段名需大写其中的S字符
    */
  var timestamp: Double = js.native
}
object ChooseWXPayConfig {
  
  @scala.inline
  def apply(_package: String, nonceStr: String, paySign: String, timestamp: Double): ChooseWXPayConfig = {
    val __obj = js.Dynamic.literal(nonceStr = nonceStr.asInstanceOf[js.Any], paySign = paySign.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseWXPayConfig]
  }
  
  @scala.inline
  implicit class ChooseWXPayConfigMutableBuilder[Self <: ChooseWXPayConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNonceStr(value: String): Self = StObject.set(x, "nonceStr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaySign(value: String): Self = StObject.set(x, "paySign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignType(value: String): Self = StObject.set(x, "signType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignTypeUndefined: Self = StObject.set(x, "signType", js.undefined)
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_package(value: String): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
  }
}
