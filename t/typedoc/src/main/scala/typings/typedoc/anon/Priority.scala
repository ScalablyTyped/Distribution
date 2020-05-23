package typings.typedoc.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Priority extends js.Object {
  var priority: Double
}

object Priority {
  @scala.inline
  def apply(priority: Double): Priority = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[Priority]
  }
}

