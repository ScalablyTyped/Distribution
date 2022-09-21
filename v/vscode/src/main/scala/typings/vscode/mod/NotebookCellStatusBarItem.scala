package typings.vscode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vscode", "NotebookCellStatusBarItem")
@js.native
open class NotebookCellStatusBarItem protected () extends StObject {
  /**
    * Creates a new NotebookCellStatusBarItem.
    * @param text The text to show for the item.
    * @param alignment Whether the item is aligned to the left or right.
    */
  def this(text: String, alignment: NotebookCellStatusBarAlignment) = this()
  
  /**
    * Accessibility information used when a screen reader interacts with this item.
    */
  var accessibilityInformation: js.UndefOr[AccessibilityInformation] = js.native
  
  /**
    * Whether the item is aligned to the left or right.
    */
  var alignment: NotebookCellStatusBarAlignment = js.native
  
  /**
    * An optional {@linkcode Command} or identifier of a command to run on click.
    *
    * The command must be {@link commands.getCommands known}.
    *
    * Note that if this is a {@linkcode Command} object, only the {@linkcode Command.command command} and {@linkcode Command.arguments arguments}
    * are used by the editor.
    */
  var command: js.UndefOr[String | Command] = js.native
  
  /**
    * The priority of the item. A higher value item will be shown more to the left.
    */
  var priority: js.UndefOr[Double] = js.native
  
  /**
    * The text to show for the item.
    */
  var text: String = js.native
  
  /**
    * A tooltip to show when the item is hovered.
    */
  var tooltip: js.UndefOr[String] = js.native
}
