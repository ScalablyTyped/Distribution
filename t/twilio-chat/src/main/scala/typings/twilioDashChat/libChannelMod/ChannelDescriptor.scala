package typings.twilioDashChat.libChannelMod

import typings.twilioDashChat.libChannelMod.ChannelNs.NotificationLevel
import typings.twilioDashChat.libChannelMod.ChannelNs.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelDescriptor extends js.Object {
  var attributes: js.Object
  var channel: String
  var createdBy: js.UndefOr[String] = js.undefined
  var dateCreated: js.Any
  var dateUpdated: js.Any
  var entityName: String
  var friendlyName: String
  var lastConsumedMessageIndex: Double
  var name: String
  var notificationLevel: js.UndefOr[NotificationLevel] = js.undefined
  var `type`: Type
  var uniqueName: String
}

object ChannelDescriptor {
  @scala.inline
  def apply(
    attributes: js.Object,
    channel: String,
    dateCreated: js.Any,
    dateUpdated: js.Any,
    entityName: String,
    friendlyName: String,
    lastConsumedMessageIndex: Double,
    name: String,
    `type`: Type,
    uniqueName: String,
    createdBy: String = null,
    notificationLevel: NotificationLevel = null
  ): ChannelDescriptor = {
    val __obj = js.Dynamic.literal(attributes = attributes, channel = channel, dateCreated = dateCreated, dateUpdated = dateUpdated, entityName = entityName, friendlyName = friendlyName, lastConsumedMessageIndex = lastConsumedMessageIndex, name = name, uniqueName = uniqueName)
    __obj.updateDynamic("type")(`type`)
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy)
    if (notificationLevel != null) __obj.updateDynamic("notificationLevel")(notificationLevel)
    __obj.asInstanceOf[ChannelDescriptor]
  }
}

