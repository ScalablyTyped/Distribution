package typings.ts3NodejsLibrary.eventsMod

import typings.ts3NodejsLibrary.channelMod.TeamSpeakChannel
import typings.ts3NodejsLibrary.clientMod.TeamSpeakClient
import typings.ts3NodejsLibrary.enumMod.ReasonIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientMoved extends js.Object {
  var channel: TeamSpeakChannel
  var client: TeamSpeakClient
  var reasonid: ReasonIdentifier
}

object ClientMoved {
  @scala.inline
  def apply(channel: TeamSpeakChannel, client: TeamSpeakClient, reasonid: ReasonIdentifier): ClientMoved = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], reasonid = reasonid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ClientMoved]
  }
}

