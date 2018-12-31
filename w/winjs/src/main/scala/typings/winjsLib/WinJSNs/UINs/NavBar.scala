package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Displays NavBarCommands in an overlayed navigation pane that opens and closes at the top or bottom of the main view.
  **/
@JSGlobal("WinJS.UI.NavBar")
@js.native
//#region Constructors
/**
  * Creates a new NavBar.
  * @constructor
  * @param element The DOM element that will host the new NavBar.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
  **/
class NavBar () extends js.Object {
  def this(element: stdLib.HTMLElement) = this()
  def this(element: stdLib.HTMLElement, options: js.Any) = this()
  //#endregion Methods
  //#region Properties
  /**
    * Gets/Sets how NavBar will display itself while closed. Values are "none" and "minimal".
    **/
  var closedDisplayMode: java.lang.String = js.native
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  var commands: AppBarCommand = js.native
  /**
    * Gets the HTML element that hosts this NavBar.
    **/
  var element: stdLib.HTMLElement = js.native
  /**
    * This API supports the WinJS infrastructure and is not intended to be used directly from your code. Use NavBar.opened instead.
    **/
  var hidden: scala.Boolean = js.native
  /**
    * Gets a value that indicates whether the NavBar is opened or in the process of becoming opened, or sets the NavBar to open or close itself.
    **/
  var opened: scala.Boolean = js.native
  /**
    * Gets or sets a value that specifies whether the NavBar appears at the top or bottom of the main view.
    **/
  var placement: java.lang.String = js.native
  //#endregion Events
  //#region Methods
  /**
    * Registers an event handler for the specified event.
    * @param eventName The name of the event to handle. Note that you drop the "on" when specifying the event name. For example, instead of specifying "onclick", you specify "click".
    * @param eventHandler The event handler function to associate with the event.
    * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
    **/
  def addEventListener(eventName: java.lang.String, eventHandler: js.Function): scala.Unit = js.native
  def addEventListener(eventName: java.lang.String, eventHandler: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
  /**
    * Closes the NavBar.
    **/
  def close(): scala.Unit = js.native
  /**
    * Raises an event of the specified type and with additional properties.
    * @param type The type (name) of the event.
    * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
    * @returns true if preventDefault was called on the event, otherwise false.
    **/
  def dispatchEvent(`type`: java.lang.String, eventProperties: js.Any): scala.Boolean = js.native
  /**
    * Releases resources held by this NavBar. Call this method when the NavBar is no longer needed. After calling this method, the NavBar becomes unusable.
    **/
  def dispose(): scala.Unit = js.native
  /**
    * Returns the NavBarCommand object identified by id.
    * @param id The element idenitifier (ID) of the NavBarCommand to be returned.
    * @returns The NavBarCommand identified by id. If multiple commands have the same ID, returns the first command found.
    **/
  def getCommandById(id: java.lang.String): NavBarCommand = js.native
  /**
    * Hides the specified commands of the NavBar.
    * @param commands The commands to hide. The array elements may be NavBarCommand objects, or the string identifiers (IDs) of commands.
    * @param immediate The parameter immediate is not supported and may be altered or unavailable in the future. true to hide the commands immediately, without animating them; otherwise, false.
    **/
  def hideCommands(commands: js.Array[_]): scala.Unit = js.native
  def hideCommands(commands: js.Array[_], immediate: scala.Boolean): scala.Unit = js.native
  //#endregion Constructors
  //#region Events
  /**
    * Occurs immediately after the NavBar is closed.
    * @param eventInfo An object that contains information about the event.
    **/
  def onafterclose(eventInfo: stdLib.Event): scala.Unit = js.native
  /**
    * Raised after the NavBar is opened.
    * @param eventInfo An object that contains information about the event.
    **/
  def onafteropen(eventInfo: stdLib.Event): scala.Unit = js.native
  /**
    * Raised just before the NavBar is closed.
    * @param eventInfo An object that contains information about the event.
    **/
  def onbeforeclose(eventInfo: stdLib.Event): scala.Unit = js.native
  /**
    * Occurs before a closed NavBar is opened.
    * @param eventInfo An object that contains information about the event.
    **/
  def onbeforeopen(eventInfo: stdLib.Event): scala.Unit = js.native
  /**
    * Occurs after the NavBar has finished processing its child elements.
    * @param eventInfo An object that contains information about the event.
    **/
  def onchildrenprocessed(eventInfo: stdLib.Event): scala.Unit = js.native
  /**
    * Opens the NavBar
    **/
  def open(): scala.Unit = js.native
  /**
    * Removes an event handler that the addEventListener method registered.
    * @param eventName The name of the event that the event handler is registered for.
    * @param eventCallback The event handler function to remove.
    * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
    **/
  def removeEventListener(eventName: java.lang.String, eventCallback: js.Function): scala.Unit = js.native
  def removeEventListener(eventName: java.lang.String, eventCallback: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
  /**
    * Shows the specified commands of the NavBar.
    * @param commands The commands to show. The array elements may be NavBarCommand objects, or the string identifiers (IDs) of commands.
    * @param immediate The parameter immediate is not supported and may be altered or unavailable in the future. true to show the commands immediately, without animating them; otherwise, false.
    **/
  def showCommands(commands: js.Array[_]): scala.Unit = js.native
  def showCommands(commands: js.Array[_], immediate: scala.Boolean): scala.Unit = js.native
  /**
    * Shows the specified commands of the NavBar while hiding all other commands.
    * @param commands The commands to show. The array elements may be NavBarCommand objects, or the string identifiers (IDs) of commands.
    * @param immediate The parameter immediate is not supported and may be altered or unavailable in the future. true to show the specified commands (and hide the others) immediately, without animating them; otherwise, false.
    **/
  def showOnlyCommands(commands: js.Array[_]): scala.Unit = js.native
  def showOnlyCommands(commands: js.Array[_], immediate: scala.Boolean): scala.Unit = js.native
}

/**
  * Displays NavBarCommands in an overlayed navigation pane that opens and closes at the top or bottom of the main view.
  **/
@JSGlobal("WinJS.UI.NavBar")
@js.native
object NavBar extends js.Object {
  /**
    * This object supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  var isDeclarativeControlContainer: js.Any = js.native
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: scala.Boolean = js.native
}

