package typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Methods defined by the ConnectivityManager class enable enforcement of traffic routing on a specific network adapter for the specified destination suffix. Once a policy is set using AddHttpRoutePolicy , traffic that matches the policy will either be routed or dropped. */
@JSGlobal("Windows.Networking.Connectivity.ConnectivityManager")
@js.native
abstract class ConnectivityManager () extends js.Object

/* static members */
@JSGlobal("Windows.Networking.Connectivity.ConnectivityManager")
@js.native
object ConnectivityManager extends js.Object {
  /**
    * Establishes a connection to a specific access point on a network. The request is defined using a CellularApnContext object.
    * @param CellularApnContext Provides specific details about the APN.
    * @return The established APN connection.
    */
  def acquireConnectionAsync(CellularApnContext: CellularApnContext): IPromiseWithIAsyncOperation[ConnectionSession] = js.native
  /**
    * Specifies a RoutePolicy that the Http stack (WinInet) will follow when routing traffic.
    * @param RoutePolicy Indicates the policy for traffic routing.
    */
  def addHttpRoutePolicy(RoutePolicy: RoutePolicy): Unit = js.native
  /**
    * Removes a previously specified RoutePolicy from the Http stack (WinInet).
    * @param RoutePolicy The RoutePolicy to remove.
    */
  def removeHttpRoutePolicy(RoutePolicy: RoutePolicy): Unit = js.native
}

