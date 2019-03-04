package typings
package winjsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KeyCode extends js.Object {
  var keyCode: scala.Double
  var nextFocusElement: stdLib.HTMLElement
  var previousFocusElement: stdLib.HTMLElement
}

object Anon_KeyCode {
  @scala.inline
  def apply(
    keyCode: scala.Double,
    nextFocusElement: stdLib.HTMLElement,
    previousFocusElement: stdLib.HTMLElement
  ): Anon_KeyCode = {
    val __obj = js.Dynamic.literal(keyCode = keyCode, nextFocusElement = nextFocusElement, previousFocusElement = previousFocusElement)
  
    __obj.asInstanceOf[Anon_KeyCode]
  }
}

