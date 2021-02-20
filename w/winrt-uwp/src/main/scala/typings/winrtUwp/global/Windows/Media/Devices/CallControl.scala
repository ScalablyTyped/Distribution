package typings.winrtUwp.global.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the properties, commands and events for handling calls on a telephony related device. */
@JSGlobal("Windows.Media.Devices.CallControl")
@js.native
abstract class CallControl ()
  extends typings.winrtUwp.Windows.Media.Devices.CallControl
object CallControl {
  
  /**
    * Returns a CallControl class that represents the audio communications device specified by the DeviceInformation ID being passed.
    * @param deviceId The DeviceInformation ID of the specified audio communications device.
    * @return A class that represents the specified audio communications device.
    */
  /* static member */
  @JSGlobal("Windows.Media.Devices.CallControl.fromId")
  @js.native
  def fromId(deviceId: String): typings.winrtUwp.Windows.Media.Devices.CallControl = js.native
  
  /**
    * Returns a CallControl class that represents the default audio communications device.
    * @return A class that represents the default audio communications device.
    */
  /* static member */
  @JSGlobal("Windows.Media.Devices.CallControl.getDefault")
  @js.native
  def getDefault(): typings.winrtUwp.Windows.Media.Devices.CallControl = js.native
}
