package typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to access information specific to a WWAN connection. */
@JSGlobal("Windows.Networking.Connectivity.WwanConnectionProfileDetails")
@js.native
abstract class WwanConnectionProfileDetails () extends js.Object {
  /** Indicates the name of the access point used to establish the WWAN connection. */
  var accessPointName: String = js.native
  /** Indicates the Home Network Provider ID. */
  var homeProviderId: String = js.native
  /**
    * Indicates the class of data service offered by the network currently in use for the WWAN connection.
    * @return The class of data service currently provided.
    */
  def getCurrentDataClass(): WwanDataClass = js.native
  /**
    * Retrieves the current network registration state for the WWAN connection.
    * @return The current network registration state.
    */
  def getNetworkRegistrationState(): WwanNetworkRegistrationState = js.native
}

