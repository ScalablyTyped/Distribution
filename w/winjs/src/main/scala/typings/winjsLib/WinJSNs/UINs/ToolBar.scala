package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Displays ICommands within the flow of the app. Use the ToolBar around other statically positioned app content.
  **/
@JSGlobal("WinJS.UI.ToolBar")
@js.native
/**
  * Creates a new ToolBar control.
  * @param element The DOM element that will host the control.
  * @param options The set of properties and values to apply to the new ToolBar.
  **/
class ToolBar () extends js.Object {
  def this(element: stdLib.HTMLElement) = this()
  def this(element: stdLib.HTMLElement, options: js.Any) = this()
  /**
    * Gets or sets the closedDisplayMode for the ToolBar. Values are "compact" and "full".
    **/
  var closedDisplayMode: java.lang.String = js.native
  /**
    * Gets or sets the Binding List of ICommand for the ToolBar.
    **/
  var data: winjsLib.WinJSNs.BindingNs.List[ICommand] = js.native
  /**
    * Gets the DOM element that hosts the ToolBar.
    **/
  var element: stdLib.HTMLElement = js.native
  /**
    * Gets or sets whether the ToolBar is currently opened.
    **/
  var opened: scala.Boolean = js.native
  /**
    * Registers an event handler for the specified event.
    * @param type The event type to register. It must be beforeopen, beforeclose, afteropen, or afterclose.
    * @param listener The event handler function to associate with the event.
    * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
    **/
  def addEventListener(eventName: java.lang.String, eventHandler: js.Function): scala.Unit = js.native
  def addEventListener(eventName: java.lang.String, eventHandler: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
  /**
    * Closes the ToolBar
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
    * Disposes the ToolBar
    **/
  def dispose(): scala.Unit = js.native
  /**
    * Forces the ToolBar to update its layout.
    * Use this function when the window did not change size, but the ToolBar itself did.
    **/
  def forceLayout(): scala.Unit = js.native
  /**
    * Returns the Command object identified by id.
    * @param id The element idenitifier (ID) of the command to be returned.
    * @returns The command identified by id. If multiple commands have the same ID, returns the first command found.
    **/
  def getCommandById(id: java.lang.String): ICommand = js.native
  /**
    * Occurs immediately after the control is closed.
    * @param eventInfo An object that contains information about the event.
    **/
  def onafterclose(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
    * Occurs immediately after the control is opened.
    * @param eventInfo An object that contains information about the event.
    **/
  def onafteropen(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
    * Occurs immediately before the control is closed. Is cancelable.
    * @param eventInfo An object that contains information about the event.
    **/
  def onbeforeclose(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
    * Occurs immediately before the control is opened. Is cancelable.
    * @param eventInfo An object that contains information about the event.
    **/
  def onbeforeopen(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
    * Opens the ToolBar
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
    * Shows the specified commands of the ToolBar while hiding all other commands.
    * @param commands The commands to show. The array elements may be ICommand objects, or the string identifiers (IDs) of commands.
    **/
  def showOnlyCommands(commands: js.Array[java.lang.String | ICommand]): scala.Unit = js.native
}

/**
  * Displays ICommands within the flow of the app. Use the ToolBar around other statically positioned app content.
  **/
@JSGlobal("WinJS.UI.ToolBar")
@js.native
object ToolBar extends js.Object {
  /**
    * Display options for the closed ToolBar.
    **/
  var ClosedDisplayMode: winjsLib.Anon_Compact = js.native
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: scala.Boolean = js.native
}

