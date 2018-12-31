package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion Interfaces
//#region Objects
/**
  * Displays ICommands in overlayed application pane that opens and closes at the top or bottom of the main view.
  **/
@JSGlobal("WinJS.UI.AppBar")
@js.native
//#region Constructors
/**
  * Creates a new AppBar object.
  * @constructor
  * @param element The DOM element that will host the control.
  * @param options The set of properties and values to apply to the new AppBar.
  **/
class AppBar () extends js.Object {
  def this(element: stdLib.HTMLElement) = this()
  def this(element: stdLib.HTMLElement, options: js.Any) = this()
  //#endregion Methods
  //#region Properties
  /**
    * Gets/Sets how AppBar will display itself while closed. Values are "none" , "minimal", "compact" and "full".
    **/
  var closedDisplayMode: java.lang.String = js.native
  /**
    * Gets or sets the Binding List of WinJS.UI.Command for the AppBar.
    **/
  var data: winjsLib.WinJSNs.BindingNs.List[ICommand] = js.native
  /**
    * Gets the DOM element that hosts the AppBar.
    **/
  var element: stdLib.HTMLElement = js.native
  /**
    * Gets or sets whether the AppBar is currently opened.
    **/
  var opened: scala.Boolean = js.native
  /**
    * Gets or sets a value that specifies whether the AppBar appears at the top or bottom of the main view.
    **/
  var placement: java.lang.String = js.native
  //#endregion Events
  //#region Methods
  /**
    * Registers an event handler for the specified event.
    * @param type The event type to register. It must be beforeopen, beforeclose, afteropen, or afterclose.
    * @param listener The event handler function to associate with the event.
    * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
    **/
  def addEventListener(eventName: java.lang.String, eventHandler: js.Function): scala.Unit = js.native
  def addEventListener(eventName: java.lang.String, eventHandler: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
  /**
    * Closes the AppBar.
    **/
  def close(): scala.Unit = js.native
  /**
    * Raises an event of the specified type and with additional properties.
    * @param type The type (name) of the event.
    * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
    * @returns true if preventDefault was called on the event, otherwise false.
    **/
  def dispatchEvent(eventName: java.lang.String, eventProperties: js.Any): scala.Boolean = js.native
  /**
    * Releases resources held by this AppBar. Call this method when the AppBar is no longer needed. After calling this method, the AppBar becomes unusable.
    **/
  def dispose(): scala.Unit = js.native
  /**
    * Forces the AppBar to update its layout.
    **/
  def forceLayout(): scala.Unit = js.native
  /**
    * Returns the Command object identified by id.
    * @param id The element idenitifier (ID) of the command to be returned.
    * @returns The command identified by id. If multiple commands have the same ID, returns the first command found.
    **/
  def getCommandById(id: java.lang.String): ICommand = js.native
  //#endregion Constructors
  //#region Events
  /**
    * Occurs immediately after the AppBar is closed.
    * @param eventInfo An object that contains information about the event.
    **/
  def onafterclose(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
    * Occurs immeidately after the AppBar is opened.
    * @param eventInfo An object that contains information about the event.
    **/
  def onafteropen(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
    * Occurs immediately before the AppBar is closed. Is cancelable.
    * @param eventInfo An object that contains information about the event.
    **/
  def onbeforeclose(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
    * Occurs immediately before the AppBar is opened. Is cancelable.
    * @param eventInfo An object that contains information about the event.
    **/
  def onbeforeopen(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
    * Opens the AppBar.
    **/
  def open(): scala.Unit = js.native
  /**
    * Removes an event handler that the addEventListener method registered.
    * @param type The event type to unregister. It must be beforeopen, beforeclose, afteropen, or afterclose.
    * @param listener The event handler function to remove.
    * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
    **/
  def removeEventListener(eventName: java.lang.String, eventHandler: js.Function): scala.Unit = js.native
  def removeEventListener(eventName: java.lang.String, eventHandler: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
  /**
    * Shows the specified commands of the AppBar while hiding all other commands.
    * @param commands The commands to show. The array elements may be ICommand objects, or the string identifiers (IDs) of commands.
    **/
  def showOnlyCommands(commands: js.Array[java.lang.String | ICommand]): scala.Unit = js.native
}

//#endregion Interfaces
//#region Objects
/**
  * Displays ICommands in overlayed application pane that opens and closes at the top or bottom of the main view.
  **/
@JSGlobal("WinJS.UI.AppBar")
@js.native
object AppBar extends js.Object {
  /**
    * Display options for the AppBar when closed.
    **/
  var ClosedDisplayMode: winjsLib.Anon_NoneMinimal = js.native
  /**
    * Display options for AppBar placement in relation to the main view.
    */
  var Placement: winjsLib.Anon_BottomTop = js.native
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: scala.Boolean = js.native
}

