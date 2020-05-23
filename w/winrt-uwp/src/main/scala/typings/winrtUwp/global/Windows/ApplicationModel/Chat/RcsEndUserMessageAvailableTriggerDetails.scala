package typings.winrtUwp.global.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data to the background task about a new message. */
@JSGlobal("Windows.ApplicationModel.Chat.RcsEndUserMessageAvailableTriggerDetails")
@js.native
abstract class RcsEndUserMessageAvailableTriggerDetails ()
  extends typings.winrtUwp.Windows.ApplicationModel.Chat.RcsEndUserMessageAvailableTriggerDetails {
  /** Gets the text of the new message. */
  /* CompleteClass */
  override var text: String = js.native
  /** Gets the title of the new message. */
  /* CompleteClass */
  override var title: String = js.native
}

