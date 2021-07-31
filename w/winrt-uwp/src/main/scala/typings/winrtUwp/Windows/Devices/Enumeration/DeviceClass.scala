package typings.winrtUwp.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeviceClass extends StObject
/** Indicates the type of devices that the user wants to enumerate. */
@JSGlobal("Windows.Devices.Enumeration.DeviceClass")
@js.native
object DeviceClass extends StObject {
  
  /** Indicates that the user wants to enumerate all devices. */
  @js.native
  sealed trait all
    extends StObject
       with DeviceClass
  
  /** Indicates that the user wants to enumerate all audio capture devices. */
  @js.native
  sealed trait audioCapture
    extends StObject
       with DeviceClass
  
  /** Indicates that the user wants to enumerate all audio rendering devices. */
  @js.native
  sealed trait audioRender
    extends StObject
       with DeviceClass
  
  /** Introduced in Windows 8.1. Indicates that the user wants to enumerate all scanning devices. */
  @js.native
  sealed trait imageScanner
    extends StObject
       with DeviceClass
  
  /** Introduced in Windows 8.1. Indicates that the user wants to enumerate all location aware devices. */
  @js.native
  sealed trait location
    extends StObject
       with DeviceClass
  
  /** Indicates that the user wants to enumerate all portable storage devices. */
  @js.native
  sealed trait portableStorageDevice
    extends StObject
       with DeviceClass
  
  /** Indicates that the user wants to enumerate all video capture devices. */
  @js.native
  sealed trait videoCapture
    extends StObject
       with DeviceClass
}
