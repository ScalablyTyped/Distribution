package typings.xummApi

import typings.xummApi.mod.XummCancelReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancelled extends js.Object {
  var cancelled: Boolean
  var reason: XummCancelReason
}

object AnonCancelled {
  @scala.inline
  def apply(cancelled: Boolean, reason: XummCancelReason): AnonCancelled = {
    val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancelled]
  }
}

