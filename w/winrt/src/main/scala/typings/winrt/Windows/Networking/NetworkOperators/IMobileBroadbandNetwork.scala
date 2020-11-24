package typings.winrt.Windows.Networking.NetworkOperators

import typings.winrt.Windows.Networking.Connectivity.NetworkAdapter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMobileBroadbandNetwork extends js.Object {
  
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
  implicit class IMobileBroadbandNetworkOps[Self <: IMobileBroadbandNetwork] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAccessPointName(value: String): Self = this.set("accessPointName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivationNetworkError(value: Double): Self = this.set("activationNetworkError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkAdapter(value: NetworkAdapter): Self = this.set("networkAdapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkRegistrationState(value: NetworkRegistrationState): Self = this.set("networkRegistrationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPacketAttachNetworkError(value: Double): Self = this.set("packetAttachNetworkError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteredDataClass(value: DataClasses): Self = this.set("registeredDataClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteredProviderId(value: String): Self = this.set("registeredProviderId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegisteredProviderName(value: String): Self = this.set("registeredProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrationNetworkError(value: Double): Self = this.set("registrationNetworkError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowConnectionUI(value: () => Unit): Self = this.set("showConnectionUI", js.Any.fromFunction0(value))
  }
}
