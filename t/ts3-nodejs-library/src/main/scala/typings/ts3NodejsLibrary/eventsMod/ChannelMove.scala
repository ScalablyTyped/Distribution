package typings.ts3NodejsLibrary.eventsMod

import typings.ts3NodejsLibrary.channelMod.TeamSpeakChannel
import typings.ts3NodejsLibrary.clientMod.TeamSpeakClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelMove extends js.Object {
  var channel: TeamSpeakChannel
  var invoker: TeamSpeakClient
  var order: Double
  var parent: TeamSpeakChannel
}

object ChannelMove {
  @scala.inline
  def apply(channel: TeamSpeakChannel, invoker: TeamSpeakClient, order: Double, parent: TeamSpeakChannel): ChannelMove = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], invoker = invoker.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChannelMove]
  }
}

