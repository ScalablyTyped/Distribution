package typings.winrt.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAdvancedVideoCaptureDeviceController extends StObject {
  
  def getDeviceProperty(propertyId: String): Any
  
  def setDeviceProperty(propertyId: String, propertyValue: Any): Unit
}
object IAdvancedVideoCaptureDeviceController {
  
  inline def apply(getDeviceProperty: String => Any, setDeviceProperty: (String, Any) => Unit): IAdvancedVideoCaptureDeviceController = {
    val __obj = js.Dynamic.literal(getDeviceProperty = js.Any.fromFunction1(getDeviceProperty), setDeviceProperty = js.Any.fromFunction2(setDeviceProperty))
    __obj.asInstanceOf[IAdvancedVideoCaptureDeviceController]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAdvancedVideoCaptureDeviceController] (val x: Self) extends AnyVal {
    
    inline def setGetDeviceProperty(value: String => Any): Self = StObject.set(x, "getDeviceProperty", js.Any.fromFunction1(value))
    
    inline def setSetDeviceProperty(value: (String, Any) => Unit): Self = StObject.set(x, "setDeviceProperty", js.Any.fromFunction2(value))
  }
}
