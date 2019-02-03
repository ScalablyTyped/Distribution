package typings
package winrtLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Connectivity.NetworkInformation")
@js.native
class NetworkInformation () extends js.Object

/* static members */
@JSGlobal("Windows.Networking.Connectivity.NetworkInformation")
@js.native
object NetworkInformation extends js.Object {
  var onnetworkstatuschanged: js.Any = js.native
  def getConnectionProfiles(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.ConnectionProfile] = js.native
  def getHostNames(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.NetworkingNs.HostName] = js.native
  def getInternetConnectionProfile(): winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.ConnectionProfile = js.native
  def getLanIdentifiers(): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.LanIdentifier] = js.native
  def getProxyConfigurationAsync(uri: winrtLib.WindowsNs.FoundationNs.Uri): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.NetworkingNs.ConnectivityNs.ProxyConfiguration] = js.native
  def getSortedEndpointPairs(
    destinationList: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtLib.WindowsNs.NetworkingNs.EndpointPair],
    sortOptions: winrtLib.WindowsNs.NetworkingNs.HostNameSortOptions
  ): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.NetworkingNs.EndpointPair] = js.native
}

