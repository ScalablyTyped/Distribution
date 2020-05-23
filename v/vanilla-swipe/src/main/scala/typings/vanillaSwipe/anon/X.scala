package typings.vanillaSwipe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait X extends js.Object {
  var x: js.Any
  var y: js.Any
}

object X {
  @scala.inline
  def apply(x: js.Any, y: js.Any): X = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[X]
  }
}

