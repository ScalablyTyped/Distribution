package typings.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the data for a MessageAvailableChanged event. */
trait RcsEndUserMessageAvailableEventArgs extends js.Object {
  /** Gets a Boolean value indicating if a new message is available. */
  var isMessageAvailable: Boolean
  /** Gets the actual message to display, or empty if IsMessageAvailable is FALSE. */
  var message: RcsEndUserMessage
}

object RcsEndUserMessageAvailableEventArgs {
  @scala.inline
  def apply(isMessageAvailable: Boolean, message: RcsEndUserMessage): RcsEndUserMessageAvailableEventArgs = {
    val __obj = js.Dynamic.literal(isMessageAvailable = isMessageAvailable.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[RcsEndUserMessageAvailableEventArgs]
  }
}

