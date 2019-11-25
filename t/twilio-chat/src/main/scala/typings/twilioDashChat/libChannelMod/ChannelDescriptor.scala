package typings.twilioDashChat.libChannelMod

import typings.twilioDashChat.libChannelMod.Channel.NotificationLevel
import typings.twilioDashChat.libChannelMod.Channel.Type
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
    `type`: Type,
    uniqueName: String,
    createdBy: String = null,
    notificationLevel: NotificationLevel = null
  ): ChannelDescriptor = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], dateCreated = dateCreated.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any], entityName = entityName.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], lastConsumedMessageIndex = lastConsumedMessageIndex.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (createdBy != null) __obj.updateDynamic("createdBy")(createdBy.asInstanceOf[js.Any])
    if (notificationLevel != null) __obj.updateDynamic("notificationLevel")(notificationLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelDescriptor]
  }
}

