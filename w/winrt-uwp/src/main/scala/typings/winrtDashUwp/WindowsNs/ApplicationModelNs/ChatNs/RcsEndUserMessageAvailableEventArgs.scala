package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ChatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the data for a MessageAvailableChanged event. */
@JSGlobal("Windows.ApplicationModel.Chat.RcsEndUserMessageAvailableEventArgs")
@js.native
abstract class RcsEndUserMessageAvailableEventArgs () extends js.Object {
  /** Gets a Boolean value indicating if a new message is available. */
  var isMessageAvailable: Boolean = js.native
  /** Gets the actual message to display, or empty if IsMessageAvailable is FALSE. */
  var message: RcsEndUserMessage = js.native
}

