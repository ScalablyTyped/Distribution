package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Reports results of a call to MobileBroadbandUicc.GetUiccAppsAsync . */
trait MobileBroadbandUiccAppsResult extends StObject {
  
  /** Gets the status of the completed MobileBroadbandUicc.GetUiccAppsAsync operation. If this value is not Success, then other properties may not be valid. */
  var status: MobileBroadbandUiccAppOperationStatus
  
  /** A list of UICC applications retrieved using MobileBroadbandUicc.GetUiccAppsAsync . Note that this is only valid when Status is Success. */
  var uiccApps: IVectorView[MobileBroadbandUiccApp]
}
object MobileBroadbandUiccAppsResult {
  
  inline def apply(status: MobileBroadbandUiccAppOperationStatus, uiccApps: IVectorView[MobileBroadbandUiccApp]): MobileBroadbandUiccAppsResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], uiccApps = uiccApps.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandUiccAppsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MobileBroadbandUiccAppsResult] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: MobileBroadbandUiccAppOperationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUiccApps(value: IVectorView[MobileBroadbandUiccApp]): Self = StObject.set(x, "uiccApps", value.asInstanceOf[js.Any])
  }
}
