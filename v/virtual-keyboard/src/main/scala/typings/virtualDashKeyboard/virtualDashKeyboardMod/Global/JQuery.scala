package typings.virtualDashKeyboard.virtualDashKeyboardMod.Global

import typings.virtualDashKeyboard.virtualDashKeyboardMod.KeyboardOptions
import typings.virtualDashKeyboard.virtualDashKeyboardMod.NavigateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  def addNavigation(options: NavigateOptions): this.type
  def keyboard(options: KeyboardOptions): this.type
}

object JQuery {
  @scala.inline
  def apply(addNavigation: NavigateOptions => JQuery, keyboard: KeyboardOptions => JQuery): JQuery = {
    val __obj = js.Dynamic.literal(addNavigation = js.Any.fromFunction1(addNavigation), keyboard = js.Any.fromFunction1(keyboard))
  
    __obj.asInstanceOf[JQuery]
  }
}

