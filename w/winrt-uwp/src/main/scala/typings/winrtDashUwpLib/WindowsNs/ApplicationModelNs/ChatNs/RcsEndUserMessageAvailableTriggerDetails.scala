package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ChatNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data to the background task about a new message. */
@JSGlobal("Windows.ApplicationModel.Chat.RcsEndUserMessageAvailableTriggerDetails")
@js.native
abstract class RcsEndUserMessageAvailableTriggerDetails () extends js.Object {
  /** Gets the text of the new message. */
  var text: java.lang.String = js.native
  /** Gets the title of the new message. */
  var title: java.lang.String = js.native
}

