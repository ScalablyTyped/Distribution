package typings.winrtUwp.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DevicePairingKinds extends StObject
/** Indicates the action the user will need to take in order to complete the pairing or unpairing action. */
@JSGlobal("Windows.Devices.Enumeration.DevicePairingKinds")
@js.native
object DevicePairingKinds extends StObject {
  
  /** The user needs to confirm they wish to perform the pairing or unpairing action. */
  @js.native
  sealed trait confirmOnly extends DevicePairingKinds
  
  /** A pin is shown on both the device and the application, and the user needs to confirm that they match. */
  @js.native
  sealed trait confirmPinMatch extends DevicePairingKinds
  
  /** A pin is displayed to the user that will need to be entered on the device. In this scenario, the application should Accept the pairing. The device has the authority to cancel the operation if the pin does not match. */
  @js.native
  sealed trait displayPin extends DevicePairingKinds
  
  /** No action is required on the part of the user. In this case, the device object will attempt to pair without any verification. */
  @js.native
  sealed trait none extends DevicePairingKinds
  
  /** A pin is shown on the target device and must be provided to the app. */
  @js.native
  sealed trait providePin extends DevicePairingKinds
}
