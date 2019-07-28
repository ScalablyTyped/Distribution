package typings.winrt.WindowsNs.NetworkingNs.ConnectivityNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IIterable
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.FoundationNs.Uri
import typings.winrt.WindowsNs.NetworkingNs.EndpointPair
import typings.winrt.WindowsNs.NetworkingNs.HostName
import typings.winrt.WindowsNs.NetworkingNs.HostNameSortOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INetworkInformationStatics extends js.Object {
  var onnetworkstatuschanged: js.Any
  def getConnectionProfiles(): IVectorView[ConnectionProfile]
  def getHostNames(): IVectorView[HostName]
  def getInternetConnectionProfile(): ConnectionProfile
  def getLanIdentifiers(): IVectorView[LanIdentifier]
  def getProxyConfigurationAsync(uri: Uri): IAsyncOperation[ProxyConfiguration]
  def getSortedEndpointPairs(destinationList: IIterable[EndpointPair], sortOptions: HostNameSortOptions): IVectorView[EndpointPair]
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
    val __obj = js.Dynamic.literal(getConnectionProfiles = js.Any.fromFunction0(getConnectionProfiles), getHostNames = js.Any.fromFunction0(getHostNames), getInternetConnectionProfile = js.Any.fromFunction0(getInternetConnectionProfile), getLanIdentifiers = js.Any.fromFunction0(getLanIdentifiers), getProxyConfigurationAsync = js.Any.fromFunction1(getProxyConfigurationAsync), getSortedEndpointPairs = js.Any.fromFunction2(getSortedEndpointPairs), onnetworkstatuschanged = onnetworkstatuschanged)
  
    __obj.asInstanceOf[INetworkInformationStatics]
  }
}

