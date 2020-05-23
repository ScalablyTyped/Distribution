package typings.winrtUwp.Windows.Devices.AllJoyn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Exposes information about the sender of a message being processed. */
trait AllJoynMessageInfo extends js.Object {
  /** The unique bus name of the message sender. */
  var senderUniqueName: String
}

object AllJoynMessageInfo {
  @scala.inline
  def apply(senderUniqueName: String): AllJoynMessageInfo = {
    val __obj = js.Dynamic.literal(senderUniqueName = senderUniqueName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllJoynMessageInfo]
  }
}

