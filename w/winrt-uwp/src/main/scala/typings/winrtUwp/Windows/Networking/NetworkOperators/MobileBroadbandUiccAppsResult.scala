package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Reports results of a call to MobileBroadbandUicc.GetUiccAppsAsync . */
@js.native
trait MobileBroadbandUiccAppsResult extends js.Object {
  
  /** Gets the status of the completed MobileBroadbandUicc.GetUiccAppsAsync operation. If this value is not Success, then other properties may not be valid. */
  var status: MobileBroadbandUiccAppOperationStatus = js.native
  
  /** A list of UICC applications retrieved using MobileBroadbandUicc.GetUiccAppsAsync . Note that this is only valid when Status is Success. */
  var uiccApps: IVectorView[MobileBroadbandUiccApp] = js.native
}
object MobileBroadbandUiccAppsResult {
  
  @scala.inline
  def apply(status: MobileBroadbandUiccAppOperationStatus, uiccApps: IVectorView[MobileBroadbandUiccApp]): MobileBroadbandUiccAppsResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], uiccApps = uiccApps.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandUiccAppsResult]
  }
  
  @scala.inline
  implicit class MobileBroadbandUiccAppsResultOps[Self <: MobileBroadbandUiccAppsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStatus(value: MobileBroadbandUiccAppOperationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUiccApps(value: IVectorView[MobileBroadbandUiccApp]): Self = this.set("uiccApps", value.asInstanceOf[js.Any])
  }
}
