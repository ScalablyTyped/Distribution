package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPrevious extends js.Object {
  var none: Double
  var previous: Double
  var useRename: Double
}

object AnonPrevious {
  @scala.inline
  def apply(none: Double, previous: Double, useRename: Double): AnonPrevious = {
    val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any], previous = previous.asInstanceOf[js.Any], useRename = useRename.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPrevious]
  }
}

