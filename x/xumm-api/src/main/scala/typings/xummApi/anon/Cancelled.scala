package typings.xummApi.anon

import typings.xummApi.mod.XummCancelReason
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cancelled extends js.Object {
  var cancelled: Boolean
  var reason: XummCancelReason
}

object Cancelled {
  @scala.inline
  def apply(cancelled: Boolean, reason: XummCancelReason): Cancelled = {
    val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancelled]
  }
}

