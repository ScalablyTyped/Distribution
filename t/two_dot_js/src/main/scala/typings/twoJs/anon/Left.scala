package typings.twoJs.anon

import typings.twoJs.mod.Vector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Left extends js.Object {
  var left: Vector
  var right: Vector
}

object Left {
  @scala.inline
  def apply(left: Vector, right: Vector): Left = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any])
    __obj.asInstanceOf[Left]
  }
}

