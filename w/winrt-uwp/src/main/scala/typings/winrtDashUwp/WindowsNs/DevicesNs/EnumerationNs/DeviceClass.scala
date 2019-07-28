package typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs

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
  sealed trait all extends DeviceClass
  
  /** Indicates that the user wants to enumerate all audio capture devices. */
  @js.native
  sealed trait audioCapture extends DeviceClass
  
  /** Indicates that the user wants to enumerate all audio rendering devices. */
  @js.native
  sealed trait audioRender extends DeviceClass
  
  /** Introduced in Windows 8.1. Indicates that the user wants to enumerate all scanning devices. */
  @js.native
  sealed trait imageScanner extends DeviceClass
  
  /** Introduced in Windows 8.1. Indicates that the user wants to enumerate all location aware devices. */
  @js.native
  sealed trait location extends DeviceClass
  
  /** Indicates that the user wants to enumerate all portable storage devices. */
  @js.native
  sealed trait portableStorageDevice extends DeviceClass
  
  /** Indicates that the user wants to enumerate all video capture devices. */
  @js.native
  sealed trait videoCapture extends DeviceClass
  
  /* 0 */ val all: typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs.DeviceClass.all with Double = js.native
  /* 1 */ val audioCapture: typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs.DeviceClass.audioCapture with Double = js.native
  /* 2 */ val audioRender: typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs.DeviceClass.audioRender with Double = js.native
  /* 5 */ val imageScanner: typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs.DeviceClass.imageScanner with Double = js.native
  /* 6 */ val location: typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs.DeviceClass.location with Double = js.native
  /* 3 */ val portableStorageDevice: typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs.DeviceClass.portableStorageDevice with Double = js.native
  /* 4 */ val videoCapture: typings.winrtDashUwp.WindowsNs.DevicesNs.EnumerationNs.DeviceClass.videoCapture with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeviceClass with Double] = js.native
}

