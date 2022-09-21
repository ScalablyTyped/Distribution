package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #region iBeacon
trait StartBeaconDiscoveryOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  var success_StartBeaconDiscoveryOptions: js.UndefOr[js.Function1[/* res */ ErrMsgResponse, Unit]] = js.undefined
  
  /**
    * iBeacon设备广播的 uuids
    */
  var uuids: String | js.Array[String]
}
object StartBeaconDiscoveryOptions {
  
  inline def apply(uuids: String | js.Array[String]): StartBeaconDiscoveryOptions = {
    val __obj = js.Dynamic.literal(uuids = uuids.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartBeaconDiscoveryOptions]
  }
  
  extension [Self <: StartBeaconDiscoveryOptions](x: Self) {
    
    inline def setSuccess(value: /* res */ ErrMsgResponse => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setUuids(value: String | js.Array[String]): Self = StObject.set(x, "uuids", value.asInstanceOf[js.Any])
    
    inline def setUuidsVarargs(value: String*): Self = StObject.set(x, "uuids", js.Array(value*))
  }
}
