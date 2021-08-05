package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartBeaconDiscoveryOptions extends StObject {
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * iBeacon设备广播的 uuids
    */
  var uuids: js.UndefOr[js.Array[js.Any]] = js.undefined
}
object StartBeaconDiscoveryOptions {
  
  inline def apply(): StartBeaconDiscoveryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartBeaconDiscoveryOptions]
  }
  
  extension [Self <: StartBeaconDiscoveryOptions](x: Self) {
    
    inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    inline def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    inline def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setUuids(value: js.Array[js.Any]): Self = StObject.set(x, "uuids", value.asInstanceOf[js.Any])
    
    inline def setUuidsUndefined: Self = StObject.set(x, "uuids", js.undefined)
    
    inline def setUuidsVarargs(value: js.Any*): Self = StObject.set(x, "uuids", js.Array(value :_*))
  }
}
