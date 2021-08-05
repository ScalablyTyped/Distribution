package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnGetWifiListCallbackResult extends StObject {
  
  /** Wi-Fi 列表数据 */
  var wifiList: js.Array[WifiInfo]
}
object OnGetWifiListCallbackResult {
  
  inline def apply(wifiList: js.Array[WifiInfo]): OnGetWifiListCallbackResult = {
    val __obj = js.Dynamic.literal(wifiList = wifiList.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnGetWifiListCallbackResult]
  }
  
  extension [Self <: OnGetWifiListCallbackResult](x: Self) {
    
    inline def setWifiList(value: js.Array[WifiInfo]): Self = StObject.set(x, "wifiList", value.asInstanceOf[js.Any])
    
    inline def setWifiListVarargs(value: WifiInfo*): Self = StObject.set(x, "wifiList", js.Array(value :_*))
  }
}
