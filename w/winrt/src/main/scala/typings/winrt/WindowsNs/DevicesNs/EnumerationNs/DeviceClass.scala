package typings.winrt.WindowsNs.DevicesNs.EnumerationNs

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
  
  /* 0 */ val all: typings.winrt.WindowsNs.DevicesNs.EnumerationNs.DeviceClass.all with Double = js.native
  /* 1 */ val audioCapture: typings.winrt.WindowsNs.DevicesNs.EnumerationNs.DeviceClass.audioCapture with Double = js.native
  /* 2 */ val audioRender: typings.winrt.WindowsNs.DevicesNs.EnumerationNs.DeviceClass.audioRender with Double = js.native
  /* 3 */ val portableStorageDevice: typings.winrt.WindowsNs.DevicesNs.EnumerationNs.DeviceClass.portableStorageDevice with Double = js.native
  /* 4 */ val videoCapture: typings.winrt.WindowsNs.DevicesNs.EnumerationNs.DeviceClass.videoCapture with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeviceClass with Double] = js.native
}

