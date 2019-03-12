package typings
package winrtLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAdvancedVideoCaptureDeviceController extends js.Object {
  def getDeviceProperty(propertyId: java.lang.String): js.Any
  def setDeviceProperty(propertyId: java.lang.String, propertyValue: js.Any): scala.Unit
}

object IAdvancedVideoCaptureDeviceController {
  @scala.inline
  def apply(
    getDeviceProperty: java.lang.String => js.Any,
    setDeviceProperty: (java.lang.String, js.Any) => scala.Unit
  ): IAdvancedVideoCaptureDeviceController = {
    val __obj = js.Dynamic.literal(getDeviceProperty = js.Any.fromFunction1(getDeviceProperty), setDeviceProperty = js.Any.fromFunction2(setDeviceProperty))
  
    __obj.asInstanceOf[IAdvancedVideoCaptureDeviceController]
  }
}

