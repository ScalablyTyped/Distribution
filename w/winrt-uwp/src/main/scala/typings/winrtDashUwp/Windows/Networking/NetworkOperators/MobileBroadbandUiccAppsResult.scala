package typings.winrtDashUwp.Windows.Networking.NetworkOperators

import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reports results of a call to MobileBroadbandUicc.GetUiccAppsAsync . */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandUiccAppsResult")
@js.native
abstract class MobileBroadbandUiccAppsResult () extends js.Object {
  /** Gets the status of the completed MobileBroadbandUicc.GetUiccAppsAsync operation. If this value is not Success, then other properties may not be valid. */
  var status: MobileBroadbandUiccAppOperationStatus = js.native
  /** A list of UICC applications retrieved using MobileBroadbandUicc.GetUiccAppsAsync . Note that this is only valid when Status is Success. */
  var uiccApps: IVectorView[MobileBroadbandUiccApp] = js.native
}

