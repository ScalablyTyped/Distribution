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

@JSGlobal("Windows.Networking.Connectivity.NetworkInformation")
@js.native
class NetworkInformation () extends js.Object

/* static members */
@JSGlobal("Windows.Networking.Connectivity.NetworkInformation")
@js.native
object NetworkInformation extends js.Object {
  var onnetworkstatuschanged: js.Any = js.native
  def getConnectionProfiles(): IVectorView[ConnectionProfile] = js.native
  def getHostNames(): IVectorView[HostName] = js.native
  def getInternetConnectionProfile(): ConnectionProfile = js.native
  def getLanIdentifiers(): IVectorView[LanIdentifier] = js.native
  def getProxyConfigurationAsync(uri: Uri): IAsyncOperation[ProxyConfiguration] = js.native
  def getSortedEndpointPairs(destinationList: IIterable[EndpointPair], sortOptions: HostNameSortOptions): IVectorView[EndpointPair] = js.native
}

