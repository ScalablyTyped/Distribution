package typings.wordpressComponents.noticeMod.Notice

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLButtonElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wordpressComponents.noticeMod.Notice.ButtonAction
  - typings.wordpressComponents.noticeMod.Notice.URLAction
*/
trait Action extends js.Object

object Action {
  @scala.inline
  def ButtonAction(
    label: String,
    onClick: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit,
    className: String = null,
    noDefaultClasses: js.UndefOr[Boolean] = js.undefined
  ): Action = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(noDefaultClasses)) __obj.updateDynamic("noDefaultClasses")(noDefaultClasses.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  @scala.inline
  def URLAction(
    label: String,
    url: String,
    className: String = null,
    noDefaultClasses: js.UndefOr[Boolean] = js.undefined
  ): Action = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(noDefaultClasses)) __obj.updateDynamic("noDefaultClasses")(noDefaultClasses.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
}

