package typings
package twilioDashChatLib.libChannelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelDescriptor extends js.Object {
  var attributes: js.Object
  var channel: java.lang.String
  var createdBy: java.lang.String
  var dateCreated: js.Any
  var dateUpdated: js.Any
  var entityName: java.lang.String
  var friendlyName: java.lang.String
  var lastConsumedMessageIndex: scala.Double
  var name: java.lang.String
  var notificationLevel: js.UndefOr[twilioDashChatLib.libChannelMod.ChannelNs.NotificationLevel] = js.undefined
  var `type`: twilioDashChatLib.libChannelMod.ChannelNs.Type
  var uniqueName: java.lang.String
}

object ChannelDescriptor {
  @scala.inline
  def apply(
    attributes: js.Object,
    channel: java.lang.String,
    createdBy: java.lang.String,
    dateCreated: js.Any,
    dateUpdated: js.Any,
    entityName: java.lang.String,
    friendlyName: java.lang.String,
    lastConsumedMessageIndex: scala.Double,
    name: java.lang.String,
    `type`: twilioDashChatLib.libChannelMod.ChannelNs.Type,
    uniqueName: java.lang.String,
    notificationLevel: twilioDashChatLib.libChannelMod.ChannelNs.NotificationLevel = null
  ): ChannelDescriptor = {
    val __obj = js.Dynamic.literal(attributes = attributes, channel = channel, createdBy = createdBy, dateCreated = dateCreated, dateUpdated = dateUpdated, entityName = entityName, friendlyName = friendlyName, lastConsumedMessageIndex = lastConsumedMessageIndex, name = name, uniqueName = uniqueName)
    __obj.updateDynamic("type")(`type`)
    if (notificationLevel != null) __obj.updateDynamic("notificationLevel")(notificationLevel)
    __obj.asInstanceOf[ChannelDescriptor]
  }
}

