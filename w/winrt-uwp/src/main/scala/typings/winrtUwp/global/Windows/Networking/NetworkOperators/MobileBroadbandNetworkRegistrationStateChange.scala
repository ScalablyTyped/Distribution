package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides details about one network registration state change. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandNetworkRegistrationStateChange")
@js.native
abstract class MobileBroadbandNetworkRegistrationStateChange ()
  extends StObject
     with typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandNetworkRegistrationStateChange {
  
  /** Gets the unique identifier of the device associated with a network registration state change. */
  /* CompleteClass */
  var deviceId: String = js.native
  
  /** Gets an object which contains details about the network associated with this network state change. */
  /* CompleteClass */
  var network: typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandNetwork = js.native
}
