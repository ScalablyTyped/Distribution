package typings.winjs.WinJS.UI

import typings.std.CustomEvent
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines an item that can be pressed, swiped, and dragged.
  **/
@js.native
trait ItemContainer extends StObject {
  
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
    * Raises an event of the specified type and with additional properties.
    * @param type The type (name) of the event.
    * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
    * @returns true if preventDefault was called on the event, otherwise false.
    **/
  def dispatchEvent(`type`: String, eventProperties: Any): Boolean = js.native
  
  /**
    * Releases resources held by this ItemContainer. Call this method when the ItemContainer is no longer needed. After calling this method, the ItemContainer becomes unusable.
    **/
  def dispose(): Unit = js.native
  
  //#endregion Methods
  //#region Properties
  /**
    * Gets or sets a value that specifies whether the item can be dragged.
    **/
  var draggable: Boolean = js.native
  
  /**
    * Gets the element that hosts this ItemContainer.
    **/
  var element: HTMLElement = js.native
  
  /**
    * Forces the ItemContainer to update its layout. Call this function when the reading direction of the app changes after the control has been initialized.
    **/
  def forceLayout(): Unit = js.native
  
  //#endregion Constructors
  //#region Events
  /**
    * Raised when the item is invoked. (You can use the tapBehavior property to specify whether taps and clicks invoke the item.)
    * @param eventInfo An object that contains information about the event.
    **/
  def oninvoked(eventInfo: CustomEvent[Any]): Unit = js.native
  
  /**
    * Raised after the item is selected or deselected.
    * @param eventInfo An object that contains information about the event.
    **/
  def onselectionchanged(eventInfo: CustomEvent[Any]): Unit = js.native
  
  /**
    * Raised just before the current selection changes.
    * @param eventInfo An object that contains information about the event.
    **/
  def onselectionchanging(eventInfo: CustomEvent[Any]): Unit = js.native
  
  /**
    * Removes an event handler that the addEventListener method registered.
    * @param eventName The name of the event that the event handler is registered for.
    * @param eventCallback The event handler function to remove.
    * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
    **/
  def removeEventListener(eventName: String, eventCallback: js.Function): Unit = js.native
  def removeEventListener(eventName: String, eventCallback: js.Function, useCapture: Boolean): Unit = js.native
  
  /**
    * Gets or sets a value that specifies whether the item is selected.
    **/
  var selected: Boolean = js.native
  
  /**
    * Gets or sets a value that specifies whether selection of this item is disabled.
    **/
  var selectionDisabled: Boolean = js.native
  
  /**
    * Gets or sets how the ItemContainer reacts to the swipe gesture. The swipe gesture can select the swiped items or can have no effect on the current selection.
    **/
  var swipeBehavior: SwipeBehavior = js.native
  
  /**
    * Gets or sets the orientation of swipe gestures.
    **/
  var swipeOrientation: Orientation = js.native
  
  /**
    * Gets or sets how the ItemContainer reacts when the user taps or clicks an item.
    **/
  var tapBehavior: TapBehavior = js.native
}
