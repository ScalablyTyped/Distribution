package typings.winrt.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAdvancedVideoCaptureDeviceController extends js.Object {
  def getDeviceProperty(propertyId: String): js.Any
  def setDeviceProperty(propertyId: String, propertyValue: js.Any): Unit
}

object IAdvancedVideoCaptureDeviceController {
  @scala.inline
  def apply(getDeviceProperty: String => js.Any, setDeviceProperty: (String, js.Any) => Unit): IAdvancedVideoCaptureDeviceController = {
    val __obj = js.Dynamic.literal(getDeviceProperty = js.Any.fromFunction1(getDeviceProperty), setDeviceProperty = js.Any.fromFunction2(setDeviceProperty))
    __obj.asInstanceOf[IAdvancedVideoCaptureDeviceController]
  }
}

