package typings.winrtUwp.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Used to access information specific to a WWAN connection. */
@js.native
trait WwanConnectionProfileDetails extends StObject {
  
  /** Indicates the name of the access point used to establish the WWAN connection. */
  var accessPointName: String = js.native
  
  /**
    * Indicates the class of data service offered by the network currently in use for the WWAN connection.
    * @return The class of data service currently provided.
    */
  def getCurrentDataClass(): WwanDataClass = js.native
  
  /**
    * Retrieves the current network registration state for the WWAN connection.
    * @return The current network registration state.
    */
  def getNetworkRegistrationState(): WwanNetworkRegistrationState = js.native
  
  /** Indicates the Home Network Provider ID. */
  var homeProviderId: String = js.native
}
object WwanConnectionProfileDetails {
  
  @scala.inline
  def apply(
    accessPointName: String,
    getCurrentDataClass: () => WwanDataClass,
    getNetworkRegistrationState: () => WwanNetworkRegistrationState,
    homeProviderId: String
  ): WwanConnectionProfileDetails = {
    val __obj = js.Dynamic.literal(accessPointName = accessPointName.asInstanceOf[js.Any], getCurrentDataClass = js.Any.fromFunction0(getCurrentDataClass), getNetworkRegistrationState = js.Any.fromFunction0(getNetworkRegistrationState), homeProviderId = homeProviderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WwanConnectionProfileDetails]
  }
  
  @scala.inline
  implicit class WwanConnectionProfileDetailsMutableBuilder[Self <: WwanConnectionProfileDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessPointName(value: String): Self = StObject.set(x, "accessPointName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCurrentDataClass(value: () => WwanDataClass): Self = StObject.set(x, "getCurrentDataClass", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNetworkRegistrationState(value: () => WwanNetworkRegistrationState): Self = StObject.set(x, "getNetworkRegistrationState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHomeProviderId(value: String): Self = StObject.set(x, "homeProviderId", value.asInstanceOf[js.Any])
  }
}
