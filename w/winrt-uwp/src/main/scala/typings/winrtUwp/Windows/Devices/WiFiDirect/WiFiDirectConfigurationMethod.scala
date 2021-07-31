package typings.winrtUwp.Windows.Devices.WiFiDirect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WiFiDirectConfigurationMethod extends StObject
/** Specifies a Wi-Fi Direct configuration method. Configuration is how a user tells one piece of Wi-Fi Direct equipment to connect to another piece of Wi-Fi Direct equipment. */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectConfigurationMethod")
@js.native
object WiFiDirectConfigurationMethod extends StObject {
  
  /** This device accepts connections from devices that provide the PIN this device currently displays. */
  @js.native
  sealed trait displayPin
    extends StObject
       with WiFiDirectConfigurationMethod
  
  /** This device accepts entry of the PIN being displayed on the accepting device. */
  @js.native
  sealed trait providePin
    extends StObject
       with WiFiDirectConfigurationMethod
  
  /** This device uses the pushbutton method for pairing. A user pushes a button on both the connecting device and the accepting device in order to establish a connection between them. */
  @js.native
  sealed trait pushButton
    extends StObject
       with WiFiDirectConfigurationMethod
}
