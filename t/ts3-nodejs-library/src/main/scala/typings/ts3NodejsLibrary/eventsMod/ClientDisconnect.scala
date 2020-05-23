package typings.ts3NodejsLibrary.eventsMod

import typings.ts3NodejsLibrary.anon.Cfid
import typings.ts3NodejsLibrary.clientMod.TeamSpeakClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientDisconnect extends js.Object {
  var client: js.UndefOr[TeamSpeakClient] = js.undefined
  var event: Cfid
}

object ClientDisconnect {
  @scala.inline
  def apply(event: Cfid, client: TeamSpeakClient = null): ClientDisconnect = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    if (client != null) __obj.updateDynamic("client")(client.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientDisconnect]
  }
}

