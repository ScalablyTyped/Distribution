package typings.taskGraphRunner.mod

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Results[Item, Result] extends js.Object {
  var safe: Boolean
  var values: Map[Item, Result]
}

object Results {
  @scala.inline
  def apply[Item, Result](safe: Boolean, values: Map[Item, Result]): Results[Item, Result] = {
    val __obj = js.Dynamic.literal(safe = safe.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Results[Item, Result]]
  }
}

