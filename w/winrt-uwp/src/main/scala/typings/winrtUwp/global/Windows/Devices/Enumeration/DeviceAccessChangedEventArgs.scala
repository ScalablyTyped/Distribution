package typings.winrtUwp.global.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the AccessChanged event. */
@JSGlobal("Windows.Devices.Enumeration.DeviceAccessChangedEventArgs")
@js.native
abstract class DeviceAccessChangedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Enumeration.DeviceAccessChangedEventArgs {
  
  /** The new status of access to a device. */
  /* CompleteClass */
  var status: typings.winrtUwp.Windows.Devices.Enumeration.DeviceAccessStatus = js.native
}
