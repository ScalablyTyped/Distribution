package typings.wxJsSdkBrowser.wx

import typings.wxJsSdkBrowser.anon.CheckResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 判断当前客户端版本是否支持指定 JS 接口, checkJsApi 接口是客户端6.0.2新引入的一个预留接口，第一期开放的接口均可不使用 checkJsApi 来检测
  */
trait CheckApiConfig
  extends StObject
     with WxBaseRequestConfig {
  
  /**
    * 需要检测的JS接口列表
    */
  var jsApiList: js.Array[String]
  
  /**
    * 以键值对的形式返回，可用的 api 值 true，不可用为 false
    * 如：{"checkResult":{"chooseImage":true},"errMsg":"checkJsApi:ok"}
    */
  @JSName("success")
  def success_MCheckApiConfig(res: CheckResult): Unit
}
object CheckApiConfig {
  
  inline def apply(jsApiList: js.Array[String], success: CheckResult => Unit): CheckApiConfig = {
    val __obj = js.Dynamic.literal(jsApiList = jsApiList.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[CheckApiConfig]
  }
  
  extension [Self <: CheckApiConfig](x: Self) {
    
    inline def setJsApiList(value: js.Array[String]): Self = StObject.set(x, "jsApiList", value.asInstanceOf[js.Any])
    
    inline def setJsApiListVarargs(value: String*): Self = StObject.set(x, "jsApiList", js.Array(value*))
    
    inline def setSuccess(value: CheckResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
