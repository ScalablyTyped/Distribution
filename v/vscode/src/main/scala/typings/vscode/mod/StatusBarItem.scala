package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusBarItem extends StObject {
  
  /**
    * Accessibility information used when a screen reader interacts with this StatusBar item
    */
  var accessibilityInformation: js.UndefOr[AccessibilityInformation] = js.undefined
  
  /**
    * The alignment of this item.
    */
  val alignment: StatusBarAlignment
  
  /**
    * The background color for this entry.
    *
    * *Note*: only the following colors are supported:
    * * `new ThemeColor('statusBarItem.errorBackground')`
    * * `new ThemeColor('statusBarItem.warningBackground')`
    *
    * More background colors may be supported in the future.
    *
    * *Note*: when a background color is set, the statusbar may override
    * the `color` choice to ensure the entry is readable in all themes.
    */
  var backgroundColor: js.UndefOr[ThemeColor] = js.undefined
  
  /**
    * The foreground color for this entry.
    */
  var color: js.UndefOr[String | ThemeColor] = js.undefined
  
  /**
    * {@linkcode Command} or identifier of a command to run on click.
    *
    * The command must be {@link commands.getCommands known}.
    *
    * Note that if this is a {@linkcode Command} object, only the {@linkcode Command.command command} and {@linkcode Command.arguments arguments}
    * are used by the editor.
    */
  var command: js.UndefOr[String | Command] = js.undefined
  
  /**
    * Dispose and free associated resources. Call
    * {@link StatusBarItem.hide hide}.
    */
  def dispose(): Unit
  
  /**
    * Hide the entry in the status bar.
    */
  def hide(): Unit
  
  /**
    * The identifier of this item.
    *
    * *Note*: if no identifier was provided by the {@linkcode window.createStatusBarItem}
    * method, the identifier will match the {@link Extension.id extension identifier}.
    */
  val id: String
  
  /**
    * The name of the entry, like 'Python Language Indicator', 'Git Status' etc.
    * Try to keep the length of the name short, yet descriptive enough that
    * users can understand what the status bar item is about.
    */
  var name: js.UndefOr[String] = js.undefined
  
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
    * Where the icon-name is taken from the ThemeIcon [icon set](https://code.visualstudio.com/api/references/icons-in-labels#icon-listing), e.g.
    * `light-bulb`, `thumbsup`, `zap` etc.
    */
  var text: String
  
  /**
    * The tooltip text when you hover over this entry.
    */
  var tooltip: js.UndefOr[String | MarkdownString] = js.undefined
}
object StatusBarItem {
  
  inline def apply(
    alignment: StatusBarAlignment,
    dispose: () => Unit,
    hide: () => Unit,
    id: String,
    show: () => Unit,
    text: String
  ): StatusBarItem = {
    val __obj = js.Dynamic.literal(alignment = alignment.asInstanceOf[js.Any], dispose = js.Any.fromFunction0(dispose), hide = js.Any.fromFunction0(hide), id = id.asInstanceOf[js.Any], show = js.Any.fromFunction0(show), text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatusBarItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StatusBarItem] (val x: Self) extends AnyVal {
    
    inline def setAccessibilityInformation(value: AccessibilityInformation): Self = StObject.set(x, "accessibilityInformation", value.asInstanceOf[js.Any])
    
    inline def setAccessibilityInformationUndefined: Self = StObject.set(x, "accessibilityInformation", js.undefined)
    
    inline def setAlignment(value: StatusBarAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColor(value: ThemeColor): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
    
    inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
    
    inline def setColor(value: String | ThemeColor): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setCommand(value: String | Command): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    
    inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: String | MarkdownString): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    
    inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
  }
}
