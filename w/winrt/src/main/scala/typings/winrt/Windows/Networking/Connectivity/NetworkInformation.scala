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

