package typings.winrt.Windows.Networking.NetworkOperators

import typings.winrt.Windows.Networking.Connectivity.NetworkAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMobileBroadbandNetwork extends StObject {
  
  var accessPointName: String = js.native
  
  var activationNetworkError: Double = js.native
  
  var networkAdapter: NetworkAdapter = js.native
  
  var networkRegistrationState: NetworkRegistrationState = js.native
  
  var packetAttachNetworkError: Double = js.native
  
  var registeredDataClass: DataClasses = js.native
  
  var registeredProviderId: String = js.native
  
  var registeredProviderName: String = js.native
  
  var registrationNetworkError: Double = js.native
  
  def showConnectionUI(): Unit = js.native
}
object IMobileBroadbandNetwork {
  
  @scala.inline
  def apply(
    accessPointName: String,
    activationNetworkError: Double,
    networkAdapter: NetworkAdapter,
    networkRegistrationState: NetworkRegistrationState,
    packetAttachNetworkError: Double,
    registeredDataClass: DataClasses,
    registeredProviderId: String,
    registeredProviderName: String,
    registrationNetworkError: Double,
    showConnectionUI: () => Unit
  ): IMobileBroadbandNetwork = {
    val __obj = js.Dynamic.literal(accessPointName = accessPointName.asInstanceOf[js.Any], activationNetworkError = activationNetworkError.asInstanceOf[js.Any], networkAdapter = networkAdapter.asInstanceOf[js.Any], networkRegistrationState = networkRegistrationState.asInstanceOf[js.Any], packetAttachNetworkError = packetAttachNetworkError.asInstanceOf[js.Any], registeredDataClass = registeredDataClass.asInstanceOf[js.Any], registeredProviderId = registeredProviderId.asInstanceOf[js.Any], registeredProviderName = registeredProviderName.asInstanceOf[js.Any], registrationNetworkError = registrationNetworkError.asInstanceOf[js.Any], showConnectionUI = js.Any.fromFunction0(showConnectionUI))
    __obj.asInstanceOf[IMobileBroadbandNetwork]
  }
  
  @scala.inline
  implicit class IMobileBroadbandNetworkMutableBuilder[Self <: IMobileBroadbandNetwork] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessPointName(value: String): Self = StObject.set(x, "accessPointName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivationNetworkError(value: Double): Self = StObject.set(x, "activationNetworkError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkAdapter(value: NetworkAdapter): Self = StObject.set(x, "networkAdapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkRegistrationState(value: NetworkRegistrationState): Self = StObject.set(x, "networkRegistrationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketAttachNetworkError(value: Double): Self = StObject.set(x, "packetAttachNetworkError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteredDataClass(value: DataClasses): Self = StObject.set(x, "registeredDataClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteredProviderId(value: String): Self = StObject.set(x, "registeredProviderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteredProviderName(value: String): Self = StObject.set(x, "registeredProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrationNetworkError(value: Double): Self = StObject.set(x, "registrationNetworkError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowConnectionUI(value: () => Unit): Self = StObject.set(x, "showConnectionUI", js.Any.fromFunction0(value))
  }
}
