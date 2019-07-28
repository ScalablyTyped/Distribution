package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the Rich Communication Services (RCS) chat capabilities of a phone number. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatCapabilities")
@js.native
abstract class ChatCapabilities () extends js.Object {
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

