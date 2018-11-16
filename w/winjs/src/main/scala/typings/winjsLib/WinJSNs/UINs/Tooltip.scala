package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Displays a tooltip that can contain images and formatting.
    **/
@JSGlobal("WinJS.UI.Tooltip")
@js.native
class Tooltip () extends js.Object {
  //#region Constructors
  /**
           * Creates a new Tooltip.
           * @constructor
           * @param element The DOM element associated that hosts the Tooltip.
           * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events. Event names must begin with "on". For example, to provide a handler for the opened event, add a property named "onopened" to the options object and set its value to the event handler.
          **/
  def this(element: stdLib.HTMLElement) = this()
  //#region Constructors
  /**
           * Creates a new Tooltip.
           * @constructor
           * @param element The DOM element associated that hosts the Tooltip.
           * @param options An object that contains one or more property/value pairs to apply to the new control. Each property of the options object corresponds to one of the control's properties or events. Event names must begin with "on". For example, to provide a handler for the opened event, add a property named "onopened" to the options object and set its value to the event handler.
          **/
  def this(element: stdLib.HTMLElement, options: js.Any) = this()
  //#endregion Methods
  //#region Properties
  /**
           * Gets or sets the HTML element that is the content of the Tooltip.
          **/
  var contentElement: stdLib.HTMLElement = js.native
  /**
           * Gets the DOM element that hosts the Tooltip control.
          **/
  var element: stdLib.HTMLElement = js.native
  /**
           * Gets or appends additional CSS classes to apply to the element that hosts the Tooltip.
          **/
  var extraClass: java.lang.String = js.native
  /**
           * Gets or sets a value that specifies whether the Tooltip is an infotip, a tooltip that contains a lot of info and should be displayed for longer than a typical Tooltip.
          **/
  var infotip: scala.Boolean = js.native
  /**
           * Gets or sets the HTML content of the Tooltip.
          **/
  var innerHTML: java.lang.String = js.native
  /**
           * Gets or sets the position for the Tooltip relative to its target element: top, bottom, left or right.
          **/
  var placement: java.lang.String = js.native
  //#endregion Events
  //#region Methods
  /**
           * Adds an event handler for the specified event.
           * @param eventName The name of the event to handle.
           * @param eventHandler The event handler function to associate with the event.
           * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
          **/
  def addEventListener(eventName: java.lang.String, eventHandler: js.Function): scala.Unit = js.native
  //#endregion Events
  //#region Methods
  /**
           * Adds an event handler for the specified event.
           * @param eventName The name of the event to handle.
           * @param eventHandler The event handler function to associate with the event.
           * @param useCapture Set to true to register the event handler for the capturing phase; otherwise, set to false to register the event handler for the bubbling phase.
          **/
  def addEventListener(eventName: java.lang.String, eventHandler: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
  /**
           * Hides the Tooltip.
          **/
  def close(): scala.Unit = js.native
  /**
           * Releases resources held by this Tooltip. Call this method when the Tooltip is no longer needed. After calling this method, the Tooltip becomes unusable.
          **/
  def dispose(): scala.Unit = js.native
  //#endregion Constructors
  //#region Events
  /**
           * Raised just before the Tooltip is hidden.
           * @param eventInfo An object that contains information about the event.
          **/
  def onbeforeclose(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
           * Raised just before the Tooltip appears.
           * @param eventInfo An object that contains information about the event.
          **/
  def onbeforeopen(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
           * Raised when the Tooltip is no longer displayed.
           * @param eventInfo An object that contains information about the event.
          **/
  def onclosed(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
           * Raised when the Tooltip is shown.
           * @param eventInfo An object that contains information about the event.
          **/
  def onopened(eventInfo: stdLib.CustomEvent[_]): scala.Unit = js.native
  /**
           * Shows the Tooltip.
           * @param type A value that specifies when to show the Tooltip. The default value is "mousedown".
          **/
  def open(): scala.Unit = js.native
  /**
           * Shows the Tooltip.
           * @param type A value that specifies when to show the Tooltip. The default value is "mousedown".
          **/
  def open(`type`: java.lang.String): scala.Unit = js.native
  /**
           * Removes an event handler that the addEventListener method registered.
           * @param eventName The name of the event that the event handler is registered for.
           * @param eventCallback The event handler function to remove.
           * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
          **/
  def removeEventListener(eventName: java.lang.String, eventCallback: js.Function): scala.Unit = js.native
  /**
           * Removes an event handler that the addEventListener method registered.
           * @param eventName The name of the event that the event handler is registered for.
           * @param eventCallback The event handler function to remove.
           * @param useCapture Set to true to remove the capturing phase event handler; set to false to remove the bubbling phase event handler.
          **/
  def removeEventListener(eventName: java.lang.String, eventCallback: js.Function, useCapture: scala.Boolean): scala.Unit = js.native
}

/**
     * Displays a tooltip that can contain images and formatting.
    **/
@JSGlobal("WinJS.UI.Tooltip")
@js.native
object Tooltip extends js.Object {
  /**
           * Indicates that the object is compatibile with declarative processing.
          **/
  var supportedForProcessing: scala.Boolean = js.native
}

