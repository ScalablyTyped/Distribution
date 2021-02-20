package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBLEDeviceCharacteristicsSuccessData extends StObject {
  
  /**
    * 该特征值支持的操作类型
    */
  var properties: js.UndefOr[js.Any] = js.native
  
  /**
    * 蓝牙设备服务的 uuid
    */
  var uuid: js.UndefOr[String] = js.native
}
object GetBLEDeviceCharacteristicsSuccessData {
  
  @scala.inline
  def apply(): GetBLEDeviceCharacteristicsSuccessData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBLEDeviceCharacteristicsSuccessData]
  }
  
  @scala.inline
  implicit class GetBLEDeviceCharacteristicsSuccessDataMutableBuilder[Self <: GetBLEDeviceCharacteristicsSuccessData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setUuid(value: String): Self = StObject.set(x, "uuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUuidUndefined: Self = StObject.set(x, "uuid", js.undefined)
  }
}
