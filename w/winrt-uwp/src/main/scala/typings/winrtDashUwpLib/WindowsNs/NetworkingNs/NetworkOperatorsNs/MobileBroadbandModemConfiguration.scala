package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.NetworkOperatorsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains details about the mobile broadband modem configuration. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandModemConfiguration")
@js.native
abstract class MobileBroadbandModemConfiguration () extends js.Object {
  /** Gets the home provider ID associated with the mobile broadband modem. */
  var homeProviderId: java.lang.String = js.native
  /** Gets the home provider name for the mobile broadband modem. */
  var homeProviderName: java.lang.String = js.native
  /** Gets an object representing the Universal Integrated Circuit Card (UICC), commonly called a "SIM card", associated with the mobile broadband modem. */
  var uicc: MobileBroadbandUicc = js.native
}

