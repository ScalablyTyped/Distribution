package typings
package winrtLib.WindowsNs.DevicesNs.EnumerationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeviceClass extends js.Object

@JSGlobal("Windows.Devices.Enumeration.DeviceClass")
@js.native
object DeviceClass extends js.Object {
  @js.native
  sealed trait all
    extends winrtLib.WindowsNs.DevicesNs.EnumerationNs.DeviceClass
  
  @js.native
  sealed trait audioCapture
    extends winrtLib.WindowsNs.DevicesNs.EnumerationNs.DeviceClass
  
  @js.native
  sealed trait audioRender
    extends winrtLib.WindowsNs.DevicesNs.EnumerationNs.DeviceClass
  
  @js.native
  sealed trait portableStorageDevice
    extends winrtLib.WindowsNs.DevicesNs.EnumerationNs.DeviceClass
  
  @js.native
  sealed trait videoCapture
    extends winrtLib.WindowsNs.DevicesNs.EnumerationNs.DeviceClass
  
  /* 0 */ val all: all with scala.Double = js.native
  /* 1 */ val audioCapture: audioCapture with scala.Double = js.native
  /* 2 */ val audioRender: audioRender with scala.Double = js.native
  /* 3 */ val portableStorageDevice: portableStorageDevice with scala.Double = js.native
  /* 4 */ val videoCapture: videoCapture with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.DevicesNs.EnumerationNs.DeviceClass with scala.Double] = js.native
}

