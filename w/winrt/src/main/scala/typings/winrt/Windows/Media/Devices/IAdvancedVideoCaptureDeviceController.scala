package typings.winrt.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAdvancedVideoCaptureDeviceController extends StObject {
  
  def getDeviceProperty(propertyId: String): js.Any
  
  def setDeviceProperty(propertyId: String, propertyValue: js.Any): Unit
}
object IAdvancedVideoCaptureDeviceController {
  
  inline def apply(getDeviceProperty: String => js.Any, setDeviceProperty: (String, js.Any) => Unit): IAdvancedVideoCaptureDeviceController = {
    val __obj = js.Dynamic.literal(getDeviceProperty = js.Any.fromFunction1(getDeviceProperty), setDeviceProperty = js.Any.fromFunction2(setDeviceProperty))
    __obj.asInstanceOf[IAdvancedVideoCaptureDeviceController]
  }
  
  extension [Self <: IAdvancedVideoCaptureDeviceController](x: Self) {
    
    inline def setGetDeviceProperty(value: String => js.Any): Self = StObject.set(x, "getDeviceProperty", js.Any.fromFunction1(value))
    
    inline def setSetDeviceProperty(value: (String, js.Any) => Unit): Self = StObject.set(x, "setDeviceProperty", js.Any.fromFunction2(value))
  }
}
