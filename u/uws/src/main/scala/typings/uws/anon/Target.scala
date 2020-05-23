package typings.uws.anon

import typings.uws.mod.WebSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Target extends js.Object {
  var target: WebSocket
}

object Target {
  @scala.inline
  def apply(target: WebSocket): Target = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
}

