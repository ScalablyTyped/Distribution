package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeviceClass extends js.Object

/** Indicates the type of devices that the user wants to enumerate. */
@JSGlobal("Windows.Devices.Enumeration.DeviceClass")
@js.native
object DeviceClass extends js.Object {
  /** Indicates that the user wants to enumerate all devices. */
  @js.native
  sealed trait all
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceClass
  
  /** Indicates that the user wants to enumerate all audio capture devices. */
  @js.native
  sealed trait audioCapture
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceClass
  
  /** Indicates that the user wants to enumerate all audio rendering devices. */
  @js.native
  sealed trait audioRender
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceClass
  
  /** Introduced in Windows 8.1. Indicates that the user wants to enumerate all scanning devices. */
  @js.native
  sealed trait imageScanner
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceClass
  
  /** Introduced in Windows 8.1. Indicates that the user wants to enumerate all location aware devices. */
  @js.native
  sealed trait location
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceClass
  
  /** Indicates that the user wants to enumerate all portable storage devices. */
  @js.native
  sealed trait portableStorageDevice
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceClass
  
  /** Indicates that the user wants to enumerate all video capture devices. */
  @js.native
  sealed trait videoCapture
    extends winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceClass
  
  val all: all with java.lang.String = js.native
  val audioCapture: audioCapture with java.lang.String = js.native
  val audioRender: audioRender with java.lang.String = js.native
  val imageScanner: imageScanner with java.lang.String = js.native
  val location: location with java.lang.String = js.native
  val portableStorageDevice: portableStorageDevice with java.lang.String = js.native
  val videoCapture: videoCapture with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceClass with java.lang.String
  ] = js.native
}

