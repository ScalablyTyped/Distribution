package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetConnectedWifiRes extends StObject {
  
  /**
    * 接口调用成功的回调函数
    */
  var wifi: js.UndefOr[WiFi] = js.native
}
object GetConnectedWifiRes {
  
  @scala.inline
  def apply(): GetConnectedWifiRes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetConnectedWifiRes]
  }
  
  @scala.inline
  implicit class GetConnectedWifiResMutableBuilder[Self <: GetConnectedWifiRes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWifi(value: WiFi): Self = StObject.set(x, "wifi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWifiUndefined: Self = StObject.set(x, "wifi", js.undefined)
  }
}
