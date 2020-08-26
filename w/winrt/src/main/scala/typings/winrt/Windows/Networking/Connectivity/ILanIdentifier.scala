package typings.winrt.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILanIdentifier extends js.Object {
  var infrastructureId: LanIdentifierData = js.native
  var networkAdapterId: String = js.native
  var portId: LanIdentifierData = js.native
}

object ILanIdentifier {
  @scala.inline
  def apply(infrastructureId: LanIdentifierData, networkAdapterId: String, portId: LanIdentifierData): ILanIdentifier = {
    val __obj = js.Dynamic.literal(infrastructureId = infrastructureId.asInstanceOf[js.Any], networkAdapterId = networkAdapterId.asInstanceOf[js.Any], portId = portId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILanIdentifier]
  }
  @scala.inline
  implicit class ILanIdentifierOps[Self <: ILanIdentifier] (val x: Self) extends AnyVal {
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
    def setInfrastructureId(value: LanIdentifierData): Self = this.set("infrastructureId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNetworkAdapterId(value: String): Self = this.set("networkAdapterId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPortId(value: LanIdentifierData): Self = this.set("portId", value.asInstanceOf[js.Any])
  }
  
}

