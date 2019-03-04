package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Animator extends js.Object {
  var actions: js.Array[AnimationAction]
}

object Animator {
  @scala.inline
  def apply(actions: js.Array[AnimationAction]): Animator = {
    val __obj = js.Dynamic.literal(actions = actions)
  
    __obj.asInstanceOf[Animator]
  }
}

