package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBLEDeviceServicesSuccess extends StObject {
  
  /**
    * 成功：ok，错误：详细信息
    */
  var errMsg: js.UndefOr[String] = js.undefined
  
  /**
    * 设备服务列表
    */
  var services: js.UndefOr[js.Array[GetBLEDeviceServicesSuccessData]] = js.undefined
}
object GetBLEDeviceServicesSuccess {
  
  @scala.inline
  def apply(): GetBLEDeviceServicesSuccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBLEDeviceServicesSuccess]
  }
  
  @scala.inline
  implicit class GetBLEDeviceServicesSuccessMutableBuilder[Self <: GetBLEDeviceServicesSuccess] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrMsg(value: String): Self = StObject.set(x, "errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsgUndefined: Self = StObject.set(x, "errMsg", js.undefined)
    
    @scala.inline
    def setServices(value: js.Array[GetBLEDeviceServicesSuccessData]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    @scala.inline
    def setServicesVarargs(value: GetBLEDeviceServicesSuccessData*): Self = StObject.set(x, "services", js.Array(value :_*))
  }
}
