package typings.tizenCommonWeb.systeminfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemInfoNetProxyNetwork extends SystemInfoProperty {
  /**
    * Represents the status (ON or OFF) of the net_proxy network.
    */
  val status: String = js.native
}

object SystemInfoNetProxyNetwork {
  @scala.inline
  def apply(status: String): SystemInfoNetProxyNetwork = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoNetProxyNetwork]
  }
  @scala.inline
  implicit class SystemInfoNetProxyNetworkOps[Self <: SystemInfoNetProxyNetwork] (val x: Self) extends AnyVal {
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
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

