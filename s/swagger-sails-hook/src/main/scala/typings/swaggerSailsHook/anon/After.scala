package typings.swaggerSailsHook.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait After extends js.Object {
  /** routes specified in the `after` object will be bound after custom and blueprint routes */
  var after: _empty
}

object After {
  @scala.inline
  def apply(after: _empty): After = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any])
    __obj.asInstanceOf[After]
  }
}

