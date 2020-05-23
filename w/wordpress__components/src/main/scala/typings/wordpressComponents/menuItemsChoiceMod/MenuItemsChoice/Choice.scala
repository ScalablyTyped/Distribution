package typings.wordpressComponents.menuItemsChoiceMod.MenuItemsChoice

import typings.wordpressComponents.shortcutMod.Shortcut.ShortcutType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Choice extends js.Object {
  /**
    * Human-readable label for choice.
    */
  var label: String
  /**
    * Optional keyboard sequence to trigger choice with keyboard shortcut
    * (e.g. `ctrl+s`).
    */
  var shortcut: js.UndefOr[ShortcutType] = js.undefined
  /**
    * Unique value for choice.
    */
  var value: String
}

object Choice {
  @scala.inline
  def apply(label: String, value: String, shortcut: ShortcutType = null): Choice = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (shortcut != null) __obj.updateDynamic("shortcut")(shortcut.asInstanceOf[js.Any])
    __obj.asInstanceOf[Choice]
  }
}

