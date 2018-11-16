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
  
  val all: all with java.lang.String = js.native
  val audioCapture: audioCapture with java.lang.String = js.native
  val audioRender: audioRender with java.lang.String = js.native
  val portableStorageDevice: portableStorageDevice with java.lang.String = js.native
  val videoCapture: videoCapture with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.DevicesNs.EnumerationNs.DeviceClass with java.lang.String] = js.native
}

