package typings.winrtUwp.global.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the data for a MessageAvailableChanged event. */
@JSGlobal("Windows.ApplicationModel.Chat.RcsEndUserMessageAvailableEventArgs")
@js.native
abstract class RcsEndUserMessageAvailableEventArgs ()
  extends typings.winrtUwp.Windows.ApplicationModel.Chat.RcsEndUserMessageAvailableEventArgs {
  /** Gets a Boolean value indicating if a new message is available. */
  /* CompleteClass */
  override var isMessageAvailable: Boolean = js.native
  /** Gets the actual message to display, or empty if IsMessageAvailable is FALSE. */
  /* CompleteClass */
  override var message: typings.winrtUwp.Windows.ApplicationModel.Chat.RcsEndUserMessage = js.native
}

