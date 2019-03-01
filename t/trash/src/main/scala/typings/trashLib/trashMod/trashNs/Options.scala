package typings
package trashLib.trashMod.trashNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var glob: scala.Boolean
}

object Options {
  @scala.inline
  def apply(glob: scala.Boolean): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("glob")(glob)
    __obj.asInstanceOf[Options]
  }
}

