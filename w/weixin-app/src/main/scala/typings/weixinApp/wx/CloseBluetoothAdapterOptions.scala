package typings.weixinApp.wx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseBluetoothAdapterOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  @JSName("success")
  def success_MCloseBluetoothAdapterOptions(res: Any): Unit
}
object CloseBluetoothAdapterOptions {
  
  inline def apply(success: Any => Unit): CloseBluetoothAdapterOptions = {
    val __obj = js.Dynamic.literal(success = js.Any.fromFunction1(success))
    __obj.asInstanceOf[CloseBluetoothAdapterOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloseBluetoothAdapterOptions] (val x: Self) extends AnyVal {
    
    inline def setSuccess(value: Any => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
  }
}
