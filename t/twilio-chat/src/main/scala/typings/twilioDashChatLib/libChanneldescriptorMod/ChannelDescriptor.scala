package typings
package twilioDashChatLib.libChanneldescriptorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains channel information.
  * Unlike {@link Channel}, this information won't be updated in realtime.
  * To have a fresh data, user should query channel descriptors again.
  *
  * @property {Object} attributes - The Channel's custom attributes
  * @property {String} createdBy - The identity of the User that created Channel
  * @property {Date} dateCreated - The Date Channel was created
  * @property {Date} dateUpdated - The Date Channel was last updated
  * @property {String} friendlyName - The Channel's name
  * @property {Boolean} isPrivate - Whether the channel is private (as opposed to public)
  * @property {Number} lastConsumedMessageIndex - Index of the last Message the User has consumed in Channel
  * @property {Number} membersCount Number of members in a channel
  * @property {Number} messagesCount Number of messages in a channel
  * @property {String} sid - The Channel's unique system identifier
  * @property {Channel#Status} status - The Channel's status
  * @property {Channel#Type} type - The Channel's type
  * @property {String} uniqueName - The Channel's unique name
  */
@JSImport("twilio-chat/lib/channeldescriptor", "ChannelDescriptor")
@js.native
class ChannelDescriptor protected () extends js.Object {
  /**
    * @param {Client} client Chat client instance
    * @param {Object} descriptor Channel descriptor data object
    * @private
    */
  def this(client: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Client */ js.Any, descriptor: js.Any) = this()
  val attributes: js.Object = js.native
  val channel: java.lang.String = js.native
  var client: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Client */ js.Any = js.native
  val createdBy: java.lang.String = js.native
  val dateCreated: stdLib.Date = js.native
  val dateUpdated: stdLib.Date = js.native
  var descriptor: js.Any = js.native
  val friendlyName: java.lang.String = js.native
  val isPrivate: scala.Boolean = js.native
  val lastConsumedMessageIndex: scala.Double = js.native
  val membersCount: scala.Double = js.native
  val messagesCount: scala.Double = js.native
  val notificationLevel: twilioDashChatLib.libChannelMod.ChannelNs.NotificationLevel = js.native
  val sid: java.lang.String = js.native
  val status: twilioDashChatLib.libChannelMod.ChannelNs.Status = js.native
  val `type`: twilioDashChatLib.libChannelMod.ChannelNs.Type = js.native
  val uniqueName: java.lang.String = js.native
  /**
    * Get channel object from descriptor.
    * @returns {Promise<Channel>}
    */
  def getChannel(): js.Promise[twilioDashChatLib.libChannelMod.Channel] = js.native
}

