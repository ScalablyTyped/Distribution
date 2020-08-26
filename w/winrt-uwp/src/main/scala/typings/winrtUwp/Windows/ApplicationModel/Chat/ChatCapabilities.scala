package typings.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the Rich Communication Services (RCS) chat capabilities of a phone number. */
@js.native
trait ChatCapabilities extends js.Object {
  /** Gets a Boolean value indicating if a phone number supports Rich Communication Services (RCS) chat. */
  var isChatCapable: Boolean = js.native
  /** Gets a Boolean value indicating if a phone number supports Rich Communication Services (RCS) file transfer. */
  var isFileTransferCapable: Boolean = js.native
  /** Gets a Boolean value indicating if a phone number is capable of pushing Rich Communication Services (RCS) geolocation. */
  var isGeoLocationPushCapable: Boolean = js.native
  /** Gets a Boolean value indicating if a phone number supports Rich Communication Services (RCS) integrated messaging. */
  var isIntegratedMessagingCapable: Boolean = js.native
  /** Gets a Boolean value indicating if an Rich Communication Services (RCS) capable phone number is online. */
  var isOnline: Boolean = js.native
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
  @scala.inline
  implicit class ChatCapabilitiesOps[Self <: ChatCapabilities] (val x: Self) extends AnyVal {
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
    def setIsChatCapable(value: Boolean): Self = this.set("isChatCapable", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFileTransferCapable(value: Boolean): Self = this.set("isFileTransferCapable", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsGeoLocationPushCapable(value: Boolean): Self = this.set("isGeoLocationPushCapable", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsIntegratedMessagingCapable(value: Boolean): Self = this.set("isIntegratedMessagingCapable", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsOnline(value: Boolean): Self = this.set("isOnline", value.asInstanceOf[js.Any])
  }
  
}

