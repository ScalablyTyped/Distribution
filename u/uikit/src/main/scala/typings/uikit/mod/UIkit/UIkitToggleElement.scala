package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitToggleElement extends js.Object {
  def toggle(): Unit
}

object UIkitToggleElement {
  @scala.inline
  def apply(toggle: () => Unit): UIkitToggleElement = {
    val __obj = js.Dynamic.literal(toggle = js.Any.fromFunction0(toggle))
  
    __obj.asInstanceOf[UIkitToggleElement]
  }
}

