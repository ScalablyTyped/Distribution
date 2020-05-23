package typings.winrt.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeviceClass extends js.Object

@JSGlobal("Windows.Devices.Enumeration.DeviceClass")
@js.native
object DeviceClass extends js.Object {
  @js.native
  sealed trait all extends DeviceClass
  
  @js.native
  sealed trait audioCapture extends DeviceClass
  
  @js.native
  sealed trait audioRender extends DeviceClass
  
  @js.native
  sealed trait portableStorageDevice extends DeviceClass
  
  @js.native
  sealed trait videoCapture extends DeviceClass
  
}

