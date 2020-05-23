package typings.winrtUwp.global.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to property values that indicate the current cost of a network connection. */
@JSGlobal("Windows.Networking.Connectivity.ConnectionCost")
@js.native
abstract class ConnectionCost ()
  extends typings.winrtUwp.Windows.Networking.Connectivity.ConnectionCost {
  /** Gets a value that indicates if a connection is approaching the data usage allowance specified by the data plan. */
  /* CompleteClass */
  override var approachingDataLimit: Boolean = js.native
  /** Gets a value that indicates whether background data usage has been restricted. */
  /* CompleteClass */
  override var backgroundDataUsageRestricted: Boolean = js.native
  /** Gets a value that indicates the current network cost for a connection. */
  /* CompleteClass */
  override var networkCostType: typings.winrtUwp.Windows.Networking.Connectivity.NetworkCostType = js.native
  /** Gets a value that indicates if the connection has exceeded the data usage allowance specified by the data plan. */
  /* CompleteClass */
  override var overDataLimit: Boolean = js.native
  /** Gets a value that indicates whether the connection is connected to a network outside of the home provider. */
  /* CompleteClass */
  override var roaming: Boolean = js.native
}

