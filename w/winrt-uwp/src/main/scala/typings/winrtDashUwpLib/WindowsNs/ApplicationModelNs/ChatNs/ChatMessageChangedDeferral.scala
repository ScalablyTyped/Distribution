package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a deferred asynchronous change request. */
@JSGlobal("Windows.ApplicationModel.Chat.ChatMessageChangedDeferral")
@js.native
abstract class ChatMessageChangedDeferral () extends js.Object {
  /** Fires to indicate that the deferred change request has completed. */
  def complete(): scala.Unit = js.native
}

