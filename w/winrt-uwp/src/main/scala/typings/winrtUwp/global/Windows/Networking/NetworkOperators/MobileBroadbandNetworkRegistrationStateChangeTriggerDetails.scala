package typings.winrtUwp.global.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides details for a network registration state change notification. */
@JSGlobal("Windows.Networking.NetworkOperators.MobileBroadbandNetworkRegistrationStateChangeTriggerDetails")
@js.native
abstract class MobileBroadbandNetworkRegistrationStateChangeTriggerDetails ()
  extends StObject
     with typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandNetworkRegistrationStateChangeTriggerDetails {
  
  /** Gets the collection of network registration state changes associated with this notification. */
  /* CompleteClass */
  var networkRegistrationStateChanges: IVectorView[
    typings.winrtUwp.Windows.Networking.NetworkOperators.MobileBroadbandNetworkRegistrationStateChange
  ] = js.native
}
