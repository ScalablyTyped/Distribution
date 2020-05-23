package typings.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the Rich Communication Services (RCS) chat capabilities of a phone number. */
trait ChatCapabilities extends js.Object {
  /** Gets a Boolean value indicating if a phone number supports Rich Communication Services (RCS) chat. */
  var isChatCapable: Boolean
  /** Gets a Boolean value indicating if a phone number supports Rich Communication Services (RCS) file transfer. */
  var isFileTransferCapable: Boolean
  /** Gets a Boolean value indicating if a phone number is capable of pushing Rich Communication Services (RCS) geolocation. */
  var isGeoLocationPushCapable: Boolean
  /** Gets a Boolean value indicating if a phone number supports Rich Communication Services (RCS) integrated messaging. */
  var isIntegratedMessagingCapable: Boolean
  /** Gets a Boolean value indicating if an Rich Communication Services (RCS) capable phone number is online. */
  var isOnline: Boolean
}

object ChatCapabilities {
  @scala.inline
  def apply(
    isChatCapable: Boolean,
    isFileTransferCapable: Boolean,
    isGeoLocationPushCapable: Boolean,
    isIntegratedMessagingCapable: Boolean,
    isOnline: Boolean
  ): ChatCapabilities = {
    val __obj = js.Dynamic.literal(isChatCapable = isChatCapable.asInstanceOf[js.Any], isFileTransferCapable = isFileTransferCapable.asInstanceOf[js.Any], isGeoLocationPushCapable = isGeoLocationPushCapable.asInstanceOf[js.Any], isIntegratedMessagingCapable = isIntegratedMessagingCapable.asInstanceOf[js.Any], isOnline = isOnline.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatCapabilities]
  }
}

