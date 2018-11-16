package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Methods defined by the ConnectivityManager class enable enforcement of traffic routing on a specific network adapter for the specified destination suffix. Once a policy is set using AddHttpRoutePolicy , traffic that matches the policy will either be routed or dropped. */
@JSGlobal("Windows.Networking.Connectivity.ConnectivityManager")
@js.native
abstract class ConnectivityManager () extends js.Object

/** Methods defined by the ConnectivityManager class enable enforcement of traffic routing on a specific network adapter for the specified destination suffix. Once a policy is set using AddHttpRoutePolicy , traffic that matches the policy will either be routed or dropped. */
@JSGlobal("Windows.Networking.Connectivity.ConnectivityManager")
@js.native
object ConnectivityManager extends js.Object {
  /**
                   * Establishes a connection to a specific access point on a network. The request is defined using a CellularApnContext object.
                   * @param CellularApnContext Provides specific details about the APN.
                   * @return The established APN connection.
                   */
  def acquireConnectionAsync(CellularApnContext: winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.CellularApnContext): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.ConnectionSession] = js.native
  /**
                   * Specifies a RoutePolicy that the Http stack (WinInet) will follow when routing traffic.
                   * @param RoutePolicy Indicates the policy for traffic routing.
                   */
  def addHttpRoutePolicy(RoutePolicy: winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.RoutePolicy): scala.Unit = js.native
  /**
                   * Removes a previously specified RoutePolicy from the Http stack (WinInet).
                   * @param RoutePolicy The RoutePolicy to remove.
                   */
  def removeHttpRoutePolicy(RoutePolicy: winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs.RoutePolicy): scala.Unit = js.native
}

