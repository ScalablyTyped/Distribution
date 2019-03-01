package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ConnectivityNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("roaming")(roaming)
    __obj.updateDynamic("shared")(shared)
    __obj.asInstanceOf[NetworkUsageStates]
  }
}

