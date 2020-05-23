package typings.wordpressComponents.shortcutMod.Shortcut

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShortcutObj extends js.Object {
  /**
    * Optional `aria-label` for the `<span>` element.
    */
  var ariaLabel: js.UndefOr[String] = js.undefined
  /**
    * The visible text.
    */
  var display: String
}

object ShortcutObj {
  @scala.inline
  def apply(display: String, ariaLabel: String = null): ShortcutObj = {
    val __obj = js.Dynamic.literal(display = display.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShortcutObj]
  }
}

