package typings.vara.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XY extends js.Object {
  var x: Boolean
  var y: Boolean
}

object XY {
  @scala.inline
  def apply(x: Boolean, y: Boolean): XY = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[XY]
  }
}

