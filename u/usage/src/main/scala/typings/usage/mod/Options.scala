package typings.usage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var keepHistory: Boolean
}

object Options {
  @scala.inline
  def apply(keepHistory: Boolean): Options = {
    val __obj = js.Dynamic.literal(keepHistory = keepHistory.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

