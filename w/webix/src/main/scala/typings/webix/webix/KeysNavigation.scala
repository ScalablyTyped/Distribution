package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeysNavigation extends js.Object {
  def moveSelection(direction: String): Unit
}

object KeysNavigation {
  @scala.inline
  def apply(moveSelection: String => Unit): KeysNavigation = {
    val __obj = js.Dynamic.literal(moveSelection = js.Any.fromFunction1(moveSelection))
    __obj.asInstanceOf[KeysNavigation]
  }
}

