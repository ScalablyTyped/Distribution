package typings.winrtUwp.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines the desired state of the connection profile for which usage data is returned by the method GetNetworkUsageAsync . */
@js.native
trait NetworkUsageStates extends js.Object {
  /** Defines the desired roaming state of the network connection. */
  var roaming: TriStates = js.native
  /** Defines the desired sharing state of the network connection. */
  var shared: TriStates = js.native
}

object NetworkUsageStates {
  @scala.inline
  def apply(roaming: TriStates, shared: TriStates): NetworkUsageStates = {
    val __obj = js.Dynamic.literal(roaming = roaming.asInstanceOf[js.Any], shared = shared.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkUsageStates]
  }
  @scala.inline
  implicit class NetworkUsageStatesOps[Self <: NetworkUsageStates] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRoaming(value: TriStates): Self = this.set("roaming", value.asInstanceOf[js.Any])
    @scala.inline
    def setShared(value: TriStates): Self = this.set("shared", value.asInstanceOf[js.Any])
  }
  
}

