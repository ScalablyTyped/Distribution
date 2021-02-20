package typings.winrt.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAdvancedVideoCaptureDeviceController extends StObject {
  
  def getDeviceProperty(propertyId: String): js.Any = js.native
  
  def setDeviceProperty(propertyId: String, propertyValue: js.Any): Unit = js.native
}
object IAdvancedVideoCaptureDeviceController {
  
  @scala.inline
  def apply(getDeviceProperty: String => js.Any, setDeviceProperty: (String, js.Any) => Unit): IAdvancedVideoCaptureDeviceController = {
    val __obj = js.Dynamic.literal(getDeviceProperty = js.Any.fromFunction1(getDeviceProperty), setDeviceProperty = js.Any.fromFunction2(setDeviceProperty))
    __obj.asInstanceOf[IAdvancedVideoCaptureDeviceController]
  }
  
  @scala.inline
  implicit class IAdvancedVideoCaptureDeviceControllerMutableBuilder[Self <: IAdvancedVideoCaptureDeviceController] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDeviceProperty(value: String => js.Any): Self = StObject.set(x, "getDeviceProperty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetDeviceProperty(value: (String, js.Any) => Unit): Self = StObject.set(x, "setDeviceProperty", js.Any.fromFunction2(value))
  }
}
