package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Previous extends js.Object {
  var none: scala.Double
  var previous: scala.Double
  var useRename: scala.Double
}

object Previous {
  @scala.inline
  def apply(none: scala.Double, previous: scala.Double, useRename: scala.Double): Previous = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], useRename = useRename.asInstanceOf[js.Any])
    __obj.asInstanceOf[Previous]
  }
}

