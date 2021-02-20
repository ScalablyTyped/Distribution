package typings.titanium.Titanium.UI

import typings.titanium.Titanium.Proxy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An application shortcut item.
  */
@js.native
trait ShortcutItem extends Proxy {
  
  /**
    * Shortcut data.
    */
  var data: js.Any = js.native
  
  /**
    * Description of the shortcut.
    */
  var description: String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.ShortcutItem.data> property.
    * @deprecated Access <Titanium.UI.ShortcutItem.data> instead.
    */
  def getData(): js.Any = js.native
  
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
    * Gets the value of the <Titanium.UI.ShortcutItem.visible> property.
    * @deprecated Use [Titanium.UI.Shortcut.items](Titanium.UI.Shortcut.items) to determine if shortcut is active.
    */
  def getVisible(): Boolean = js.native
  
  /**
    * Hide the shortcut.
    * @deprecated Use [Titanium.UI.Shortcut.remove](Titanium.UI.Shortcut.remove) instead.
    */
  def hide(): Unit = js.native
  
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
    * Pin shortcut to launcher.
    */
  def pin(): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.ShortcutItem.data> property.
    * @deprecated Set the value using <Titanium.UI.ShortcutItem.data> instead.
    */
  def setData(data: js.Any): Unit = js.native
  
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
    * Sets the value of the <Titanium.UI.ShortcutItem.visible> property.
    * @deprecated Use [Titanium.UI.Shortcut.items](Titanium.UI.Shortcut.items) to determine if shortcut is active.
    */
  def setVisible(visible: Boolean): Unit = js.native
  
  /**
    * Allow the shortcut to show.
    * @deprecated Use [Titanium.UI.Shortcut.add](Titanium.UI.Shortcut.add) instead.
    */
  def show(): Unit = js.native
  
  /**
    * Title of the shortcut.
    */
  var title: String = js.native
  
  /**
    * Shortcut visibility.
    * @deprecated Use [Titanium.UI.Shortcut.items](Titanium.UI.Shortcut.items) to determine if shortcut is active.
    */
  var visible: Boolean = js.native
}
