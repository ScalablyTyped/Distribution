package typings.ts3NodejsLibrary.eventsMod

import typings.ts3NodejsLibrary.clientMod.TeamSpeakClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientConnect extends js.Object {
  var client: TeamSpeakClient
}

object ClientConnect {
  @scala.inline
  def apply(client: TeamSpeakClient): ClientConnect = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientConnect]
  }
}

