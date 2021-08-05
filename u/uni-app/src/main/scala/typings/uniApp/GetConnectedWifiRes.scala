package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectedWifiRes extends StObject {
  
  /**
    * 接口调用成功的回调函数
    */
  var wifi: js.UndefOr[WiFi] = js.undefined
}
object GetConnectedWifiRes {
  
  inline def apply(): GetConnectedWifiRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectedWifiRes]
  }
  
  extension [Self <: GetConnectedWifiRes](x: Self) {
    
    inline def setWifi(value: WiFi): Self = StObject.set(x, "wifi", value.asInstanceOf[js.Any])
    
    inline def setWifiUndefined: Self = StObject.set(x, "wifi", js.undefined)
  }
}
