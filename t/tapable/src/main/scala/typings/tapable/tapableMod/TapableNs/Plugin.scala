package typings.tapable.tapableMod.TapableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Plugin extends js.Object {
  @JSName("apply")
  def apply(args: js.Any*): Unit
}

object Plugin {
  @scala.inline
  def apply(apply: /* repeated */ js.Any => Unit): Plugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
  
    __obj.asInstanceOf[Plugin]
  }
}

