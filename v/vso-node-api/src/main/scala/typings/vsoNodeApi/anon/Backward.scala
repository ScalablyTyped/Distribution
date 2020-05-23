package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Backward extends js.Object {
  var backward: scala.Double
  var forward: scala.Double
}

object Backward {
  @scala.inline
  def apply(backward: scala.Double, forward: scala.Double): Backward = {
    val __obj = js.Dynamic.literal(backward = backward.asInstanceOf[js.Any], forward = forward.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backward]
  }
}

