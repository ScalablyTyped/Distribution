package typings
package winrtLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INetworkInformationStatics extends js.Object {
  var onnetworkstatuschanged: js.Any
  def getConnectionProfiles(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ConnectionProfile]
  def getHostNames(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.NetworkingNs.HostName]
  def getInternetConnectionProfile(): ConnectionProfile
  def getLanIdentifiers(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[LanIdentifier]
  def getProxyConfigurationAsync(uri: winrtLib.WindowsNs.FoundationNs.Uri): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[ProxyConfiguration]
  def getSortedEndpointPairs(
    destinationList: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtLib.WindowsNs.NetworkingNs.EndpointPair],
    sortOptions: winrtLib.WindowsNs.NetworkingNs.HostNameSortOptions
  ): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.NetworkingNs.EndpointPair]
}

object INetworkInformationStatics {
  @scala.inline
  def apply(
    getConnectionProfiles: () => winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ConnectionProfile],
    getHostNames: () => winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.NetworkingNs.HostName],
    getInternetConnectionProfile: () => ConnectionProfile,
    getLanIdentifiers: () => winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[LanIdentifier],
    getProxyConfigurationAsync: winrtLib.WindowsNs.FoundationNs.Uri => winrtLib.WindowsNs.FoundationNs.IAsyncOperation[ProxyConfiguration],
    getSortedEndpointPairs: (winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtLib.WindowsNs.NetworkingNs.EndpointPair], winrtLib.WindowsNs.NetworkingNs.HostNameSortOptions) => winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.NetworkingNs.EndpointPair],
    onnetworkstatuschanged: js.Any
  ): INetworkInformationStatics = {
    val __obj = js.Dynamic.literal(getConnectionProfiles = js.Any.fromFunction0(getConnectionProfiles), getHostNames = js.Any.fromFunction0(getHostNames), getInternetConnectionProfile = js.Any.fromFunction0(getInternetConnectionProfile), getLanIdentifiers = js.Any.fromFunction0(getLanIdentifiers), getProxyConfigurationAsync = js.Any.fromFunction1(getProxyConfigurationAsync), getSortedEndpointPairs = js.Any.fromFunction2(getSortedEndpointPairs), onnetworkstatuschanged = onnetworkstatuschanged)
  
    __obj.asInstanceOf[INetworkInformationStatics]
  }
}

