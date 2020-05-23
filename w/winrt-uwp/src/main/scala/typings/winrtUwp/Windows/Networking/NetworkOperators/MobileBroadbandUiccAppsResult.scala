package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reports results of a call to MobileBroadbandUicc.GetUiccAppsAsync . */
trait MobileBroadbandUiccAppsResult extends js.Object {
  /** Gets the status of the completed MobileBroadbandUicc.GetUiccAppsAsync operation. If this value is not Success, then other properties may not be valid. */
  var status: MobileBroadbandUiccAppOperationStatus
  /** A list of UICC applications retrieved using MobileBroadbandUicc.GetUiccAppsAsync . Note that this is only valid when Status is Success. */
  var uiccApps: IVectorView[MobileBroadbandUiccApp]
}

object MobileBroadbandUiccAppsResult {
  @scala.inline
  def apply(status: MobileBroadbandUiccAppOperationStatus, uiccApps: IVectorView[MobileBroadbandUiccApp]): MobileBroadbandUiccAppsResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], uiccApps = uiccApps.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandUiccAppsResult]
  }
}

