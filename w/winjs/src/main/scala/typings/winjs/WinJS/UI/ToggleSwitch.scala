package typings.winjs.WinJS.UI

import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A control that lets the user switch an option between two states: on (checked is set to true) and off (checked is set to false).
  **/
@js.native
trait ToggleSwitch extends js.Object {
  
  //#endregion Events
  //#region Methods
  /**
    * Registers an event handler for the specified event.
    * @param eventName The name of the event to handle.
    * @param eventHandler The event handler function to associate with the event.
    * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
    **/
  def addEventListener(eventName: String, eventHandler: js.Function): Unit = js.native
  def addEventListener(eventName: String, eventHandler: js.Function, useCapture: Boolean): Unit = js.native
  
  //#endregion Methods
  //#region Properties
  /**
    * Gets or sets a value that specifies whether the control is on or off.
    **/
  var checked: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether the control is disabled.
    **/
  var disabled: Boolean = js.native
  
  /**
    * Raises an event of the specified type and with additional properties.
    * @param type The type (name) of the event.
    * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
    * @returns true if preventDefault was called on the event, otherwise false.
    **/
  def dispatchEvent(`type`: String, eventProperties: js.Any): Boolean = js.native
  
  /**
    * Releases resources held by this ToggleSwitch. Call this method when the ToggleSwitch is no longer needed. After calling this method, the ToggleSwitch becomes unusable.
    **/
  def dispose(): Unit = js.native
  
  /**
    * Gets the DOM element that hosts the ToggleSwitch.
    **/
  var element: HTMLElement = js.native
  
  /**
    * Gets or sets the text that displays when the ToggleSwitch is off (checked is set to false).
    **/
  var labelOff: String = js.native
  
  /**
    * Gets or sets the text that displays when the ToggleSwitch is on (checked is set to true).
    **/
  var labelOn: String = js.native
  
  //#endregion Constructors
  //#region Events
  /**
    * Occurs when the ToggleSwitch control is flipped to on (checked == true) or off (checked == false).
    * @param eventInfo An object that contains information about the event.
    **/
  def onchange(eventInfo: Event): Unit = js.native
  
  /**
    * Removes an event handler that the addEventListener method registered.
    * @param eventName The name of the event that the event handler is registered for.
    * @param eventCallback The event handler function to remove.
    * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
    **/
  def removeEventListener(eventName: String, eventCallback: js.Function): Unit = js.native
  def removeEventListener(eventName: String, eventCallback: js.Function, useCapture: Boolean): Unit = js.native
  
  /**
    * Gets or sets the main text for the ToggleSwitch control. This text is always displayed, regardless of whether the control is switched on or off.
    **/
  var title: String = js.native
}
