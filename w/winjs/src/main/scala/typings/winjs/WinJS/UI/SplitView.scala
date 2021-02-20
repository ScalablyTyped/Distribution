package typings.winjs.WinJS.UI

import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Displays a SplitView which renders a collapsable pane next to arbitrary HTML content.
  **/
@js.native
trait SplitView extends StObject {
  
  /**
    * Registers an event handler for the specified event.
    * @param eventName The name of the event to handle. Note that you drop the "on" when specifying the event name. For example, instead of specifying "onclick", you specify "click".
    * @param eventHandler The event handler function to associate with the event.
    * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
    **/
  def addEventListener(eventName: String, eventHandler: js.Function): Unit = js.native
  def addEventListener(eventName: String, eventHandler: js.Function, useCapture: Boolean): Unit = js.native
  
  /**
    * Closes the SplitView's pane.
    **/
  def closePane(): Unit = js.native
  
  /**
    * Gets or sets the display mode of the SplitView's pane when it is closed.
    **/
  var closedDisplayMode: String = js.native
  
  /**
    * Gets the DOM element that hosts the SplitView's content.
    **/
  var contentElement: HTMLElement = js.native
  
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
    * Gets the DOM element that hosts the SplitView control.
    **/
  var element: HTMLElement = js.native
  
  /**
    * Raised immediately after the pane is fully closed.
    * @param eventInfo An object that contains information about the event.
    **/
  def onafterclose(eventInfo: Event): Unit = js.native
  
  /**
    * Raised immediately after the pane is fully open.
    * @param eventInfo An object that contains information about the event.
    **/
  def onafteropen(eventInfo: Event): Unit = js.native
  
  /**
    * Raised just before closing the pane. Call preventDefault on this event to stop the pane from closing.
    * @param eventInfo An object that contains information about the event.
    **/
  def onbeforeclose(eventInfo: Event): Unit = js.native
  
  /**
    * Raised just before opening the pane. Call preventDefault on this event to stop the pane from opening.
    * @param eventInfo An object that contains information about the event.
    **/
  def onbeforeopen(eventInfo: Event): Unit = js.native
  
  /**
    * Opens the SplitView's pane.
    **/
  def openPane(): Unit = js.native
  
  /**
    * Gets or sets the display mode of the SplitView's pane when it is open.
    **/
  var openedDisplayMode: String = js.native
  
  /**
    * Gets the DOM element that hosts the SplitView pane.
    **/
  var paneElement: HTMLElement = js.native
  
  /**
    * Gets or sets whether the SpitView's pane is currently open.
    **/
  var paneOpened: Boolean = js.native
  
  /**
    * Gets or sets the placement of the SplitView's pane.
    **/
  var panePlacement: String = js.native
  
  /**
    * Removes an event handler that the addEventListener method registered.
    * @param eventName The name of the event that the event handler is registered for.
    * @param eventCallback The event handler function to remove.
    * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
    **/
  def removeEventListener(eventName: String, eventCallback: js.Function): Unit = js.native
  def removeEventListener(eventName: String, eventCallback: js.Function, useCapture: Boolean): Unit = js.native
}
