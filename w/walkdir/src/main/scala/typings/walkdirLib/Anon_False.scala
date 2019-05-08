package typings
package walkdirLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_False extends js.Object {
  var return_object: js.UndefOr[walkdirLib.walkdirLibNumbers.`false`] = js.undefined
  var sync: walkdirLib.walkdirLibNumbers.`true`
}

object Anon_False {
  @scala.inline
  def apply(
    sync: walkdirLib.walkdirLibNumbers.`true`,
    return_object: walkdirLib.walkdirLibNumbers.`false` = null
  ): Anon_False = {
    val __obj = js.Dynamic.literal(sync = sync)
    if (return_object != null) __obj.updateDynamic("return_object")(return_object)
    __obj.asInstanceOf[Anon_False]
  }
}

