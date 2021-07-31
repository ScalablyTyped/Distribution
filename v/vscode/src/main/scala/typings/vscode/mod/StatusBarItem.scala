package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusBarItem extends StObject {
  
  /**
    * Accessibility information used when screen reader interacts with this StatusBar item
    */
  var accessibilityInformation: js.UndefOr[AccessibilityInformation] = js.undefined
  
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
    * Dispose and free associated resources. Call
    * [hide](#StatusBarItem.hide).
    */
  def dispose(): Unit
  
  /**
    * Hide the entry in the status bar.
    */
  def hide(): Unit
  
  /**
    * The priority of this item. Higher value means the item should
    * be shown more to the left.
    */
  val priority: js.UndefOr[Double] = js.undefined
  
  /**
    * Shows the entry in the status bar.
    */
  def show(): Unit
  
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
  implicit class StatusBarItemMutableBuilder[Self <: StatusBarItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessibilityInformation(value: AccessibilityInformation): Self = StObject.set(x, "accessibilityInformation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessibilityInformationUndefined: Self = StObject.set(x, "accessibilityInformation", js.undefined)
    
    @scala.inline
    def setAlignment(value: StatusBarAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String | ThemeColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setCommand(value: String | Command): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
