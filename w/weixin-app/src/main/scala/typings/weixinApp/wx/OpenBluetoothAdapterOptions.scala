package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 设备-----蓝牙
trait OpenBluetoothAdapterOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  def success_MOpenBluetoothAdapterOptions(res: Any): Unit
}
object OpenBluetoothAdapterOptions {
  
  inline def apply(success: Any => Unit): OpenBluetoothAdapterOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[OpenBluetoothAdapterOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenBluetoothAdapterOptions] (val x: Self) extends AnyVal {
    
    inline def setSuccess(value: Any => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
