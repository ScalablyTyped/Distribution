package typings.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data about the configuration of a Rich Communication Services (RCS) transport. */
trait RcsTransportConfiguration extends js.Object {
  /** Gets the maximum number of attachments supported by the transport. */
  var maxAttachmentCount: Double
  /** Gets the maximum size of a file that can be sent using the transport. */
  var maxFileSizeInKilobytes: Double
  /** Gets the maximum size of a group chat message supported by the transport. */
  var maxGroupMessageSizeInKilobytes: Double
  /** Gets the maximum size of a chat message supported by the transport. */
  var maxMessageSizeInKilobytes: Double
  /** Gets the maximum number of recipients supported for a group chat. */
  var maxRecipientCount: Double
  /** Gets the size at which the user should be warned that they are attaching a large file for the transport. */
  var warningFileSizeInKilobytes: Double
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
}

