package typings.waypoints

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPush extends js.Object {
  var push: AnonAdapter
}

object AnonPush {
  @scala.inline
  def apply(push: AnonAdapter): AnonPush = {
    val __obj = js.Dynamic.literal(push = push.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPush]
  }
}

