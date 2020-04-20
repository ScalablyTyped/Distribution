package typings.wonderJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonX extends js.Object {
  var x: js.Any
  var y: js.Any
}

object AnonX {
  @scala.inline
  def apply(x: js.Any, y: js.Any): AnonX = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonX]
  }
}

