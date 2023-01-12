package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBLEDeviceCharacteristicsSuccessData extends StObject {
  
  /**
    * 该特征值支持的操作类型
    */
  var properties: js.UndefOr[Any] = js.undefined
  
  /**
    * 蓝牙设备服务的 uuid
    */
  var uuid: js.UndefOr[String] = js.undefined
}
object GetBLEDeviceCharacteristicsSuccessData {
  
  inline def apply(): GetBLEDeviceCharacteristicsSuccessData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBLEDeviceCharacteristicsSuccessData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBLEDeviceCharacteristicsSuccessData] (val x: Self) extends AnyVal {
    
    inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    inline def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
