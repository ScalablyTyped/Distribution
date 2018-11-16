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

