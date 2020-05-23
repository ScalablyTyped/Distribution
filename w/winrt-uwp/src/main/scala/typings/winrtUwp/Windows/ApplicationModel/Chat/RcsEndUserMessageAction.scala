package typings.winrtUwp.Windows.ApplicationModel.Chat

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the actions to which the user can respond. */
trait RcsEndUserMessageAction extends js.Object {
  /** Gets the label of the action. */
  var label: String
}

object RcsEndUserMessageAction {
  @scala.inline
  def apply(label: String): RcsEndUserMessageAction = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[RcsEndUserMessageAction]
  }
}

