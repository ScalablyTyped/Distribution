package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a mobile broadband modem. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandModem")
@js.native
abstract class MobileBroadbandModem ()
  extends typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandModem
/* static members */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandModem")
@js.native
object MobileBroadbandModem extends js.Object {
  
  /**
    * Determine if a mobile broadband device is a Wireless WAN device.
    * @param deviceId The mobile broadband device ID
    * @return The mobile broadband modem.
    */
  def fromId(deviceId: String): typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandModem = js.native
  
  /**
    * Determines the default mobile broadband modem.
    * @return The mobile broadband modem.
    */
  def getDefault(): typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandModem = js.native
  
  /**
    * Gets a device selector for the mobile broadband modem.
    * @return A device selector for the mobile broadband modem.
    */
  def getDeviceSelector(): String = js.native
}
