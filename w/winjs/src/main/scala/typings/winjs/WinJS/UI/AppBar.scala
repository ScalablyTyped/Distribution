package typings.winjs.WinJS.UI

import typings.std.CustomEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion Interfaces
//#region Objects
/**
  * Displays ICommands in overlayed application pane that opens and closes at the top or bottom of the main view.
  **/
@js.native
trait AppBar extends StObject {
  
  //#endregion Events
  //#region Methods
  /**
    * Registers an event handler for the specified event.
    * @param type The event type to register. It must be beforeopen, beforeclose, afteropen, or afterclose.
    * @param listener The event handler function to associate with the event.
    * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
    **/
  def addEventListener(eventName: String, eventHandler: js.Function): Unit = js.native
  def addEventListener(eventName: String, eventHandler: js.Function, useCapture: Boolean): Unit = js.native
  
  /**
    * Closes the AppBar.
    **/
  def close(): Unit = js.native
  
  //#endregion Methods
  //#region Properties
  /**
    * Gets/Sets how AppBar will display itself while closed. Values are "none" , "minimal", "compact" and "full".
    **/
  var closedDisplayMode: String = js.native
  
  /**
    * Gets or sets the Binding List of WinJS.UI.Command for the AppBar.
    **/
  var data: typings.winjs.WinJS.Binding.List[ICommand] = js.native
  
  /**
    * Raises an event of the specified type and with additional properties.
    * @param type The type (name) of the event.
    * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
    * @returns true if preventDefault was called on the event, otherwise false.
    **/
  def dispatchEvent(eventName: String, eventProperties: Any): Boolean = js.native
  
  /**
    * Releases resources held by this AppBar. Call this method when the AppBar is no longer needed. After calling this method, the AppBar becomes unusable.
    **/
  def dispose(): Unit = js.native
  
  /**
    * Gets the DOM element that hosts the AppBar.
    **/
  var element: HTMLElement = js.native
  
  /**
    * Forces the AppBar to update its layout.
    **/
  def forceLayout(): Unit = js.native
  
  /**
    * Returns the Command object identified by id.
    * @param id The element idenitifier (ID) of the command to be returned.
    * @returns The command identified by id. If multiple commands have the same ID, returns the first command found.
    **/
  def getCommandById(id: String): ICommand = js.native
  
  //#endregion Constructors
  //#region Events
  /**
    * Occurs immediately after the AppBar is closed.
    * @param eventInfo An object that contains information about the event.
    **/
  def onafterclose(eventInfo: CustomEvent[Any]): Unit = js.native
  
  /**
    * Occurs immeidately after the AppBar is opened.
    * @param eventInfo An object that contains information about the event.
    **/
  def onafteropen(eventInfo: CustomEvent[Any]): Unit = js.native
  
  /**
    * Occurs immediately before the AppBar is closed. Is cancelable.
    * @param eventInfo An object that contains information about the event.
    **/
  def onbeforeclose(eventInfo: CustomEvent[Any]): Unit = js.native
  
  /**
    * Occurs immediately before the AppBar is opened. Is cancelable.
    * @param eventInfo An object that contains information about the event.
    **/
  def onbeforeopen(eventInfo: CustomEvent[Any]): Unit = js.native
  
  /**
    * Opens the AppBar.
    **/
  def open(): Unit = js.native
  
  /**
    * Gets or sets whether the AppBar is currently opened.
    **/
  var opened: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the AppBar appears at the top or bottom of the main view.
    **/
  var placement: String = js.native
  
  /**
    * Removes an event handler that the addEventListener method registered.
    * @param type The event type to unregister. It must be beforeopen, beforeclose, afteropen, or afterclose.
    * @param listener The event handler function to remove.
    * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
    **/
  def removeEventListener(eventName: String, eventHandler: js.Function): Unit = js.native
  def removeEventListener(eventName: String, eventHandler: js.Function, useCapture: Boolean): Unit = js.native
  
  /**
    * Shows the specified commands of the AppBar while hiding all other commands.
    * @param commands The commands to show. The array elements may be ICommand objects, or the string identifiers (IDs) of commands.
    **/
  def showOnlyCommands(commands: js.Array[String | ICommand]): Unit = js.native
}
