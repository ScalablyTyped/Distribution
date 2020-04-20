package typings.weappApi.mod.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animator extends js.Object {
  var actions: js.Array[AnimationAction]
}

object Animator {
  @scala.inline
  def apply(actions: js.Array[AnimationAction]): Animator = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animator]
  }
}

