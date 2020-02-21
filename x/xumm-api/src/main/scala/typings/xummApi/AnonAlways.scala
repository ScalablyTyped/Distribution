package typings.xummApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlways extends js.Object {
  var always: String
  var no_push_msg_received: js.UndefOr[String] = js.undefined
}

object AnonAlways {
  @scala.inline
  def apply(always: String, no_push_msg_received: String = null): AnonAlways = {
    val __obj = js.Dynamic.literal(always = always.asInstanceOf[js.Any])
    if (no_push_msg_received != null) __obj.updateDynamic("no_push_msg_received")(no_push_msg_received.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlways]
  }
}

