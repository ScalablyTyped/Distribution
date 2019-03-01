package typings
package traversonLib.traversonMod.TraversonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Traversal extends js.Object {
  def continue(): Builder
}

object Traversal {
  @scala.inline
  def apply(continue: js.Function0[Builder]): Traversal = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("continue")(continue)
    __obj.asInstanceOf[Traversal]
  }
}

