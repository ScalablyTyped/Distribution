package typings.twilioChat.channelsMod

import typings.node.eventsMod.EventEmitter
import typings.std.Map
import typings.twilioChat.channeldescriptorMod.ChannelDescriptor
import typings.twilioChat.deferredMod.Deferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents channels collection
  * {@see Channel}
  */
@JSImport("twilio-chat/lib/data/channels", "Channels")
@js.native
class Channels_ protected () extends EventEmitter {
  def this(services: ChannelsServices) = this()
  var _wrapPaginator: js.Any = js.native
  val channels: Map[String, typings.twilioChat.channelMod.Channel] = js.native
  var getMap: js.Any = js.native
  var onChannelRemoved: js.Any = js.native
  var registerForEvents: js.Any = js.native
  var services: js.Any = js.native
  var syncListFetched: js.Any = js.native
  val syncListRead: Deferred[Boolean] = js.native
  val thumbstones: js.Any = js.native
  var upsertChannel: js.Any = js.native
  /**
    * Add channel to server
    * @private
    * @returns {Promise<Channel|SessionError>} Channel
    */
  def addChannel(options: js.Any): js.Promise[typings.twilioChat.channelMod.Channel] = js.native
  /**
    * Fetch channels list and instantiate all necessary objects
    */
  def fetchChannels(): Unit = js.native
  def getChannel(sid: String): js.Promise[typings.twilioChat.channelMod.Channel] = js.native
  def getChannels(args: js.Any): js.Promise[_] = js.native
  def pushChannel(descriptor: ChannelDescriptor): js.Promise[typings.twilioChat.channelMod.Channel] = js.native
}

