package typings.waypoints.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Push extends js.Object {
  var push: Adapter
}

object Push {
  @scala.inline
  def apply(push: Adapter): Push = {
    val __obj = js.Dynamic.literal(push = push.asInstanceOf[js.Any])
    __obj.asInstanceOf[Push]
  }
}

