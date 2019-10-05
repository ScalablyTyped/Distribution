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

