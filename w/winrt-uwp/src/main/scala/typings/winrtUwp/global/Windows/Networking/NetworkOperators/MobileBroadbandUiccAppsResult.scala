package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Reports results of a call to MobileBroadbandUicc.GetUiccAppsAsync . */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandUiccAppsResult")
@js.native
abstract class MobileBroadbandUiccAppsResult ()
  extends StObject
     with typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandUiccAppsResult {
  
  /** Gets the status of the completed MobileBroadbandUicc.GetUiccAppsAsync operation. If this value is not Success, then other properties may not be valid. */
  /* CompleteClass */
  var status: typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandUiccAppOperationStatus = js.native
  
  /** A list of UICC applications retrieved using MobileBroadbandUicc.GetUiccAppsAsync . Note that this is only valid when Status is Success. */
  /* CompleteClass */
  var uiccApps: IVectorView[typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandUiccApp] = js.native
}
