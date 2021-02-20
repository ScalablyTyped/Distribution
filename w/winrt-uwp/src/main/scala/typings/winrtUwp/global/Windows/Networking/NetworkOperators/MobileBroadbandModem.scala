package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a mobile broadband modem. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandModem")
@js.native
abstract class MobileBroadbandModem ()
  extends typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandModem
object MobileBroadbandModem {
  
  /**
    * Determine if a mobile broadband device is a Wireless WAN device.
    * @param deviceId The mobile broadband device ID
    * @return The mobile broadband modem.
    */
  /* static member */
  @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandModem.fromId")
  @js.native
  def fromId(deviceId: String): typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandModem = js.native
  
  /**
    * Determines the default mobile broadband modem.
    * @return The mobile broadband modem.
    */
  /* static member */
  @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandModem.getDefault")
  @js.native
  def getDefault(): typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandModem = js.native
  
  /**
    * Gets a device selector for the mobile broadband modem.
    * @return A device selector for the mobile broadband modem.
    */
  /* static member */
  @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandModem.getDeviceSelector")
  @js.native
  def getDeviceSelector(): String = js.native
}
