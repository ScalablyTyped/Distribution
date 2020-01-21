package typings.trashable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTrash extends js.Object {
  def trash(): Unit
}

object AnonTrash {
  @scala.inline
  def apply(trash: () => Unit): AnonTrash = {
    val __obj = js.Dynamic.literal(trash = js.Any.fromFunction0(trash))
  
    __obj.asInstanceOf[AnonTrash]
  }
}

