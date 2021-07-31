package typings.winrtUwp.global.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the DisconnectButtonClicked event on the DevicePicker object. */
@JSGlobal("Windows.Devices.Enumeration.DeviceDisconnectButtonClickedEventArgs")
@js.native
abstract class DeviceDisconnectButtonClickedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Devices.Enumeration.DeviceDisconnectButtonClickedEventArgs {
  
  /** The device that the user clicked the disconnect button for. */
  /* CompleteClass */
  var device: typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation = js.native
}
