package typings.wordpressComponents.noticeMod.Notice

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonAction
  extends BaseAction
     with Action {
  var onClick: MouseEventHandler[HTMLButtonElement]
}

object ButtonAction {
  @scala.inline
  def apply(
    label: String,
    onClick: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit,
    className: String = null,
    noDefaultClasses: js.UndefOr[Boolean] = js.undefined
  ): ButtonAction = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(noDefaultClasses)) __obj.updateDynamic("noDefaultClasses")(noDefaultClasses.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonAction]
  }
}

