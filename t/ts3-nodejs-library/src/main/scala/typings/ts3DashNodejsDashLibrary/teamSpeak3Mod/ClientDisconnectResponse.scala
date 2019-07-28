package typings.ts3DashNodejsDashLibrary.teamSpeak3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientDisconnectResponse extends js.Object {
  var client: DisconnectedClient
  var event: DisconnectEvent
}

object ClientDisconnectResponse {
  @scala.inline
  def apply(client: DisconnectedClient, event: DisconnectEvent): ClientDisconnectResponse = {
    val __obj = js.Dynamic.literal(client = client, event = event)
  
    __obj.asInstanceOf[ClientDisconnectResponse]
  }
}

