package typings.swaggerSailsHook

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAfter extends js.Object {
  /** routes specified in the `after` object will be bound after custom and blueprint routes */
  var after: Anon
}

object AnonAfter {
  @scala.inline
  def apply(after: Anon): AnonAfter = {
    val __obj = js.Dynamic.literal(after = after.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAfter]
  }
}

