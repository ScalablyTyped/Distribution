package typings
package twilioDashChatLib.libDataChannelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents channels collection
  * {@see Channel}
  */
@JSImport("twilio-chat/lib/data/channels", "Channels")
@js.native
class Channels protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(services: ChannelsServices) = this()
  var _wrapPaginator: js.Any = js.native
  val channels: stdLib.Map[java.lang.String, twilioDashChatLib.libChannelMod.Channel] = js.native
  var getMap: js.Any = js.native
  var onChannelRemoved: js.Any = js.native
  var registerForEvents: js.Any = js.native
  var services: js.Any = js.native
  var syncListFetched: js.Any = js.native
  val syncListRead: twilioDashChatLib.libUtilDeferredMod.Deferred[scala.Boolean] = js.native
  val thumbstones: js.Any = js.native
  var upsertChannel: js.Any = js.native
  /**
    * Add channel to server
    * @private
    * @returns {Promise<Channel|SessionError>} Channel
    */
  def addChannel(options: js.Any): js.Promise[twilioDashChatLib.libChannelMod.Channel] = js.native
  /**
    * Fetch channels list and instantiate all necessary objects
    */
  def fetchChannels(): scala.Unit = js.native
  def getChannel(sid: java.lang.String): js.Promise[twilioDashChatLib.libChannelMod.Channel] = js.native
  def getChannels(args: js.Any): js.Promise[_] = js.native
  def pushChannel(descriptor: twilioDashChatLib.libChanneldescriptorMod.ChannelDescriptor): js.Promise[twilioDashChatLib.libChannelMod.Channel] = js.native
}

