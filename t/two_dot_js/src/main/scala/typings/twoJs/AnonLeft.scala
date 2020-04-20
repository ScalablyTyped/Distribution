package typings.twoJs

import typings.twoJs.mod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLeft extends js.Object {
  var left: Vector
  var right: Vector
}

object AnonLeft {
  @scala.inline
  def apply(left: Vector, right: Vector): AnonLeft = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLeft]
  }
}

