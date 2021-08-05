package typings.weixinApp.anon

import typings.weixinApp.weixinAppStrings.ok
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  services :std.Array<{  uuid :string,   isPrimary :boolean}>} & weixin-app.wx.ErrMsgResponse */
trait servicesArrayuuidstringis extends StObject {
  
  /** 成功：ok，错误：详细信息 */
  var errMsg: ok | String
  
  var services: js.Array[IsPrimary]
}
object servicesArrayuuidstringis {
  
  inline def apply(errMsg: ok | String, services: js.Array[IsPrimary]): servicesArrayuuidstringis = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any])
    __obj.asInstanceOf[servicesArrayuuidstringis]
  }
  
  extension [Self <: servicesArrayuuidstringis](x: Self) {
    
    inline def setErrMsg(value: ok | String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    inline def setServices(value: js.Array[IsPrimary]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    inline def setServicesVarargs(value: IsPrimary*): Self = StObject.set(x, "services", js.Array(value :_*))
  }
}
