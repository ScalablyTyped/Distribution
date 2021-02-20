package typings.weixinApp.wx

import typings.weixinApp.anon.devicesArrayBluetoothDevi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetConnectedBluetoothDevicesOptions
  extends BaseOptions[js.Any, js.Any] {
  
  var services: js.Array[String] = js.native
  
  @JSName("success")
  def success_MGetConnectedBluetoothDevicesOptions(res: devicesArrayBluetoothDevi): Unit = js.native
}
object GetConnectedBluetoothDevicesOptions {
  
  @scala.inline
  def apply(services: js.Array[String], success: devicesArrayBluetoothDevi => Unit): GetConnectedBluetoothDevicesOptions = {
    val __obj = js.Dynamic.literal(services = services.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetConnectedBluetoothDevicesOptions]
  }
  
  @scala.inline
  implicit class GetConnectedBluetoothDevicesOptionsMutableBuilder[Self <: GetConnectedBluetoothDevicesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServices(value: js.Array[String]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesVarargs(value: String*): Self = StObject.set(x, "services", js.Array(value :_*))
    
    @scala.inline
    def setSuccess(value: devicesArrayBluetoothDevi => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
