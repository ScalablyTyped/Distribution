package typings.vanillaSwipe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Passive extends js.Object {
  var passive: Boolean
}

object Passive {
  @scala.inline
  def apply(passive: Boolean): Passive = {
    val __obj = js.Dynamic.literal(passive = passive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Passive]
  }
}

