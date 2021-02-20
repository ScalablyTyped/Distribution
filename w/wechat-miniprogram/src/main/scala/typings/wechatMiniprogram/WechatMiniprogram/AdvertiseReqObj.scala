package typings.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 广播自定义参数 */
@js.native
trait AdvertiseReqObj extends StObject {
  
  /** 当前Service是否可连接 */
  var connectable: js.UndefOr[Boolean] = js.native
  
  /** 广播中deviceName字段，默认为空 */
  var deviceName: js.UndefOr[String] = js.native
  
  /** 广播的制造商信息, 仅安卓支持 */
  var manufacturerData: js.UndefOr[js.Array[ManufacturerData]] = js.native
  
  /** 要广播的serviceUuid列表 */
  var serviceUuids: js.UndefOr[js.Array[String]] = js.native
}
object AdvertiseReqObj {
  
  @scala.inline
  def apply(): AdvertiseReqObj = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvertiseReqObj]
  }
  
  @scala.inline
  implicit class AdvertiseReqObjMutableBuilder[Self <: AdvertiseReqObj] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectable(value: Boolean): Self = StObject.set(x, "connectable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectableUndefined: Self = StObject.set(x, "connectable", js.undefined)
    
    @scala.inline
    def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceNameUndefined: Self = StObject.set(x, "deviceName", js.undefined)
    
    @scala.inline
    def setManufacturerData(value: js.Array[ManufacturerData]): Self = StObject.set(x, "manufacturerData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setManufacturerDataUndefined: Self = StObject.set(x, "manufacturerData", js.undefined)
    
    @scala.inline
    def setManufacturerDataVarargs(value: ManufacturerData*): Self = StObject.set(x, "manufacturerData", js.Array(value :_*))
    
    @scala.inline
    def setServiceUuids(value: js.Array[String]): Self = StObject.set(x, "serviceUuids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUuidsUndefined: Self = StObject.set(x, "serviceUuids", js.undefined)
    
    @scala.inline
    def setServiceUuidsVarargs(value: String*): Self = StObject.set(x, "serviceUuids", js.Array(value :_*))
  }
}
