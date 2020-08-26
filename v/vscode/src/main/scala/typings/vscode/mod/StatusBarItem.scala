package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusBarItem extends js.Object {
  /**
    * Accessibility information used when screen reader interacts with this StatusBar item
    */
  var accessibilityInformation: js.UndefOr[AccessibilityInformation] = js.native
  /**
    * The alignment of this item.
    */
  val alignment: StatusBarAlignment = js.native
  /**
    * The foreground color for this entry.
    */
  var color: js.UndefOr[String | ThemeColor] = js.native
  /**
    * [`Command`](#Command) or identifier of a command to run on click.
    *
    * The command must be [known](#commands.getCommands).
    *
    * Note that if this is a [`Command`](#Command) object, only the [`command`](#Command.command) and [`arguments`](#Command.arguments)
    * are used by VS Code.
    */
  var command: js.UndefOr[String | Command] = js.native
  /**
    * The priority of this item. Higher value means the item should
    * be shown more to the left.
    */
  val priority: js.UndefOr[Double] = js.native
  /**
    * The text to show for the entry. You can embed icons in the text by leveraging the syntax:
    *
    * `My text $(icon-name) contains icons like $(icon-name) this one.`
    *
    * Where the icon-name is taken from the [codicon](https://microsoft.github.io/vscode-codicons/dist/codicon.html) icon set, e.g.
    * `light-bulb`, `thumbsup`, `zap` etc.
    */
  var text: String = js.native
  /**
    * The tooltip text when you hover over this entry.
    */
  var tooltip: js.UndefOr[String] = js.native
  /**
    * Dispose and free associated resources. Call
    * [hide](#StatusBarItem.hide).
    */
  def dispose(): Unit = js.native
  /**
    * Hide the entry in the status bar.
    */
  def hide(): Unit = js.native
  /**
    * Shows the entry in the status bar.
    */
  def show(): Unit = js.native
}

object StatusBarItem {
  @scala.inline
  def apply(
    alignment: StatusBarAlignment,
    dispose: () => Unit,
    hide: () => Unit,
    show: () => Unit,
    text: String
  ): StatusBarItem = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show), text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusBarItem]
  }
  @scala.inline
  implicit class StatusBarItemOps[Self <: StatusBarItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlignment(value: StatusBarAlignment): Self = this.set("alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessibilityInformation(value: AccessibilityInformation): Self = this.set("accessibilityInformation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessibilityInformation: Self = this.set("accessibilityInformation", js.undefined)
    @scala.inline
    def setColor(value: String | ThemeColor): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setCommand(value: String | Command): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommand: Self = this.set("command", js.undefined)
    @scala.inline
    def setPriority(value: Double): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
  
}

