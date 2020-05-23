package typings.systeminformation.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Summary extends js.Object {
  var summary: Count
}

object Summary {
  @scala.inline
  def apply(summary: Count): Summary = {
    val __obj = js.Dynamic.literal(summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Summary]
  }
}

