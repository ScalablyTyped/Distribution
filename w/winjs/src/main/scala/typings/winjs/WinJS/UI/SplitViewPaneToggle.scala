package typings.winjs.WinJS.UI

import typings.std.Event
import typings.std.HTMLButtonElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Displays a button which is used for opening and closing a SplitView's pane.
  **/
@js.native
trait SplitViewPaneToggle extends js.Object {
  
  /**
    * Registers an event handler for the specified event.
    * @param eventName The name of the event to handle. Note that you drop the "on" when specifying the event name. For example, instead of specifying "onclick", you specify "click".
    * @param eventHandler The event handler function to associate with the event.
    * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
    **/
  def addEventListener(eventName: String, eventHandler: js.Function): Unit = js.native
  def addEventListener(eventName: String, eventHandler: js.Function, useCapture: Boolean): Unit = js.native
  
  /**
    * Raises an event of the specified type and with additional properties.
    * @param type The type (name) of the event.
    * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
    * @returns true if preventDefault was called on the event, otherwise false.
    **/
  def dispatchEvent(`type`: String, eventProperties: js.Any): Boolean = js.native
  
  /**
    * Disposes this control.
    **/
  def dispose(): Unit = js.native
  
  /**
    * Gets the DOM element that hosts the SplitViewPaneToggle control.
    **/
  var element: HTMLButtonElement = js.native
  
  /**
    * Raised when the SplitViewPaneToggle is invoked.
    * @param eventInfo An object that contains information about the event.
    **/
  def oninvoked(eventInfo: Event): Unit = js.native
  
  /**
    * Removes an event handler that the addEventListener method registered.
    * @param eventName The name of the event that the event handler is registered for.
    * @param eventCallback The event handler function to remove.
    * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
    **/
  def removeEventListener(eventName: String, eventCallback: js.Function): Unit = js.native
  def removeEventListener(eventName: String, eventCallback: js.Function, useCapture: Boolean): Unit = js.native
  
  /**
    * Gets or sets the DOM element of the SplitView that is associated with the SplitViewPaneToggle control.
    * When the SplitViewPaneToggle is invoked, it'll toggle this SplitView's pane.
    **/
  var splitView: HTMLElement = js.native
}
