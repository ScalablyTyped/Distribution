package typings.titanium.TitaniumNs.UINs

import typings.titanium.TitaniumNs.Proxy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An application shortcut.
		 */
@js.native
trait ShortcutItem extends Proxy {
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
  var id: String = js.native
  /**
  			 * Title of the shortcut.
  			 */
  var title: String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ShortcutItem.description> property.
  			 */
  def getDescription(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ShortcutItem.icon> property.
  			 */
  def getIcon(): String | Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ShortcutItem.id> property.
  			 */
  def getId(): String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ShortcutItem.title> property.
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
  			 */
  def setDescription(description: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ShortcutItem.icon> property.
  			 */
  def setIcon(icon: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ShortcutItem.icon> property.
  			 */
  def setIcon(icon: Double): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ShortcutItem.id> property.
  			 */
  def setId(id: String): Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ShortcutItem.title> property.
  			 */
  def setTitle(title: String): Unit = js.native
  /**
  			 * Allow the shortcut to show.
  			 */
  def show(): Unit = js.native
}

