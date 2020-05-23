package typings.winrtUwp.global.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to access information specific to a WWAN connection. */
@JSGlobal("Windows.Networking.Connectivity.WwanConnectionProfileDetails")
@js.native
abstract class WwanConnectionProfileDetails ()
  extends typings.winrtUwp.Windows.Networking.Connectivity.WwanConnectionProfileDetails {
  /** Indicates the name of the access point used to establish the WWAN connection. */
  /* CompleteClass */
  override var accessPointName: String = js.native
  /** Indicates the Home Network Provider ID. */
  /* CompleteClass */
  override var homeProviderId: String = js.native
  /**
    * Indicates the class of data service offered by the network currently in use for the WWAN connection.
    * @return The class of data service currently provided.
    */
  /* CompleteClass */
  override def getCurrentDataClass(): typings.winrtUwp.Windows.Networking.Connectivity.WwanDataClass = js.native
  /**
    * Retrieves the current network registration state for the WWAN connection.
    * @return The current network registration state.
    */
  /* CompleteClass */
  override def getNetworkRegistrationState(): typings.winrtUwp.Windows.Networking.Connectivity.WwanNetworkRegistrationState = js.native
}

