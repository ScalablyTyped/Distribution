package typings.wxJsSdkDt.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 微信配置对象
  */
trait WxConfig extends StObject {
  
  /**
    * 公众号的唯一标识
    */
  var appId: String
  
  /**
    * 开启调试模式,调用的所有 api 的返回值会在客户端 alert 出来，若要查看传入的参数，可以在 pc 端打开，参数信息会通过 log 打出，仅在 pc 端时才会打印。
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 需要使用的JS接口列表
    */
  var jsApiList: js.Array[String]
  
  /**
    * 签名的随机串
    */
  var nonceStr: String
  
  /**
    * 可选，需要使用的开放标签列表
    */
  var openTagList: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * 签名
    */
  var signature: String
  
  /**
    * 签名的时间戳
    */
  var timestamp: Double
}
object WxConfig {
  
  inline def apply(appId: String, jsApiList: js.Array[String], nonceStr: String, signature: String, timestamp: Double): WxConfig = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], jsApiList = jsApiList.asInstanceOf[js.Any], nonceStr = nonceStr.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[WxConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WxConfig] (val x: Self) extends AnyVal {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setJsApiList(value: js.Array[String]): Self = StObject.set(x, "jsApiList", value.asInstanceOf[js.Any])
    
    inline def setJsApiListVarargs(value: String*): Self = StObject.set(x, "jsApiList", js.Array(value*))
    
    inline def setNonceStr(value: String): Self = StObject.set(x, "nonceStr", value.asInstanceOf[js.Any])
    
    inline def setOpenTagList(value: js.Array[String]): Self = StObject.set(x, "openTagList", value.asInstanceOf[js.Any])
    
    inline def setOpenTagListUndefined: Self = StObject.set(x, "openTagList", js.undefined)
    
    inline def setOpenTagListVarargs(value: String*): Self = StObject.set(x, "openTagList", js.Array(value*))
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
