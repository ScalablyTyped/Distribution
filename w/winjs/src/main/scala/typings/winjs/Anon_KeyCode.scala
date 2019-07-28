package typings.winjs

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyCode extends js.Object {
  var keyCode: Double
  var nextFocusElement: HTMLElement
  var previousFocusElement: HTMLElement
}

object Anon_KeyCode {
  @scala.inline
  def apply(keyCode: Double, nextFocusElement: HTMLElement, previousFocusElement: HTMLElement): Anon_KeyCode = {
    val __obj = js.Dynamic.literal(keyCode = keyCode, nextFocusElement = nextFocusElement, previousFocusElement = previousFocusElement)
  
    __obj.asInstanceOf[Anon_KeyCode]
  }
}

