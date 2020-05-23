package typings.winjs.anon

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyCode extends js.Object {
  var keyCode: Double
  var nextFocusElement: HTMLElement
  var previousFocusElement: HTMLElement
}

object KeyCode {
  @scala.inline
  def apply(keyCode: Double, nextFocusElement: HTMLElement, previousFocusElement: HTMLElement): KeyCode = {
    val __obj = js.Dynamic.literal(keyCode = keyCode.asInstanceOf[js.Any], nextFocusElement = nextFocusElement.asInstanceOf[js.Any], previousFocusElement = previousFocusElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyCode]
  }
}

