package typings.titanium.Titanium.UI

import typings.titanium.Titanium.Proxy
import typings.titanium.titaniumStrings.click
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Manage application shortcuts.
  */
@js.native
trait Shortcut extends Proxy {
  
  /**
    * Adds a shortcut item to the application.
    */
  def add(item: ShortcutItem): Unit = js.native
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  @JSName("addEventListener")
  def addEventListener_click(
    name: click,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ShortcutClickEvent, Unit]
  ): Unit = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  @JSName("fireEvent")
  def fireEvent_click(name: click): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_click(name: click, event: ShortcutClickEvent): Unit = js.native
  
  /**
    * Fetches a shortcut item by its unique string identifier.
    */
  def getById(id: String): ShortcutItem = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Shortcut.items> property.
    * @deprecated Access <Titanium.UI.Shortcut.items> instead.
    */
  def getItems(): js.Array[ShortcutItem] = js.native
  
  /**
    * Gets the value of the <Titanium.UI.Shortcut.staticItems> property.
    * @deprecated Access <Titanium.UI.Shortcut.staticItems> instead.
    */
  def getStaticItems(): js.Array[ShortcutItem] = js.native
  
  /**
    * List dynamic shortcuts.
    */
  val items: js.Array[ShortcutItem] = js.native
  
  /**
    * Removes the given shortcut item from the application.
    */
  def remove(item: ShortcutItem): Unit = js.native
  
  /**
    * Removes all shortcut items from the application.
    */
  def removeAll(): Unit = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  @JSName("removeEventListener")
  def removeEventListener_click(
    name: click,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ ShortcutClickEvent, Unit]
  ): Unit = js.native
  
  /**
    * List current pinned/static shortcuts.
    */
  val staticItems: js.Array[ShortcutItem] = js.native
}
