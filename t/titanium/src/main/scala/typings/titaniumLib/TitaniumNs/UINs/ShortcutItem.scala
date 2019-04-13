package typings
package titaniumLib.TitaniumNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * An application shortcut.
		 */
@js.native
trait ShortcutItem
  extends titaniumLib.TitaniumNs.Proxy {
  /**
  			 * Description of the shortcut.
  			 */
  var description: java.lang.String = js.native
  /**
  			 * Shortcut icon.
  			 */
  var icon: java.lang.String | scala.Double = js.native
  /**
  			 * Determines shortcut id.
  			 */
  var id: java.lang.String = js.native
  /**
  			 * Title of the shortcut.
  			 */
  var title: java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ShortcutItem.description> property.
  			 */
  def getDescription(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ShortcutItem.icon> property.
  			 */
  def getIcon(): java.lang.String | scala.Double = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ShortcutItem.id> property.
  			 */
  def getId(): java.lang.String = js.native
  /**
  			 * Gets the value of the <Titanium.UI.ShortcutItem.title> property.
  			 */
  def getTitle(): java.lang.String = js.native
  /**
  			 * Hide the shortcut.
  			 */
  def hide(): scala.Unit = js.native
  /**
  			 * Pin shortcut to launcher.
  			 */
  def pin(): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ShortcutItem.description> property.
  			 */
  def setDescription(description: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ShortcutItem.icon> property.
  			 */
  def setIcon(icon: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ShortcutItem.icon> property.
  			 */
  def setIcon(icon: scala.Double): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ShortcutItem.id> property.
  			 */
  def setId(id: java.lang.String): scala.Unit = js.native
  /**
  			 * Sets the value of the <Titanium.UI.ShortcutItem.title> property.
  			 */
  def setTitle(title: java.lang.String): scala.Unit = js.native
  /**
  			 * Allow the shortcut to show.
  			 */
  def show(): scala.Unit = js.native
}

