package typings.winrtUwp.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Indicates which properties of a network have changed after a network state change background trigger. */
trait NetworkStateChangeEventDetails extends StObject {
  
  /** Indicates if a connected network has a new connection cost. */
  var hasNewConnectionCost: Boolean
  
  /** Indicates a connected network has a new domain connectivity level. */
  var hasNewDomainConnectivityLevel: Boolean
  
  /** Indicates if the list of host names returned by GetHostNames has changed. */
  var hasNewHostNameList: Boolean
  
  /** Indicates if the local machine has a new connection profile associated with the current internet connection. */
  var hasNewInternetConnectionProfile: Boolean
  
  /** Indicates if the network connectivity level for any connection profiles has changed. */
  var hasNewNetworkConnectivityLevel: Boolean
  
  /** Gets a value indicating whether the network state change event shows a new tethering client count. */
  var hasNewTetheringClientCount: Boolean
  
  /** Gets a value that indicates whether the tethering operational state has changed. */
  var hasNewTetheringOperationalState: Boolean
  
  /** Indicates if the network state change event represents a change to the registration state of a WWAN connection. The current registration state can be retrieved from WwanConnectionProfileDetails.GetNetworkRegistrationState . */
  var hasNewWwanRegistrationState: Boolean
}
object NetworkStateChangeEventDetails {
  
  inline def apply(
    hasNewConnectionCost: Boolean,
    hasNewDomainConnectivityLevel: Boolean,
    hasNewHostNameList: Boolean,
    hasNewInternetConnectionProfile: Boolean,
    hasNewNetworkConnectivityLevel: Boolean,
    hasNewTetheringClientCount: Boolean,
    hasNewTetheringOperationalState: Boolean,
    hasNewWwanRegistrationState: Boolean
  ): NetworkStateChangeEventDetails = {
    val __obj = js.Dynamic.literal(hasNewConnectionCost = hasNewConnectionCost.asInstanceOf[js.Any], hasNewDomainConnectivityLevel = hasNewDomainConnectivityLevel.asInstanceOf[js.Any], hasNewHostNameList = hasNewHostNameList.asInstanceOf[js.Any], hasNewInternetConnectionProfile = hasNewInternetConnectionProfile.asInstanceOf[js.Any], hasNewNetworkConnectivityLevel = hasNewNetworkConnectivityLevel.asInstanceOf[js.Any], hasNewTetheringClientCount = hasNewTetheringClientCount.asInstanceOf[js.Any], hasNewTetheringOperationalState = hasNewTetheringOperationalState.asInstanceOf[js.Any], hasNewWwanRegistrationState = hasNewWwanRegistrationState.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkStateChangeEventDetails]
  }
  
  extension [Self <: NetworkStateChangeEventDetails](x: Self) {
    
    inline def setHasNewConnectionCost(value: Boolean): Self = StObject.set(x, "hasNewConnectionCost", value.asInstanceOf[js.Any])
    
    inline def setHasNewDomainConnectivityLevel(value: Boolean): Self = StObject.set(x, "hasNewDomainConnectivityLevel", value.asInstanceOf[js.Any])
    
    inline def setHasNewHostNameList(value: Boolean): Self = StObject.set(x, "hasNewHostNameList", value.asInstanceOf[js.Any])
    
    inline def setHasNewInternetConnectionProfile(value: Boolean): Self = StObject.set(x, "hasNewInternetConnectionProfile", value.asInstanceOf[js.Any])
    
    inline def setHasNewNetworkConnectivityLevel(value: Boolean): Self = StObject.set(x, "hasNewNetworkConnectivityLevel", value.asInstanceOf[js.Any])
    
    inline def setHasNewTetheringClientCount(value: Boolean): Self = StObject.set(x, "hasNewTetheringClientCount", value.asInstanceOf[js.Any])
    
    inline def setHasNewTetheringOperationalState(value: Boolean): Self = StObject.set(x, "hasNewTetheringOperationalState", value.asInstanceOf[js.Any])
    
    inline def setHasNewWwanRegistrationState(value: Boolean): Self = StObject.set(x, "hasNewWwanRegistrationState", value.asInstanceOf[js.Any])
  }
}
