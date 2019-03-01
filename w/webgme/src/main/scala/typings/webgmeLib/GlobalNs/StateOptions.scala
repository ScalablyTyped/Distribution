package typings
package webgmeLib.GlobalNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateOptions extends js.Object {
  var silent: scala.Boolean
}

object StateOptions {
  @scala.inline
  def apply(silent: scala.Boolean): StateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("silent")(silent)
    __obj.asInstanceOf[StateOptions]
  }
}

