package typings.wordpressComponents.shortcutMod.Shortcut

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var shortcut: js.UndefOr[ShortcutType] = js.undefined
}

object Props {
  @scala.inline
  def apply(className: String = null, shortcut: ShortcutType = null): Props = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (shortcut != null) __obj.updateDynamic("shortcut")(shortcut.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

