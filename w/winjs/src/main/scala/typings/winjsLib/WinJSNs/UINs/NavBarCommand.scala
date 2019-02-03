package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a navigation command in a NavBarContainer.
  **/
@JSGlobal("WinJS.UI.NavBarCommand")
@js.native
//#region Constructors
/**
  * Creates a new NavBarCommand.
  * @constructor
  * @param element The DOM element hosts the new NavBarCommand.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events.
  **/
class NavBarCommand () extends js.Object {
  def this(element: stdLib.HTMLElement) = this()
  def this(element: stdLib.HTMLElement, options: js.Any) = this()
  //#endregion Methods
  //#region Properties
  /**
    * Gets the HTML element that hosts this NavBarCommand.
    **/
  var element: stdLib.HTMLElement = js.native
  /**
    * Gets or sets the command's icon.
    **/
  var icon: java.lang.String = js.native
  /**
    * Gets or sets the label of the command.
    **/
  var label: java.lang.String = js.native
  /**
    * Get or sets the location to navigate to when this command is invoked.
    **/
  var location: js.Any = js.native
  //#endregion Constructors
  //#region Events
  /**
    * This API supports the Windows Library for JavaScript infrastructure and is not intended to be used directly from your code.
    * Use NavBarContainer.oninvoked instead.
    **/
  var oninvoked: js.Any = js.native
  /**
    * Gets or sets a value that specifies whether to show the split tab stop.
    **/
  var splitButton: scala.Boolean = js.native
  /**
    * Gets a value that indicates whether the splitButton is open.
    **/
  var splitOpened: scala.Boolean = js.native
  /**
    * Gets or sets a user-defined object that represents the state associated with the command's location.
    **/
  var state: js.Any = js.native
  /**
    * Gets or sets the tooltip of the command.
    **/
  var tooltip: java.lang.String = js.native
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
    * Raises an event of the specified type and with additional properties.
    * @param type The type (name) of the event.
    * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
    * @returns true if preventDefault was called on the event, otherwise false.
    **/
  def dispatchEvent(`type`: java.lang.String, eventProperties: js.Any): scala.Boolean = js.native
  /**
    * Releases resources held by this NavBarCommand. Call this method when the NavBarCommand is no longer needed. After calling this method, the NavBarCommand becomes unusable.
    **/
  def dispose(): scala.Unit = js.native
  /**
    * Removes an event handler that the addEventListener method registered.
    * @param eventName The name of the event that the event handler is registered for.
    * @param eventCallback The event handler function to remove.
    * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
    **/
  def removeEventListener(eventName: java.lang.String, eventCallback: js.Function): scala.Unit = js.native
  def removeEventListener(eventName: java.lang.String, eventCallback: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
}

/* static members */
@JSGlobal("WinJS.UI.NavBarCommand")
@js.native
object NavBarCommand extends js.Object {
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: scala.Boolean = js.native
}

