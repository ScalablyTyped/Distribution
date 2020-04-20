package typings.winrt.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILanIdentifier extends js.Object {
  var infrastructureId: LanIdentifierData
  var networkAdapterId: String
  var portId: LanIdentifierData
}

object ILanIdentifier {
  @scala.inline
  def apply(infrastructureId: LanIdentifierData, networkAdapterId: String, portId: LanIdentifierData): ILanIdentifier = {
    val __obj = js.Dynamic.literal(infrastructureId = infrastructureId.asInstanceOf[js.Any], networkAdapterId = networkAdapterId.asInstanceOf[js.Any], portId = portId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILanIdentifier]
  }
}

