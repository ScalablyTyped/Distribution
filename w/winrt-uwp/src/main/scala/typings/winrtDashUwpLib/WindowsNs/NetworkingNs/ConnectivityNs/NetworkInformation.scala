package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to network connection information for the local machine. */
@JSGlobal("Windows.Networking.Connectivity.NetworkInformation")
@js.native
abstract class NetworkInformation () extends js.Object

/** Provides access to network connection information for the local machine. */
@JSGlobal("Windows.Networking.Connectivity.NetworkInformation")
@js.native
object NetworkInformation extends js.Object {
  /** Occurs when the network status changes for a connection. */
  @JSName("onnetworkstatuschanged")
  var onnetworkstatuschanged_Original: winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkStatusChangedEventHandler = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_networkstatuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.networkstatuschanged,
    listener: winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkStatusChangedEventHandler
  ): scala.Unit = js.native
  /**
    * Returns an array of ConnectionProfile objects that match the filtering criteria defined by ConnectionProfileFilter .
    * @param pProfileFilter Provides the filtering criteria.
    * @return An array of ConnectionProfile objects.
    */
  def findConnectionProfilesAsync(pProfileFilter: winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.ConnectionProfileFilter): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[_]] = js.native
  /**
    * Gets a list of profiles for connections, active or otherwise, on the local machine.
    * @return An array of ConnectionProfile objects.
    */
  def getConnectionProfiles(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.ConnectionProfile] = js.native
  /**
    * Gets a list of host names associated with the local machine.
    * @return An array of host names for the local machine.
    */
  def getHostNames(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.NetworkingNs.HostName] = js.native
  /**
    * Gets the connection profile associated with the internet connection currently used by the local machine.
    * @return The profile for the connection currently used to connect the machine to the Internet, or null if there is no connection profile with a suitable connection.
    */
  def getInternetConnectionProfile(): winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.ConnectionProfile = js.native
  /**
    * Gets an array of LanIdentifier objects that contain locality information for each NetworkAdapter object that currently connected to a network.
    * @return An array of LanIdentifier objects.
    */
  def getLanIdentifiers(): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.LanIdentifier] = js.native
  /**
    * Gets proxy configuration for a connection using the specified URI.
    * @param uri The proxy configuration URI.
    * @return Information about the connection proxy.
    */
  def getProxyConfigurationAsync(uri: winrtDashUwpLib.WindowsNs.FoundationNs.Uri): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.ProxyConfiguration] = js.native
  /**
    * Gets a sorted list of EndpointPair objects.
    * @param destinationList A list of EndpointPair objects to be sorted.
    * @param sortOptions Indicates sorting options for the returned array.
    * @return A sorted array of EndpointPair objects.
    */
  def getSortedEndpointPairs(
    destinationList: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtDashUwpLib.WindowsNs.NetworkingNs.EndpointPair],
    sortOptions: winrtDashUwpLib.WindowsNs.NetworkingNs.HostNameSortOptions
  ): winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtDashUwpLib.WindowsNs.NetworkingNs.EndpointPair] = js.native
  /** Occurs when the network status changes for a connection. */
  def onnetworkstatuschanged(ev: winrtDashUwpLib.WindowsNs.WinRTEvent[_]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_networkstatuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.networkstatuschanged,
    listener: winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.NetworkStatusChangedEventHandler
  ): scala.Unit = js.native
}

