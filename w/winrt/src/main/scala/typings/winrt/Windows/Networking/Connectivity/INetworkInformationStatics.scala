package typings.winrt.Windows.Networking.Connectivity

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Networking.EndpointPair
import typings.winrt.Windows.Networking.HostName
import typings.winrt.Windows.Networking.HostNameSortOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INetworkInformationStatics extends js.Object {
  var onnetworkstatuschanged: js.Any = js.native
  def getConnectionProfiles(): IVectorView[ConnectionProfile] = js.native
  def getHostNames(): IVectorView[HostName] = js.native
  def getInternetConnectionProfile(): ConnectionProfile = js.native
  def getLanIdentifiers(): IVectorView[LanIdentifier] = js.native
  def getProxyConfigurationAsync(uri: Uri): IAsyncOperation[ProxyConfiguration] = js.native
  def getSortedEndpointPairs(destinationList: IIterable[EndpointPair], sortOptions: HostNameSortOptions): IVectorView[EndpointPair] = js.native
}

object INetworkInformationStatics {
  @scala.inline
  def apply(
    getConnectionProfiles: () => IVectorView[ConnectionProfile],
    getHostNames: () => IVectorView[HostName],
    getInternetConnectionProfile: () => ConnectionProfile,
    getLanIdentifiers: () => IVectorView[LanIdentifier],
    getProxyConfigurationAsync: Uri => IAsyncOperation[ProxyConfiguration],
    getSortedEndpointPairs: (IIterable[EndpointPair], HostNameSortOptions) => IVectorView[EndpointPair],
    onnetworkstatuschanged: js.Any
  ): INetworkInformationStatics = {
    val __obj = js.Dynamic.literal(getConnectionProfiles = js.Any.fromFunction0(getConnectionProfiles), getHostNames = js.Any.fromFunction0(getHostNames), getInternetConnectionProfile = js.Any.fromFunction0(getInternetConnectionProfile), getLanIdentifiers = js.Any.fromFunction0(getLanIdentifiers), getProxyConfigurationAsync = js.Any.fromFunction1(getProxyConfigurationAsync), getSortedEndpointPairs = js.Any.fromFunction2(getSortedEndpointPairs), onnetworkstatuschanged = onnetworkstatuschanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[INetworkInformationStatics]
  }
  @scala.inline
  implicit class INetworkInformationStaticsOps[Self <: INetworkInformationStatics] (val x: Self) extends AnyVal {
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
    def setGetConnectionProfiles(value: () => IVectorView[ConnectionProfile]): Self = this.set("getConnectionProfiles", js.Any.fromFunction0(value))
    @scala.inline
    def setGetHostNames(value: () => IVectorView[HostName]): Self = this.set("getHostNames", js.Any.fromFunction0(value))
    @scala.inline
    def setGetInternetConnectionProfile(value: () => ConnectionProfile): Self = this.set("getInternetConnectionProfile", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLanIdentifiers(value: () => IVectorView[LanIdentifier]): Self = this.set("getLanIdentifiers", js.Any.fromFunction0(value))
    @scala.inline
    def setGetProxyConfigurationAsync(value: Uri => IAsyncOperation[ProxyConfiguration]): Self = this.set("getProxyConfigurationAsync", js.Any.fromFunction1(value))
    @scala.inline
    def setGetSortedEndpointPairs(value: (IIterable[EndpointPair], HostNameSortOptions) => IVectorView[EndpointPair]): Self = this.set("getSortedEndpointPairs", js.Any.fromFunction2(value))
    @scala.inline
    def setOnnetworkstatuschanged(value: js.Any): Self = this.set("onnetworkstatuschanged", value.asInstanceOf[js.Any])
  }
  
}

