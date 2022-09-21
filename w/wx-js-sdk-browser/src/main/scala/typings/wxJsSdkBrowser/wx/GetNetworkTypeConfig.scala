package typings.wxJsSdkBrowser.wx

import typings.wxJsSdkBrowser.anon.NetworkType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNetworkTypeConfig
  extends StObject
     with WxBaseRequestConfig {
  
  @JSName("success")
  def success_MGetNetworkTypeConfig(res: NetworkType): Unit
}
object GetNetworkTypeConfig {
  
  inline def apply(success: NetworkType => Unit): GetNetworkTypeConfig = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetNetworkTypeConfig]
  }
  
  extension [Self <: GetNetworkTypeConfig](x: Self) {
    
    inline def setSuccess(value: NetworkType => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
