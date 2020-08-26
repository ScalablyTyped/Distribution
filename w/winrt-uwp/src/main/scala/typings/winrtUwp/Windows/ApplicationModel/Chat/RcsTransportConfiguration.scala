package typings.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data about the configuration of a Rich Communication Services (RCS) transport. */
@js.native
trait RcsTransportConfiguration extends js.Object {
  /** Gets the maximum number of attachments supported by the transport. */
  var maxAttachmentCount: Double = js.native
  /** Gets the maximum size of a file that can be sent using the transport. */
  var maxFileSizeInKilobytes: Double = js.native
  /** Gets the maximum size of a group chat message supported by the transport. */
  var maxGroupMessageSizeInKilobytes: Double = js.native
  /** Gets the maximum size of a chat message supported by the transport. */
  var maxMessageSizeInKilobytes: Double = js.native
  /** Gets the maximum number of recipients supported for a group chat. */
  var maxRecipientCount: Double = js.native
  /** Gets the size at which the user should be warned that they are attaching a large file for the transport. */
  var warningFileSizeInKilobytes: Double = js.native
}

object RcsTransportConfiguration {
  @scala.inline
  def apply(
    maxAttachmentCount: Double,
    maxFileSizeInKilobytes: Double,
    maxGroupMessageSizeInKilobytes: Double,
    maxMessageSizeInKilobytes: Double,
    maxRecipientCount: Double,
    warningFileSizeInKilobytes: Double
  ): RcsTransportConfiguration = {
    val __obj = js.Dynamic.literal(maxAttachmentCount = maxAttachmentCount.asInstanceOf[js.Any], maxFileSizeInKilobytes = maxFileSizeInKilobytes.asInstanceOf[js.Any], maxGroupMessageSizeInKilobytes = maxGroupMessageSizeInKilobytes.asInstanceOf[js.Any], maxMessageSizeInKilobytes = maxMessageSizeInKilobytes.asInstanceOf[js.Any], maxRecipientCount = maxRecipientCount.asInstanceOf[js.Any], warningFileSizeInKilobytes = warningFileSizeInKilobytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[RcsTransportConfiguration]
  }
  @scala.inline
  implicit class RcsTransportConfigurationOps[Self <: RcsTransportConfiguration] (val x: Self) extends AnyVal {
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
    def setMaxAttachmentCount(value: Double): Self = this.set("maxAttachmentCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxFileSizeInKilobytes(value: Double): Self = this.set("maxFileSizeInKilobytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxGroupMessageSizeInKilobytes(value: Double): Self = this.set("maxGroupMessageSizeInKilobytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxMessageSizeInKilobytes(value: Double): Self = this.set("maxMessageSizeInKilobytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxRecipientCount(value: Double): Self = this.set("maxRecipientCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setWarningFileSizeInKilobytes(value: Double): Self = this.set("warningFileSizeInKilobytes", value.asInstanceOf[js.Any])
  }
  
}

