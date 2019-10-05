package typings.winjs.WinJS.UI

import typings.std.CustomEvent
import typings.std.HTMLElement
import typings.winjs.WinJS.Binding.List
import typings.winjs.WinJS.Binding.Template
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Generates HTML from a set of data. Use this control to generate lists of items.
  **/
@JSGlobal("WinJS.UI.Repeater")
@js.native
//#region Constructors
/**
  * Creates a new Repeater control.
  * @constructor
  * @param elemnt The DOM element that will host the new control. The Repeater will create an element if this value is null.
  * @param options An object that contains one or more property/value pairs to apply to the new Repeater. Each property of the options object corresponds to one of the object's properties or events. Event names must begin with "on".
  **/
class Repeater () extends js.Object {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: js.Any) = this()
  //#endregion Methods
  //#region Properties
  /**
    * Gets or sets the List that provides the Repeater with items to display.
    **/
  var data: List[_] = js.native
  /**
    * Gets the DOM element that hosts the Repeater.
    **/
  var element: HTMLElement = js.native
  /**
    * Gets the number of items in the Repeater control.
    **/
  var length: Double = js.native
  /**
    * Gets or sets a WinJS.Binding.Template or custom rendering function that defines the HTML of each item within the Repeater.
    **/
  var template: Template = js.native
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
    * Releases resources held by this Repeater. Call this method when the Repeater is no longer needed. After calling this method, the Repeater becomes unusable.
    **/
  def dispose(): Unit = js.native
  /**
    * Returns the HTML element for the item at the specified index.
    * @param index The index of the item.
    * @returns The DOM element for the specified item.
    **/
  def elementFromIndex(index: Double): HTMLElement = js.native
  //#endregion Constructors
  //#region Events
  /**
    * Raised after an item in the Repeater control's data source changes and after the corresponding DOM element has been updated.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.index, detail.key, detail.newElement, detail.newItem, detail.newValue, detail.oldElement, detail.oldItem, detail.oldValue, detail.setPromise.
    **/
  def onitemchanged(eventInfo: CustomEvent[_]): Unit = js.native
  /**
    * Raised after an item in the Repeater control's data source changes but before the corresponding DOM element has been updated.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.index, detail.key, detail.newElement, detail.newItem, detail.newValue, detail.oldElement, detail.oldItem, detail.oldValue, detail.setPromise.
    **/
  def onitemchanging(eventInfo: CustomEvent[_]): Unit = js.native
  /**
    * Raised after an item has been added to the Repeater control's data source and after the corresponding DOM element has been added.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.affectedElement, detail.index, detail.key, detail.value.
    **/
  def oniteminserted(eventInfo: CustomEvent[_]): Unit = js.native
  /**
    * Raised after an item has been added to the Repeater control's data source but before the corresponding DOM element has been added.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.affectedElement, detail.index, detail.key, detail.value.
    **/
  def oniteminserting(eventInfo: CustomEvent[_]): Unit = js.native
  /**
    * Raised after an item has been moved from one index to another in the Repeater control's data source and after the corresponding DOM element has been moved.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.affectedElement, detail.index, detail.key, detail.oldIndex, detail.newIndex.
    **/
  def onitemmoved(eventInfo: CustomEvent[_]): Unit = js.native
  /**
    * Raised after an item has been moved from one index to another in the Repeater control's data source but before the corresponding DOM element has been moved.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.affectedElement, detail.index, detail.key, detail.oldIndex, detail.newIndex.
    **/
  def onitemmoving(eventInfo: CustomEvent[_]): Unit = js.native
  /**
    * Raised after an item has been moved from one index to another in the Repeater control's data source and after the corresponding DOM element has been moved.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.affectedElement, detail.index, detail.item, detail.setPromise.
    **/
  def onitemremoved(eventInfo: CustomEvent[_]): Unit = js.native
  /**
    * Raised after an item has been removed from the Repeater control's data source but before the corresponding DOM element has been removed.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.affectedElement, detail.index, detail.item, detail.setPromise.
    **/
  def onitemremoving(eventInfo: CustomEvent[_]): Unit = js.native
  /**
    * Raised when the Repeater has finished loading a new set of data. This event is only fired on construction. This event is only raised when the Repeater is constructed or its data source or template changes.
    * @param eventInfo An object that contains information about the event.
    **/
  def onitemsloaded(eventInfo: CustomEvent[_]): Unit = js.native
  /**
    * Raised after the Repeater control's underlying data has been updated and after the updated HTML has been reloaded.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.affectedElements.
    **/
  def onitemsreloaded(eventInfo: CustomEvent[_]): Unit = js.native
  /**
    * Raised after the Repeater control's underlying data has been updated but before the updated HTML has been reloaded.
    * @param eventInfo An object that contains information about the event. The detail property of this object contains the following sub-properties: detail.affectedElements, detail.setPromise.
    **/
  def onitemsreloading(eventInfo: CustomEvent[_]): Unit = js.native
  /**
    * Removes an event handler that the addEventListener method registered.
    * @param eventName The name of the event that the event handler is registered for.
    * @param eventCallback The event handler function to remove.
    * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
    **/
  def removeEventListener(eventName: String, eventCallback: js.Function): Unit = js.native
  def removeEventListener(eventName: String, eventCallback: js.Function, useCapture: Boolean): Unit = js.native
}

/* static members */
@JSGlobal("WinJS.UI.Repeater")
@js.native
object Repeater extends js.Object {
  /**
    * This object supports the WinJS infrastructure and is not intended to be used directly from your code.
    **/
  var isDeclarativeControlContainer: js.Any = js.native
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}

