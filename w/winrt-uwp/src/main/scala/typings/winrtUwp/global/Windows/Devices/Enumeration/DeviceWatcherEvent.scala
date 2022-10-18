package typings.winrtUwp.global.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Triggered when the list of devices is updated after the initial enumeration is complete. */
/* note: abstract class */ @JSGlobal("Windows.Devices.Enumeration.DeviceWatcherEvent")
@js.native
open class DeviceWatcherEvent ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Enumeration.DeviceWatcherEvent {
  
  /** Gets the information for the device associated with the DeviceWatcherEvent . */
  /* CompleteClass */
  var deviceInformation: typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation = js.native
  
  /** Gets updated information for a device updated by the DeviceWatcherEvent . */
  /* CompleteClass */
  var deviceInformationUpdate: typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformationUpdate = js.native
  
  /** Gets the type for the device indicated by the DeviceWatcherEvent . */
  /* CompleteClass */
  var kind: typings.winrtUwp.Windows.Devices.Enumeration.DeviceWatcherEventKind = js.native
}
