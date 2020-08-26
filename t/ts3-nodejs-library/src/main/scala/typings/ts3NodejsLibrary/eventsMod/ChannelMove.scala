package typings.ts3NodejsLibrary.eventsMod

import typings.ts3NodejsLibrary.channelMod.TeamSpeakChannel
import typings.ts3NodejsLibrary.clientMod.TeamSpeakClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelMove extends js.Object {
  var channel: TeamSpeakChannel = js.native
  var invoker: TeamSpeakClient = js.native
  var order: Double = js.native
  var parent: TeamSpeakChannel = js.native
}

object ChannelMove {
  @scala.inline
  def apply(channel: TeamSpeakChannel, invoker: TeamSpeakClient, order: Double, parent: TeamSpeakChannel): ChannelMove = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], invoker = invoker.asInstanceOf[js.Any], order = order.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelMove]
  }
  @scala.inline
  implicit class ChannelMoveOps[Self <: ChannelMove] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChannel(value: TeamSpeakChannel): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def setInvoker(value: TeamSpeakClient): Self = this.set("invoker", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrder(value: Double): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: TeamSpeakChannel): Self = this.set("parent", value.asInstanceOf[js.Any])
  }
  
}

