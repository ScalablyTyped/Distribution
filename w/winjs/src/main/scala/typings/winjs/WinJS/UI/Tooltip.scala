package typings.winjs.WinJS.UI

import typings.std.CustomEvent
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Displays a tooltip that can contain images and formatting.
  **/
@JSGlobal("WinJS.UI.Tooltip")
@js.native
//#region Constructors
/**
  * Creates a new Tooltip.
  * @constructor
  * @param element The DOM element associated that hosts the Tooltip.
  * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events. Event names must begin with "on". For example, to provide a handler for the opened event, add a property named "onopened" to the options object and set its value to the event handler.
  **/
class Tooltip () extends js.Object {
  def this(element: HTMLElement) = this()
  def this(element: HTMLElement, options: js.Any) = this()
  //#endregion Methods
  //#region Properties
  /**
    * Gets or sets the HTML element that is the content of the Tooltip.
    **/
  var contentElement: HTMLElement = js.native
  /**
    * Gets the DOM element that hosts the Tooltip control.
    **/
  var element: HTMLElement = js.native
  /**
    * Gets or appends additional CSS classes to apply to the element that hosts the Tooltip.
    **/
  var extraClass: String = js.native
  /**
    * Gets or sets a value that specifies whether the Tooltip is an infotip, a tooltip that contains a lot of info and should be displayed for longer than a typical Tooltip.
    **/
  var infotip: Boolean = js.native
  /**
    * Gets or sets the HTML content of the Tooltip.
    **/
  var innerHTML: String = js.native
  /**
    * Gets or sets the position for the Tooltip relative to its target element: top, bottom, left or right.
    **/
  var placement: String = js.native
  //#endregion Events
  //#region Methods
  /**
    * Adds an event handler for the specified event.
    * @param eventName The name of the event to handle.
    * @param eventHandler The event handler function to associate with the event.
    * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
    **/
  def addEventListener(eventName: String, eventHandler: js.Function): Unit = js.native
  def addEventListener(eventName: String, eventHandler: js.Function, useCapture: Boolean): Unit = js.native
  /**
    * Hides the Tooltip.
    **/
  def close(): Unit = js.native
  /**
    * Releases resources held by this Tooltip. Call this method when the Tooltip is no longer needed. After calling this method, the Tooltip becomes unusable.
    **/
  def dispose(): Unit = js.native
  //#endregion Constructors
  //#region Events
  /**
    * Raised just before the Tooltip is hidden.
    * @param eventInfo An object that contains information about the event.
    **/
  def onbeforeclose(eventInfo: CustomEvent[_]): Unit = js.native
  /**
    * Raised just before the Tooltip appears.
    * @param eventInfo An object that contains information about the event.
    **/
  def onbeforeopen(eventInfo: CustomEvent[_]): Unit = js.native
  /**
    * Raised when the Tooltip is no longer displayed.
    * @param eventInfo An object that contains information about the event.
    **/
  def onclosed(eventInfo: CustomEvent[_]): Unit = js.native
  /**
    * Raised when the Tooltip is shown.
    * @param eventInfo An object that contains information about the event.
    **/
  def onopened(eventInfo: CustomEvent[_]): Unit = js.native
  /**
    * Shows the Tooltip.
    * @param type A value that specifies when to show the Tooltip. The default value is "mousedown".
    **/
  def open(): Unit = js.native
  def open(`type`: String): Unit = js.native
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
@JSGlobal("WinJS.UI.Tooltip")
@js.native
object Tooltip extends js.Object {
  /**
    * Indicates that the object is compatibile with declarative processing.
    **/
  var supportedForProcessing: Boolean = js.native
}

