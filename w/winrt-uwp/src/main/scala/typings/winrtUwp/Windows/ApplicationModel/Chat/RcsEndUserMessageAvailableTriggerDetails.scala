package typings.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data to the background task about a new message. */
trait RcsEndUserMessageAvailableTriggerDetails extends js.Object {
  /** Gets the text of the new message. */
  var text: String
  /** Gets the title of the new message. */
  var title: String
}

object RcsEndUserMessageAvailableTriggerDetails {
  @scala.inline
  def apply(text: String, title: String): RcsEndUserMessageAvailableTriggerDetails = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[RcsEndUserMessageAvailableTriggerDetails]
  }
}

