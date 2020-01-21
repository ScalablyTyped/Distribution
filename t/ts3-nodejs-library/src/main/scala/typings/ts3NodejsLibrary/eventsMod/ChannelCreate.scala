package typings.ts3NodejsLibrary.eventsMod

import typings.std.Partial
import typings.ts3NodejsLibrary.channelMod.TeamSpeakChannel
import typings.ts3NodejsLibrary.clientMod.TeamSpeakClient
import typings.ts3NodejsLibrary.queryResponseMod.QueryResponseTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelCreate extends js.Object {
  var channel: TeamSpeakChannel
  var cpid: Double
  var invoker: TeamSpeakClient
  var modified: Partial[QueryResponseTypes]
}

object ChannelCreate {
  @scala.inline
  def apply(
    channel: TeamSpeakChannel,
    cpid: Double,
    invoker: TeamSpeakClient,
    modified: Partial[QueryResponseTypes]
  ): ChannelCreate = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], cpid = cpid.asInstanceOf[js.Any], invoker = invoker.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChannelCreate]
  }
}

