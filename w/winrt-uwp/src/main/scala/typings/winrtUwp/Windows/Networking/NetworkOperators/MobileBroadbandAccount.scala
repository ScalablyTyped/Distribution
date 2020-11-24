package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Networking.Connectivity.ConnectionProfile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a mobile broadband account and related information about the network provider for the account. */
@js.native
trait MobileBroadbandAccount extends js.Object {
  
  /** Gets the mobile broadband device information associated with this account. */
  var currentDeviceInformation: MobileBroadbandDeviceInformation = js.native
  
  /** Gets the Mobile Broadband network object for this account. */
  var currentNetwork: MobileBroadbandNetwork = js.native
  
  /**
    * Retrieves an array of ConnectionProfile objects that represent connections associated with the Mobile Broadband account.
    * @return An array of ConnectionProfile objects.
    */
  def getConnectionProfiles(): IVectorView[ConnectionProfile] = js.native
  
  /** Gets a unique identifier for the mobile broadband account. */
  var networkAccountId: String = js.native
  
  /** A unique identifier for the network provider for the mobile broadband account. */
  var serviceProviderGuid: String = js.native
  
  /** The name of the network provider for the mobile broadband account. */
  var serviceProviderName: String = js.native
}
object MobileBroadbandAccount {
  
  @scala.inline
  def apply(
    currentDeviceInformation: MobileBroadbandDeviceInformation,
    currentNetwork: MobileBroadbandNetwork,
    getConnectionProfiles: () => IVectorView[ConnectionProfile],
    networkAccountId: String,
    serviceProviderGuid: String,
    serviceProviderName: String
  ): MobileBroadbandAccount = {
    val __obj = js.Dynamic.literal(currentDeviceInformation = currentDeviceInformation.asInstanceOf[js.Any], currentNetwork = currentNetwork.asInstanceOf[js.Any], getConnectionProfiles = js.Any.fromFunction0(getConnectionProfiles), networkAccountId = networkAccountId.asInstanceOf[js.Any], serviceProviderGuid = serviceProviderGuid.asInstanceOf[js.Any], serviceProviderName = serviceProviderName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileBroadbandAccount]
  }
  
  @scala.inline
  implicit class MobileBroadbandAccountOps[Self <: MobileBroadbandAccount] (val x: Self) extends AnyVal {
    
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
    def setCurrentDeviceInformation(value: MobileBroadbandDeviceInformation): Self = this.set("currentDeviceInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentNetwork(value: MobileBroadbandNetwork): Self = this.set("currentNetwork", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetConnectionProfiles(value: () => IVectorView[ConnectionProfile]): Self = this.set("getConnectionProfiles", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNetworkAccountId(value: String): Self = this.set("networkAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceProviderGuid(value: String): Self = this.set("serviceProviderGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceProviderName(value: String): Self = this.set("serviceProviderName", value.asInstanceOf[js.Any])
  }
}
