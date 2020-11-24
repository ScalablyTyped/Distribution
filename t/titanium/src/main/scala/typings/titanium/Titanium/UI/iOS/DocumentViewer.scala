package typings.titanium.Titanium.UI.iOS

import typings.titanium.DocumentViewerOptions
import typings.titanium.Titanium.Proxy
import typings.titanium.titaniumStrings.load
import typings.titanium.titaniumStrings.menu
import typings.titanium.titaniumStrings.unload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A DocumentViewer provides in-app support for managing user interactions with files on the
  * local system.
  */
@js.native
trait DocumentViewer extends Proxy {
  
  /**
    * Adds the specified callback as an event listener for the named event.
    */
  @JSName("addEventListener")
  def addEventListener_load(
    name: load,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ DocumentViewerLoadEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_menu(
    name: menu,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ DocumentViewerMenuEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_unload(
    name: unload,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ DocumentViewerUnloadEvent, Unit]
  ): Unit = js.native
  
  /**
    * Fires a synthesized event to any registered listeners.
    */
  @JSName("fireEvent")
  def fireEvent_load(name: load): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_load(name: load, event: DocumentViewerLoadEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_menu(name: menu): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_menu(name: menu, event: DocumentViewerMenuEvent): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_unload(name: unload): Unit = js.native
  @JSName("fireEvent")
  def fireEvent_unload(name: unload, event: DocumentViewerUnloadEvent): Unit = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.DocumentViewer.name> property.
    * @deprecated Access <Titanium.UI.iOS.DocumentViewer.name> instead.
    */
  def getName(): String = js.native
  
  /**
    * Gets the value of the <Titanium.UI.iOS.DocumentViewer.url> property.
    * @deprecated Access <Titanium.UI.iOS.DocumentViewer.url> instead.
    */
  def getUrl(): String = js.native
  
  /**
    * Dismisses the document viewer.
    */
  def hide(): Unit = js.native
  def hide(options: DocumentViewerOptions): Unit = js.native
  
  /**
    * Name of the file (without the path).
    */
  val name: String = js.native
  
  /**
    * Removes the specified callback as an event listener for the named event.
    */
  @JSName("removeEventListener")
  def removeEventListener_load(
    name: load,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ DocumentViewerLoadEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_menu(
    name: menu,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ DocumentViewerMenuEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_unload(
    name: unload,
    callback: js.ThisFunction1[/* this */ this.type, /* event */ DocumentViewerUnloadEvent, Unit]
  ): Unit = js.native
  
  /**
    * Sets the value of the <Titanium.UI.iOS.DocumentViewer.url> property.
    * @deprecated Set the value using <Titanium.UI.iOS.DocumentViewer.url> instead.
    */
  def setUrl(url: String): Unit = js.native
  
  /**
    * Displays the document viewer over the current view.
    */
  def show(): Unit = js.native
  def show(options: DocumentViewerOptions): Unit = js.native
  
  /**
    * URL of the document being previewed.
    */
  var url: String = js.native
}
