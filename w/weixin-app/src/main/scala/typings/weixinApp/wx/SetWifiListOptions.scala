package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetWifiListOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  /** 提供预设的 Wi-Fi 信息列表 */
  var wifiList: js.Array[SetWifiList]
}
object SetWifiListOptions {
  
  inline def apply(wifiList: js.Array[SetWifiList]): SetWifiListOptions = {
    val __obj = js.Dynamic.literal(wifiList = wifiList.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetWifiListOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SetWifiListOptions] (val x: Self) extends AnyVal {
    
    inline def setWifiList(value: js.Array[SetWifiList]): Self = StObject.set(x, "wifiList", value.asInstanceOf[js.Any])
    
    inline def setWifiListVarargs(value: SetWifiList*): Self = StObject.set(x, "wifiList", js.Array(value*))
  }
}
