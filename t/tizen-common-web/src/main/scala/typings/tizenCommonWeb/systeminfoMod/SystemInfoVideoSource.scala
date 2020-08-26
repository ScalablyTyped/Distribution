package typings.tizenCommonWeb.systeminfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemInfoVideoSource extends SystemInfoProperty {
  /**
    * Represents a list of video sources that a device is connected with.
    */
  val connected: js.Array[SystemInfoVideoSourceInfo] = js.native
  /**
    * Represents a list of video sources that a device is not connected with.
    */
  val disconnected: js.Array[SystemInfoVideoSourceInfo] = js.native
}

object SystemInfoVideoSource {
  @scala.inline
  def apply(connected: js.Array[SystemInfoVideoSourceInfo], disconnected: js.Array[SystemInfoVideoSourceInfo]): SystemInfoVideoSource = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], disconnected = disconnected.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoVideoSource]
  }
  @scala.inline
  implicit class SystemInfoVideoSourceOps[Self <: SystemInfoVideoSource] (val x: Self) extends AnyVal {
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
    def setConnectedVarargs(value: SystemInfoVideoSourceInfo*): Self = this.set("connected", js.Array(value :_*))
    @scala.inline
    def setConnected(value: js.Array[SystemInfoVideoSourceInfo]): Self = this.set("connected", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisconnectedVarargs(value: SystemInfoVideoSourceInfo*): Self = this.set("disconnected", js.Array(value :_*))
    @scala.inline
    def setDisconnected(value: js.Array[SystemInfoVideoSourceInfo]): Self = this.set("disconnected", value.asInstanceOf[js.Any])
  }
  
}

