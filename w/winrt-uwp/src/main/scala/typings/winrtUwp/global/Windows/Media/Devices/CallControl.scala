package typings.winrtUwp.global.Windows.Media.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the properties, commands and events for handling calls on a telephony related device. */
@JSGlobal("Windows.Media.Devices.CallControl")
@js.native
abstract class CallControl ()
  extends typings.winrtUwp.Windows.Media.Devices.CallControl
/* static members */
@JSGlobal("Windows.Media.Devices.CallControl")
@js.native
object CallControl extends js.Object {
  
  /**
    * Returns a CallControl class that represents the audio communications device specified by the DeviceInformation ID being passed.
    * @param deviceId The DeviceInformation ID of the specified audio communications device.
    * @return A class that represents the specified audio communications device.
    */
  def fromId(deviceId: String): typings.winrtUwp.Windows.Media.Devices.CallControl = js.native
  
  /**
    * Returns a CallControl class that represents the default audio communications device.
    * @return A class that represents the default audio communications device.
    */
  def getDefault(): typings.winrtUwp.Windows.Media.Devices.CallControl = js.native
}
