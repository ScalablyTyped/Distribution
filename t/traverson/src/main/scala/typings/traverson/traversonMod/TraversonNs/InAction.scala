package typings.traverson.traversonMod.TraversonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InAction extends js.Object {
  def abort(): Unit
}

object InAction {
  @scala.inline
  def apply(abort: () => Unit): InAction = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort))
  
    __obj.asInstanceOf[InAction]
  }
}

