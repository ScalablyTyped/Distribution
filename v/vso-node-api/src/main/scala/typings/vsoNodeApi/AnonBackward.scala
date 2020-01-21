package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBackward extends js.Object {
  var backward: Double
  var forward: Double
}

object AnonBackward {
  @scala.inline
  def apply(backward: Double, forward: Double): AnonBackward = {
    val __obj = js.Dynamic.literal(backward = backward.asInstanceOf[js.Any], forward = forward.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBackward]
  }
}

