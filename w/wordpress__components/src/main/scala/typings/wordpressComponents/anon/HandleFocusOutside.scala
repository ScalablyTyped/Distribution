package typings.wordpressComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleFocusOutside extends js.Object {
  def handleFocusOutside(): Unit
}

object HandleFocusOutside {
  @scala.inline
  def apply(handleFocusOutside: () => Unit): HandleFocusOutside = {
    val __obj = js.Dynamic.literal(handleFocusOutside = js.Any.fromFunction0(handleFocusOutside))
    __obj.asInstanceOf[HandleFocusOutside]
  }
}

