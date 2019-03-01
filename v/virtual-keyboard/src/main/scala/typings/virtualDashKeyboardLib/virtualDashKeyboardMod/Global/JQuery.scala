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
    addNavigation: js.Function1[virtualDashKeyboardLib.virtualDashKeyboardMod.NavigateOptions, JQuery],
    keyboard: js.Function1[virtualDashKeyboardLib.virtualDashKeyboardMod.KeyboardOptions, JQuery]
  ): JQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addNavigation")(addNavigation)
    __obj.updateDynamic("keyboard")(keyboard)
    __obj.asInstanceOf[JQuery]
  }
}

