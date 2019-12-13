package typings.trashable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Trash extends js.Object {
  def trash(): Unit
}

object Anon_Trash {
  @scala.inline
  def apply(trash: () => Unit): Anon_Trash = {
    val __obj = js.Dynamic.literal(trash = js.Any.fromFunction0(trash))
  
    __obj.asInstanceOf[Anon_Trash]
  }
}

