package typings.winrt.WindowsNs.NetworkingNs.ConnectivityNs

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
    val __obj = js.Dynamic.literal(infrastructureId = infrastructureId, networkAdapterId = networkAdapterId, portId = portId)
  
    __obj.asInstanceOf[ILanIdentifier]
  }
}

