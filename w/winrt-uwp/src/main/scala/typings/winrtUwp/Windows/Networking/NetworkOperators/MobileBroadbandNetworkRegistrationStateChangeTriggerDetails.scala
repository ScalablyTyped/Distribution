package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides details for a network registration state change notification. */
trait MobileBroadbandNetworkRegistrationStateChangeTriggerDetails extends StObject {
  
  /** Gets the collection of network registration state changes associated with this notification. */
  var networkRegistrationStateChanges: IVectorView[MobileBroadbandNetworkRegistrationStateChange]
}
object MobileBroadbandNetworkRegistrationStateChangeTriggerDetails {
  
  inline def apply(networkRegistrationStateChanges: IVectorView[MobileBroadbandNetworkRegistrationStateChange]): MobileBroadbandNetworkRegistrationStateChangeTriggerDetails = {
    val __obj = js.Dynamic.literal(networkRegistrationStateChanges = networkRegistrationStateChanges.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandNetworkRegistrationStateChangeTriggerDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MobileBroadbandNetworkRegistrationStateChangeTriggerDetails] (val x: Self) extends AnyVal {
    
    inline def setNetworkRegistrationStateChanges(value: IVectorView[MobileBroadbandNetworkRegistrationStateChange]): Self = StObject.set(x, "networkRegistrationStateChanges", value.asInstanceOf[js.Any])
  }
}
