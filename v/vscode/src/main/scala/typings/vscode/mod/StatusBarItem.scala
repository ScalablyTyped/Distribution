package typings.vscode.mod

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
  var color: js.UndefOr[String | ThemeColor] = js.undefined
  /**
    * [`Command`](#Command) or identifier of a command to run on click.
    *
    * The command must be [known](#commands.getCommands).
    *
    * Note that if this is a [`Command`](#Command) object, only the [`command`](#Command.command) and [`arguments`](#Command.arguments)
    * are used by VS Code.
    */
  var command: js.UndefOr[String | Command] = js.undefined
  /**
    * The priority of this item. Higher value means the item should
    * be shown more to the left.
    */
  val priority: js.UndefOr[Double] = js.undefined
  /**
    * The text to show for the entry. You can embed icons in the text by leveraging the syntax:
    *
    * `My text $(icon-name) contains icons like $(icon-name) this one.`
    *
    * Where the icon-name is taken from the [codicon](https://microsoft.github.io/vscode-codicons/dist/codicon.html) icon set, e.g.
    * `light-bulb`, `thumbsup`, `zap` etc.
    */
  var text: String
  /**
    * The tooltip text when you hover over this entry.
    */
  var tooltip: js.UndefOr[String] = js.undefined
  /**
    * Dispose and free associated resources. Call
    * [hide](#StatusBarItem.hide).
    */
  def dispose(): Unit
  /**
    * Hide the entry in the status bar.
    */
  def hide(): Unit
  /**
    * Shows the entry in the status bar.
    */
  def show(): Unit
}

object StatusBarItem {
  @scala.inline
  def apply(
    alignment: StatusBarAlignment,
    dispose: () => Unit,
    hide: () => Unit,
    show: () => Unit,
    text: String,
    color: String | ThemeColor = null,
    command: String | Command = null,
    priority: js.UndefOr[Double] = js.undefined,
    tooltip: String = null
  ): StatusBarItem = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), text = text.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (command != null) __obj.updateDynamic("command")(command.asInstanceOf[js.Any])
    if (!js.isUndefined(priority)) __obj.updateDynamic("priority")(priority.get.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusBarItem]
  }
}

