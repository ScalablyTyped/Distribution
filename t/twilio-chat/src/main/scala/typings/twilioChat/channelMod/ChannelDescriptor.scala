package typings.twilioChat.channelMod

import typings.twilioChat.channelMod.Channel.NotificationLevel
import typings.twilioChat.channelMod.Channel.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelDescriptor extends js.Object {
  var attributes: js.Any = js.native
  var channel: String = js.native
  var createdBy: js.UndefOr[String] = js.native
  var dateCreated: js.Any = js.native
  var dateUpdated: js.Any = js.native
  var entityName: String = js.native
  var friendlyName: String = js.native
  var lastConsumedMessageIndex: Double = js.native
  var notificationLevel: js.UndefOr[NotificationLevel] = js.native
  var `type`: Type = js.native
  var uniqueName: String = js.native
}

object ChannelDescriptor {
  @scala.inline
  def apply(
    attributes: js.Any,
    channel: String,
    dateCreated: js.Any,
    dateUpdated: js.Any,
    entityName: String,
    friendlyName: String,
    lastConsumedMessageIndex: Double,
    `type`: Type,
    uniqueName: String
  ): ChannelDescriptor = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any], dateCreated = dateCreated.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any], entityName = entityName.asInstanceOf[js.Any], friendlyName = friendlyName.asInstanceOf[js.Any], lastConsumedMessageIndex = lastConsumedMessageIndex.asInstanceOf[js.Any], uniqueName = uniqueName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelDescriptor]
  }
  @scala.inline
  implicit class ChannelDescriptorOps[Self <: ChannelDescriptor] (val x: Self) extends AnyVal {
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
    def setAttributes(value: js.Any): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setChannel(value: String): Self = this.set("channel", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateCreated(value: js.Any): Self = this.set("dateCreated", value.asInstanceOf[js.Any])
    @scala.inline
    def setDateUpdated(value: js.Any): Self = this.set("dateUpdated", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntityName(value: String): Self = this.set("entityName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFriendlyName(value: String): Self = this.set("friendlyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastConsumedMessageIndex(value: Double): Self = this.set("lastConsumedMessageIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Type): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUniqueName(value: String): Self = this.set("uniqueName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreatedBy(value: String): Self = this.set("createdBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedBy: Self = this.set("createdBy", js.undefined)
    @scala.inline
    def setNotificationLevel(value: NotificationLevel): Self = this.set("notificationLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationLevel: Self = this.set("notificationLevel", js.undefined)
  }
  
}

