package typings
package traversonLib.traversonMod.TraversonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InAction extends js.Object {
  def abort(): scala.Unit
}

object InAction {
  @scala.inline
  def apply(abort: js.Function0[scala.Unit]): InAction = {
    val __obj = js.Dynamic.literal(abort = abort)
  
    __obj.asInstanceOf[InAction]
  }
}

