package typings.uws

import typings.uws.mod.WebSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTarget extends js.Object {
  var target: WebSocket
}

object AnonTarget {
  @scala.inline
  def apply(target: WebSocket): AnonTarget = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTarget]
  }
}

