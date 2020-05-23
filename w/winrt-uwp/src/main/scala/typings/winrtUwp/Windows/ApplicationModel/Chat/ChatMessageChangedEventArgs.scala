package typings.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents event parameters used by the event handler that processes message change events. */
trait ChatMessageChangedEventArgs extends js.Object {
  /**
    * The message changed event handler that an application registers with the message store receives a deferral object in the event parameters. The GetDeferral method registers a change deferral and allows an application to take action related to the change before the message store completes the change.
    * @return Gets a deferral for the MessageChanged event.
    */
  def getDeferral(): ChatMessageChangedDeferral
}

object ChatMessageChangedEventArgs {
  @scala.inline
  def apply(getDeferral: () => ChatMessageChangedDeferral): ChatMessageChangedEventArgs = {
    val __obj = js.Dynamic.literal(getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[ChatMessageChangedEventArgs]
  }
}

