package typings.twilioDashChat.libServicesNetworkMod

import typings.twilioDashChat.libInterfacesTransportMod.Transport
import typings.twilioDashChat.libSessionMod.Session
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkServices extends js.Object {
  var session: Session
  var transport: Transport
}

object NetworkServices {
  @scala.inline
  def apply(session: Session, transport: Transport): NetworkServices = {
    val __obj = js.Dynamic.literal(session = session.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NetworkServices]
  }
}

