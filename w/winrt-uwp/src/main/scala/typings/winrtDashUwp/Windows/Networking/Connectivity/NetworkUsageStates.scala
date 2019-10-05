package typings.winrtDashUwp.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the desired state of the connection profile for which usage data is returned by the method GetNetworkUsageAsync . */
trait NetworkUsageStates extends js.Object {
  /** Defines the desired roaming state of the network connection. */
  var roaming: TriStates
  /** Defines the desired sharing state of the network connection. */
  var shared: TriStates
}

object NetworkUsageStates {
  @scala.inline
  def apply(roaming: TriStates, shared: TriStates): NetworkUsageStates = {
    val __obj = js.Dynamic.literal(roaming = roaming, shared = shared)
  
    __obj.asInstanceOf[NetworkUsageStates]
  }
}

