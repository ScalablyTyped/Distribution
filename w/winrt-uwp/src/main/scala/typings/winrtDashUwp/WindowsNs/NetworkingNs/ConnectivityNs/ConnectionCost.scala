package typings.winrtDashUwp.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to property values that indicate the current cost of a network connection. */
@JSGlobal("Windows.Networking.Connectivity.ConnectionCost")
@js.native
abstract class ConnectionCost () extends js.Object {
  /** Gets a value that indicates if a connection is approaching the data usage allowance specified by the data plan. */
  var approachingDataLimit: Boolean = js.native
  /** Gets a value that indicates whether background data usage has been restricted. */
  var backgroundDataUsageRestricted: Boolean = js.native
  /** Gets a value that indicates the current network cost for a connection. */
  var networkCostType: NetworkCostType = js.native
  /** Gets a value that indicates if the connection has exceeded the data usage allowance specified by the data plan. */
  var overDataLimit: Boolean = js.native
  /** Gets a value that indicates whether the connection is connected to a network outside of the home provider. */
  var roaming: Boolean = js.native
}

