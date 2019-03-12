package typings
package virtualDashKeyboardLib.virtualDashKeyboardMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQuery extends js.Object {
  def addNavigation(options: virtualDashKeyboardLib.virtualDashKeyboardMod.NavigateOptions): this.type
  def keyboard(options: virtualDashKeyboardLib.virtualDashKeyboardMod.KeyboardOptions): this.type
}

object JQuery {
  @scala.inline
  def apply(
    addNavigation: virtualDashKeyboardLib.virtualDashKeyboardMod.NavigateOptions => JQuery,
    keyboard: virtualDashKeyboardLib.virtualDashKeyboardMod.KeyboardOptions => JQuery
  ): JQuery = {
    val __obj = js.Dynamic.literal(addNavigation = js.Any.fromFunction1(addNavigation), keyboard = js.Any.fromFunction1(keyboard))
  
    __obj.asInstanceOf[JQuery]
  }
}

