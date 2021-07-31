package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information for the AccountUpdated event. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandAccountUpdatedEventArgs")
@js.native
abstract class MobileBroadbandAccountUpdatedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandAccountUpdatedEventArgs {
  
  /** Gets a value indicating whether the device information has changed for the account. */
  /* CompleteClass */
  var hasDeviceInformationChanged: Boolean = js.native
  
  /** Gets a value that indicates if the CurrentNetwork was updated for the account. */
  /* CompleteClass */
  var hasNetworkChanged: Boolean = js.native
  
  /** Gets the network account Id of the updated account. */
  /* CompleteClass */
  var networkAccountId: String = js.native
}
