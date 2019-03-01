package typings
package underscoreLib.underscoreMod.underscoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cancelable extends js.Object {
  def cancel(): scala.Unit
}

object Cancelable {
  @scala.inline
  def apply(cancel: js.Function0[scala.Unit]): Cancelable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.asInstanceOf[Cancelable]
  }
}

