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
    getConnectionProfiles: js.Function0[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ConnectionProfile]],
    getHostNames: js.Function0[
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.NetworkingNs.HostName]
    ],
    getInternetConnectionProfile: js.Function0[ConnectionProfile],
    getLanIdentifiers: js.Function0[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[LanIdentifier]],
    getProxyConfigurationAsync: js.Function1[
      winrtLib.WindowsNs.FoundationNs.Uri, 
      winrtLib.WindowsNs.FoundationNs.IAsyncOperation[ProxyConfiguration]
    ],
    getSortedEndpointPairs: js.Function2[
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtLib.WindowsNs.NetworkingNs.EndpointPair], 
      winrtLib.WindowsNs.NetworkingNs.HostNameSortOptions, 
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.NetworkingNs.EndpointPair]
    ],
    onnetworkstatuschanged: js.Any
  ): INetworkInformationStatics = {
    val __obj = js.Dynamic.literal(getConnectionProfiles = getConnectionProfiles, getHostNames = getHostNames, getInternetConnectionProfile = getInternetConnectionProfile, getLanIdentifiers = getLanIdentifiers, getProxyConfigurationAsync = getProxyConfigurationAsync, getSortedEndpointPairs = getSortedEndpointPairs, onnetworkstatuschanged = onnetworkstatuschanged)
  
    __obj.asInstanceOf[INetworkInformationStatics]
  }
}

