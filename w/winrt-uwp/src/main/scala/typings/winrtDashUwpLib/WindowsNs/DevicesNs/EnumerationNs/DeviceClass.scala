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
  
  /* 0 */ val all: all with scala.Double = js.native
  /* 1 */ val audioCapture: audioCapture with scala.Double = js.native
  /* 2 */ val audioRender: audioRender with scala.Double = js.native
  /* 5 */ val imageScanner: imageScanner with scala.Double = js.native
  /* 6 */ val location: location with scala.Double = js.native
  /* 3 */ val portableStorageDevice: portableStorageDevice with scala.Double = js.native
  /* 4 */ val videoCapture: videoCapture with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.DevicesNs.EnumerationNs.DeviceClass with scala.Double] = js.native
}

