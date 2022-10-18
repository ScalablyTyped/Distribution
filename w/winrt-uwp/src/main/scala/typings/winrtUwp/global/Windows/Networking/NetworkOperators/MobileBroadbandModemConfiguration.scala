package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains details about the mobile broadband modem configuration. */
/* note: abstract class */ @JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandModemConfiguration")
@js.native
open class MobileBroadbandModemConfiguration ()
  extends StObject
     with typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandModemConfiguration {
  
  /** Gets the home provider ID associated with the mobile broadband modem. */
  /* CompleteClass */
  var homeProviderId: String = js.native
  
  /** Gets the home provider name for the mobile broadband modem. */
  /* CompleteClass */
  var homeProviderName: String = js.native
  
  /** Gets an object representing the Universal Integrated Circuit Card (UICC), commonly called a "SIM card", associated with the mobile broadband modem. */
  /* CompleteClass */
  var uicc: typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandUicc = js.native
}
