package typings.winrtUwp.global.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information and enables pairing for a device. */
@JSGlobal("Windows.Devices.Enumeration.DeviceInformationPairing")
@js.native
abstract class DeviceInformationPairing ()
  extends typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformationPairing
object DeviceInformationPairing {
  
  /**
    * Attempts to pair for all inbound pairing requests
    * @param pairingKindsSupported The pairing kinds this device supports.
    * @return Whether or not the attempt was successful.
    */
  /* static member */
  @JSGlobal("Windows.Devices.Enumeration.DeviceInformationPairing.tryRegisterForAllInboundPairingRequests")
  @js.native
  def tryRegisterForAllInboundPairingRequests(pairingKindsSupported: typings.winrtUwp.Windows.Devices.Enumeration.DevicePairingKinds): Boolean = js.native
}
