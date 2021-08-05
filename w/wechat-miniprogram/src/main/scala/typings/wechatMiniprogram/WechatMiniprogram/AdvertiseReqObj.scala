package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 广播自定义参数 */
trait AdvertiseReqObj extends StObject {
  
  /** 当前Service是否可连接 */
  var connectable: js.UndefOr[Boolean] = js.undefined
  
  /** 广播中deviceName字段，默认为空 */
  var deviceName: js.UndefOr[String] = js.undefined
  
  /** 广播的制造商信息, 仅安卓支持 */
  var manufacturerData: js.UndefOr[js.Array[ManufacturerData]] = js.undefined
  
  /** 要广播的serviceUuid列表 */
  var serviceUuids: js.UndefOr[js.Array[String]] = js.undefined
}
object AdvertiseReqObj {
  
  inline def apply(): AdvertiseReqObj = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvertiseReqObj]
  }
  
  extension [Self <: AdvertiseReqObj](x: Self) {
    
    inline def setConnectable(value: Boolean): Self = StObject.set(x, "connectable", value.asInstanceOf[js.Any])
    
    inline def setConnectableUndefined: Self = StObject.set(x, "connectable", js.undefined)
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    inline def setManufacturerData(value: js.Array[ManufacturerData]): Self = StObject.set(x, "manufacturerData", value.asInstanceOf[js.Any])
    
    inline def setManufacturerDataUndefined: Self = StObject.set(x, "manufacturerData", js.undefined)
    
    inline def setManufacturerDataVarargs(value: ManufacturerData*): Self = StObject.set(x, "manufacturerData", js.Array(value :_*))
    
    inline def setServiceUuids(value: js.Array[String]): Self = StObject.set(x, "serviceUuids", value.asInstanceOf[js.Any])
    
    inline def setServiceUuidsUndefined: Self = StObject.set(x, "serviceUuids", js.undefined)
    
    inline def setServiceUuidsVarargs(value: String*): Self = StObject.set(x, "serviceUuids", js.Array(value :_*))
  }
}
