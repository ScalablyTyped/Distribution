package typings.winjs.WinJS.UI

import typings.std.Event
import typings.std.HTMLElement
import typings.winjs.WinJS.Binding.List
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A tab control that displays multiple items.
  **/
@js.native
trait Pivot extends js.Object {
  /**
    * Gets or sets the left custom header.
    **/
  var customLeftHeader: HTMLElement = js.native
  /**
    * Gets or sets the right custom header.
    **/
  var customRightHeader: HTMLElement = js.native
  //#endregion Methods
  //#region Properties
  /**
    * Gets the DOM element that hosts the Pivot control.
    **/
  var element: HTMLElement = js.native
  /**
    * Gets or sets the Binding.List that contains the PivotItem objects that belong to this Pivot.
    **/
  var items: List[PivotItem] = js.native
  /**
    * Gets or sets a value that specifies whether the Pivot control is locked to the current item.
    **/
  var locked: Boolean = js.native
  /**
    * Gets or sets the index of the PivotItem control in view.
    **/
  var selectedIndex: Double = js.native
  /**
    * Gets or sets the PivotItem control in view within the Pivot control.
    **/
  var selectedItem: PivotItem = js.native
  /**
    * Gets or sets the title displayed above the PivotItem controls.
    **/
  var title: String = js.native
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
  /**
    * Raises an event of the specified type and with additional properties.
    * @param type The type (name) of the event.
    * @param eventProperties The set of additional properties to be attached to the event object when the event is raised.
    * @returns true if preventDefault was called on the event, otherwise false.
    **/
  def dispatchEvent(`type`: String, eventProperties: js.Any): Boolean = js.native
  /**
    * Releases resources held by this Pivot. Call this method when the Pivot is no longer needed. After calling this method, the Pivot becomes unusable.
    **/
  def dispose(): Unit = js.native
  /**
    * Forces the control to relayout its content. This function is expected to be called
    * when the pivot element is manually resized.
    **/
  def forceLayout(): Unit = js.native
  //#endregion Constructors
  //#region Events
  /**
    * Raised when a PivotItem control's animation ends.
    * @param eventInfo An object that contains information about the event.
    **/
  def onitemanimationend(eventInfo: Event): Unit = js.native
  /**
    * Raised when a PivotItem control's animation starts.
    * @param eventInfo An object that contains information about the event.
    **/
  def onitemanimationstart(eventInfo: Event): Unit = js.native
  /**
    * Raised when the user navigates to a different PivotItem.
    * @param eventInfo An object that contains information about the event.
    **/
  def onselectionchanged(eventInfo: Event): Unit = js.native
  /**
    * Removes an event handler that the addEventListener method registered.
    * @param eventName The name of the event that the event handler is registered for.
    * @param eventCallback The event handler function to remove.
    * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
    **/
  def removeEventListener(eventName: String, eventCallback: js.Function): Unit = js.native
  def removeEventListener(eventName: String, eventCallback: js.Function, useCapture: Boolean): Unit = js.native
}

