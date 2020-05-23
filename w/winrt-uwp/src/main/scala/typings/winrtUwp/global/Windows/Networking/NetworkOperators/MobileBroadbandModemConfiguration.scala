package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains details about the mobile broadband modem configuration. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandModemConfiguration")
@js.native
abstract class MobileBroadbandModemConfiguration ()
  extends typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandModemConfiguration {
  /** Gets the home provider ID associated with the mobile broadband modem. */
  /* CompleteClass */
  override var homeProviderId: String = js.native
  /** Gets the home provider name for the mobile broadband modem. */
  /* CompleteClass */
  override var homeProviderName: String = js.native
  /** Gets an object representing the Universal Integrated Circuit Card (UICC), commonly called a "SIM card", associated with the mobile broadband modem. */
  /* CompleteClass */
  override var uicc: typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandUicc = js.native
}

