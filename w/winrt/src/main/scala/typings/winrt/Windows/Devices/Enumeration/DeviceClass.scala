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
  
  /* 0 */ val all: typings.winrt.Windows.Devices.Enumeration.DeviceClass.all with Double = js.native
  /* 1 */ val audioCapture: typings.winrt.Windows.Devices.Enumeration.DeviceClass.audioCapture with Double = js.native
  /* 2 */ val audioRender: typings.winrt.Windows.Devices.Enumeration.DeviceClass.audioRender with Double = js.native
  /* 3 */ val portableStorageDevice: typings.winrt.Windows.Devices.Enumeration.DeviceClass.portableStorageDevice with Double = js.native
  /* 4 */ val videoCapture: typings.winrt.Windows.Devices.Enumeration.DeviceClass.videoCapture with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeviceClass with Double] = js.native
}

