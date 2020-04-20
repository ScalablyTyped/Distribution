package typings.titanium.Titanium.UI

import typings.titanium.Titanium.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An application shortcut.
		 */
@JSGlobal("Titanium.UI.ShortcutItem")
@js.native
class ShortcutItem () extends Proxy {
  /**
  			 * Description of the shortcut.
  			 */
  var description: String = js.native
  /**
  			 * Shortcut icon.
  			 */
  var icon: String | Double = js.native
  /**
  			 * Determines shortcut id.
  			 */
  @JSName("id")
  var id_ShortcutItem: String = js.native
  /**
  			 * Title of the shortcut.
  			 */
  var title: String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ShortcutItem.description> property.
  			 * @deprecated Access <Titanium.UI.ShortcutItem.description> instead.
  			 */
  def getDescription(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ShortcutItem.icon> property.
  			 * @deprecated Access <Titanium.UI.ShortcutItem.icon> instead.
  			 */
  def getIcon(): String | Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ShortcutItem.id> property.
  			 * @deprecated Access <Titanium.UI.ShortcutItem.id> instead.
  			 */
  def getId(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ShortcutItem.title> property.
  			 * @deprecated Access <Titanium.UI.ShortcutItem.title> instead.
  			 */
  def getTitle(): String = js.native
  /**
  			 * Hide the shortcut.
  			 */
  def hide(): Unit = js.native
  /**
  			 * Pin shortcut to launcher.
  			 */
  def pin(): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ShortcutItem.description> property.
  			 * @deprecated Set the value using <Titanium.UI.ShortcutItem.description> instead.
  			 */
  def setDescription(description: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ShortcutItem.icon> property.
  			 * @deprecated Set the value using <Titanium.UI.ShortcutItem.icon> instead.
  			 */
  def setIcon(icon: String): Unit = js.native
  def setIcon(icon: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ShortcutItem.id> property.
  			 * @deprecated Set the value using <Titanium.UI.ShortcutItem.id> instead.
  			 */
  def setId(id: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ShortcutItem.title> property.
  			 * @deprecated Set the value using <Titanium.UI.ShortcutItem.title> instead.
  			 */
  def setTitle(title: String): Unit = js.native
  /**
  			 * Allow the shortcut to show.
  			 */
  def show(): Unit = js.native
}

