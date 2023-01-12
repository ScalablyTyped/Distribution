package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnBLEConnectionStateChangeSuccess extends StObject {
  
  /**
    * 连接目前的状态
    */
  var connected: js.UndefOr[Boolean] = js.undefined
  
  /**
    * 蓝牙设备 id，参考 device 对象
    */
  var deviceId: js.UndefOr[String] = js.undefined
}
object OnBLEConnectionStateChangeSuccess {
  
  inline def apply(): OnBLEConnectionStateChangeSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnBLEConnectionStateChangeSuccess]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnBLEConnectionStateChangeSuccess] (val x: Self) extends AnyVal {
    
    inline def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
    
    inline def setConnectedUndefined: Self = StObject.set(x, "connected", js.undefined)
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
  }
}
