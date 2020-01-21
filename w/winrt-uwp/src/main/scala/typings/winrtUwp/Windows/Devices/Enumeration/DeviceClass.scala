package typings.winrtUwp.Windows.Devices.Enumeration

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeviceClass with Double] = js.native
  /* 0 */ @js.native
  object all extends TopLevel[all with Double]
  
  /* 1 */ @js.native
  object audioCapture extends TopLevel[audioCapture with Double]
  
  /* 2 */ @js.native
  object audioRender extends TopLevel[audioRender with Double]
  
  /* 5 */ @js.native
  object imageScanner extends TopLevel[imageScanner with Double]
  
  /* 6 */ @js.native
  object location extends TopLevel[location with Double]
  
  /* 3 */ @js.native
  object portableStorageDevice extends TopLevel[portableStorageDevice with Double]
  
  /* 4 */ @js.native
  object videoCapture extends TopLevel[videoCapture with Double]
  
}

