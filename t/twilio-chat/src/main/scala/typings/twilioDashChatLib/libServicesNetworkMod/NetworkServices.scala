package typings
package twilioDashChatLib.libServicesNetworkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkServices extends js.Object {
  var session: twilioDashChatLib.libSessionMod.Session
  var transport: twilioDashChatLib.libInterfacesTransportMod.Transport
}

object NetworkServices {
  @scala.inline
  def apply(
    session: twilioDashChatLib.libSessionMod.Session,
    transport: twilioDashChatLib.libInterfacesTransportMod.Transport
  ): NetworkServices = {
    val __obj = js.Dynamic.literal(session = session, transport = transport)
  
    __obj.asInstanceOf[NetworkServices]
  }
}

