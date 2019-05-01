package typings
package twilioDashChatLib.libSynclistdescriptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("twilio-chat/lib/synclistdescriptor", "SyncListDescriptor")
@js.native
class SyncListDescriptor protected () extends js.Object {
  /**
    * @param {Object} sync list descriptor data object
    * @private
    */
  def this(descriptor: js.Any) = this()
  val channel: java.lang.String = js.native
  val channel_sid: java.lang.String = js.native
  val descriptor: js.Object = js.native
  val lastConsumedMessageIndex: scala.Double = js.native
  val messages: java.lang.String = js.native
  val notificationLevel: twilioDashChatLib.libChannelMod.ChannelNs.NotificationLevel = js.native
  val roster: java.lang.String = js.native
  val status: java.lang.String = js.native
}

