package typings
package tailLib.tailMod.TailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Static extends js.Object {
  var Tail: TailConstructor
}

object Static {
  @scala.inline
  def apply(Tail: TailConstructor): Static = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Tail")(Tail)
    __obj.asInstanceOf[Static]
  }
}

