package typings.winjs.mod

import typings.std.CustomEvent
import typings.std.HTMLElement
import typings.winjs.anon.Empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides functions for accessing resources and localizing content.
**/
object Resources {
  
  //#region Functions
  /**
    * Registers an event handler for the specified event. Use this method to register for events that are related to resources, such as when the app's language, scale, or contrast changes.
    * @param type The name of the event to handle.
    * @param listener The listener (event handler function) to associate with the event.
    * @param useCapture Set to true to register the listener for the capturing phase; otherwise, set to false to register the listener for the bubbling phase.
    **/
  @JSImport("winjs", "Resources.addEventListener")
  @js.native
  def addEventListener(`type`: String, listener: js.Function): Unit = js.native
  @JSImport("winjs", "Resources.addEventListener")
  @js.native
  def addEventListener(`type`: String, listener: js.Function, useCapture: Boolean): Unit = js.native
  
  /**
    * Raises an event of the specified type and with the specified additional properties.
    * @param type The name of the event to raise.
    * @param details The set of additional properties to attach to the event object.
    **/
  @JSImport("winjs", "Resources.dispatchEvent")
  @js.native
  def dispatchEvent(`type`: String, details: js.Any): Unit = js.native
  
  /**
    * Retrieves the resource string that has the specified resource identifier.
    * @param resourceId The resource ID of the string to retrieve.
    * @returns An object that can contain these properties: value, empty, lang.
    **/
  @JSImport("winjs", "Resources.getString")
  @js.native
  def getString(resourceId: String): Empty = js.native
  
  //#endregion Functions
  //#region Events
  /**
    * Occurs when the user changes the system's language or contrast, or the scale of the display, or when the user changes any of the items in the current context's qualifier values list. For more info about the current context's qualifier values list, see the Remarks section.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.qualifier, detail.changed.
    **/
  @JSImport("winjs", "Resources.oncontextchanged")
  @js.native
  def oncontextchanged(eventInfo: CustomEvent[_]): Unit = js.native
  
  /**
    * Processes data-win-res attributes on elements and replaces attributes and properties with resource strings.
    * @param rootElement The element to process. The element and its child elements will be processed. If an element isn't specified, the entire document is processed.
    **/
  @JSImport("winjs", "Resources.processAll")
  @js.native
  def processAll(): typings.winjs.WinJS.Promise[Unit] = js.native
  @JSImport("winjs", "Resources.processAll")
  @js.native
  def processAll(rootElement: HTMLElement): typings.winjs.WinJS.Promise[Unit] = js.native
  
  /**
    * Removes an event listener that the addEventListener method registered.
    * @param type The name of the event that the event listener is registered for.
    * @param listener The listener (event handler function) to remove.
    * @param useCapture Set to true to remove the capturing phase listener; set to false to remove the bubbling phase listener.
    **/
  @JSImport("winjs", "Resources.removeEventListener")
  @js.native
  def removeEventListener(`type`: String, listener: js.Function): Unit = js.native
  @JSImport("winjs", "Resources.removeEventListener")
  @js.native
  def removeEventListener(`type`: String, listener: js.Function, useCapture: Boolean): Unit = js.native
}
