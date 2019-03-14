package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusBarItem extends js.Object {
  /**
  		 * The alignment of this item.
  		 */
  val alignment: StatusBarAlignment
  /**
  		 * The foreground color for this entry.
  		 */
  var color: js.UndefOr[java.lang.String | ThemeColor]
  /**
  		 * The identifier of a command to run on click. The command must be
  		 * [known](#commands.getCommands).
  		 */
  var command: js.UndefOr[java.lang.String]
  /**
  		 * The priority of this item. Higher value means the item should
  		 * be shown more to the left.
  		 */
  val priority: scala.Double
  /**
  		 * The text to show for the entry. You can embed icons in the text by leveraging the syntax:
  		 *
  		 * `My text $(icon-name) contains icons like $(icon'name) this one.`
  		 *
  		 * Where the icon-name is taken from the [octicon](https://octicons.github.com) icon set, e.g.
  		 * `light-bulb`, `thumbsup`, `zap` etc.
  		 */
  var text: java.lang.String
  /**
  		 * The tooltip text when you hover over this entry.
  		 */
  var tooltip: js.UndefOr[java.lang.String]
  /**
  		 * Dispose and free associated resources. Call
  		 * [hide](#StatusBarItem.hide).
  		 */
  def dispose(): scala.Unit
  /**
  		 * Hide the entry in the status bar.
  		 */
  def hide(): scala.Unit
  /**
  		 * Shows the entry in the status bar.
  		 */
  def show(): scala.Unit
}

object StatusBarItem {
  @scala.inline
  def apply(
    alignment: StatusBarAlignment,
    dispose: () => scala.Unit,
    hide: () => scala.Unit,
    priority: scala.Double,
    show: () => scala.Unit,
    text: java.lang.String,
    color: java.lang.String | ThemeColor = null,
    command: java.lang.String = null,
    tooltip: java.lang.String = null
  ): StatusBarItem = {
    val __obj = js.Dynamic.literal(alignment = alignment, dispose = js.Any.fromFunction0(dispose), hide = js.Any.fromFunction0(hide), priority = priority, show = js.Any.fromFunction0(show), text = text)
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (command != null) __obj.updateDynamic("command")(command)
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[StatusBarItem]
  }
}

