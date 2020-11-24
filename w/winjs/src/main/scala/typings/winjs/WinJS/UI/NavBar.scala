package typings.winjs.WinJS.UI

import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Displays NavBarCommands in an overlayed navigation pane that opens and closes at the top or bottom of the main view.
  **/
@js.native
trait NavBar extends js.Object {
  
  //#endregion Events
  //#region Methods
  /**
    * Registers an event handler for the specified event.
    * @param eventName The name of the event to handle. Note that you drop the "on" when specifying the event name. For example, instead of specifying "onclick", you specify "click".
    * @param eventHandler The event handler function to associate with the event.
    * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
    **/
  def addEventListener(eventName: String, eventHandler: js.Function): Unit = js.native
  def addEventListener(eventName: String, eventHandler: js.Function, useCapture: Boolean): Unit = js.native
  
  /**
    * Closes the NavBar.
    **/
  def close(): Unit = js.native
  
  //#endregion Methods
  //#region Properties
  /**
    * Gets/Sets how NavBar will display itself while closed. Values are "none" and "minimal".
    **/
  var closedDisplayMode: String = js.native
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  var commands: AppBarCommand = js.native
  
  /**
    * Raises an event of the specified type and with additional properties.
    * @param type The type (name) of the event.
    * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
    * @returns true if preventDefault was called on the event, otherwise false.
    **/
  def dispatchEvent(`type`: String, eventProperties: js.Any): Boolean = js.native
  
  /**
    * Releases resources held by this NavBar. Call this method when the NavBar is no longer needed. After calling this method, the NavBar becomes unusable.
    **/
  def dispose(): Unit = js.native
  
  /**
    * Gets the HTML element that hosts this NavBar.
    **/
  var element: HTMLElement = js.native
  
  /**
    * Returns the NavBarCommand object identified by id.
    * @param id The element idenitifier (ID) of the NavBarCommand to be returned.
    * @returns The NavBarCommand identified by id. If multiple commands have the same ID, returns the first command found.
    **/
  def getCommandById(id: String): NavBarCommand = js.native
  
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code. Use NavBar.opened instead.
    **/
  var hidden: Boolean = js.native
  
  /**
    * Hides the specified commands of the NavBar.
    * @param commands The commands to hide. The array elements may be NavBarCommand objects, or the string identifiers (IDs) of commands.
    * @param immediate The parameter immediate is not supported and may be altered or unavailable in the future. true to hide the commands immediately, without animating them; otherwise, false.
    **/
  def hideCommands(commands: js.Array[_]): Unit = js.native
  def hideCommands(commands: js.Array[_], immediate: Boolean): Unit = js.native
  
  //#endregion Constructors
  //#region Events
  /**
    * Occurs immediately after the NavBar is closed.
    * @param eventInfo An object that contains information about the event.
    **/
  def onafterclose(eventInfo: Event): Unit = js.native
  
  /**
    * Raised after the NavBar is opened.
    * @param eventInfo An object that contains information about the event.
    **/
  def onafteropen(eventInfo: Event): Unit = js.native
  
  /**
    * Raised just before the NavBar is closed.
    * @param eventInfo An object that contains information about the event.
    **/
  def onbeforeclose(eventInfo: Event): Unit = js.native
  
  /**
    * Occurs before a closed NavBar is opened.
    * @param eventInfo An object that contains information about the event.
    **/
  def onbeforeopen(eventInfo: Event): Unit = js.native
  
  /**
    * Occurs after the NavBar has finished processing its child elements.
    * @param eventInfo An object that contains information about the event.
    **/
  def onchildrenprocessed(eventInfo: Event): Unit = js.native
  
  /**
    * Opens the NavBar
    **/
  def open(): Unit = js.native
  
  /**
    * Gets a value that indicates whether the NavBar is opened or in the process of becoming opened, or sets the NavBar to open or close itself.
    **/
  var opened: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the NavBar appears at the top or bottom of the main view.
    **/
  var placement: String = js.native
  
  /**
    * Removes an event handler that the addEventListener method registered.
    * @param eventName The name of the event that the event handler is registered for.
    * @param eventCallback The event handler function to remove.
    * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
    **/
  def removeEventListener(eventName: String, eventCallback: js.Function): Unit = js.native
  def removeEventListener(eventName: String, eventCallback: js.Function, useCapture: Boolean): Unit = js.native
  
  /**
    * Shows the specified commands of the NavBar.
    * @param commands The commands to show. The array elements may be NavBarCommand objects, or the string identifiers (IDs) of commands.
    * @param immediate The parameter immediate is not supported and may be altered or unavailable in the future. true to show the commands immediately, without animating them; otherwise, false.
    **/
  def showCommands(commands: js.Array[_]): Unit = js.native
  def showCommands(commands: js.Array[_], immediate: Boolean): Unit = js.native
  
  /**
    * Shows the specified commands of the NavBar while hiding all other commands.
    * @param commands The commands to show. The array elements may be NavBarCommand objects, or the string identifiers (IDs) of commands.
    * @param immediate The parameter immediate is not supported and may be altered or unavailable in the future. true to show the specified commands (and hide the others) immediately, without animating them; otherwise, false.
    **/
  def showOnlyCommands(commands: js.Array[_]): Unit = js.native
  def showOnlyCommands(commands: js.Array[_], immediate: Boolean): Unit = js.native
}
